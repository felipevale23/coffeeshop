package telaprincipal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estoque extends JFrame {
	public Estoque() {
		super("Estoque");
		criarEstoque();
	}

	private void criarEstoque() {
		setLayout(new BorderLayout());
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());
		JLabel titulo = new JLabel("Estoque");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelTitulo.add(titulo);

		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());

		JButton botaoVendas = new JButton("Adicionar Produto");
		panelBotoes.add(botaoVendas);
		botaoVendas.setPreferredSize(new Dimension(140, 100));
		JButton botaoClientes = new JButton("Listar Produtos");
		botaoClientes.setPreferredSize(new Dimension(140, 100));
		panelBotoes.add(botaoClientes);
		add(panelTitulo, BorderLayout.NORTH);
		add(panelBotoes, BorderLayout.CENTER);

	}
}
