package ifc2x3javatoolbox.demo;
import ifc2x3javatoolbox.guidcompressor.GuidCompressor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 * An application that demonstrates the conversion between a UUID and an IFC
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class GuidCompressionDemo extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JComboBox upperCombo = new JComboBox();
	private JComboBox lowerCombo = new JComboBox();
	private ItemListener upperListener;
	private ItemListener lowerListener;

	/**
	 * Creates a new GuidCompressionDemo object.
	 */
	public GuidCompressionDemo()
	{
		initComponent();
	}

	private void initComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("OPEN IFC TOOLS - GUID Compression Demo");
		this.setLayout(new BorderLayout());
		this.setSize(500, 160);
		this.setMinimumSize(new Dimension(300, 160));
		this.setMaximizedBounds(new Rectangle(new Dimension(300, 160)));
		this.setMaximizedBounds(new Rectangle(new Dimension(2000, 160)));

		// create upper input box
		BorderLayout borderLayout1 = new BorderLayout(10, 20);
		JPanel upperPanel = new JPanel(borderLayout1);
		upperPanel.setBorder(new EmptyBorder(15, 20, 10, 20));
		JLabel label1 = new JLabel("UUID:");
		label1.setPreferredSize(new Dimension(120, 25));
		upperPanel.add(label1, BorderLayout.WEST);
		upperCombo.addItem("9d6e075e-7fe0-400d-8cf7-d2e0f68d6a65");
		upperCombo.addItem("3520734c-afdb-418c-a33a-859cec5ee95b");
		upperCombo.setBackground(Color.WHITE);
		upperCombo.setToolTipText("select or enter a GUID");
		upperCombo.setEditable(true);
		upperCombo.setSelectedItem("");
		upperListener = new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent e) {
				lowerCombo.removeItemListener(lowerListener);
				try {
					lowerCombo.setSelectedItem(GuidCompressor
							.compressGuidString((String) upperCombo
									.getSelectedItem()));
				}
				catch (Exception ex) {
					lowerCombo.setSelectedItem("### wrong input ###");
				}
				lowerCombo.addItemListener(lowerListener);
			}
		};
		upperCombo.addItemListener(upperListener);
		upperPanel.add(upperCombo, BorderLayout.CENTER);

		// create lower input box
		BorderLayout borderLayout2 = new BorderLayout(10, 20);
		JPanel lowerPanel = new JPanel(borderLayout2);
		lowerPanel.setBorder(new EmptyBorder(10, 20, 15, 20));
		JLabel label2 = new JLabel("IFC GUID:");
		label2.setPreferredSize(new Dimension(120, 25));
		lowerPanel.add(label2, BorderLayout.WEST);
		lowerCombo.addItem("2TRWTUV_103Optqk3sZMfb");
		lowerCombo.addItem("0r87DChzj1ZACwXPpiNkbR");
		lowerCombo.setBackground(Color.WHITE);
		lowerCombo.setToolTipText("select or enter a compressed GUID");
		lowerCombo.setEditable(true);
		lowerCombo.setSelectedItem("");
		lowerListener = new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent e) {
				try {
					upperCombo.removeItemListener(upperListener);
					upperCombo.setSelectedItem(GuidCompressor
							.uncompressGuidString((String) lowerCombo
									.getSelectedItem()));
					upperCombo.addItemListener(upperListener);
				}
				catch (Exception ex) {
					upperCombo.removeItemListener(upperListener);
					upperCombo.setSelectedItem("### wrong input ###");
					upperCombo.addItemListener(upperListener);
				}
			}
		};
		lowerCombo.addItemListener(lowerListener);
		lowerPanel.add(lowerCombo, BorderLayout.CENTER);

		// create panel with button
		JButton generateButton = new JButton("new GUID");
		generateButton.setToolTipText("generates a new GUID");
		generateButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				lowerCombo.setSelectedItem(GuidCompressor
						.getNewIfcGloballyUniqueId());
			}
		});

		// place boxes into the JFrame, use empty JPanel for nice resize
		// behavior
		JPanel contentPanel = new JPanel(new BorderLayout());
		contentPanel.add(upperPanel, BorderLayout.NORTH);
		contentPanel.add(lowerPanel, BorderLayout.CENTER);
		this.add(contentPanel, BorderLayout.NORTH);
		this.add(new JPanel(), BorderLayout.CENTER);
		this.add(generateButton, BorderLayout.SOUTH);

		// set frame to visible
		this.setVisible(true);
	}

	/**
	 * Main method to start the GuidCompressionDemo
	 * @param args
	 *            no arguments needed
	 */
	public static void main(String args[]) {
		new GuidCompressionDemo();
	}
}
