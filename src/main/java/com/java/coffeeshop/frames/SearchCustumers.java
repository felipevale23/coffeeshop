package com.java.coffeeshop.frames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author vinic
 */
public class SearchCustumers extends javax.swing.JInternalFrame implements FrameManagement {

    /** Creates new form NewJFrame */
    public SearchCustumers() {
        initComponents();
    }

    int numberofCustumers = 50;

    String s;
    String[][] r = new String[numberofCustumers][5];

    public void readData() {

        File file = new File(
                "/home/felipe/DEV/Java-Scripts/coffeeshop/src/main/java/com/java/coffeeshop/frames/clientes_db.txt");
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

    public void setTableData() {

        int[] row = new int[numberofCustumers];
        int[] col = new int[5];

        readData();

        System.out.println(s);

        int i = 0;
        int j = 0;

        for (i = 0; i < row.length; i++) {

            for (j = 0; j < col.length; j++) {

                row[i] = i;
                col[j] = j;

                custumersTable.setValueAt(r[i][j], row[i], col[j]);

            }

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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        custumersTable = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);

        setFrameIcon(new javax.swing.ImageIcon("/home/felipe/DEV/Java-Scripts/coffeeshop/images/coffeeshop.png"));
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

        custumersTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null } },
                new String[] { "Nome", "CEP", "CPF", "Data de Nascimento", "Contato" }));
        custumersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        custumersTable.setEnabled(false);
        custumersTable.setGridColor(new java.awt.Color(87, 25, 202));
        custumersTable.setMaximumSize(new java.awt.Dimension(300, 64));
        custumersTable.setShowHorizontalLines(false);
        custumersTable.getTableHeader().setResizingAllowed(false);
        custumersTable.getTableHeader().setReorderingAllowed(false);
        setTableData();
        jScrollPane1.setViewportView(custumersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JTable custumersTable;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration

}
