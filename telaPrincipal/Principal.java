package telaPrincipal;
import javax.swing.JFrame;
public class Principal {
	public static void main(String[] args) {
		ContatoFrame contatoFrame = new ContatoFrame();
		Estoque estoque = new Estoque();
		
	
	
		
		
		
		estoque.setSize(450,350);
		estoque.setVisible(true);
		estoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contatoFrame.setSize(550,450);
		contatoFrame.setVisible(true);
		contatoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
