package ifc2x3javatoolbox.demo;
import ifc2x3javatoolbox.ifc2x3tc1.IfcLabel;
import ifc2x3javatoolbox.ifc2x3tc1.IfcProject;
import ifc2x3javatoolbox.ifcmodel.IfcModel;
import ifc2x3javatoolbox.step.parser.util.ProgressEvent;
import ifc2x3javatoolbox.step.parser.util.StepParserProgressListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
/**
 * This is a demo application for the package
 * openifctools.com.ifcopenjavatoolbox<br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class StructureViewer extends JFrame
{
	private static final long serialVersionUID = 1L;
	private IfcModel ifcModel = null;
	private JProgressBar progressBar = null;
	private IfcTreeView treeView = null;
	private JTextPane infoPane = null;
	private JScrollPane scrollPane = null;
	private JMenuItem saveItem = null;
	private JMenuItem renameProjectItem = null;

//	private URL openImageUrl = Thread
//			.currentThread()
//			.getContextClassLoader()
//			.getResource(
//					"openifctools/com/openifcjavatoolbox/icons/openFolder.png");
//	private URL editImageUrl = Thread.currentThread().getContextClassLoader()
//			.getResource("openifctools/com/openifcjavatoolbox/icons/edit.png");
//	private URL saveImageUrl = Thread.currentThread().getContextClassLoader()
//			.getResource("openifctools/com/openifcjavatoolbox/icons/save.png");
//	private URL aboutImageUrl = Thread.currentThread().getContextClassLoader()
//			.getResource("openifctools/com/openifcjavatoolbox/icons/about.png");

	/**
	 * Constructs a new Structure Viewer object.
	 */
	public StructureViewer()
	{
		initComponents();
	}

	/**
	 * initialize the application components
	 */
	private void initComponents() {

		// Create new IfcModel
		ifcModel = new IfcModel();
		// init the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setSize(600, 400);
		// set MenuBar
		this.setJMenuBar(getApplicationMenuBar());
		// set ProgressBar
		this.add(getApplicationProgressBar(), BorderLayout.SOUTH);
		// set TreeView
		this.add(treeView = new IfcTreeView(), BorderLayout.CENTER);
		// set InfoPane
		this.add(getInfoPane(), BorderLayout.WEST);
		// set frame to visible
		this.setVisible(true);
	}

	private JScrollPane getInfoPane() {
		infoPane = new JTextPane();
		infoPane.setEditable(false);
		StyledDocument doc = infoPane.getStyledDocument();
		addStylesToDocument(doc);
		scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(150, 400));
		scrollPane.setMaximumSize(new Dimension(150, 400));
		scrollPane.setPreferredSize(new Dimension(150, 400));
		scrollPane.setViewportView(infoPane);
		return scrollPane;
	}

	private JProgressBar getApplicationProgressBar() {
		progressBar = new JProgressBar(0, 100);
		progressBar.setPreferredSize(new Dimension(600, 20));
		progressBar.setStringPainted(false);
		return progressBar;
	}

	private JMenuBar getApplicationMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		fileMenu.setMnemonic('F');
		JMenuItem openItem = new JMenuItem("open");
		openItem.setMnemonic('o');
//		openItem.setIcon(new ImageIcon(new ImageIcon(openImageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		openItem.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				loadFile();
			}
		});
		fileMenu.add(openItem);
		saveItem = new JMenuItem("save");
		saveItem.setEnabled(false);
		saveItem.setMnemonic('o');
//		saveItem.setIcon(new ImageIcon(new ImageIcon(saveImageUrl).getImage()
//				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		saveItem.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		fileMenu.add(saveItem);

		JMenu dataMenu = new JMenu("Data");
		dataMenu.setMnemonic('D');
		renameProjectItem = new JMenuItem("Rename Project");
		renameProjectItem.setMnemonic('R');
		renameProjectItem.setEnabled(false);
//		renameProjectItem.setIcon(new ImageIcon(new ImageIcon(editImageUrl)
//				.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		renameProjectItem.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				renameProject();
			}
		});
		dataMenu.add(renameProjectItem);
		menuBar.add(dataMenu);

		JMenu infoMenu = new JMenu("Info");
		infoMenu.setMnemonic('I');
		JMenuItem aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.setMnemonic('A');
