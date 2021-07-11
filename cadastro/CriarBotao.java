package cadastro;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CriarBotao extends JFrame {

    protected void criarButton(String nome, GridBagLayout gridbag, GridBagConstraints c) {
        JButton b = new JButton(nome);
        gridbag.setConstraints(b, c);
        getContentPane().add(b);
    }

}
