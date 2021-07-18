package com.java.coffeeshop.frames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;

import com.java.coffeeshop.app.stock.Products;
import com.java.coffeeshop.util.ChangeLineInFile;

/**
 *
 * @author vinic
 */
public class Stock extends javax.swing.JInternalFrame {

        /**
         * Creates new form NewJInternalFrame2
         */
        public Stock() {
                initComponents();
        }

        int custumersList = 50;
        int productListSize = 50;
        int aux = 0;
        String s;
        String[][] e = new String[custumersList][5];
        Products[] products = new Products[productListSize];

        public void readDataProducts() {

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

                                                e[i][j] = w[j];

                                        }

                                }

                                i++;

                        } while (s != null);

                        reader.close();

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }

        }

        public void getProducts() {

                readDataProducts();

                for (int i = 0; i < productListSize; i++) {

                        products[i] = new Products();
                        products[i].setId(e[i][0]);
                        products[i].setName(e[i][1]);
                        products[i].setPrice(e[i][2]);
                        products[i].setCategory(e[i][3]);
                        products[i].setAmmount(e[i][4]);

                }

                for (int i = 0; i < productListSize; i++) {

                        jComboBoxProduto.addItem(products[i].getName());

                }

        }

        public String getNewAmmount() {

                int i = Integer.parseInt(products[aux].getAmmount()) + Integer.parseInt(jTextFieldQuantidade.getText());

                System.out.println(Integer.parseInt(products[aux].getAmmount()));
                System.out.println(Integer.parseInt(jTextFieldQuantidade.getText()));

                return "" + i;

        }

        public void setNewAmmount() {

                String file = "src/main/java/com/java/coffeeshop/frames/estoque_db.txt";
                String newLineContent = "" + products[aux].getId() + ";" + products[aux].getName() + ";"
                                + products[aux].getPrice() + ";" + products[aux].getCategory() + ";" + getNewAmmount()
                                + ";";
                int lineToBeEdited = aux + 1;

                ChangeLineInFile changeFile = new ChangeLineInFile();
                changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);

        }

        public boolean isNumeric(String str) {

                try {
                        Double.parseDouble(str);
                        return true;

                } catch (NumberFormatException e) {

                        return false;

                }
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabelEntradadeEstoque = new javax.swing.JLabel();
                jLabelAdicionarTexto = new javax.swing.JLabel();
                jComboBoxProduto = new javax.swing.JComboBox<>();
                jLabelQuantidade = new javax.swing.JLabel();
                jTextFieldQuantidade = new javax.swing.JTextField();
                jButtonCancelar = new javax.swing.JButton();
                jButtonSalvar = new javax.swing.JButton();

                setClosable(true);
                setResizable(true);
                setFrameIcon(new javax.swing.ImageIcon("images/coffeeshop.png"));
                setMaximumSize(new java.awt.Dimension(1280, 664));
                setMinimumSize(new java.awt.Dimension(1280, 664));
                setPreferredSize(new java.awt.Dimension(1280, 664));

                jLabelAdicionarTexto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
                jLabelAdicionarTexto.setText("Adicionar Produto");

                getProducts();
                jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBoxProdutoActionPerformed(evt);
                        }
                });

                jLabelQuantidade.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
                jLabelQuantidade.setText("Quantidade");

                jButtonCancelar.setText("Cancelar");

                jButtonSalvar.setText("Salvar");
                jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonSalvarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jComboBoxProduto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                385,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButtonCancelar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                172,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButtonSalvar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                172,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabelAdicionarTexto)
                                                                                .addComponent(jLabelQuantidade)
                                                                                .addComponent(jTextFieldQuantidade,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                93,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup().addGap(429, 429, 429)
                                                                .addComponent(jLabelEntradadeEstoque)))
                                                .addContainerGap(451, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jLabelEntradadeEstoque).addGap(139, 139, 139)
                                                .addComponent(jLabelAdicionarTexto,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(jLabelQuantidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldQuantidade,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                165, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButtonCancelar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                51,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButtonSalvar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                51,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(78, 78, 78)));

                pack();
        }// </editor-fold>

        private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

                readDataProducts();

                try {

                        int i = 0;
                        boolean flag = false;

                        do {

                                if (jComboBoxProduto.getSelectedItem() == products[i].getName()) {

                                        aux = i;
                                        flag = true;

                                } else {

                                        i++;

                                }

                        } while (flag == false);

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }

        }

        private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

                JFrame frame = new JFrame("Adicionar");
                System.out.println("" + jComboBoxProduto.getSelectedItem());

                if (isNumeric(jTextFieldQuantidade.getText())) {

                        setNewAmmount();
                        jTextFieldQuantidade.setText("");

                } else {

                        javax.swing.JOptionPane.showMessageDialog(frame, "Insira a quantidade", "Error",
                                        javax.swing.JOptionPane.ERROR_MESSAGE);

                }

        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButtonCancelar;
        private javax.swing.JButton jButtonSalvar;
        private javax.swing.JComboBox<String> jComboBoxProduto;
        private javax.swing.JLabel jLabelAdicionarTexto;
        private javax.swing.JLabel jLabelEntradadeEstoque;
        private javax.swing.JLabel jLabelQuantidade;
        private javax.swing.JTextField jTextFieldQuantidade;
        // End of variables declaration
}
