package exercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class segundoCartao extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			segundoCartao dialog = new segundoCartao();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public segundoCartao() {
		setBounds(100, 100, 538, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 128, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbCartao = new JLabel("Olá! eu sou a Ana Julya, e esse é o meu cartão de visita!");
		lbCartao.setForeground(new Color(255, 255, 255));
		lbCartao.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 19));
		lbCartao.setBounds(20, 28, 484, 20);
		contentPanel.add(lbCartao);
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(segundoCartao.class.getResource("/exercicios/images-removebg-preview.png")));
			lblNewLabel.setBounds(283, 138, 229, 159);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblTenhoAnos = new JLabel("Tenho 19 anos e vivo em Joinville.");
		lblTenhoAnos.setForeground(Color.WHITE);
		lblTenhoAnos.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 17));
		lblTenhoAnos.setBounds(20, 58, 484, 20);
		contentPanel.add(lblTenhoAnos);
		
		JLabel lblSouEstudanteE = new JLabel("Sou estudante de desenvolvimento de sistemas");
		lblSouEstudanteE.setForeground(Color.WHITE);
		lblSouEstudanteE.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 17));
		lblSouEstudanteE.setBounds(20, 89, 484, 20);
		contentPanel.add(lblSouEstudanteE);
		
		JLabel lblAmoLerE = new JLabel("Amo ler e adoro aprender \r\ncoisas novas!!!!");
		lblAmoLerE.setForeground(Color.WHITE);
		lblAmoLerE.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 17));
		lblAmoLerE.setBounds(20, 120, 371, 20);
		contentPanel.add(lblAmoLerE);
		
		JLabel lblM = new JLabel("Mude a cor do fundo:");
		lblM.setForeground(Color.WHITE);
		lblM.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 17));
		lblM.setBounds(20, 164, 371, 20);
		contentPanel.add(lblM);
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 128, 192));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
				JComboBox comboBox = new JComboBox();
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(comboBox.getSelectedItem() == "Rosa"){
							contentPanel.setBackground(new Color(255, 182, 193));
							buttonPane.setBackground(new Color(255, 182, 193));
							lbCartao.setForeground(Color.white);
							lblTenhoAnos.setForeground(Color.white);
							lblSouEstudanteE.setForeground(Color.white);
							lblAmoLerE.setForeground(Color.white);
							lblM.setForeground(Color.white);
						}if(comboBox.getSelectedItem() == "Amarelo"){
							contentPanel.setBackground(new Color(255, 255, 204));
							buttonPane.setBackground(new Color(255, 255, 204));
							lbCartao.setForeground(new Color(255, 102, 102));
							lblTenhoAnos.setForeground(new Color(255, 102, 102));
							lblSouEstudanteE.setForeground(new Color(255, 102, 102));
							lblAmoLerE.setForeground(new Color(255, 102, 102));
							lblM.setForeground(new Color(255, 102, 102));
						}if(comboBox.getSelectedItem() == "Vermelho"){
							contentPanel.setBackground(new Color(255, 102, 102));
							buttonPane.setBackground(new Color(255, 102, 102));
							lbCartao.setForeground(Color.white);
							lblTenhoAnos.setForeground(Color.white);
							lblSouEstudanteE.setForeground(Color.white);
							lblAmoLerE.setForeground(Color.white);
							lblM.setForeground(Color.white);
						}
					}
				});
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rosa", "Vermelho", "Amarelo"}));
				comboBox.setBounds(20, 195, 217, 22);
				contentPanel.add(comboBox);
			
			}
		}
	}
}
