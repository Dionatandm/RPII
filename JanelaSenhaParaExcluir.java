package ProgramaCadastro;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class JanelaSenhaParaExcluir extends JFrame implements ActionListener{
	private JPasswordField passwordField;

	public JanelaSenhaParaExcluir() {
		setTitle("Insira a Senha para confirmar a remoção do id");
		getContentPane().setLayout(null);

		JLabel senha = new JLabel("Senha:");
		senha.setBounds(176, 63, 87, 20);
		getContentPane().add(senha);

		passwordField = new JPasswordField();
		passwordField.setBounds(225, 63, 87, 20);
		getContentPane().add(passwordField);

		JButton Ok = new JButton("Confirma");
		Ok.setBounds(145, 103, 87, 23);
		getContentPane().add(Ok);
		Ok.setActionCommand("OK");
		Ok.addActionListener(this);

		JButton cancela = new JButton("Cancelar");
		cancela.setBounds(270, 103, 87, 23);
		getContentPane().add(cancela);
		cancela.setActionCommand("Exit");
		cancela.addActionListener(this);

		
		setSize(500,250);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String comando = (String) e.getActionCommand();

		if (comando.equals("OK")) 
			System.exit(0);

		if (comando.equals("Exit")) 
			System.exit(0);

	}
}
