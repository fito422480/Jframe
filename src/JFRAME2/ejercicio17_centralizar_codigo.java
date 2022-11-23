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
public class ejercicio17_centralizar_codigo extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio17_centralizar_codigo
     */
    public ejercicio17_centralizar_codigo() {
        initComponents();
    }

    void Sumar() {
    String cadena1, cadena2;
    int a,b,c;
    cadena1 = txt_num1.getText();
    cadena2 = txt_num2.getText();
    a = Integer.parseInt(cadena1);
    b = Integer.parseInt(cadena2);
    c= a+b;
    eti_resultado.setText ("El resultado es: "+c);
    }
    
    void Restar() {
    String cadena1, cadena2;
    int a,b,c;
    cadena1 = txt_num1.getText();
    cadena2 = txt_num2.getText();
    a = Integer.parseInt(cadena1);
    b = Integer.parseInt(cadena2);
    c= a-b;
    eti_resultado.setText ("El resultado es: "+c);
    }
    
    void Multiplicar() {
    String cadena1, cadena2;
    int a,b,c;
    cadena1 = txt_num1.getText();
    cadena2 = txt_num2.getText();
    a = Integer.parseInt(cadena1);
    b = Integer.parseInt(cadena2);
    c= a*b;
    eti_resultado.setText ("El resultado es: "+c);
    }
    
    void Borrar () {
    txt_num1.setText("");
    txt_num2.setText("");
      }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eti_num1 = new javax.swing.JLabel();
        eti_num2 = new javax.swing.JLabel();
        txt_num1 = new javax.swing.JTextField();
        txt_num2 = new javax.swing.JTextField();
        eti_resultado = new javax.swing.JLabel();
        btn_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_calcular = new javax.swing.JMenu();
        menu_suma = new javax.swing.JMenuItem();
        menu_resta = new javax.swing.JMenuItem();
        menu_multiplicacion = new javax.swing.JMenuItem();
        menu_borrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 255, 255));

        eti_num1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eti_num1.setText("NÚMERO 1:");

        eti_num2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eti_num2.setText("NÚMERO 2:");

        txt_num1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num1ActionPerformed(evt);
            }
        });

        txt_num2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num2ActionPerformed(evt);
            }
        });

        eti_resultado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eti_resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_suma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_suma.setText("SUMA");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_resta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_resta.setText("RESTA");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_multiplicacion.setText("MULTIPLICACIÓN");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_borrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/cerrar.png"))); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eti_num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eti_num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_num1)
                            .addComponent(txt_num2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(eti_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_num1)
                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_num2)
                    .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(eti_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        menu_calcular.setText("CALCULAR");
        menu_calcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menu_suma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_suma.setText("SUMA");
        menu_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sumaActionPerformed(evt);
            }
        });
        menu_calcular.add(menu_suma);

        menu_resta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_resta.setText("RESTA");
        menu_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_restaActionPerformed(evt);
            }
        });
        menu_calcular.add(menu_resta);

        menu_multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_multiplicacion.setText("MULTIPLICACIÓN");
        menu_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_multiplicacionActionPerformed(evt);
            }
        });
        menu_calcular.add(menu_multiplicacion);

        menu_borrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_borrar.setText("BORRAR");
        menu_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_borrarActionPerformed(evt);
            }
        });
        menu_calcular.add(menu_borrar);

        jMenuBar1.add(menu_calcular);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_restaActionPerformed
Restar();        // TODO add your handling code here:
    }//GEN-LAST:event_menu_restaActionPerformed

    private void txt_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num1ActionPerformed
Sumar();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num1ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       int a = JOptionPane.YES_NO_OPTION;
       int resultado = JOptionPane.showConfirmDialog(this,"¿Desea Salir?","Salir",a);
       if (resultado == 0){
       System.exit(0);
       } 
    }//GEN-LAST:event_btn_salirActionPerformed

    private void menu_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sumaActionPerformed
Sumar();        // TODO add your handling code here:
    }//GEN-LAST:event_menu_sumaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
Sumar();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void txt_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num2ActionPerformed
Sumar();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num2ActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
Restar ();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
Multiplicar(); 
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void menu_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_multiplicacionActionPerformed
Multiplicar();        // TODO add your handling code here:
    }//GEN-LAST:event_menu_multiplicacionActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
Borrar ();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void menu_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_borrarActionPerformed
Borrar ();        // TODO add your handling code here:
    }//GEN-LAST:event_menu_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio17_centralizar_codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio17_centralizar_codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio17_centralizar_codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio17_centralizar_codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio17_centralizar_codigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel eti_num1;
    private javax.swing.JLabel eti_num2;
    private javax.swing.JLabel eti_resultado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_borrar;
    private javax.swing.JMenu menu_calcular;
    private javax.swing.JMenuItem menu_multiplicacion;
    private javax.swing.JMenuItem menu_resta;
    private javax.swing.JMenuItem menu_suma;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextField txt_num2;
    // End of variables declaration//GEN-END:variables
}
