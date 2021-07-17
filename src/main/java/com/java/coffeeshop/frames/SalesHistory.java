/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.coffeeshop.frames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author felip
 */
public class SalesHistory extends javax.swing.JInternalFrame {

        /**
         * Creates new form SalesHistory
         */
        public SalesHistory() {
                initComponents();
        }

        int salesListSize = 50;
        int productListSize = 50;
        int rowCounter = 0;
        int aux = 0;

        String s;
        String[][] output = new String[salesListSize][6];

        public void readSalesData() {

                File file = new File(
                                "/home/felipe/DEV/Java-Scripts/coffeeshop/src/main/java/com/java/coffeeshop/frames/salesHistory_db.txt");
                String path = file.getPath();

                try {

                        BufferedReader reader = new BufferedReader(new FileReader(path));

                        int i = 0;

                        do {

                                s = reader.readLine();

                                if (s != null) {

                                        String[] w = s.split(";");

                                        for (int j = 0; j < w.length; j++) {

                                                output[i][j] = w[j];

                                        }

                                }

                                i++;

                        } while (s != null);

                        reader.close();

                } catch (Exception e) {

                        s = "Erro de Leitura";

                }

        }

        public void setTableData() {

                readSalesData();

                System.out.println(s);

                int[] row = new int[salesListSize];
                int[] col = new int[6];

                readSalesData();

                System.out.println(s);

                int i = 0;
                int j = 0;

                for (i = 0; i < row.length; i++) {

                        for (j = 0; j < col.length; j++) {

                                row[i] = i;
                                col[j] = j;

                                salesTable.setValueAt(output[i][j], row[i], col[j]);

                        }

                }
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                background = new javax.swing.JPanel();
                comboBox = new javax.swing.JComboBox<>();
                scrollPane = new javax.swing.JScrollPane();
                salesTable = new javax.swing.JTable();
                filterText = new javax.swing.JLabel();
                dateFormattedTextField1 = new javax.swing.JFormattedTextField();
                dateFormattedTextField2 = new javax.swing.JFormattedTextField();

                setBorder(null);
                setClosable(true);
                setEnabled(false);
                setFrameIcon(null);
                setMaximumSize(new java.awt.Dimension(1280, 664));
                setMinimumSize(new java.awt.Dimension(1280, 664));
                setPreferredSize(new java.awt.Dimension(1280, 664));
                setRequestFocusEnabled(false);

                background.setBackground(new java.awt.Color(116, 70, 255));

                comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "TO", "SEM", "TEMPO", "PRA FAZER" }));
                comboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                comboBoxActionPerformed(evt);
                        }
                });

                scrollPane.setMaximumSize(new java.awt.Dimension(469, 402));
                scrollPane.setMinimumSize(new java.awt.Dimension(469, 402));

                salesTable.setBackground(new java.awt.Color(252, 251, 255));
                salesTable.setForeground(new java.awt.Color(156, 126, 255));
                salesTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null },
                                { null, null, null, null, null, null }, { null, null, null, null, null, null } },
                                new String[] { "Data", "Cod. de Venda", "Cliente", "Produto", "Quantidade", "Valor" }) {
                        boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                salesTable.setMaximumSize(new java.awt.Dimension(300, 64));
                salesTable.setMinimumSize(new java.awt.Dimension(300, 64));
                salesTable.setName(""); // NOI18N
                salesTable.setSelectionBackground(new java.awt.Color(238, 233, 255));
                salesTable.setSelectionForeground(new java.awt.Color(116, 70, 255));
                salesTable.setShowHorizontalLines(false);
                setTableData();
                scrollPane.setViewportView(salesTable);

                filterText.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
                filterText.setForeground(new java.awt.Color(252, 251, 255));
                filterText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                filterText.setText("Filtrar");
                filterText.setAlignmentY(0.0F);

                dateFormattedTextField1.setForeground(new java.awt.Color(116, 70, 255));
                dateFormattedTextField1.setFormatterFactory(
                                new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
                dateFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                dateFormattedTextField1.setMaximumSize(new java.awt.Dimension(7, 20));
                dateFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                dateFormattedTextField1ActionPerformed(evt);
                        }
                });

                dateFormattedTextField2.setForeground(new java.awt.Color(116, 70, 255));
                dateFormattedTextField2.setFormatterFactory(
                                new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
                dateFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                dateFormattedTextField2.setMaximumSize(new java.awt.Dimension(7, 20));
                dateFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                dateFormattedTextField2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
                background.setLayout(backgroundLayout);
                backgroundLayout.setHorizontalGroup(backgroundLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup().addGap(29, 29, 29)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(filterText)
                                                                .addGroup(backgroundLayout.createSequentialGroup()
                                                                                .addComponent(comboBox,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                316,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(dateFormattedTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                109,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(dateFormattedTextField2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                109,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(715, Short.MAX_VALUE))
                                .addGroup(backgroundLayout.createSequentialGroup().addContainerGap()
                                                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()));
                backgroundLayout.setVerticalGroup(backgroundLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup().addGap(23, 23, 23)
                                                .addComponent(filterText)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(comboBox,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(dateFormattedTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(dateFormattedTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35,
                                                                Short.MAX_VALUE)
                                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 599,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap()));

                try {
                        dateFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                        new javax.swing.text.MaskFormatter("##/##/####")));

                } catch (java.text.ParseException ex) {

                        ex.printStackTrace();
                }

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                try {
                        dateFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                        new javax.swing.text.MaskFormatter("##/##/####")));

                } catch (java.text.ParseException ex) {

                        ex.printStackTrace();
                }

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void dateFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dateFormattedTextField2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_dateFormattedTextField2ActionPerformed

        private void dateFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dateFormattedTextField1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_dateFormattedTextField1ActionPerformed

        private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBoxActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_comboBoxActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel background;
        private javax.swing.JComboBox<String> comboBox;
        private javax.swing.JFormattedTextField dateFormattedTextField1;
        private javax.swing.JFormattedTextField dateFormattedTextField2;
        private javax.swing.JLabel filterText;
        private javax.swing.JTable salesTable;
        private javax.swing.JScrollPane scrollPane;
        // End of variables declaration//GEN-END:variables
}
