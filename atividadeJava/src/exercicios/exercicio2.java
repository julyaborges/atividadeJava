package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exercicio2 {

	private JFrame frmExerccio;
	private JTextField textField1;
	private JTextField textField2;
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
					exercicio2 window = new exercicio2();
					window.frmExerccio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerccio = new JFrame();
		frmExerccio.setTitle("Exercício 02");
		frmExerccio.setBounds(100, 100, 419, 300);
		frmExerccio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerccio.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Número 1:");
		label1.setBounds(21, 35, 71, 14);
		frmExerccio.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Número 2:");
		label2.setBounds(21, 75, 71, 14);
		frmExerccio.getContentPane().add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(133, 32, 86, 20);
		frmExerccio.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(133, 72, 86, 20);
		frmExerccio.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton sair = new JButton("SAIR");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmExerccio.dispose();
			}
		});
		sair.setBounds(132, 116, 89, 23);
		frmExerccio.getContentPane().add(sair);
		
		JButton soma = new JButton("SOMA");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				resultado = String.format("A soma dos dois números: %.2f", (num1+num2));
	            JOptionPane.showMessageDialog(null, resultado, "Mensagem", 1);     
			}
		});
		soma.setBounds(263, 31, 103, 23);
		frmExerccio.getContentPane().add(soma);
		
		JButton subtrai = new JButton("SUBTRAI");
		subtrai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				resultado = String.format("Subtração dos dois números: %.2f", (num1-num2));
	            JOptionPane.showMessageDialog(null, resultado, "Mensagem", 1);
			}
		});
		subtrai.setBounds(263, 71, 103, 23);
		frmExerccio.getContentPane().add(subtrai);
		
		JButton multiplica = new JButton("MULTIPLICA");
		multiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				resultado = String.format("Multiplicação dos dois números: %.2f", (num1*num2));
	            JOptionPane.showMessageDialog(null, resultado, "Mensagem", 1);
			}
		});
		multiplica.setBounds(263, 116, 103, 23);
		frmExerccio.getContentPane().add(multiplica);
		
		JButton divide = new JButton("DIVIDE");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				num2 = Double.parseDouble(textField2.getText());   
				resultado = String.format("Divisão dos dois números: %.2f", (num1/num2));
	            JOptionPane.showMessageDialog(null, resultado, "Mensagem", 1);
			}
		});
		divide.setBounds(263, 157, 103, 23);
		frmExerccio.getContentPane().add(divide);
	}
}
