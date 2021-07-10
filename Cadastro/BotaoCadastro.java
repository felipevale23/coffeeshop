package Cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoCadastro implements ActionListener{
	private JTextField t;

	public BotaoCadastro(JTextField t) {
		this.t = t;

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nome = t.getText();
		
		JOptionPane.showMessageDialog(null, "foi digitado: " + nome);
		
		
		
		
	}

}
