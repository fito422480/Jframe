/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAME1;

/**
 *
 * @author DELL
 */
public class ejercicio1_cuadros_verificacion extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio1_cuadros_verificacion
     */
    public ejercicio1_cuadros_verificacion() {
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

        fondo_adorno = new javax.swing.JLabel();
        abm_aceptar = new javax.swing.JButton();
        etiresultado = new javax.swing.JLabel();
        consulta = new javax.swing.JLabel();
        chk_python = new javax.swing.JCheckBox();
        chk_java = new javax.swing.JCheckBox();
        chk_javascript = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_adorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/ejerc_1.jpg"))); // NOI18N
        getContentPane().add(fondo_adorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 220, 210));

        abm_aceptar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        abm_aceptar.setText("ACEPTAR");
        abm_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abm_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(abm_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 40));

        etiresultado.setBackground(new java.awt.Color(153, 153, 153));
        etiresultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        etiresultado.setForeground(new java.awt.Color(0, 0, 51));
        etiresultado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        getContentPane().add(etiresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 510, 60));

        consulta.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        consulta.setText("Cual es tu Lenguaje favorito?");
        getContentPane().add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 40));

        chk_python.setFont(new java.awt.Font("Courier New", 3, 16)); // NOI18N
        chk_python.setText("Python");
        getContentPane().add(chk_python, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        chk_java.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        chk_java.setText("JAVA");
        getContentPane().add(chk_java, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        chk_javascript.setFont(new java.awt.Font("Courier New", 3, 16)); // NOI18N
        chk_javascript.setText("JAVAScript");
        getContentPane().add(chk_javascript, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abm_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abm_aceptarActionPerformed
 String mensaje="Seleccionaste: ";
 if (chk_python.isSelected()) {
 mensaje=mensaje+"Python ";
 } 
 
 if (chk_java.isSelected()) {
 mensaje=mensaje+"JAVA ";
 }
 
 if (chk_javascript.isSelected()) {
 mensaje=mensaje+"JAVAScript ";
 }
 
 etiresultado.setText(mensaje);
        
        
    }//GEN-LAST:event_abm_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio1_cuadros_verificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio1_cuadros_verificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio1_cuadros_verificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio1_cuadros_verificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio1_cuadros_verificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abm_aceptar;
    private javax.swing.JCheckBox chk_java;
    private javax.swing.JCheckBox chk_javascript;
    private javax.swing.JCheckBox chk_python;
    private javax.swing.JLabel consulta;
    private javax.swing.JLabel etiresultado;
    private javax.swing.JLabel fondo_adorno;
    // End of variables declaration//GEN-END:variables
}
