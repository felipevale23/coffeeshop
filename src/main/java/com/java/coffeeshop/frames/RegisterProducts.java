/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.coffeeshop.frames;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.UUID;

/**
 *
 * @author felip
 */
public class RegisterProducts extends javax.swing.JInternalFrame implements FrameManagement {

        /**
         * Creates new form RegisterProducts
         */
        public RegisterProducts() {
                initComponents();
        }

        public void writeData(String input, String input2, String input3, String input4, String input5) {

                String path = "src/main/java/com/java/coffeeshop/frames/estoque_db.txt";

                try {

                        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                        writer.append("\n" + input + ";" + input2 + ";" + input3 + ";" + input4 + ";" + input5 + ";");

                        writer.close();

                } catch (Exception e) {

                        System.out.println("Erro ao escrever em Estoque Database");

                }

        }

        public UUID getNewId() {

                return UUID.randomUUID();

        }

        public void setProductData() {

                String path = "src/main/java/com/java/coffeeshop/frames/estoque_db.txt";
                String w[] = new String[5];

                w[0] = idField.getText();
                w[1] = nameField.getText();
                w[2] = priceField.getText();
                w[3] = categoryField.getText();
                w[4] = ammountField.getText();

                try {

                        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                        writer.append(w[0] + ";" + w[1] + ";" + w[2] + ";" + w[3] + ";" + w[4] + ";\n");

                        writer.close();

                } catch (Exception e) {

                        System.out.println("Erro ao escrever em Estoque Database");

                }

        }

        public void clear() {

                idField.setText("" + getNewId());
                nameField.setText("");
                priceField.setText("");
                categoryField.setText("");
                ammountField.setText("");
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
                idField = new javax.swing.JTextField();
                nameField = new javax.swing.JTextField();
                priceField = new javax.swing.JTextField();
                categoryField = new javax.swing.JTextField();
                ammountField = new javax.swing.JTextField();
                registerButton = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();

                setClosable(true);
                setResizable(true);

                setFrameIcon(new javax.swing.ImageIcon("images/coffeeshop.png")); // NOI18N
                setMaximumSize(new java.awt.Dimension(1280, 664));
                setMinimumSize(new java.awt.Dimension(1280, 664));
                setName(""); // NOI18N
                setPreferredSize(new java.awt.Dimension(1280, 664));

                background.setBackground(new java.awt.Color(116, 70, 255));
                background.setMaximumSize(new java.awt.Dimension(1280, 664));

                idField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                idField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                idFieldActionPerformed(evt);
                        }
                });
                idField.setEnabled(false);
                idField.setText("" + getNewId());

                ammountField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ammoutFieldActionPerformed(evt);
                        }
                });

                registerButton.setBackground(new java.awt.Color(252, 251, 255));
                registerButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
                registerButton.setForeground(new java.awt.Color(116, 70, 255));
                registerButton.setText("Cadastrar");
                registerButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
                registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                registerButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registerButtonActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(252, 251, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Id");

                jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(252, 251, 255));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Nome");

                jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(252, 251, 255));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Valor");

                jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(252, 251, 255));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("Categoria");

                jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(252, 251, 255));
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel5.setText("Quantidade");

                javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
                background.setLayout(backgroundLayout);
                backgroundLayout.setHorizontalGroup(backgroundLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup().addGap(382, 382, 382)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(backgroundLayout.createSequentialGroup()
                                                                                .addGroup(backgroundLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                backgroundLayout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                72,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(31, 31, 31))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                backgroundLayout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                89,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(22, 22, 22)))
                                                                                .addGroup(backgroundLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(idField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                319,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(nameField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                319,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(backgroundLayout.createSequentialGroup()
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                72,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(31, 31, 31)
                                                                                .addComponent(priceField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                319,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(backgroundLayout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addGap(341, 341, 341))
                                                                .addGroup(backgroundLayout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(31, 31, 31)
                                                                                .addComponent(categoryField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                319,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(registerButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                111,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(ammountField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                319,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(454, Short.MAX_VALUE)));
                backgroundLayout.setVerticalGroup(backgroundLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup().addGap(165, 165, 165)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(idField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(nameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel3).addComponent(priceField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(categoryField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ammountField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(211, 211, 211)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_idFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_idFieldActionPerformed

        private void ammoutFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ammoutFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_ammoutFieldActionPerformed

        private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerFieldActionPerformed
                // TODO add your handling code here:

                JFrame frame = new JFrame("Cadastrado com Sucesso");

                if (nameField.getText() == null || priceField.getText() == null || categoryField.getText() == null
                                || ammountField.getText() == null) {

                        JOptionPane.showMessageDialog(this, "Erro: Complete todos os campos");
                        clear();

                } else if (JOptionPane.showConfirmDialog(frame, "Deseja cadastrar outro produto?", "Cadastrado",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

                        setProductData();
                        clear();

                } else {
                        setProductData();
                        dispose();
                }

        }// GEN-LAST:event_registerFieldActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField ammountField;
        private javax.swing.JPanel background;
        private javax.swing.JTextField categoryField;
        private javax.swing.JTextField idField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField nameField;
        private javax.swing.JTextField priceField;
        private javax.swing.JButton registerButton;
        // End of variables declaration//GEN-END:variables
}
