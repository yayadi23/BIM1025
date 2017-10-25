package ifc2x3javatoolbox.demo;
import ifc2x3javatoolbox.ifc2x3tc1.ClassInterface;
import ifc2x3javatoolbox.ifc2x3tc1.IfcBuilding;
import ifc2x3javatoolbox.ifc2x3tc1.IfcObjectDefinition;
import ifc2x3javatoolbox.ifc2x3tc1.IfcProduct;
import ifc2x3javatoolbox.ifc2x3tc1.IfcProject;
import ifc2x3javatoolbox.ifc2x3tc1.IfcSite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
/**
 * IfcTreeRenderer component for the StructureViewer demo application. This
 * component renders the tree components for the class IfcTreeView.<br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public final class IfcTreeRenderer extends DefaultTreeCellRenderer
{
	private static final long serialVersionUID = 1L;
//	private ImageIcon openFolderIcon = null;
//	private ImageIcon closedFolderIcon = null;
//	private ImageIcon leafIcon = null;
//	private ImageIcon buildingIcon = null;
//	private ImageIcon siteIcon = null;
//	private ImageIcon projectIcon = null;

	/**
	 * Constructs a new IfcTreeRenderer object.
	 */
	public IfcTreeRenderer()
	{
		setBorder(new EmptyBorder(1, 0, 1, 0));
//		URL openimageUrl = Thread
//				.currentThread()
//				.getContextClassLoader()
//				.getResource(
//						"openifctools/com/openifcjavatoolbox/icons/openFolder.png");
//		URL closeimageUrl = Thread
//				.currentThread()
//				.getContextClassLoader()
//				.getResource(
//						"openifctools/com/openifcjavatoolbox/icons/closedFolder.png");
//		URL leafimageUrl = Thread
//				.currentThread()
//				.getContextClassLoader()
//				.getResource(
//						"openifctools/com/openifcjavatoolbox/icons/object_blue.png");
//		URL buildingimageUrl = Thread
//				.currentThread()
//				.getContextClassLoader()
//				.getResource(
//						"openifctools/com/openifcjavatoolbox/icons/building.png");
//		URL siteimageUrl = Thread
//				.currentThread()
//				.getContextClassLoader()
//				.getResource(
//						"openifctools/com/openifcjavatoolbox/icons/site.png");
//		URL projectImageUrl = Thread
//				.currentThread()
//				.getContextClassLoader()
//				.getResource(
//						"openifctools/com/openifcjavatoolbox/icons/project.png");

//		openFolderIcon = new ImageIcon(new ImageIcon(openimageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
//		closedFolderIcon = new ImageIcon(new ImageIcon(closeimageUrl)
//				.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
//		leafIcon = new ImageIcon(new ImageIcon(leafimageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
//		buildingIcon = new ImageIcon(new ImageIcon(buildingimageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
//		siteIcon = new ImageIcon(new ImageIcon(siteimageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
//		projectIcon = new ImageIcon(new ImageIcon(projectImageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	}

	/**
	 * Configures the renderer based on the passed in components. The value is
	 * set from messaging the tree with <code>convertValueToText</code>, which
	 * ultimately invokes <code>toString</code> on <code>value</code>. The
	 * foreground color is set based on the selection and the icon is set based
	 * on the <code>leaf</code> and <code>expanded</code> parameters.
	 */
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean selected, boolean expanded, boolean leaf, int row,
			boolean focus)
	{
		super.getTreeCellRendererComponent(tree, value, selected, expanded,
				leaf, row, hasFocus);
		DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) value;
		if (!leaf) {
			boolean shouldBeSelected = false;
			for (int i = 0; i < ((DefaultMutableTreeNode) value)
					.getChildCount(); i++)
			{
				DefaultMutableTreeNode currenTreeNode = (DefaultMutableTreeNode) ((DefaultMutableTreeNode) value)
						.getChildAt(i);
				if (tree.getSelectionModel().isPathSelected(
						new TreePath(currenTreeNode.getPath())))
				{
					shouldBeSelected = true;
					break;
				}
			}
			if (shouldBeSelected) {
				this.setBackgroundSelectionColor(Color.LIGHT_GRAY);
				this.setForeground(Color.BLACK);
			} else {
				this.setBackgroundSelectionColor(Color.WHITE);
				this.setForeground(Color.BLACK);
			}
		} else {
			this.setBackgroundSelectionColor(Color.LIGHT_GRAY);
			this.setForeground(Color.BLACK);
		}
		if (treeNode.getUserObject() instanceof IfcProject) {
//			setIcon(projectIcon);
			if (((IfcObjectDefinition) treeNode.getUserObject()).getName() != null) setText(((IfcObjectDefinition) treeNode
					.getUserObject()).getName().getDecodedValue());
		} else if (treeNode.getUserObject() instanceof IfcSite) {
//			setIcon(siteIcon);
			if (((IfcObjectDefinition) treeNode.getUserObject()).getName() != null) setText(((IfcObjectDefinition) treeNode
					.getUserObject()).getName().getDecodedValue());
		} else if (treeNode.getUserObject() instanceof IfcBuilding) {
//			setIcon(buildingIcon);
			if (((IfcObjectDefinition) treeNode.getUserObject()).getName() != null) setText(((IfcObjectDefinition) treeNode
					.getUserObject()).getName().getDecodedValue());
		} else if (leaf) {
			setIcon(leafIcon);
			if (((IfcProduct) treeNode.getUserObject()).getName() != null) setText(((IfcProduct) treeNode
					.getUserObject()).getName().getDecodedValue());
			else {
				setText(getObjectNameWithUID(treeNode.getUserObject()));
			}
		} else if (expanded) {
//			setIcon(openFolderIcon);
			if (treeNode.getUserObject() instanceof IfcObjectDefinition) if (((IfcObjectDefinition) treeNode
					.getUserObject()).getName() != null) setText(((IfcObjectDefinition) treeNode
					.getUserObject()).getName().getDecodedValue());
			else
				setText(getObjectName(treeNode.getUserObject()));
		} else if (!expanded) {
//			setIcon(closedFolderIcon);
			if (treeNode.getUserObject() instanceof IfcObjectDefinition) if (((IfcObjectDefinition) treeNode
					.getUserObject()).getName() != null) setText(((IfcObjectDefinition) treeNode
					.getUserObject()).getName().getDecodedValue());
			else
				setText(getObjectName(treeNode.getUserObject()));
		}
		if (treeNode.getUserObject() instanceof ClassInterface) this
				.setToolTipText(((ClassInterface) treeNode.getUserObject())
						.getStepLine());
		return this;
	}

	private String getObjectName(Object object) {
		String name = new String();
		name = object.getClass().getName();
		int lastIndex = name.lastIndexOf('.');
		name = name.substring(lastIndex + 1);
		return name;
	}

	private String getObjectNameWithUID(Object object) {
		String name = new String();
		name = object.getClass().getName();
		int lastIndex = name.lastIndexOf('.');
		name = name.substring(lastIndex + 1);
		name += " - [" + ((IfcProduct) object).getGlobalId() + "]";
		return name;
	}
}
