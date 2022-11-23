/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAME2;

/**
 *
 * @author DELL
 */
public class ejercicio16_variables_globales extends javax.swing.JFrame {
int coches;
    /**
     * Creates new form ejercicio16_variables_globales
     */
    public ejercicio16_variables_globales() {
        initComponents();
        coches=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_diseño1 = new javax.swing.JPanel();
        panel_diseño2 = new javax.swing.JPanel();
        panel_diseño3 = new javax.swing.JPanel();
        etiq_cochestitulo = new javax.swing.JLabel();
        etiq_cochescontador = new javax.swing.JLabel();
        etiq_logo = new javax.swing.JLabel();
        btn_ingreso = new javax.swing.JButton();
        btn_salio = new javax.swing.JButton();
        btn_reiniciar = new javax.swing.JButton();
        etiq_diseño = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_diseño1.setBackground(new java.awt.Color(51, 153, 255));
        panel_diseño1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panel_diseño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 30));

        panel_diseño2.setBackground(new java.awt.Color(204, 204, 204));
        panel_diseño2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panel_diseño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 660, 20));

        panel_diseño3.setBackground(new java.awt.Color(153, 204, 255));
        panel_diseño3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiq_cochestitulo.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        etiq_cochestitulo.setText("COCHES EN EL PARKING");
        panel_diseño3.add(etiq_cochestitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 270, 40));

        etiq_cochescontador.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        etiq_cochescontador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiq_cochescontador.setText("0");
        etiq_cochescontador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panel_diseño3.add(etiq_cochescontador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 140, 70));

        etiq_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/ejerc_16.PNG"))); // NOI18N
        panel_diseño3.add(etiq_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 360, 320));

        getContentPane().add(panel_diseño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 460, 440));

        btn_ingreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/aceptar.png"))); // NOI18N
        btn_ingreso.setText("INGRESO UN COCHE");
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 50));

        btn_salio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_salio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/cancelar.png"))); // NOI18N
        btn_salio.setText("SALIO UN COCHE");
        btn_salio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 50));

        btn_reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/eliminar.png"))); // NOI18N
        btn_reiniciar.setText("REINICIAR");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 322, 170, 50));

        etiq_diseño.setBackground(new java.awt.Color(255, 255, 255));
        etiq_diseño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(etiq_diseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed
    coches=coches+1; 
    etiq_cochescontador.setText(""+coches);
    }//GEN-LAST:event_btn_ingresoActionPerformed

    private void btn_salioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salioActionPerformed
if (coches>0) { 
coches=coches-1;
etiq_cochescontador.setText(""+coches);
}

    }//GEN-LAST:event_btn_salioActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
coches=0; 
etiq_cochescontador.setText("0");
    }//GEN-LAST:event_btn_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio16_variables_globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio16_variables_globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio16_variables_globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio16_variables_globales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio16_variables_globales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JButton btn_salio;
    private javax.swing.JLabel etiq_cochescontador;
    private javax.swing.JLabel etiq_cochestitulo;
    private javax.swing.JLabel etiq_diseño;
    private javax.swing.JLabel etiq_logo;
    private javax.swing.JPanel panel_diseño1;
    private javax.swing.JPanel panel_diseño2;
    private javax.swing.JPanel panel_diseño3;
    // End of variables declaration//GEN-END:variables
}
