package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class exercicio4 {

	private JFrame frmCombobox;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio4 window = new exercicio4();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.getContentPane().setBackground(new Color(192, 192, 192));
		frmCombobox.setTitle("COMBOBOX");
		frmCombobox.setBounds(100, 100, 450, 300);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Modelos Populares Brasileiros");
		label1.setForeground(new Color(0, 0, 255));
		label1.setBounds(47, 21, 181, 14);
		frmCombobox.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Modelo:");
		label2.setForeground(new Color(255, 0, 0));
		label2.setBounds(47, 56, 89, 14);
		frmCombobox.getContentPane().add(label2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "Gol"){
					textField.setText("Volkswagem");
				}if(comboBox.getSelectedItem() == "Corsa"){
					textField.setText("Chevrolet");
				}if(comboBox.getSelectedItem() == "Palio"){
					textField.setText("Fiat");
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gol", "Corsa", "Palio", "--"}));
		comboBox.setBounds(47, 81, 154, 22);
		frmCombobox.getContentPane().add(comboBox);
		
		JLabel label3 = new JLabel("Montadora:");
		label3.setForeground(new Color(255, 0, 0));
		label3.setBounds(47, 124, 77, 14);
		frmCombobox.getContentPane().add(label3);
		
		textField = new JTextField();
		textField.setBounds(47, 149, 154, 20);
		frmCombobox.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				comboBox.setSelectedItem("--"); 
			}
		});
		limpar.setBounds(47, 199, 89, 23);
		frmCombobox.getContentPane().add(limpar);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(156, 199, 89, 23);
		frmCombobox.getContentPane().add(sair);
	}
}
