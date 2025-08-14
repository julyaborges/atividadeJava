package exercicios;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.AbstractListModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class cartaoVisita {

	private JFrame frame;
	private JTextField txtMensagem;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cartaoVisita window = new cartaoVisita();
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
	public cartaoVisita() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuCartao = new JMenuItem("Abrir Cartão de Visita");
		menuCartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundoCartao st = new segundoCartao();
				st.setVisible(true);
			}
		});
		menuCartao.setSelected(true);
		mnNewMenu.add(menuCartao);
		
		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_1);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(0, 0, 581, 159);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbMensagem = new JLabel("Digite uma Mensagem:");
		lbMensagem.setBounds(10, 70, 138, 14);
		panel.add(lbMensagem);
		
		txtMensagem = new JTextField();
		txtMensagem.setBounds(10, 95, 196, 20);
		panel.add(txtMensagem);
		txtMensagem.setColumns(10);
		
		JButton btMensagem = new JButton("Mostra Mensagem");
		btMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = txtMensagem.getText();
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		btMensagem.setBounds(10, 126, 165, 23);
		panel.add(btMensagem);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "Petri"},
				{new Integer(2), "Francini"},
				{new Integer(3), "Claudia"},
				{new Integer(4), "Talita"},
			},
			new String[] {
				"C\u00F3digo", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(288, 11, 283, 104);
		panel.add(scrollPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "Rosa"){
					table.setBackground(Color.pink);
				}if(comboBox.getSelectedItem() == "Amarelo"){
					table.setBackground(Color.yellow);;
				}if(comboBox.getSelectedItem() == "Vermelho"){
					table.setBackground(Color.red);
				}if(comboBox.getSelectedItem() == "Azul"){
					table.setBackground(Color.blue);
				}if(comboBox.getSelectedItem() == "Selecione uma cor para a Tabela"){
					table.setBackground(UIManager.getColor("Table.background"));
					table.setForeground(UIManager.getColor("Table.foreground"));

				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma cor para a Tabela", "Rosa", "Amarelo", "Vermelho", "Azul"}));
		comboBox.setBounds(353, 126, 218, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(0, 128, 581, 306);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox ckbJornal = new JCheckBox("Jornal");
		ckbJornal.setBounds(18, 51, 97, 23);
		panel_1.add(ckbJornal);
		
		JCheckBox ckbRevista = new JCheckBox("Revista");
		ckbRevista.setBounds(18, 80, 97, 23);
		panel_1.add(ckbRevista);
		
		JCheckBox ckbCd = new JCheckBox("CD / DVD");
		ckbCd.setBounds(18, 106, 97, 23);
		panel_1.add(ckbCd);
		
		JButton btItens = new JButton("Itens Selecionados");
		btItens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder selecionados = new StringBuilder("Você marcou:\n");
				
				if(ckbJornal.isSelected() == true) {
					selecionados.append(ckbJornal.getText()).append("\n");
				}
				if(ckbRevista.isSelected() == true){
					selecionados.append(ckbRevista.getText()).append("\n");
				}
				if(ckbCd.isSelected() == true){
					selecionados.append(ckbCd.getText()).append("\n");
				}
				
				 JOptionPane.showMessageDialog(null, selecionados.toString());
			}
		});
		btItens.setBounds(141, 80, 156, 23);
		panel_1.add(btItens);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Teclado", "Mouse", "Monitor", "CPU"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list.setBounds(313, 54, 124, 159);
		panel_1.add(list);
		
		JList list_1 = new JList();
		list_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list_1.setBounds(447, 54, 124, 159);
		panel_1.add(list_1);
		
		JButton btConfirma = new JButton("Confirma");
		btConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel dlm = new DefaultListModel();
				list_1.setModel(dlm);
				
				list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

				for(Iterator it = list.getSelectedValuesList().iterator(); it.hasNext(); ) {
					String itemSelecionado = (String) it.next();
					if (!dlm.contains(itemSelecionado)) {
						dlm.addElement(itemSelecionado);
					}
				}
			}
		});
		btConfirma.setBounds(402, 227, 89, 23);
		panel_1.add(btConfirma);
		
		JRadioButton rbtFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rbtFeminino);
		rbtFeminino.setBounds(6, 217, 109, 23);
		panel_1.add(rbtFeminino);
		
		JRadioButton rbtMasculino = new JRadioButton("Masculino");
		buttonGroup.add(rbtMasculino);
		rbtMasculino.setBounds(6, 191, 109, 23);
		panel_1.add(rbtMasculino);
		
		JList list_2 = new JList();
		list_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list_2.setBounds(133, 194, 164, 76);
		panel_1.add(list_2);
		
		JButton btInserir = new JButton("Inserir");
		btInserir.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        DefaultListModel<String> dlm;
		        if (list_2.getModel() instanceof DefaultListModel) {
		            dlm = (DefaultListModel<String>) list_2.getModel();
		        } else {
		            dlm = new DefaultListModel<>();
		            list_2.setModel(dlm);
		        }

		        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		        for (Object item : list.getSelectedValuesList()) {
		            if (!dlm.contains(item.toString())) {
		                dlm.addElement(item.toString());
		            }
		        }

		        if (rbtFeminino.isSelected()) {
		            dlm.removeElement("Masculino"); // garante que Masculino some
		            if (!dlm.contains("Feminino")) {
		                dlm.addElement("Feminino");
		            }
		        }

		        if (rbtMasculino.isSelected()) {
		            dlm.removeElement("Feminino"); // garante que Feminino some
		            if (!dlm.contains("Masculino")) {
		                dlm.addElement("Masculino");
		            }
		        }
		    }
		});
		btInserir.setBounds(18, 247, 89, 23);
		panel_1.add(btInserir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(453, 445, 117, 23);
		frame.getContentPane().add(btnSair);
		
	
	}
}
