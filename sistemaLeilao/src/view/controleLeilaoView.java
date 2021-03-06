package view;

import Controllers.sistemaLeilao;
import Models.Leilaomodel;
import Models.Usuario;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Lucas
 */
public class controleLeilaoView extends javax.swing.JFrame {
private int resp;
private Usuario usuarioCon;
sistemaLeilao server = new sistemaLeilao();
    /**
     * Creates new form controleLeilaoView
     * @param resultLogin
     */
    public controleLeilaoView(Usuario resultLogin) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102,204,255));
        this.usuarioCon = resultLogin;
        sistemaLeilao server = new sistemaLeilao();
        preencherLeilao(resultLogin);
    }
    

    private controleLeilaoView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void preencherLeilao(Usuario user) {
        java.util.List<Leilaomodel> leiloes;
        String criterio = "criadoPor =" + user.getId();
        try {
            leiloes = server.preencherleilao(criterio ,server.conectarServidor());
            Iterator it = leiloes.iterator();
            while (it.hasNext()) {
                Object obj = it.next();
                cmb_leilao.addItem(obj.toString());
            }
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:" + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        btn_encerrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        cmb_leilao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente Leilão");
        setMinimumSize(new java.awt.Dimension(578, 421));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROLE LEILAO");

        btn_novo.setBackground(new java.awt.Color(102, 255, 102));
        btn_novo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cute-Ball-Go-icon.png"))); // NOI18N
        btn_novo.setText("NOVO LEILAO");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_abrir.setBackground(new java.awt.Color(51, 102, 255));
        btn_abrir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_abrir.setText("VER LANCES");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });

        btn_encerrar.setBackground(new java.awt.Color(255, 51, 51));
        btn_encerrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_encerrar.setText("ENCERRAR LEILAO");
        btn_encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encerrarActionPerformed(evt);
            }
        });

        btn_sair.setBackground(new java.awt.Color(255, 51, 51));
        btn_sair.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout-icon (1).png"))); // NOI18N
        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        cmb_leilao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cmb_leilao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_leilaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Seus leiloes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_leilao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_novo)
                        .addGap(40, 40, 40)
                        .addComponent(btn_abrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btn_encerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_encerrar)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_abrir))
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_leilao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_abrir, btn_encerrar, btn_novo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // TODO add your handling code here:
        new cadLeilaoView(usuarioCon).setVisible(true);
          this.dispose();
          
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        // TODO add your handling code here:
        new controleLance().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_encerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encerrarActionPerformed
        try {
            String div[] = cmb_leilao.getSelectedItem().toString().split(",");
            String criterio = div[0];
            server.alterarStatuById(criterio, server.conectarServidor());
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }
    }//GEN-LAST:event_btn_encerrarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair ?", "Saindo do programa!!!", JOptionPane.YES_NO_OPTION);
        if (resp == 0){
            this.dispose();
        }
    }//GEN-LAST:event_btn_sairActionPerformed

    private void cmb_leilaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_leilaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_leilaoActionPerformed

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
            java.util.logging.Logger.getLogger(controleLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controleLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controleLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controleLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controleLeilaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_encerrar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox<String> cmb_leilao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
