package poo;

import java.io.*;
import java.util.ArrayList;

public class Streaming extends javax.swing.JFrame implements Serializable {

    public static ArrayList<Ator> act = new ArrayList();
    public static ArrayList<Filme> film = new ArrayList();
    public static ArrayList<Atua> a = new ArrayList();

    public Streaming() {
        initComponents();
        act = carregarAtor();
        film = carregarFilme();
        a = carregarAtuacao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bCadAtor = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bConsAtor = new javax.swing.JButton();
        bExcAtor = new javax.swing.JButton();
        bAltNomeAtor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bCadFilme = new javax.swing.JButton();
        bConsFilme = new javax.swing.JButton();
        bAltNomeFilme = new javax.swing.JButton();
        bExcluirFilme = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bCadAtuar = new javax.swing.JButton();
        bConsAtuar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Streaming");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        bCadAtor.setText("Cadastrar Ator");
        bCadAtor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCadAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadAtorActionPerformed(evt);
            }
        });

        bSair.setText("SAIR");
        bSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AdamSandler.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bConsAtor.setText("Consultar Ator");
        bConsAtor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConsAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsAtorActionPerformed(evt);
            }
        });

        bExcAtor.setText("Excluir Ator");
        bExcAtor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bExcAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcAtorActionPerformed(evt);
            }
        });

        bAltNomeAtor.setText("Alterar Nome do Ator");
        bAltNomeAtor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAltNomeAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltNomeAtorActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/csfapv.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bCadFilme.setText("Cadastrar Filme");
        bCadFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCadFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadFilmeActionPerformed(evt);
            }
        });

        bConsFilme.setText("Consultar Filme");
        bConsFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConsFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsFilmeActionPerformed(evt);
            }
        });

        bAltNomeFilme.setText("Alterar Nome do Filme");
        bAltNomeFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAltNomeFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltNomeFilmeActionPerformed(evt);
            }
        });

        bExcluirFilme.setText("Excluir Filme");
        bExcluirFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bExcluirFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirFilmeActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atuar.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bCadAtuar.setText("Cadastrar Atuação");
        bCadAtuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCadAtuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadAtuarActionPerformed(evt);
            }
        });

        bConsAtuar.setText("Consultar Atuação");
        bConsAtuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConsAtuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsAtuarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("STREAMING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCadAtor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bConsAtor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bExcAtor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAltNomeAtor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCadFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bConsFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAltNomeFilme, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(bExcluirFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCadAtuar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(bConsAtuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(bSair)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadAtor)
                    .addComponent(bCadFilme)
                    .addComponent(bCadAtuar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConsAtor)
                    .addComponent(bConsFilme)
                    .addComponent(bConsAtuar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAltNomeAtor)
                    .addComponent(bAltNomeFilme))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bExcAtor)
                    .addComponent(bExcluirFilme))
                .addGap(43, 43, 43)
                .addComponent(bSair)
                .addGap(27, 27, 27))
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

    private void bCadAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadAtorActionPerformed
        CadastroAtor actor = new CadastroAtor(act);
        actor.setVisible(true);
    }//GEN-LAST:event_bCadAtorActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void bExcAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcAtorActionPerformed
        ExcluirAtor actor = new ExcluirAtor(act);
        actor.setVisible(true);
    }//GEN-LAST:event_bExcAtorActionPerformed

    private void bConsAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsAtorActionPerformed
        ConsultarAtor actor = new ConsultarAtor(act);
        actor.setVisible(true);
    }//GEN-LAST:event_bConsAtorActionPerformed

    private void bAltNomeAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltNomeAtorActionPerformed
        AlterarNomeAtor actor1 = new AlterarNomeAtor(act);
        actor1.setVisible(true);
    }//GEN-LAST:event_bAltNomeAtorActionPerformed

    private void bCadFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadFilmeActionPerformed
        CadastrarFilme movie = new CadastrarFilme(film);
        movie.setVisible(true);
    }//GEN-LAST:event_bCadFilmeActionPerformed

    private void bConsFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsFilmeActionPerformed
        ConsultarFilme movie = new ConsultarFilme(film);
        movie.setVisible(true);
    }//GEN-LAST:event_bConsFilmeActionPerformed

    private void bAltNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltNomeFilmeActionPerformed
        AlterarNomeFilme movie = new AlterarNomeFilme(film);
        movie.setVisible(true);
    }//GEN-LAST:event_bAltNomeFilmeActionPerformed

    private void bExcluirFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirFilmeActionPerformed
        ExcluirFilme movie = new ExcluirFilme(film);
        movie.setVisible(true);
    }//GEN-LAST:event_bExcluirFilmeActionPerformed

    private void bCadAtuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadAtuarActionPerformed
        CadastroAtuacao acting = new CadastroAtuacao(a);
        acting.setVisible(true);
    }//GEN-LAST:event_bCadAtuarActionPerformed

    private void bConsAtuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsAtuarActionPerformed
        ConsultarAtuacao acting = new ConsultarAtuacao(a);
        acting.setVisible(true);
    }//GEN-LAST:event_bConsAtuarActionPerformed

    public ArrayList<Ator> carregarAtor() {
        try {
            ArrayList<Ator> at2;
            try ( ObjectInputStream arqAtor
                    = new ObjectInputStream(new FileInputStream("ArquivoAtor"))) {
                at2 = (ArrayList<Ator>) arqAtor.readObject();
            }
            return at2;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Filme> carregarFilme() {
        try {
            ArrayList<Filme> f;
            try ( ObjectInputStream arqFilme
                    = new ObjectInputStream(new FileInputStream("ArquivoFilme"))) {
                f = (ArrayList<Filme>) arqFilme.readObject();
            }
            return f;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Atua> carregarAtuacao() {
        try {
            ArrayList<Atua> a1;
            try ( ObjectInputStream arqAtu
                    = new ObjectInputStream(new FileInputStream("ArquivoAtuacao"))) {
                a1 = (ArrayList<Atua>) arqAtu.readObject();
            }
            return a1;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(Streaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Streaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Streaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Streaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Streaming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAltNomeAtor;
    private javax.swing.JButton bAltNomeFilme;
    private javax.swing.JButton bCadAtor;
    private javax.swing.JButton bCadAtuar;
    private javax.swing.JButton bCadFilme;
    private javax.swing.JButton bConsAtor;
    private javax.swing.JButton bConsAtuar;
    private javax.swing.JButton bConsFilme;
    private javax.swing.JButton bExcAtor;
    private javax.swing.JButton bExcluirFilme;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
