package gym2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Gym2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtIvanDrago;
	private JTextField txtSibiriengatan;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtDraggehotmailcom;
	private JTextField textField_6;
	private JTextField txtSovjet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gym2 frame = new Gym2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gym2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmMerHjlp = new JMenuItem("Mer hj\u00E4lp ");
		mnHjlp.add(mntmMerHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, 240, SpringLayout.WEST, contentPane);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Ivan Drago"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nr.", "Namn"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(0).setMaxWidth(1000000);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setMaxWidth(300);
		scrollPane.setViewportView(table);
		
		JButton btnSpara = new JButton("Spara");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSpara, 545, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSpara, -27, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSpara, -40, SpringLayout.EAST, contentPane);
		contentPane.add(btnSpara);
		
		textField = new JTextField();
		textField.setText("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -263, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("19731009-5679");
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, -190, SpringLayout.EAST, contentPane);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtIvanDrago = new JTextField();
		txtIvanDrago.setText("Ivan Drago");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtIvanDrago, 6, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtIvanDrago, -190, SpringLayout.EAST, contentPane);
		contentPane.add(txtIvanDrago);
		txtIvanDrago.setColumns(10);
		
		JLabel lblMedlemNr = new JLabel("Medlem nr.");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblMedlemNr, -346, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.EAST, lblMedlemNr);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMedlemNr, 3, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMedlemNr, 25, SpringLayout.EAST, scrollPane);
		contentPane.add(lblMedlemNr);
		
		JLabel lblNamn = new JLabel("Namn");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNamn, 25, SpringLayout.EAST, scrollPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNamn, -363, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtIvanDrago, 27, SpringLayout.EAST, lblNamn);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNamn, 3, SpringLayout.NORTH, txtIvanDrago);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Person nr.");
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, -3, SpringLayout.NORTH, lblPersonnummer);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPersonnummer, 13, SpringLayout.SOUTH, lblNamn);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPersonnummer, 0, SpringLayout.WEST, lblMedlemNr);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPersonnummer, -346, SpringLayout.EAST, contentPane);
		contentPane.add(lblPersonnummer);
		
		JLabel lblAdress = new JLabel("Gata\r\n");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAdress, 0, SpringLayout.WEST, lblMedlemNr);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblAdress, -173, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblAdress, 0, SpringLayout.EAST, lblNamn);
		contentPane.add(lblAdress);
		
		JLabel lblTlfnNr = new JLabel("Tlfn nr.");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTlfnNr, 0, SpringLayout.WEST, lblMedlemNr);
		contentPane.add(lblTlfnNr);
		
		JLabel lblEpost = new JLabel("E-Post");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEpost, 25, SpringLayout.EAST, scrollPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblEpost, 0, SpringLayout.EAST, lblNamn);
		contentPane.add(lblEpost);
		
		txtSibiriengatan = new JTextField();
		txtSibiriengatan.setText("Sibiriengatan 4 ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtSibiriengatan, -3, SpringLayout.NORTH, lblAdress);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtSibiriengatan, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtSibiriengatan, 0, SpringLayout.EAST, textField_1);
		contentPane.add(txtSibiriengatan);
		txtSibiriengatan.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("+25 7723894729834");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTlfnNr, 3, SpringLayout.NORTH, textField_4);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTlfnNr, -27, SpringLayout.WEST, textField_4);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_4, 338, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_1);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_5, 269, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_5, -92, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_4, -6, SpringLayout.NORTH, textField_5);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_5, -190, SpringLayout.EAST, contentPane);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAdress_1 = new JLabel("Postnr. / Ort");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAdress_1, 0, SpringLayout.WEST, lblMedlemNr);
		contentPane.add(lblAdress_1);
		
		JLabel lblMobilNr = new JLabel("Mobil nr.");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMobilNr, 272, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMobilNr, 0, SpringLayout.WEST, lblMedlemNr);
		contentPane.add(lblMobilNr);
		
		txtDraggehotmailcom = new JTextField();
		txtDraggehotmailcom.setText("Dragge73@hotmail.com");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEpost, 3, SpringLayout.NORTH, txtDraggehotmailcom);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDraggehotmailcom, 6, SpringLayout.SOUTH, textField_5);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDraggehotmailcom, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtDraggehotmailcom, 0, SpringLayout.EAST, textField_1);
		contentPane.add(txtDraggehotmailcom);
		txtDraggehotmailcom.setColumns(10);
		
		textField_6 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblAdress_1, 3, SpringLayout.NORTH, textField_6);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_6, 6, SpringLayout.SOUTH, txtSibiriengatan);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_6, -105, SpringLayout.EAST, textField_1);
		textField_6.setText("22738");
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gym2.class.getResource("/gym2/img/drago.jpg")));
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 104, SpringLayout.EAST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label, 134, SpringLayout.NORTH, txtIvanDrago);
		sl_contentPane.putConstraint(SpringLayout.EAST, label, -29, SpringLayout.EAST, contentPane);
		contentPane.add(label);
		
		txtSovjet = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtSovjet, 6, SpringLayout.SOUTH, txtSibiriengatan);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtSovjet, 6, SpringLayout.EAST, textField_6);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtSovjet, -190, SpringLayout.EAST, contentPane);
		txtSovjet.setText("Sovjet");
		contentPane.add(txtSovjet);
		txtSovjet.setColumns(10);
	}
}
