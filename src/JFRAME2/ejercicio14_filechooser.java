/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAME2;

import javax.swing.*;

/**
 *
 * @author DELL
 */
public class ejercicio14_filechooser extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio14_filechooser
     */
    public ejercicio14_filechooser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abrir_fichero = new javax.swing.JFileChooser();
        fondo = new javax.swing.JPanel();
        solo_diseño1 = new javax.swing.JPanel();
        solo_diseño2 = new javax.swing.JPanel();
        solo_diseño3 = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        barra_menu = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        submenu_abrir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 500));
        setPreferredSize(new java.awt.Dimension(450, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));

        solo_diseño1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout solo_diseño1Layout = new javax.swing.GroupLayout(solo_diseño1);
        solo_diseño1.setLayout(solo_diseño1Layout);
        solo_diseño1Layout.setHorizontalGroup(
            solo_diseño1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        solo_diseño1Layout.setVerticalGroup(
            solo_diseño1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        solo_diseño2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout solo_diseño2Layout = new javax.swing.GroupLayout(solo_diseño2);
        solo_diseño2.setLayout(solo_diseño2Layout);
        solo_diseño2Layout.setHorizontalGroup(
            solo_diseño2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        solo_diseño2Layout.setVerticalGroup(
            solo_diseño2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        solo_diseño3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout solo_diseño3Layout = new javax.swing.GroupLayout(solo_diseño3);
        solo_diseño3.setLayout(solo_diseño3Layout);
        solo_diseño3Layout.setHorizontalGroup(
            solo_diseño3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
        solo_diseño3Layout.setVerticalGroup(
            solo_diseño3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        btn_salir.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 280, Short.MAX_VALUE)
                .addComponent(solo_diseño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solo_diseño3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solo_diseño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(solo_diseño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(solo_diseño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(solo_diseño3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 320));

        menu_archivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        menu_archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Floppy.png"))); // NOI18N
        menu_archivo.setText("Archivo");

        submenu_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/buscar.png"))); // NOI18N
        submenu_abrir.setText("Abrir");
        submenu_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_abrirActionPerformed(evt);
            }
        });
        menu_archivo.add(submenu_abrir);

        barra_menu.add(menu_archivo);

        setJMenuBar(barra_menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submenu_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_abrirActionPerformed
int resp;
resp=abrir_fichero.showOpenDialog(this);
if (resp==JFileChooser.APPROVE_OPTION) {
JOptionPane.showMessageDialog(null,abrir_fichero.getSelectedFile(
).toString());
} else if (resp==JFileChooser.CANCEL_OPTION) {
JOptionPane.showMessageDialog(null,"Se pulsó la opción Cancelar");
}

    }//GEN-LAST:event_submenu_abrirActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       int a = JOptionPane.YES_NO_OPTION;
       int resultado = JOptionPane.showConfirmDialog(this,"¿Desea Salir?","Salir",a);
       if (resultado == 0){
       System.exit(0);
       }         // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio14_filechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio14_filechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio14_filechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio14_filechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio14_filechooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser abrir_fichero;
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel fondo;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JPanel solo_diseño1;
    private javax.swing.JPanel solo_diseño2;
    private javax.swing.JPanel solo_diseño3;
    private javax.swing.JMenuItem submenu_abrir;
    // End of variables declaration//GEN-END:variables
}