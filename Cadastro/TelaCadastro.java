package Cadastro;

import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


public class TelaCadastro {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("CoffeShop Cadastro");
		f.setLocation(500, 300);		
		JPanel p = new JPanel();
		JLabel nome = new JLabel("Digite o nome: ");
		p.add(nome);
		JTextField Nome = new JTextField(10);
		p.add(Nome);
		
		
		JLabel Cep = new JLabel("CEP: ");
		p.add(Cep);	
		MaskFormatter mascaraCep = null;
		
        JLabel Tel = new JLabel("Telefone: ");
        p.add(Tel);		
        JLabel Cpf = new JLabel("CPF: ");
        p.add(Cpf);
        JLabel Data = new JLabel("Data: ");
        p.add(Data);
        Cep.setBounds(50,40,100,20);
        Tel.setBounds(50,80,100,20);
        Cpf.setBounds(50,120,100,20);
        Data.setBounds(50,160,100,20);		
		JButton b = new JButton("OK");
		p.add(b);
		BotaoCadastro action = new BotaoCadastro(Nome);
		
		b.addActionListener(action);
		p.add(b);
		 
		
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;
		try{
             mascaraCep = new MaskFormatter("#####-###");
             mascaraTel = new MaskFormatter("(##)####-####");
             mascaraCpf = new MaskFormatter("#########-##");
             mascaraData = new MaskFormatter("##/##/####");
             mascaraCep.setPlaceholderCharacter('_');
             mascaraTel.setPlaceholderCharacter('_');
             mascaraCpf.setPlaceholderCharacter('_');
             mascaraData.setPlaceholderCharacter('_');
      }
      catch(ParseException excp) {
             System.err.println("Erro na formatação: " + excp.getMessage());
             System.exit(-1);
      }
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
        jFormattedTextTel.setBounds(150,80,100,20);
        jFormattedTextCpf.setBounds(150,120,100,20);
        jFormattedTextData.setBounds(150,160,100,20);

        JFormattedTextField jFormattedTextCep = new JFormattedTextField(mascaraCep);

		p.add(jFormattedTextCep);
    	p.add(jFormattedTextTel);
    	p.add(jFormattedTextCpf);
    	p.add(jFormattedTextData);

		
		f.setSize(450, 250);
		f.add(p);
		
		
		
		
		
		f.setVisible(true);
	}
}