package cadastro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();
        tela.telacadastro();

    }

    public TelaCadastro() {
        super("Cadastro de Cliente");
    }

    private void telacadastro() {
        Container janela = getContentPane();
        janela.setLayout(null);

        JLabel labelNome = new JLabel("Nome: ");

        JLabel labelCep = new JLabel("Cep: ");
        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelData = new JLabel("Data: ");
        labelNome.setBounds(50, 40, 100, 20);
        labelCep.setBounds(50, 80, 100, 20);
        labelTel.setBounds(50, 120, 100, 20);
        labelCpf.setBounds(50, 160, 100, 20);
        labelData.setBounds(50, 200, 100, 20);

        MaskFormatter mascaraCep = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;

        try {
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCep.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');

        } catch (ParseException excp) {
            System.err.println("Erro na formatacao:" + excp.getMessage());
            System.exit(-1);
        }
        JTextField nome = new JTextField(10);
        janela.add(nome);
        JFormattedTextField jFormattedTextCep = new JFormattedTextField(mascaraCep);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
        nome.setBounds(150, 40, 100, 20);
        jFormattedTextCep.setBounds(150, 80, 100, 20);
        jFormattedTextTel.setBounds(150, 120, 100, 20);
        jFormattedTextCpf.setBounds(150, 160, 100, 20);
        jFormattedTextData.setBounds(150, 200, 100, 20);

        janela.add(labelNome);
        janela.add(labelCep);
        janela.add(labelTel);
        janela.add(labelCpf);
        janela.add(labelData);
        janela.add(jFormattedTextCep);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextData);
        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new FlowLayout());
        JButton botaoSalvar = new JButton("Salvar");
        panelBotoes.add(botaoSalvar);
        add(panelBotoes, BorderLayout.SOUTH);
        ((JComponent) janela).setBorder(BorderFactory.createLineBorder(Color.black));
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
