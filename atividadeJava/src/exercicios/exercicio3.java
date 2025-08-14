package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class exercicio3 {

	private JFrame frmCalculadora;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private double num1;
	private double num2;
	private String resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio3 window = new exercicio3();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setForeground(new Color(192, 192, 192));
		frmCalculadora.setBounds(100, 100, 639, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Número 1:");
		label1.setBounds(27, 35, 68, 14);
		frmCalculadora.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Número 2:");
		label2.setBounds(27, 72, 68, 14);
		frmCalculadora.getContentPane().add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(123, 32, 100, 20);
		frmCalculadora.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(123, 69, 100, 20);
		frmCalculadora.getContentPane().add(textField2);
		
		JLabel label3 = new JLabel("Resultado");
		label3.setBounds(32, 199, 117, 14);
		frmCalculadora.getContentPane().add(label3);
		
		JButton soma = new JButton("SOMA");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				textField3.setText("" + (num1 + num2));
				label3.setText("Resultado da Soma:");
			}
		});
		soma.setBounds(277, 31, 103, 23);
		frmCalculadora.getContentPane().add(soma);
		
		JButton subtrai = new JButton("SUBTRAI");
		subtrai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				textField3.setText("" + (num1 - num2));
				label3.setText("Resultado da Subtração:");
			}
		});
		subtrai.setBounds(277, 68, 103, 23);
		frmCalculadora.getContentPane().add(subtrai);
		
		JButton multiplica = new JButton("MULTIPLICA");
		multiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				textField3.setText("" + (num1 * num2));
				label3.setText("Resultado da Multiplicação:");
			}
		});
		multiplica.setBounds(277, 104, 103, 23);
		frmCalculadora.getContentPane().add(multiplica);
		
		JButton divide = new JButton("DIVIDE");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				textField3.setText("" + (num1 / num2));
				label3.setText("Resultado da Divisão:");
			}
		});
		divide.setBounds(277, 138, 103, 23);
		frmCalculadora.getContentPane().add(divide);
		
		JButton limpa = new JButton("LIMPA");
		limpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(null);
				textField2.setText(null);
				textField3.setText(null);
				label3.setText("Resultado:");
			}
		});
		limpa.setBounds(277, 175, 103, 23);
		frmCalculadora.getContentPane().add(limpa);
		
		JButton sair = new JButton("SAIR");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(277, 213, 103, 23);
		frmCalculadora.getContentPane().add(sair);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(137, 214, 86, 20);
		frmCalculadora.getContentPane().add(textField3);
		
		JButton novaTela = new JButton("ABRIR");
		novaTela.setToolTipText("ABRIR SEGUNDA TELA");
		novaTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundaTela st = new segundaTela();
				//st.show();
				st.setVisible(true);
			}
		});
		novaTela.setBounds(134, 155, 89, 23);
		frmCalculadora.getContentPane().add(novaTela);
		
		JTextArea txtrreaDeTexto = new JTextArea();
		txtrreaDeTexto.setText("Área de Texto");
		txtrreaDeTexto.setBounds(27, 100, 196, 44);
		frmCalculadora.getContentPane().add(txtrreaDeTexto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(comboBox.getSelectedItem() == "Leite") {
				frmCalculadora.getContentPane().setBackground(Color.white);
			}if(comboBox.getSelectedItem() == "Milho") {
				frmCalculadora.getContentPane().setBackground(Color.yellow);
			}if(comboBox.getSelectedItem() == "Arroz"){
				frmCalculadora.getContentPane().setBackground(Color.cyan);
			}if(comboBox.getSelectedItem() == "Macarrão"){
				frmCalculadora.getContentPane().setBackground(Color.red);
			}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Feijão", "Arroz", "Macarrão", "Milho", "Leite"}));
		comboBox.setBounds(418, 31, 125, 22);
		frmCalculadora.getContentPane().add(comboBox);
		
		JButton btnMudar = new JButton("MUDAR DE COR");
		btnMudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "Feijão") {
					frmCalculadora.getContentPane().setBackground(Color.black);
					label1.setForeground(Color.white);
					label2.setForeground(Color.white);
					label3.setForeground(Color.white);
				}if(comboBox.getSelectedItem() == "Leite") {
					frmCalculadora.getContentPane().setBackground(Color.white);
				}if(comboBox.getSelectedItem() == "Milho") {
					frmCalculadora.getContentPane().setBackground(Color.yellow);
				}if(comboBox.getSelectedItem() == "Arroz"){
					frmCalculadora.getContentPane().setBackground(Color.cyan);
				}if(comboBox.getSelectedItem() == "Macarrão"){
					frmCalculadora.getContentPane().setBackground(Color.red);
				}
			}
		});
		btnMudar.setBounds(418, 68, 125, 23);
		frmCalculadora.getContentPane().add(btnMudar);
	}
}
