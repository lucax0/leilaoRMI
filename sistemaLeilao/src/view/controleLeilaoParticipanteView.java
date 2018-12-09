package view;

import Controllers.sistemaLeilao;
import Models.Usuario;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import Models.Leilaomodel;
import java.sql.SQLException;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Lucas
 */
    public class controleLeilaoParticipanteView extends javax.swing.JFrame {
        
    private int resp;
    sistemaLeilao server = new sistemaLeilao();
    private Leilaomodel leilao;
    private DefaultListModel<Leilaomodel> model;
    /**
     * Creates new form controleLeilaoParticipanteView
     */
    public controleLeilaoParticipanteView() {
    }
    
    controleLeilaoParticipanteView(Usuario resultLogin) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102,204,255));
        preencherLeilao();
    }

    private void preencherLeilao() {
        java.util.List<Leilaomodel> leiloes;
        try {
            leiloes = server.preencherleilao(server.conectarServidor());
            Iterator it = leiloes.iterator();
            while (it.hasNext()) {
                Object obj = it.next();
                cmb_leilao.addItem(obj.toString());
            }
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:" + ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btn_parti = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_vizu = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_leilao = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(578, 421));
        setMinimumSize(new java.awt.Dimension(578, 421));
        setPreferredSize(new java.awt.Dimension(578, 421));
        setResizable(false);

        btn_parti.setBackground(new java.awt.Color(102, 255, 102));
        btn_parti.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_parti.setText("PARTICIPAR");
        btn_parti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROLE LEILAO PART.");

        btn_vizu.setBackground(new java.awt.Color(51, 102, 255));
        btn_vizu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_vizu.setText("EDITAR PERFIL");
        btn_vizu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vizuActionPerformed(evt);
            }
        });

        btn_sair.setBackground(new java.awt.Color(255, 51, 51));
        btn_sair.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Leiloes ativos:");

        cmb_leilao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_leilao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_parti)
                                .addGap(27, 27, 27)
                                .addComponent(btn_vizu))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_parti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vizu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_leilao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_partiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_partiActionPerformed

    private void btn_vizuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vizuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vizuActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair ?", "Saindo do programa!!!", JOptionPane.YES_NO_OPTION);
        if (resp == 1){
            
        }else{
         
            this.dispose();
        }
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(controleLeilaoParticipanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controleLeilaoParticipanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controleLeilaoParticipanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controleLeilaoParticipanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controleLeilaoParticipanteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_parti;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_vizu;
    private javax.swing.JComboBox<String> cmb_leilao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
