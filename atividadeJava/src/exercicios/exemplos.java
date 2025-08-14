package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class exemplos {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exemplos window = new exemplos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exemplos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 584, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Monitor", "Teclado", "Notebook"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBackground(new Color(255, 128, 192));
		list_1.setBounds(34, 11, 130, 138);
		frame.getContentPane().add(list_1);
		
		JList list = new JList();
		list.setBounds(308, 11, 130, 138);
		frame.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultListModel dlm = new DefaultListModel();
				list.setModel(dlm);
				
				list_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

				for(Iterator it = list_1.getSelectedValuesList().iterator(); it.hasNext(); ) {
					String itemSelecionado = (String) it.next();
					if (!dlm.contains(itemSelecionado)) {
						dlm.addElement(itemSelecionado);
					}
				}
			}
		});
		btnNewButton.setBounds(174, 92, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(34, 295, 150, 124);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rbPraia = new JRadioButton("Praia");
		buttonGroup_1.add(rbPraia);
		rbPraia.setBounds(18, 44, 109, 23);
		panel.add(rbPraia);
		
		JRadioButton rbCampo = new JRadioButton("Campo");
		buttonGroup_1.add(rbCampo);
		rbCampo.setBounds(18, 70, 109, 23);
		panel.add(rbCampo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(34, 160, 150, 124);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Manhã");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(18, 22, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tarde");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(18, 48, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNoite = new JRadioButton("Noite");
		buttonGroup.add(rdbtnNoite);
		rdbtnNoite.setBounds(18, 74, 109, 23);
		panel_1.add(rdbtnNoite);
		
		JButton btnSelecionar = new JButton("Selecione");
		btnSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbPraia.isSelected() == true) {
					JOptionPane.showMessageDialog(null, "A Praia foi selecionada");
				}
				if(rbCampo.isSelected() == true){
					JOptionPane.showMessageDialog(null, "O campo foi selecionado");
				}
			}
		});
		btnSelecionar.setBounds(43, 460, 102, 23);
		frame.getContentPane().add(btnSelecionar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(194, 160, 141, 124);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox ckbYoutube = new JCheckBox("YouTube");
		ckbYoutube.setBounds(16, 42, 97, 23);
		panel_2.add(ckbYoutube);
		
		JCheckBox ckbTiktok = new JCheckBox("TikTok");
		ckbTiktok.setBounds(16, 68, 97, 23);
		panel_2.add(ckbTiktok);
		
		JCheckBox ckbInstagram = new JCheckBox("Instagram");
		ckbInstagram.setBounds(16, 16, 97, 23);
		panel_2.add(ckbInstagram);
		
		table = new JTable();
		table.setBounds(223, 318, 0, 0);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Nome", "Idade", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setBounds(204, 295, 331, 184);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(211,323,293,146);
		
		
		frame.getContentPane().add(scrollPane);
		
		
	}
}
