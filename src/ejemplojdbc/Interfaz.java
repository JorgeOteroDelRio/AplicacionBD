/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jota
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        grupo.add(id_radio);
        grupo.add(nombre_radio);
        grupo.add(edad_radio);
        grupo.add(ciudad_radio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showData_btn = new javax.swing.JButton();
        insertar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantalla_tb = new javax.swing.JTable();
        update_btn = new javax.swing.JButton();
        id_radio = new javax.swing.JRadioButton();
        nombre_radio = new javax.swing.JRadioButton();
        ciudad_radio = new javax.swing.JRadioButton();
        edad_radio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor BD Alumnos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        showData_btn.setText("Mostrar Datos");
        showData_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showData_btnActionPerformed(evt);
            }
        });

        insertar_btn.setText("Insertar");
        insertar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setText("Eliminar");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        pantalla_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "EDAD", "CIUDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(pantalla_tb);

        update_btn.setText("Actualizar");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        id_radio.setSelected(true);
        id_radio.setText("ID");

        nombre_radio.setText("Nombre");

        ciudad_radio.setText("Ciudad");

        edad_radio.setText("Edad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(showData_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(id_radio)
                    .addComponent(nombre_radio)
                    .addComponent(edad_radio)
                    .addComponent(ciudad_radio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(showData_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edad_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudad_radio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showData_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showData_btnActionPerformed

        for (int i = 0; i < pantalla_tb.getRowCount(); i++) {
            for (int j = 0; j < pantalla_tb.getColumnCount(); j++) {
                pantalla_tb.setValueAt(null, i, j);
            }
        }

        ResultSet rs = DataBase.consultarDatos();
        try {
            while (rs.next()) {
                for (int i = 0; i < pantalla_tb.getRowCount(); i++) {
                    if (pantalla_tb.getValueAt(i, 0) == null) {
                        pantalla_tb.setValueAt(rs.getInt("id"), i, 0);
                        pantalla_tb.setValueAt(rs.getString("nombre"), i, 1);
                        pantalla_tb.setValueAt(rs.getInt("edad"), i, 2);
                        pantalla_tb.setValueAt(rs.getString("ciudad"), i, 3);
                        break;
                    }

                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_showData_btnActionPerformed

    private void insertar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar_btnActionPerformed
        JPanel panel = new JPanel();
        JTextField id = new JTextField(5);
        JTextField nombre = new JTextField(5);
        JTextField edad = new JTextField(5);
        JTextField ciudad = new JTextField(5);
        panel.add(new JLabel("ID:"));
        panel.add(id);
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Edad:"));
        panel.add(edad);
        panel.add(new JLabel("Ciudad:"));
        panel.add(ciudad);
        int result = JOptionPane.showConfirmDialog(null, panel, "Insertar", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            DataBase.insertar(id.getText(), nombre.getText(), edad.getText(), ciudad.getText());
        }
    }//GEN-LAST:event_insertar_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DataBase.cerrarConexion();
    }//GEN-LAST:event_formWindowClosing

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Está seguro que desea eliminar ese registro?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (n == JOptionPane.YES_OPTION) {
            try {
                DataBase.eliminar(getId());
                for (int i = 0; i < pantalla_tb.getColumnCount(); i++) {
                    pantalla_tb.setValueAt(null, pantalla_tb.getSelectedRow(), i);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fila inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        try {
            if (id_radio.isSelected()) {
                String r = JOptionPane.showInputDialog("Nuevo valor para el campo ID:");
                DataBase.actualizar("id", r, getId());
            } else if (nombre_radio.isSelected()) {
                String r = JOptionPane.showInputDialog("Nuevo valor para el campo Nombre:");
                DataBase.actualizar("nombre", r, getId());
            } else if (edad_radio.isSelected()) {
                String r = JOptionPane.showInputDialog("Nuevo valor para el campo Edad:");
                DataBase.actualizar("edad", r, getId());
            } else {
                String r = JOptionPane.showInputDialog("Nuevo valor para el campo Ciudad:");
                DataBase.actualizar("ciudad", r, getId());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fila inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private String getId() {
        int row = pantalla_tb.getSelectedRow();
        return String.valueOf(pantalla_tb.getValueAt(row, 0));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        DataBase.conectar();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    ButtonGroup grupo = new ButtonGroup();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ciudad_radio;
    private javax.swing.JRadioButton edad_radio;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JRadioButton id_radio;
    private javax.swing.JButton insertar_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton nombre_radio;
    private javax.swing.JTable pantalla_tb;
    private javax.swing.JButton showData_btn;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
