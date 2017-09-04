/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luismatos.telas.principal;

import br.com.luismatos.telas.chave.CadChave;
import br.com.luismatos.telas.usuario.CadUsuario;

/**
 *
 * @author Trabalho
 */
public class Principal extends javax.swing.JFrame {
    

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jMenu = new javax.swing.JMenuBar();
        jChave = new javax.swing.JMenu();
        jCadChave = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnCadUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jChave.setText("Chave");

        jCadChave.setText("Cadastrar");
        jCadChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadChaveActionPerformed(evt);
            }
        });
        jChave.add(jCadChave);

        jMenu.add(jChave);

        jMenu1.setText("Usuários");

        btnCadUsuario.setText("Cadastrar");
        btnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnCadUsuario);

        jMenuItem1.setText("Listar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu.add(jMenu1);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadChaveActionPerformed
        CadChave frame = new CadChave();
        jDesktop.add(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_jCadChaveActionPerformed

    private void btnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUsuarioActionPerformed
        CadUsuario frame = new CadUsuario();
        jDesktop.add(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btnCadUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadUsuario;
    private javax.swing.JMenuItem jCadChave;
    private javax.swing.JMenu jChave;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
