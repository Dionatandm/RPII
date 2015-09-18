package ProgramaCadastro;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Button;
import java.awt.event.ActionEvent;

public class JanelaRemoverID  extends JFrame implements ActionListener{

	public JanelaRemoverID() {

		setTitle("Remover id");

		getContentPane().setLayout(null);

		JLabel P1 = new JLabel("id123123 - Cliente Fulano de tal");
		P1.setBounds(72, 25, 197, 23);
		getContentPane().add(P1);

		Button B1 = new Button("Excluir");
		B1.setBounds(20, 25, 46, 22);
		getContentPane().add(B1);
		B1.setActionCommand("Excluir");
		B1.addActionListener(this);

		JLabel P2 = new JLabel("id123123 - Cliente Fulano de tal");
		P2.setBounds(72, 50, 197, 23);
		getContentPane().add(P2);

		Button B2 = new Button("Excluir");
		B2.setBounds(20, 50, 46, 22);
		getContentPane().add(B2);
		B2.setActionCommand("Excluir");
		B2.addActionListener(this);

		JLabel P3 = new JLabel("id123123 - Cliente Fulano de tal");
		P3.setBounds(72, 75, 197, 23);
		getContentPane().add(P3);

		Button B3 = new Button("Excluir");
		B3.setBounds(20, 75, 46, 22);
		getContentPane().add(B3);
		B3.setActionCommand("Excluir");
		B3.addActionListener(this);

		JLabel P4 = new JLabel("id123123 - Cliente Fulano de tal");
		P4.setBounds(72, 100, 197, 23);
		getContentPane().add(P4);

		Button B4 = new Button("Excluir");
		B4.setBounds(20, 100, 46, 22);
		getContentPane().add(B4);
		B4.setActionCommand("Excluir");
		B4.addActionListener(this);

		JLabel P5 = new JLabel("id123123 - Cliente Fulano de tal");
		P5.setBounds(72, 125, 197, 23);
		getContentPane().add(P5);

		Button B5 = new Button("Excluir");
		B5.setBounds(20, 125, 46, 22);
		getContentPane().add(B5);
		B5.setActionCommand("Excluir");
		B5.addActionListener(this);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		String comando = (String) e.getActionCommand();

		if (comando.equals("Excluir")) {
			new JanelaSenhaParaExcluir();
		}
	}


	public static void main(String[] args) {

		JanelaRemoverID remover = new JanelaRemoverID();

		remover.setSize(400,400);
	}
}
