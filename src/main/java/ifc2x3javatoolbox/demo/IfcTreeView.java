package ifc2x3javatoolbox.demo;
import ifc2x3javatoolbox.ifcmodel.IfcModel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
/**
 * IfcTreeView component for the StructureViewer demo application. This
 * component evaluates an IfcModel and shows the spatial structure of an IFC
 * building model as tree.<br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTreeView extends JPanel
{
	private static final long serialVersionUID = 1L;

	private IfcModel ifcModel = null;
	private DefaultMutableTreeNode rootTreeNode = new DefaultMutableTreeNode(
			"no model loaded");
	private JTree tree = null;
	private JScrollPane scrollPane = null;

	/**
	 * Constructs a new IfcTreeView object.
	 */
	public IfcTreeView()
	{
		tree = new JTree(rootTreeNode);
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(tree);
		this.setLayout(new BorderLayout());
		this.add(scrollPane, BorderLayout.CENTER);
	}

	/**
	 * This method sets the IfcModel. The View will evaluate the the model and
	 * update the view.
	 * @param ifcModel
	 *            the IfcModel object to evaluate
	 */
	public void setIfcModel(IfcModel ifcModel) {
		this.ifcModel = ifcModel;
		updateSpatialStructureTree();
	}

	/**
	 * updates the view
	 */
	private void updateSpatialStructureTree() {
		rootTreeNode = new IfcSpatialStructure(ifcModel).getSpatialStructureRoot(false);

		tree = new JTree(rootTreeNode);
		tree.setCellRenderer(new IfcTreeRenderer());
		tree.setRootVisible(true);
		tree.getSelectionModel().setSelectionMode(
				TreeSelectionModel.SINGLE_TREE_SELECTION);
		scrollPane.setViewportView(tree);
	}
}