//		aboutMenuItem.setIcon(new ImageIcon(new ImageIcon(aboutImageUrl)
//				.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		aboutMenuItem.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								StructureViewer.this,
								new String(
										"OPEN IFC JAVA TOOLBOX\nDemo Application\n\nCopyright: CCPL BY-NC-SA 3.0 (cc) 2008\nEike Tauscher, Jan Tulke\n\nhttp://www.openifctools.com"),
								"About", JOptionPane.INFORMATION_MESSAGE);

			}
		});
		infoMenu.add(aboutMenuItem);
		menuBar.add(infoMenu);
		return menuBar;
	}

	private void renameProject() {
		IfcProject project = ifcModel.getIfcProject();
		String newName = JOptionPane.showInputDialog(this, "new project name",
				project.getName().getDecodedValue());
		project.setName(new IfcLabel(newName, true));
		treeView.repaint();
	}

	private void loadFile() {

		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showOpenDialog(StructureViewer.this) == JFileChooser.APPROVE_OPTION)
		{

			final File file = fileChooser.getSelectedFile();
			ifcModel = new IfcModel();
			ifcModel.addStepParserProgressListener(new StepParserProgressListener()
			{
				@Override
				public void progressActionPerformed(final ProgressEvent event) {
					progressBar.setValue((int) event.getCurrentState());
					progressBar.setStringPainted(true);
					progressBar.setString(event.getMessage());
				}
			});

			new Thread(new Runnable()
			{

				@Override
				public void run() {
					long startTime = System.currentTimeMillis();
					try {
						if(file.getAbsolutePath().endsWith("ifc"))
							ifcModel.readStepFile(file);
						else ifcModel.readIfcZipFile(file);
					}
					catch (Exception e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(StructureViewer.this,
								e.getMessage(), "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					long endTime = System.currentTimeMillis();
					progressBar.setValue(0);
					StructureViewer.this.setTitle(file.getName());
					progressBar.setStringPainted(false);
					treeView.setIfcModel(ifcModel);
					saveItem.setEnabled(true);
					renameProjectItem.setEnabled(true);
					String[] info = { "*************************\n", "File:\n",
							file.getName() + "\n\n", "Loading time:\n",
							(endTime - startTime) / 1000 + " seconds\n\n",
							"Number of elements:\n",
							"" + ifcModel.getNumberOfElements() + "\n",
							"*************************\n\n" };
					String[] initStyles = { "bold", "bold", "regular", "bold",
							"regular", "bold", "regular", "bold" };
					StyledDocument doc = infoPane.getStyledDocument();
					try {
						for (int i = info.length - 1; i >= 0; i--) {
							doc.insertString(0, info[i],
									doc.getStyle(initStyles[i]));
						}
					}
					catch (BadLocationException ble) {
						System.err
								.println("Couldn't insert initial text into text pane.");
					}
				}
			}).start();
		}
	}

	private void saveFile() {
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showSaveDialog(StructureViewer.this) == JFileChooser.APPROVE_OPTION)
		{

			final File file = fileChooser.getSelectedFile();
			ifcModel.addStepParserProgressListener(new StepParserProgressListener()
			{
				@Override
				public void progressActionPerformed(final ProgressEvent event) {
					progressBar.setValue((int) event.getCurrentState());
					progressBar.setStringPainted(true);
					progressBar.setString(event.getMessage());
				}
			});

			new Thread(new Runnable()
			{

				@Override
				public void run() {
					long startTime = System.currentTimeMillis();
					try {
						ifcModel.writeStepfile(file);
					}
					catch (IOException e) {
						e.printStackTrace();
					}
					long endTime = System.currentTimeMillis();
					progressBar.setValue(0);
					StructureViewer.this.setTitle(file.getName());
					progressBar.setStringPainted(false);
					treeView.setIfcModel(ifcModel);
					String[] info = { "*************************\n", "File:\n",
							file.getName() + "\n\n", "Saving time:\n",
							(endTime - startTime) / 1000 + " seconds\n\n",
							"Number of elements:\n",
							"" + ifcModel.getNumberOfElements() + "\n",
							"*************************\n\n" };
					String[] initStyles = { "bold", "bold", "regular", "bold",
							"regular", "bold", "regular", "bold" };
					StyledDocument doc = infoPane.getStyledDocument();
					try {
						for (int i = info.length - 1; i >= 0; i--) {
							doc.insertString(0, info[i],
									doc.getStyle(initStyles[i]));
						}
					}
					catch (BadLocationException ble) {
						System.err
								.println("Couldn't insert initial text into text pane.");
					}
				}
			}).start();
		}
	}

	protected void addStylesToDocument(StyledDocument doc) {
		Style def = StyleContext.getDefaultStyleContext().getStyle(
				StyleContext.DEFAULT_STYLE);

		Style regular = doc.addStyle("regular", def);
		StyleConstants.setFontFamily(def, "SansSerif");

		Style s = doc.addStyle("bold", regular);
		StyleConstants.setBold(s, true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		new StructureViewer();
	}

}
