package com.java.coffeeshop.frames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.java.coffeeshop.relativepath.RelativePath;

/**
 *
 * @author felip
 */
public class MainFrame extends javax.swing.JFrame implements FrameManagement {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    String s;
    String[][] r = new String[50][4];
    RelativePath relativePath = new RelativePath();

    public void readData() {

        File file = new File("src/main/java/com/java/coffeeshop/frames/estoque_db.txt");
        String path = file.getPath();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));

            int i = 0;

            do {

                s = reader.readLine();

                if (s != null) {

                    String[] w = s.split(";");

                    for (int j = 0; j < w.length; j++) {

                        r[i][j] = w[j];

                    }

                }

                i++;

            } while (s != null);

            reader.close();

        } catch (Exception e) {

            s = "Erro de Leitura";

        }

    }

    public void writeDate(String input) {

        String path = "src/main/java/com/java/coffeeshop/frames/estoque_db.txt";

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.append("");
            writer.append(input + "\n");

            writer.close();

        } catch (Exception e) {

            System.out.println("Erro ao escrever em Estoque Database");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        custumers = new javax.swing.JMenu();
        addCustumer = new javax.swing.JMenuItem();
        searchCustumers = new javax.swing.JMenuItem();
        products = new javax.swing.JMenu();
        listProducts = new javax.swing.JMenuItem();
        registerProducts = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenuItem();
        sales = new javax.swing.JMenu();
        newSale = new javax.swing.JMenuItem();
        salesHistory = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoffeeShop");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(640, 200));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(desktopPaneLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1280, Short.MAX_VALUE));
        desktopPaneLayout.setVerticalGroup(desktopPaneLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 660, Short.MAX_VALUE));

        file.setIcon(new javax.swing.ImageIcon("images/page.png")); // NOI18N
        file.setText("Arquivo");
        file.setForeground(new java.awt.Color(116, 70, 255));

        exit.setIcon(new javax.swing.ImageIcon("images/exit.png")); // NOI18N
        exit.setText("Sair");
        exit.setForeground(new java.awt.Color(116, 70, 255));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        menuBar.add(file);

        custumers.setIcon(new javax.swing.ImageIcon("images/customer.png")); // NOI18N
        custumers.setText("Clientes");
        custumers.setForeground(new java.awt.Color(116, 70, 255));

        searchCustumers.setIcon(new javax.swing.ImageIcon("images/findcustumer.png")); // NOI18N
        searchCustumers.setText("Consultar");
        searchCustumers.setForeground(new java.awt.Color(116, 70, 255));
        searchCustumers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustumersActionPerformed(evt);
            }
        });
        custumers.add(searchCustumers);

        addCustumer.setIcon(new javax.swing.ImageIcon("images/adduser.png")); // NOI18N
        addCustumer.setText("Cadastrar");
        addCustumer.setForeground(new java.awt.Color(116, 70, 255));
        addCustumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustumerActionPerformed(evt);
            }
        });
        custumers.add(addCustumer);

        menuBar.add(custumers);

        products.setIcon(new javax.swing.ImageIcon("images/products.png")); // NOI18N
        products.setText("Produtos");
        products.setForeground(new java.awt.Color(116, 70, 255));
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });

        listProducts.setIcon(new javax.swing.ImageIcon("images/listproducts.png")); // NOI18N
        listProducts.setText("Listar");
        listProducts.setForeground(new java.awt.Color(116, 70, 255));
        listProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductsActionPerformed(evt);
            }
        });
        products.add(listProducts);

        registerProducts.setIcon(new javax.swing.ImageIcon("images/newproduct.png")); // NOI18N
        registerProducts.setText("Cadastrar");
        registerProducts.setForeground(new java.awt.Color(116, 70, 255));
        registerProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerProductsActionPerformed(evt);
            }
        });
        products.add(registerProducts);

        stock.setIcon(new javax.swing.ImageIcon("images/stock.png")); // NOI18N
        stock.setText("Estoque");
        stock.setForeground(new java.awt.Color(116, 70, 255));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        products.add(stock);

        menuBar.add(products);

        sales.setIcon(new javax.swing.ImageIcon("images/sellstock.png")); // NOI18N
        sales.setText("Vendas");
        sales.setForeground(new java.awt.Color(116, 70, 255));
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        newSale.setIcon(new javax.swing.ImageIcon("images/neworder.png")); // NOI18N
        newSale.setText("Nova Venda");
        newSale.setForeground(new java.awt.Color(116, 70, 255));
        newSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSaleActionPerformed(evt);
            }
        });
        sales.add(newSale);

        salesHistory.setIcon(new javax.swing.ImageIcon("images/saleshistory.png")); // NOI18N
        salesHistory.setText("Livro Caixa");
        salesHistory.setForeground(new java.awt.Color(116, 70, 255));
        salesHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesHistoryActionPerformed(evt);
            }
        });
        sales.add(salesHistory);

        menuBar.add(sales);

        about.setIcon(new javax.swing.ImageIcon("images/about.png")); // NOI18N
        about.setText("Sobre");
        about.setForeground(new java.awt.Color(116, 70, 255));
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        menuBar.add(about);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(desktopPane));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(desktopPane));

        pack();

    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:

        JFrame frame = new JFrame("Sair");
        if (JOptionPane.showConfirmDialog(frame, "Deseja realmente sair?", "Sair",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }// GEN-LAST:event_exitActionPerformed

    private void registerProductsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerProductsActionPerformed
        // TODO add your handling code here:

        RegisterProducts register = new RegisterProducts();
        desktopPane.add(register);
        register.setVisible(true);

    }// GEN-LAST:event_registerProductsActionPerformed

    private void listProductsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listProductsActionPerformed
        // TODO add your handling code here:

        ListProducts list = new ListProducts();
        desktopPane.add(list);
        list.setVisible(true);

    }// GEN-LAST:event_listProductsActionPerformed

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_productsActionPerformed

    private void addCustumerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

        RegisterCustumer registerCustumer = new RegisterCustumer();
        desktopPane.add(registerCustumer);
        registerCustumer.setVisible(true);
    }// GEN-LAST:event_addCustumerActionPerformed

    private void searchCustumersActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

        SearchCustumers searchCustumer = new SearchCustumers();
        desktopPane.add(searchCustumer);
        searchCustumer.setVisible(true);

    }

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

    }

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

        About about = new About();
        desktopPane.add(about);
        about.setVisible(true);

    }

    private void newSaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

        NewSale newSale = new NewSale();
        desktopPane.add(newSale);
        newSale.setVisible(true);

    }

    private void salesHistoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

        SalesHistory salesHistory = new SalesHistory();
        desktopPane.add(salesHistory);
        salesHistory.setVisible(true);

    }

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

        Stock stock = new Stock();
        desktopPane.add(stock);
        stock.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem addCustumer;
    private javax.swing.JMenu custumers;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem listProducts;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu products;
    private javax.swing.JMenuItem registerProducts;
    private javax.swing.JMenuItem searchCustumers;
    private javax.swing.JMenuItem stock;
    private javax.swing.JMenuItem newSale;
    private javax.swing.JMenuItem salesHistory;
    private javax.swing.JMenu sales;
    // End of variables declaration//GEN-END:variables
}
