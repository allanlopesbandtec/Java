/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.cofrinho;

/**
 *
 * @author Aluno
 */
public class Tela2 extends javax.swing.JFrame {

    Cofrinho cofrinho01 = new Cofrinho();
    Cofrinho cofrinho02 = new Cofrinho();
    /**
     * Creates new form Tela2
     */
    public Tela2() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblSaldo2 = new javax.swing.JLabel();
        LblSaldo01 = new javax.swing.JLabel();
        BtnSacar2 = new javax.swing.JButton();
        BtnSacar01 = new javax.swing.JButton();
        BtnDepositar2 = new javax.swing.JButton();
        BtnDepositar01 = new javax.swing.JButton();
        BtnQuebrar02 = new javax.swing.JButton();
        BtnQuebrar01 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Cofrinho 02");

        jLabel1.setText("Cofrinho 01");

        jLabel4.setText("Saldo: ");

        jLabel2.setText("Saldo: ");

        LblSaldo2.setText("0");

        LblSaldo01.setText("0");

        BtnSacar2.setText("Sacar 50 R$");
        BtnSacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSacar2ActionPerformed(evt);
            }
        });

        BtnSacar01.setText("Sacar 50 R$");
        BtnSacar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSacar01ActionPerformed(evt);
            }
        });

        BtnDepositar2.setText("Depositar 50 R$");
        BtnDepositar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepositar2ActionPerformed(evt);
            }
        });

        BtnDepositar01.setText("Depositar 50 R$");
        BtnDepositar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepositar01ActionPerformed(evt);
            }
        });

        BtnQuebrar02.setText("Quebrar cofrinho");
        BtnQuebrar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuebrar02ActionPerformed(evt);
            }
        });

        BtnQuebrar01.setText("Quebrar cofrinho");
        BtnQuebrar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuebrar01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BtnDepositar2)
                            .addGap(33, 33, 33)
                            .addComponent(BtnSacar2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(LblSaldo2))
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(LblSaldo01))
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BtnDepositar01)
                            .addGap(33, 33, 33)
                            .addComponent(BtnSacar01))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnQuebrar02)
                    .addComponent(BtnQuebrar01))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LblSaldo01))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSacar01)
                    .addComponent(BtnDepositar01)
                    .addComponent(BtnQuebrar01))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LblSaldo2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSacar2)
                    .addComponent(BtnDepositar2)
                    .addComponent(BtnQuebrar02))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSacar2ActionPerformed
        cofrinho02.sacar();
        LblSaldo01.setText(cofrinho01.saldo.toString());
    }//GEN-LAST:event_BtnSacar2ActionPerformed

    private void BtnSacar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSacar01ActionPerformed
        cofrinho01.sacar();
        LblSaldo01.setText(cofrinho01.saldo.toString());
    }//GEN-LAST:event_BtnSacar01ActionPerformed

    private void BtnDepositar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepositar2ActionPerformed
        cofrinho02.depositar();
        LblSaldo2.setText(cofrinho02.saldo.toString());
    }//GEN-LAST:event_BtnDepositar2ActionPerformed

    private void BtnDepositar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepositar01ActionPerformed
        cofrinho01.depositar();
        LblSaldo01.setText(cofrinho01.saldo.toString());
    }//GEN-LAST:event_BtnDepositar01ActionPerformed

    private void BtnQuebrar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuebrar02ActionPerformed
        cofrinho02.quebrar();
        LblSaldo2.setText(cofrinho02.saldo.toString());
    }//GEN-LAST:event_BtnQuebrar02ActionPerformed

    private void BtnQuebrar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuebrar01ActionPerformed
        cofrinho01.quebrar();
        LblSaldo01.setText(cofrinho01.saldo.toString());
    }//GEN-LAST:event_BtnQuebrar01ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDepositar01;
    private javax.swing.JButton BtnDepositar2;
    private javax.swing.JButton BtnQuebrar01;
    private javax.swing.JButton BtnQuebrar02;
    private javax.swing.JButton BtnSacar01;
    private javax.swing.JButton BtnSacar2;
    private javax.swing.JLabel LblSaldo01;
    private javax.swing.JLabel LblSaldo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
