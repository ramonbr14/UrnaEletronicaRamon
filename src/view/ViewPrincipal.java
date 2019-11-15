/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
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

        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncandidatos = new javax.swing.JButton();
        btnEleitor = new javax.swing.JButton();
        btnUrna = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        jmEleitor = new javax.swing.JMenu();
        jmCandidato = new javax.swing.JMenu();
        jmPartido = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jButton6.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal - URNA SOFT TAMBOR v1.0");
        setSize(new java.awt.Dimension(590, 462));

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 429));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/acesso-rapido.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ki Comic", 3, 24)); // NOI18N
        jLabel2.setText("ACESSO RAPIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btncandidatos.setBackground(new java.awt.Color(255, 255, 0));
        btncandidatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/candidatos.png"))); // NOI18N
        btncandidatos.setText("Candidatos");
        btncandidatos.setPreferredSize(new java.awt.Dimension(145, 73));
        btncandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirCandidato(evt);
            }
        });

        btnEleitor.setBackground(new java.awt.Color(255, 255, 0));
        btnEleitor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEleitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eleitor.png"))); // NOI18N
        btnEleitor.setText("Eleitor");
        btnEleitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirEleitor(evt);
            }
        });

        btnUrna.setBackground(new java.awt.Color(255, 255, 0));
        btnUrna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUrna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/urna.png"))); // NOI18N
        btnUrna.setText("URNA");
        btnUrna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirUrna(evt);
            }
        });
        btnUrna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(btnEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(btnUrna, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(btncandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEleitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUrna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncandidatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arquivo-menu-2.png"))); // NOI18N
        jmArquivo.setText("ARQUIVO");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/house_122791.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar Usuario");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmArquivo.add(jMenuItem1);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair-menu-2.png"))); // NOI18N
        jmiSair.setText("SAIR");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jMenuBar1.add(jmArquivo);

        jmEleitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eleitor-menu-2.png"))); // NOI18N
        jmEleitor.setText("ELEITOR");
        jmEleitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmEleitorMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmEleitor);

        jmCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/candidatos-menu-2.png"))); // NOI18N
        jmCandidato.setText("CANDIDATO");
        jmCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCandidatoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmCandidato);

        jmPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/partido-menu-2.png"))); // NOI18N
        jmPartido.setText("PARTIDO POLITICO");
        jmPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmPartidoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmPartido);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUrnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUrnaActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "FECHAR O PROGRAMA?", "VOCÊ ESTA ENCERRANDO O PROGRAMA", 0, 0);
        if(input == 0)
                System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void AbrirEleitor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirEleitor
        // TODO add your handling code here:
        new ViewEleitor().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_AbrirEleitor

    private void AbrirUrna(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirUrna
        // TODO add your handling code here:
        new ViewUrna().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_AbrirUrna

    private void AbrirCandidato(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirCandidato
        // TODO add your handling code here:
        new ViewCandidato().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_AbrirCandidato

    private void jmEleitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmEleitorMouseClicked
        // TODO add your handling code here:
        new ViewEleitor().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jmEleitorMouseClicked

    private void jmCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCandidatoMouseClicked
        // TODO add your handling code here:
        new ViewCandidato().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jmCandidatoMouseClicked

    private void jmPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmPartidoMouseClicked
        // TODO add your handling code here:
        new ViewPartido().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jmPartidoMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ViewUsuario().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEleitor;
    private javax.swing.JButton btnUrna;
    private javax.swing.JButton btncandidatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCandidato;
    private javax.swing.JMenu jmEleitor;
    private javax.swing.JMenu jmPartido;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
