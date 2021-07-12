package cadastro;
<<<<<<< HEAD
=======

>>>>>>> 08bb840fbaccb48907876a80a0afb7d33cb92bce
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

<<<<<<< HEAD
public class CriarBotao extends JFrame{
	

	  
	
	
=======
public class CriarBotao extends JFrame {

    protected void criarButton(String nome, GridBagLayout gridbag, GridBagConstraints c) {
        JButton b = new JButton(nome);
        gridbag.setConstraints(b, c);
        getContentPane().add(b);
    }

>>>>>>> 08bb840fbaccb48907876a80a0afb7d33cb92bce
}
