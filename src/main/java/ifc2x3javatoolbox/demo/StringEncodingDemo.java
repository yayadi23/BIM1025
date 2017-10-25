package ifc2x3javatoolbox.demo;
import ifc2x3javatoolbox.ifc2x3tc1.StringConverter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class StringEncodingDemo extends JFrame
{

	private JRadioButton encodeAuto = new JRadioButton("auto");
	private JRadioButton encode1byte = new JRadioButton("1 byte");
	private JRadioButton encode2byte = new JRadioButton("2 byte");
	private JRadioButton encode4byte = new JRadioButton("4 byte");
	private JRadioButton encodeISO8859 = new JRadioButton("ISO-8859-");
	private JComboBox partCombo = new JComboBox(new Integer[] { 1, 2, 3, 4, 5,
			6, 7, 8, 9 });
	private JComboBox upperCombo = new JComboBox();
	private JComboBox lowerCombo = new JComboBox();
	private ActionListener upperListener;
	private ActionListener lowerListener;

	// private ItemListener upperListener;
	// private ItemListener lowerListener;

	public StringEncodingDemo()
	{
		initComponent();
	}

	private void initComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("OPEN IFC TOOLS - Text Encoding Demo");
		this.setLayout(new BorderLayout());
		this.setSize(500, 230);
		this.setMinimumSize(new Dimension(500, 230));
		this.setMaximizedBounds(new Rectangle(new Dimension(500, 230)));
		this.setMaximizedBounds(new Rectangle(new Dimension(2000, 230)));

		// create option panel
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(encodeAuto);
		buttonGroup.add(encode1byte);
		buttonGroup.add(encode2byte);
		buttonGroup.add(encode4byte);
		buttonGroup.add(encodeISO8859);
		encodeAuto.setSelected(true);

		encodeAuto.setFocusPainted(false);
		encode1byte.setFocusPainted(false);
		encode2byte.setFocusPainted(false);
		encode4byte.setFocusPainted(false);
		encodeISO8859.setFocusPainted(false);

		JPanel isoPanel = new JPanel(new FlowLayout());
		isoPanel.add(encodeISO8859);
		partCombo.setPreferredSize(new Dimension(40, 20));
		partCombo.setMaximumRowCount(9);
		partCombo.setBackground(Color.WHITE);
		partCombo.setSelectedIndex(0);
		isoPanel.add(partCombo);

		JPanel radioPanel = new JPanel(new FlowLayout());
		TitledBorder titledBorder = new TitledBorder(
				new LineBorder(Color.BLACK), "method (for encoding only)");
		radioPanel.setBorder(titledBorder);
		radioPanel.add(encodeAuto);
		radioPanel.add(encode1byte);
		radioPanel.add(encode2byte);
		radioPanel.add(encode4byte);
		radioPanel.add(isoPanel);

		// create upper input box
		BorderLayout borderLayout1 = new BorderLayout(10, 20);
		JPanel upperPanel = new JPanel(borderLayout1);
		upperPanel.setBorder(new EmptyBorder(15, 20, 10, 20));
		upperPanel.add(radioPanel, BorderLayout.NORTH);
		upperPanel.add(new JLabel("decoded text:"), BorderLayout.WEST);
		upperCombo.addItem("Bäume");
		upperCombo.setBackground(Color.WHITE);
		upperCombo.setToolTipText("select or enter a text");
		upperCombo.setEditable(true);
		upperCombo.setSelectedItem("");
		// upperListener = new ItemListener(){
		// @Override
		// public void itemStateChanged(ItemEvent e) {
		// lowerCombo.removeItemListener(lowerListener);
		// try{
		// if(encodeISO8859.isSelected()){
		// lowerCombo.setSelectedItem(StringConverter.encode_ISO8859((String)upperCombo.getSelectedItem(),
		// (Integer) partCombo.getSelectedItem()));
		// }
		// else if(encode1byte.isSelected()){
		// String decodedString = "";
		// for(char c : ((String)upperCombo.getSelectedItem()).toCharArray()){
		// decodedString+=StringConverter.encode_8bit(c);
		// }
		// lowerCombo.setSelectedItem(decodedString);
		// }
		// else if(encode2byte.isSelected()){
		// lowerCombo.setSelectedItem(StringConverter.encode_2byte((String)upperCombo.getSelectedItem()));
		// }
		// else if(encode4byte.isSelected()){
		// lowerCombo.setSelectedItem(StringConverter.encode_4byte((String)upperCombo.getSelectedItem()));
		// }
		// else if(encodeAuto.isSelected()){
		// lowerCombo.setSelectedItem(StringConverter.autoencode((String)upperCombo.getSelectedItem()));
		// }
		// }catch(Exception ex){
		// lowerCombo.setSelectedItem("### wrong input ###");
		// // ex.printStackTrace();
		// }
		// lowerCombo.addItemListener(lowerListener);
		// }
		// };
		// upperCombo.addItemListener(upperListener);
		upperListener = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				lowerCombo.removeActionListener(lowerListener);
				try {
					if (encodeISO8859.isSelected()) {
						lowerCombo.setSelectedItem(StringConverter
								.encode_ISO8859(
										(String) upperCombo.getSelectedItem(),
										(Integer) partCombo.getSelectedItem()));
					} else if (encode1byte.isSelected()) {
						String decodedString = "";
						for (char c : ((String) upperCombo.getSelectedItem())
								.toCharArray())
						{
							decodedString += StringConverter.encode_8bit(c);
						}
						lowerCombo.setSelectedItem(decodedString);
					} else if (encode2byte.isSelected()) {
						lowerCombo.setSelectedItem(StringConverter
								.encode_2byte((String) upperCombo
										.getSelectedItem()));
					} else if (encode4byte.isSelected()) {
						lowerCombo.setSelectedItem(StringConverter
								.encode_4byte((String) upperCombo
										.getSelectedItem()));
					} else if (encodeAuto.isSelected()) {
						lowerCombo.setSelectedItem(StringConverter
								.autoencode((String) upperCombo
										.getSelectedItem()));
					}
				}
				catch (Exception ex) {
					lowerCombo.setSelectedItem("### wrong input ###");
					// ex.printStackTrace();
				}
				lowerCombo.addActionListener(lowerListener);
			}
		};
		upperCombo.addActionListener(upperListener);
		upperPanel.add(upperCombo, BorderLayout.CENTER);

		// create lower input box
		BorderLayout borderLayout2 = new BorderLayout(10, 20);
		JPanel lowerPanel = new JPanel(borderLayout2);
		lowerPanel.setBorder(new EmptyBorder(10, 20, 15, 20));
		lowerPanel.add(new JLabel("encoded text:"), BorderLayout.WEST);
		lowerCombo.addItem("\\PE\\\\S\\*\\S\\U\\S\\b");
		lowerCombo.addItem("Don\'\'t");
		lowerCombo.addItem("single backslash \\\\ test");
		lowerCombo.addItem("see \\X\\A7 4.1");
		lowerCombo.addItem("\\X2\\0042\\X0\\");
		lowerCombo.addItem("\\X4\\00000042\\X0\\");
		lowerCombo.addItem("\\X4\\0000004200000042\\X0\\");
		lowerCombo.setBackground(Color.WHITE);
		lowerCombo.setToolTipText("select or enter an encoded text");
		lowerCombo.setEditable(true);
		lowerCombo.setSelectedItem("");
		// lowerListener = new ItemListener(){
		// @Override
		// public void itemStateChanged(ItemEvent e) {
		// upperCombo.removeItemListener(upperListener);
		// try {
		// upperCombo.setSelectedItem(StringConverter.decode((String)lowerCombo.getSelectedItem()));
		// } catch (Exception ex) {
		// upperCombo.setSelectedItem("### wrong input ###");
		// // ex.printStackTrace();
		// }
		// upperCombo.addItemListener(upperListener);
		// }
		// };
		// lowerCombo.addItemListener(lowerListener);
		lowerListener = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				upperCombo.removeActionListener(upperListener);
				try {
					upperCombo.setSelectedItem(StringConverter
							.decode((String) lowerCombo.getSelectedItem()));
				}
				catch (Exception ex) {
					upperCombo.setSelectedItem("### wrong input ###");
					// ex.printStackTrace();
				}
				upperCombo.addActionListener(upperListener);
			}
		};
		lowerCombo.addActionListener(lowerListener);
		lowerPanel.add(lowerCombo, BorderLayout.CENTER);

		// place boxes into the JFrame, use empty JPanel for nice resize
		// behavior
		JPanel contentPanel = new JPanel(new BorderLayout());
		contentPanel.add(upperPanel, BorderLayout.NORTH);
		contentPanel.add(lowerPanel, BorderLayout.CENTER);
		this.add(contentPanel, BorderLayout.NORTH);
		this.add(new JPanel(), BorderLayout.CENTER);

		// set frame to visible
		this.setVisible(true);
	}

	public static void main(String args[]) {
		new StringEncodingDemo();
	}
}
