package telaprincipal;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {

		ContatoFrame contatoFrame = new ContatoFrame();

		contatoFrame.setSize(550, 450);
		contatoFrame.setVisible(true);
		contatoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
