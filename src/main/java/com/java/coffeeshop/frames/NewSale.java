package com.java.coffeeshop.frames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.java.coffeeshop.app.prospect.Custumers;
import com.java.coffeeshop.app.stock.Products;
import com.java.coffeeshop.relativepath.RelativePath;
import com.java.coffeeshop.util.ChangeLineInFile;

public class NewSale extends javax.swing.JInternalFrame implements FrameManagement {

        /**
         * @author vinic
         */

        public NewSale() {
                initComponents();
        }

        RelativePath relativePath = new RelativePath();
        int custumersList = 50;
        int productListSize = 50;
        int rowCounter = 0;
        int aux = 0;
        float total;
        float desc = 0F;
        int lastCode = 1000;
        String aux2;

        String s;
        String[][] r = new String[custumersList][5];
        String[][] e = new String[custumersList][5];
        Custumers[] custumers = new Custumers[custumersList];
        Products[] products = new Products[productListSize];

        public void readDataCustumers() {

                File file = new File(relativePath.getPath()
                                + "/coffeeshop/src/main/java/com/java/coffeeshop/frames/clientes_db.txt");
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

        public void readDataProducts() {

                File file = new File(relativePath.getPath()
                                + "/coffeeshop/src/main/java/com/java/coffeeshop/frames/estoque_db.txt");
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

        public void getCustumers() {

                readDataCustumers();

                for (int i = 0; i < custumersList; i++) {

                        custumers[i] = new Custumers();
                        custumers[i].setFullName(r[i][0]);
                        custumers[i].setCEP(r[i][1]);
                        custumers[i].setCPF(r[i][2]);
                        custumers[i].setBirthDate(r[i][3]);
                        custumers[i].setphone(r[i][4]);

                }

                for (int i = 0; i < custumersList; i++) {

                        jComboBox1.addItem(custumers[i].getFullName());

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

                        jComboBox2.addItem(products[i].getName());

                }

        }

        public void setTableData() {

                readDataProducts();

                System.out.println(s);

                int i = 0;

                try {

                        i = 0;
                        boolean flag = false;

                        do {

                                if (jComboBox2.getSelectedItem() == products[i].getName()) {

                                        aux = i;

                                        jTable1.setValueAt(products[i].getId(), rowCounter, 0);
                                        jTable1.setValueAt(products[i].getName(), rowCounter, 1);
                                        jTable1.setValueAt(jTextField4.getText(), rowCounter, 2);
                                        jTable1.setValueAt(products[i].getPrice(), rowCounter, 3);
                                        jTable1.setValueAt(getSubTotal(), rowCounter, 4);
                                        setTotal();

                                        rowCounter++;
                                        flag = true;

                                } else {

                                        i++;

                                }

                        } while (flag == false);

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }
        }

        public String getSubTotal() {

                float f = Float.parseFloat(products[aux].getPrice());
                float f2 = Float.parseFloat(jTextField4.getText());
                float f3 = f * f2;
                f3 = f3 - (desc / 100) * f3;

                return "" + f3;

        }

        public void setTotal() {

                total = total + Float.valueOf("" + jTable1.getValueAt((rowCounter), 4));

                valorTotal.setText("" + total);

        }

        public void setSalesTableData() {

                String path = relativePath.getPath()
                                + "/coffeeshop/src/main/java/com/java/coffeeshop/frames/salesHistory_db.txt";
                int i = 0;
                String[][] t = new String[50][6];
                boolean flag = false;

                do {

                        t[i][0] = getDate();
                        t[i][1] = "" + jTextField2.getText();
                        t[i][2] = "" + jComboBox1.getSelectedItem();
                        t[i][3] = "" + jTable1.getValueAt(i, 1);
                        t[i][4] = "" + jTable1.getValueAt(i, 2);
                        t[i][5] = "" + jTable1.getValueAt(i, 4);

                        if (jTable1.getValueAt(i, 4) == null) {

                                flag = true;

                        } else {

                                try {

                                        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                                        writer.append("" + t[i][0] + ";" + t[i][1] + ";" + t[i][2] + ";" + t[i][3] + ";"
                                                        + t[i][4] + ";" + t[i][5] + ";\n");

                                        writer.close();
                                        i++;

                                } catch (Exception e) {

                                        System.out.println("Erro ao escrever em Livro Caixa Database");
                                        flag = true;

                                }

                        }

                } while (flag != true);

        }

        public String getSaleCode() {

                File file = new File(relativePath.getPath()
                                + "/coffeeshop/src/main/java/com/java/coffeeshop/frames/salesCode_db.txt");
                String path = file.getPath();

                try {

                        BufferedReader reader = new BufferedReader(new FileReader(path));

                        do {

                                s = reader.readLine();

                                if (s != null) {

                                        lastCode = Integer.parseInt(s);

                                }

                        } while (s != null);

                        reader.close();

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }

                return "" + (lastCode + 1);

        }

        public void setSaleCode() {

                File file = new File(relativePath.getPath()
                                + "/coffeeshop/src/main/java/com/java/coffeeshop/frames/salesCode_db.txt");
                String path = file.getPath();

                try {

                        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                        writer.append("" + (lastCode + 1) + "\n");

                        writer.close();

                } catch (Exception e) {

                        System.out.println("Erro ao escrever em salesCode Database");

                }

        }

        public boolean isNumeric(String str) {

                try {
                        Double.parseDouble(str);
                        return true;

                } catch (NumberFormatException e) {

                        return false;

                }
        }

        public String getDate() {

                SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

                Date date = new Date();

                return sdf1.format(date);

        }

        public void clear() {

                jComboBox1.setEnabled(true);
                valorTotal.setText("");
                total = 0;
                rowCounter = 0;
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null } },
                                new String[] { "Código Produto", "Nome Produto", "Quantidade", "Valor Un.",
                                                "Valor Total" }));

                jTextField2.setText(getSaleCode());
                botaoAdicionar.setEnabled(false);
                jTextField4.setText("");
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                codigoCliente = new javax.swing.JLabel();
                nomeCliente = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel1 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jComboBox2 = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                jTextField4 = new javax.swing.JTextField();
                botaoAdicionar = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                desconto = new javax.swing.JTextField();
                valorTotal = new javax.swing.JTextField();
                botaoSalvar = new javax.swing.JButton();
                botaoCancelar = new javax.swing.JButton();

                setClosable(true);
                setResizable(true);
                setFrameIcon(new javax.swing.ImageIcon(relativePath.getPath() + "/coffeeshop/images/coffeeshop.png"));
                setMaximumSize(new java.awt.Dimension(1280, 664));
                setMinimumSize(new java.awt.Dimension(1280, 664));
                setName(""); // NOI18N
                setPreferredSize(new java.awt.Dimension(1280, 664));

                try {
                        setSelected(true);
                } catch (java.beans.PropertyVetoException e1) {
                        e1.printStackTrace();
                }
                setVisible(true);

                codigoCliente.setText("Código Cli.");
                jTextField1.setEnabled(false);
                nomeCliente.setText("Nome do Cliente");
                getCustumers();
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox1ActionPerformed(evt);
                        }
                });

                jLabel1.setText("Número da Venda");

                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });
                jTextField2.setEnabled(false);
                jTextField2.setText(getSaleCode());

                jTextField3.setEnabled(false);

                jTextField4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField4ActionPerformed(evt);
                        }
                });

                jLabel2.setText("Código Prod.");

                getProducts();
                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox2ActionPerformed(evt);
                        }
                });

                jLabel3.setText("Quantidade:");
                botaoAdicionar.setEnabled(false);
                botaoAdicionar.setText("Adicionar");
                botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoAdicionarActionPerformed(evt);
                        }
                });

                jTable1.setBackground(new java.awt.Color(245, 240, 253));
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null },
                                                { null, null, null, null, null }, { null, null, null, null, null } },
                                new String[] { "Código Produto", "Nome Produto", "Quantidade", "Valor Un.",
                                                "Valor Total" }));
                jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                jTable1.setEnabled(false);
                jTable1.setGridColor(new java.awt.Color(87, 25, 202));
                jTable1.setMaximumSize(new java.awt.Dimension(300, 64));
                jTable1.setShowHorizontalLines(false);
                jTable1.getTableHeader().setResizingAllowed(false);
                jTable1.getTableHeader().setReorderingAllowed(false);
                jScrollPane1.setViewportView(jTable1);

                jLabel4.setText("Desconto:");

                jLabel5.setText("Valor Total:");
                valorTotal.setEnabled(false);

                desconto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                descontoActionPerformed(evt);
                        }
                });
                desconto.setEnabled(false);

                botaoSalvar.setText("Salvar");
                botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoSalvarActionPerformed(evt);
                        }
                });
                botaoCancelar.setText("Cancelar");
                botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoCancelarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jScrollPane1)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(codigoCliente)
                                                                                                                                .addGap(30, 30, 30))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jTextField1)
                                                                                                                                .addGap(19, 19, 19)))
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(nomeCliente)
                                                                                                                .addComponent(jComboBox1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                365,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jTextField3))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jComboBox2,
                                                                                                                0,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                23, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel1)
                                                                                                .addComponent(jTextField2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel3)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jTextField4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(botaoAdicionar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                100,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(botaoSalvar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(botaoCancelar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(desconto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                100,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(52, 52, 52)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(valorTotal,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                101,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(55, 55, 55)))));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(15, 15, 15).addGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(codigoCliente).addComponent(nomeCliente)
                                                                .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel2))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(21, 21, 21)
                                                                                .addComponent(jLabel3)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(botaoAdicionar))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4).addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(desconto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(botaoCancelar)
                                                                                .addComponent(botaoSalvar))
                                                                .addComponent(valorTotal,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(26, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

        }

        private void descontoActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

        }

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

                readDataCustumers();

                try {

                        int i = 0;
                        boolean flag = false;

                        do {

                                if (jComboBox1.getSelectedItem() == custumers[i].getFullName()) {

                                        jTextField1.setText(custumers[i].getCPF());
                                        flag = true;

                                } else {

                                        i++;

                                }

                        } while (flag == false);

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }

        }

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

                readDataProducts();
                botaoAdicionar.setEnabled(true);

                try {

                        int i = 0;
                        boolean flag = false;

                        do {

                                if (jComboBox2.getSelectedItem() == products[i].getName()) {

                                        jTextField3.setText(products[i].getId());
                                        flag = true;

                                } else {

                                        i++;

                                }

                        } while (flag == false);

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }

        }

        private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                JFrame frame = new JFrame("Adicionar");
                System.out.println("" + jComboBox1.getSelectedItem());

                if (jComboBox1.getSelectedItem() != custumers[0].getFullName()) {

                        desconto.setText("10%");
                        desc = 10;

                } else {

                        desconto.setText("0%");
                        desc = 0;
                }

                if (isNumeric(jTextField4.getText())) {

                        jComboBox1.setEnabled(false);
                        setTableData();
                        getSaleCode();
                        jTextField4.setText("");

                } else {

                        JOptionPane.showMessageDialog(frame, "Insira a quantidade", "Error", JOptionPane.ERROR_MESSAGE);

                }

        }

        private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:

                clear();

        }

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {

                JFrame frame = new JFrame("Salvo com Sucesso");
                if (JOptionPane.showConfirmDialog(frame, "Deseja fazer uma nova venda?", "Salvo",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

                        setSalesTableData();
                        setSaleCode();
                        clear();

                } else {

                        setSalesTableData();
                        setSaleCode();
                        dispose();

                }

        }

        // Variables declaration - do not modify
        private javax.swing.JButton botaoAdicionar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JButton botaoCancelar;
        private javax.swing.JLabel codigoCliente;
        private javax.swing.JTextField desconto;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JLabel nomeCliente;
        private javax.swing.JTextField valorTotal;
        // End of variables declaration

}
