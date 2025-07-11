/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;

import Sistema.PanelAdmin;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author eberc
 */
public class Operador extends javax.swing.JFrame {

    /**
     */
    public Operador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Contraseña = new javax.swing.JLabel();
        Separador_Contraseña = new javax.swing.JSeparator();
        Usuario = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        Separador_usuario = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        Ingresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contraseña.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Contraseña.setText("CONTRASEÑA");

        Separador_Contraseña.setForeground(new java.awt.Color(0, 0, 0));

        Usuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Usuario.setText("USUARIO");

        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        Separador_usuario.setForeground(new java.awt.Color(0, 0, 0));

        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setBorder(null);
        passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTxtFocusLost(evt);
            }
        });

        Ingresar1.setBackground(new java.awt.Color(255, 102, 0));
        Ingresar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ingresar1.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar1.setText("INGRESAR");
        Ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar1ActionPerformed(evt);
            }
        });

        jLabel1.setText("User: admin");

        jLabel2.setText("Contraseña: admin1234");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Usuario)
                            .addComponent(Contraseña)
                            .addComponent(Separador_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Separador_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ingresar1)
                        .addGap(81, 362, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(Usuario)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addComponent(Contraseña)
                .addGap(1, 1, 1)
                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Separador_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Ingresar1)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.BLACK);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("");
            passTxt.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusGained
        if (String.valueOf(passTxt.getPassword()).equals("*******")) {
            passTxt.setText("");
            passTxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passTxtFocusGained

    private void passTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusLost
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("");
            passTxt.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_passTxtFocusLost

    private void Ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar1ActionPerformed
        // TODO add your handling code here:
        if(!"admin".equals(this.userTxt.getText()) || !"admin1234".equals(String.valueOf(this.passTxt.getPassword()))){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos");

        }else{
            PanelAdmin panel = new PanelAdmin();
            panel.setVisible(true);
            this.dispose(); }// Cierra la ventana de login

    }//GEN-LAST:event_Ingresar1ActionPerformed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton Ingresar1;
    private javax.swing.JSeparator Separador_Contraseña;
    private javax.swing.JSeparator Separador_usuario;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
