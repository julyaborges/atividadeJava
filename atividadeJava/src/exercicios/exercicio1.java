package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class exercicio1 {

	private JFrame frmExerccio;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio1 window = new exercicio1();
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
	public exercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerccio = new JFrame();
		frmExerccio.setTitle("Exercício 01");
		frmExerccio.setBounds(100, 100, 366, 244);
		frmExerccio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerccio.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Número 1:");
		label1.setBounds(66, 46, 78, 14);
		frmExerccio.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Número 2:");
		label2.setBounds(66, 96, 78, 14);
		frmExerccio.getContentPane().add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(175, 43, 101, 20);
		frmExerccio.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(175, 93, 101, 20);
		frmExerccio.getContentPane().add(textField2);
		
		JButton btnCalculaSoma = new JButton("Calcula Soma");
		btnCalculaSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField1.getText());   
				double num2 = Double.parseDouble(textField2.getText());   
				
				double soma = num1 + num2;
				
				String resultado = String.format("A soma dos dois números: %.2f", soma);
	            JOptionPane.showMessageDialog(null, resultado, "Mensagem", 1);
			}
		});
		btnCalculaSoma.setBounds(160, 156, 116, 20);
		frmExerccio.getContentPane().add(btnCalculaSoma);
	}
}
