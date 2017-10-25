package ifc2x3javatoolbox.demo;
import ifc2x3javatoolbox.ifc2x3tc1.IfcBuildingStorey;
import ifc2x3javatoolbox.ifc2x3tc1.IfcObjectDefinition;
import ifc2x3javatoolbox.ifc2x3tc1.IfcOpeningElement;
import ifc2x3javatoolbox.ifc2x3tc1.IfcProduct;
import ifc2x3javatoolbox.ifc2x3tc1.IfcProject;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRelContainedInSpatialStructure;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRelDecomposes;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRoot;
import ifc2x3javatoolbox.ifc2x3tc1.IfcSpace;
import ifc2x3javatoolbox.ifc2x3tc1.IfcSpatialStructureElement;
import ifc2x3javatoolbox.ifc2x3tc1.SET;
import ifc2x3javatoolbox.ifcmodel.IfcModel;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSpatialStructure
{
	private IfcProject project;
	private IfcModel ifcModel;
	private DefaultMutableTreeNode root;
	private TreeMap<IfcBuildingStorey, NodeParentElement> storeyNodeMap;
	private HashMap<Object, DefaultMutableTreeNode> spaceNodeMap;
	private HashSet<IfcRoot> investigatedObjects = new HashSet<IfcRoot>();

	/**
	 * Constructs a new IFCSpatialStructure Object and builds the IFC spatial
	 * structure starting at the given IfcProject.
	 */
	public IfcSpatialStructure(IfcModel ifcModel)
	{
		this.ifcModel = ifcModel;
		this.project = ifcModel.getIfcProject();
		this.root = new DefaultMutableTreeNode(project);
		buildSpatialStructure();
	}

	/**
	 * This method returns the root of the spatial structure as a
	 * DefaultMutableTreeNode. If addNonSpatialStructureObjects is true a sub
	 * tree of objects which are not contained in the spatial structure is added
	 * to the root. In the sub tree the objects are grouped by type.
	 * 
	 * @return the root of the spatial structure
	 */
	public DefaultMutableTreeNode getSpatialStructureRoot(boolean addNonSpatialStructureObjects)
	{
		if (addNonSpatialStructureObjects)
		{
			DefaultMutableTreeNode other = new DefaultMutableTreeNode("not in spatial structure");
			TreeMap<String, TreeSet<IfcProduct>> sortedTypes = new TreeMap<String, TreeSet<IfcProduct>>();
			// get all IfcProducts which have not been processed yet and group
			// them by type (except openings)
			for (IfcProduct ifcProduct : ifcModel.getCollection(IfcProduct.class))
			{
				if (investigatedObjects.contains(ifcProduct))
					continue;
				if (ifcProduct instanceof IfcOpeningElement)
					continue;
				String type = ifcProduct.getClass().getName().replace(
						ifcProduct.getClass().getPackage().getName() + ".Ifc", "");
				if (!sortedTypes.containsKey(type))
					sortedTypes.put(type, new TreeSet<IfcProduct>(new NameIdComparator()));
				sortedTypes.get(type).add(ifcProduct);
			}
			// group objects found during previous step by type in a tree
			// structure
			for (String type : sortedTypes.keySet())
			{
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(type);
				other.add(node);
				for (IfcProduct ifcProduct : sortedTypes.get(type))
				{
					node.add(new DefaultMutableTreeNode(ifcProduct));
				}
			}
			// add tree of objects not contained in spatial structure to the
			// root
			if (other.getChildCount() > 0)
				root.add(other);
		}
		return root;
	}

	/**
	 * This method starts building the spatial structure.
	 */
	private void buildSpatialStructure()
	{
		if(project == null) return;
		storeyNodeMap = new TreeMap<IfcBuildingStorey, NodeParentElement>(new ElevationComparator());
		spaceNodeMap = new HashMap<Object, DefaultMutableTreeNode>();

		SET<IfcRelDecomposes> decomposedBy = project.getIsDecomposedBy_Inverse();
		if (decomposedBy != null)
		{
			for (IfcRelDecomposes subChild : decomposedBy)
			{
				for (IfcObjectDefinition obj : subChild.getRelatedObjects())
				{
					buildSpatialStructure(obj, root);
				}
			}
		}

		sortStoreys();
	}

	/**
	 * This method builds the spatial structure.
	 * 
	 * @param objDef
	 *            the current node in spatial structure
	 * @param parent
	 *            the parental treeNode of the current node
	 */
	private void buildSpatialStructure(IfcObjectDefinition objDef, DefaultMutableTreeNode parent)
	{
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(objDef);

		investigatedObjects.add(objDef);

		if (objDef instanceof IfcBuildingStorey)
		{
			IfcBuildingStorey storey = (IfcBuildingStorey) objDef;
			storeyNodeMap.put(storey, new NodeParentElement(child, parent));
		} else if (objDef instanceof IfcSpace)
		{
			// check if parent's node has already a space node
			if (!spaceNodeMap.containsKey(parent.getUserObject()))
			{
				spaceNodeMap.put(parent.getUserObject(), new DefaultMutableTreeNode("Space"));
			}
			DefaultMutableTreeNode spaceNode = spaceNodeMap.get(parent.getUserObject());
			spaceNode.add(child);
			parent.add(spaceNode);
		} else
		{
			parent.add(child);
		}

		TreeMap<String, DefaultMutableTreeNode> typeMap = new TreeMap<String, DefaultMutableTreeNode>();
		HashMap<String, TreeSet<IfcRoot>> productMap = new HashMap<String, TreeSet<IfcRoot>>();

		if (objDef.getIsDecomposedBy_Inverse() != null)
		{
			for (IfcRelDecomposes relAggregates : objDef.getIsDecomposedBy_Inverse())
			{
				TreeSet<IfcObjectDefinition> sortedObjDefs = new TreeSet<IfcObjectDefinition>(new NameIdComparator());

				for (IfcObjectDefinition obj : relAggregates.getRelatedObjects())
				{
					sortedObjDefs.add(obj);
				}

				for (IfcObjectDefinition obj : sortedObjDefs)
				{
					buildSpatialStructure(obj, child);
				}
			}
		}

		if (objDef instanceof IfcSpatialStructureElement)
		{
			Collection<IfcRelContainedInSpatialStructure> collection = 
				((IfcSpatialStructureElement) objDef).getContainsElements_Inverse();
			if (collection != null)
			{
				for (IfcRelContainedInSpatialStructure relCon : collection)
				{
					Iterator<IfcProduct> relatedProducts = relCon.getRelatedElements().iterator();

					while(relatedProducts.hasNext())
					{
						Object obj = relatedProducts.next();

						// should not happen, but happens:
						if (!(obj instanceof IfcProduct))
							continue;

						IfcProduct ifcProduct = (IfcProduct) obj;
						String key = ifcProduct.getClass().getCanonicalName();
						if (!typeMap.containsKey(key))
						{
							DefaultMutableTreeNode typeNode = new DefaultMutableTreeNode(ifcProduct.getClass()
									.getName().replace(ifcProduct.getClass().getPackage().getName() + ".Ifc", ""));
							typeMap.put(key, typeNode);
						}
						if (!productMap.containsKey(key))
							productMap.put(key, new TreeSet<IfcRoot>(new NameIdComparator()));
						productMap.get(key).add(ifcProduct);
					}
				}
			}
			for (String key : typeMap.keySet())
			{
				child.add(typeMap.get(key));
				for (IfcRoot ifcRoot : productMap.get(key))
				{
					investigatedObjects.add(ifcRoot);
					DefaultMutableTreeNode node = new DefaultMutableTreeNode(ifcRoot);
					typeMap.get(key).add(node);
					
					if(ifcRoot instanceof IfcObjectDefinition)
					{
						IfcObjectDefinition ifcObjectDefinition = (IfcObjectDefinition) ifcRoot;
						if(ifcObjectDefinition.getIsDecomposedBy_Inverse() != null)
						{
							for (IfcRelDecomposes ifcRelDecomposes : ifcObjectDefinition.getIsDecomposedBy_Inverse())
							{
								for(IfcObjectDefinition decomposingObject : ifcRelDecomposes.getRelatedObjects())
								{
									investigatedObjects.add(decomposingObject);
									DefaultMutableTreeNode decomposingNode = new DefaultMutableTreeNode(decomposingObject);
									node.add(decomposingNode);
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * This method adds the storeys of the building in the correct order to the
	 * spatial structure tree.
	 */
	private void sortStoreys()
	{
		for (IfcBuildingStorey bs : storeyNodeMap.keySet())
		{
			storeyNodeMap.get(bs).parent.add(storeyNodeMap.get(bs).node);
		}
	}

	/**
	 * This Class maps a node and its parent node.
	 */
	private class NodeParentElement
	{
		DefaultMutableTreeNode node;
		DefaultMutableTreeNode parent;

		/**
		 * Constructs a new NodeParentElement to map a node to its parent node
		 * 
		 * @param node
		 *            the current node
		 * @param parent
		 *            the parental node of the current node
		 */
		public NodeParentElement(DefaultMutableTreeNode node, DefaultMutableTreeNode parent)
		{
			this.node = node;
			this.parent = parent;
		}
	}

	/**
	 * This comparator compares IfcBuildingStoreys.<br>
	 * The storeys are sorted by elevation, if given.<br>
	 * If the elevation is not given, the storeys are sorted alphabetically
	 * after this scheme:<br>
	 * "Name - GlobalID", e.g. "storey1 - 012345ABShcajsl"<br>
	 * These storeys are added after the storeys with given elevation.
	 */
	private class ElevationComparator implements Comparator<IfcBuildingStorey>
	{
		/**
		 * Compares two IfcBuildingStoreys.<br>
		 * The storeys are sorted by elevation, if given.<br>
		 * If the elevation is not given, the storeys are sorted alphabetically
		 * after this scheme:<br>
		 * "Name - GlobalID", e.g. "storey1 - 012345ABShcajsl"<br>
		 * These storeys are added after the storeys with given elevation.<br>
		 * If elevation is not given it is assumed with -1 * Double.MAX_VALUE.<br>
		 * If elevation1 < elevation2 returns +1<br>
		 * If elevation1 > elevation2 returns -1<br>
		 * If elevation1 = elevation2 returns
		 * "Name1 - Id1".compareTo("Name2 - Id2")<br>
		 */
		@Override
		public int compare(IfcBuildingStorey bs1, IfcBuildingStorey bs2)
		{
			double elevation1 = -Double.MAX_VALUE;
			if (bs1.getElevation() != null)
				elevation1 = bs1.getElevation().value;
			double elevation2 = -Double.MAX_VALUE;
			if (bs2.getElevation() != null)
				elevation2 = bs2.getElevation().value;

			if (elevation1 < elevation2)
				return +1;

			if (elevation1 == elevation2)
			{
				String name1 = "";
				String name2 = "";
				if (bs1.getName() != null)
					name1 = bs1.getName().getDecodedValue();
				if (bs2.getName() != null)
					name2 = bs2.getName().getDecodedValue();
				name1 += " - " + bs1.getGlobalId().getDecodedValue();
				name2 += " - " + bs2.getGlobalId().getDecodedValue();

				return name1.compareTo(name2);
			}

			return -1;
		}
	}

	/**
	 * This comparator compares IfcRoot objects (e.g. IfcProduct).<br>
	 * The IfcRoot objects are sorted alphabetically after this scheme:<br>
	 * "Name - GlobalID", e.g. "MySlab - 012345ABShcajsl"<br>
	 */
	private class NameIdComparator implements Comparator<IfcRoot>
	{
		/**
		 * Compares two IfcRoots objects (e.g. IfcProduct).<br>
		 * The roots are sorted alphabetically after this scheme:<br>
		 * "Name - GlobalID", e.g. "wall1 - 012345ABShcajsl"<br>
		 * 
		 * @return "Name1 - Id1".compareTo("Name2 - Id2")<br>
		 */
		@Override
		public int compare(IfcRoot o1, IfcRoot o2)
		{
			String name1 = "", name2 = "";
			if (o1.getName() != null)
				name1 = o1.getName().getDecodedValue();
			if (o2.getName() != null)
				name2 = o2.getName().getDecodedValue();
			name1 += " - " + o1.getGlobalId().getDecodedValue();
			name2 += " - " + o2.getGlobalId().getDecodedValue();

			return name1.compareTo(name2);
		}
	}
}
