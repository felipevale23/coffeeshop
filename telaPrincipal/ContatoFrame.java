package telaPrincipal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ContatoFrame extends JFrame{
	
	
	public ContatoFrame() {
		super("CoffeShop");
	    criarMenu();
	    criarVendas();
	}
	private void criarVendas() {
		setLayout(new BorderLayout());
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());
		JLabel titulo = new JLabel("Vendas CoffeShop");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelTitulo.add(titulo);
		
		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());
		
		JButton botaoVendas = new JButton("Vendas");
		panelBotoes.add(botaoVendas);
		botaoVendas.setPreferredSize(new Dimension(140, 100));
		JButton botaoClientes = new JButton("Clientes");
		botaoClientes.setPreferredSize(new Dimension(140, 100));		
		panelBotoes.add(botaoClientes);
		JButton botaoEstoque = new JButton ("Estoque");
		botaoEstoque.setPreferredSize(new Dimension(140, 100));		
		panelBotoes.add(botaoEstoque);
		add(panelTitulo, BorderLayout.NORTH);
		add(panelBotoes, BorderLayout.CENTER);
		
		
		
	}
	
	private void criarMenu() {
		JMenu menuMenu = new JMenu("Menu");
		JMenuItem menuItemFechar = new JMenuItem("Fechar Programa");
		menuMenu.add(menuItemFechar);
		JMenuItem menuItemAjuda = new JMenuItem("Ajuda");
		menuMenu.add(menuItemAjuda);
		
		JMenu menuProduto = new JMenu ("Produto");
		JMenuItem cadastroProduto = new JMenuItem("Cadastrar Novo Produto");
		menuProduto.add(cadastroProduto);
		JMenuItem listarProduto = new JMenuItem("Mostrar Produto");
		menuProduto.add(listarProduto);
		JMenuItem listaCompras = new JMenuItem("Listar Compras");
		JMenuBar barra = new JMenuBar();
		
		setJMenuBar(barra);
		barra.add(menuMenu);
		barra.add(menuProduto);
	}
	
	
	
	
	
	
	
	
}
