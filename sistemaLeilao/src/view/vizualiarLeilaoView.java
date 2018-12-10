package view;

import Controllers.sistemaLeilao;
import Models.Item;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Lucas
 */
public class vizualiarLeilaoView extends javax.swing.JFrame {
    private List<Item> itemsG;
    private Item itemAt;
    sistemaLeilao server = new sistemaLeilao();
    /**
     * Creates new form vizualiarLeilaoView
     * @param items
     */
    public vizualiarLeilaoView(List<Item> items) {
        this.itemsG = items;
        initComponents();
        preencherItem();
        getContentPane().setBackground(new java.awt.Color(102,204,255));
    }

    public void preencherItem(){
        try {
            Iterator it = itemsG.iterator();
            while (it.hasNext()) {
                Object obj = it.next();
                cmb_item.addItem(obj.toString());
            }
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:" + ex.getMessage());
        }
    }
    
    private vizualiarLeilaoView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nomeprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_arremate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_lance = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_arrematar = new javax.swing.JButton();
        txt_lanceatual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmb_item = new javax.swing.JComboBox<>();
        txt_seulance = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente Leilão");
        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(578, 421));
        setMinimumSize(new java.awt.Dimension(578, 421));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText(" Items do Leilao:");

        txt_descricao.setEditable(false);
        txt_descricao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Descricao Produto:");

        txt_nomeprod.setEditable(false);
        txt_nomeprod.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_nomeprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeprodActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Nome Produto:");

        txt_arremate.setEditable(false);
        txt_arremate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_arremate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_arremateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Valor arremate:");

        btn_lance.setBackground(new java.awt.Color(102, 255, 102));
        btn_lance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_lance.setText("DAR LANCE");
        btn_lance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lanceActionPerformed(evt);
            }
        });

        btn_sair.setBackground(new java.awt.Color(255, 0, 0));
        btn_sair.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Valor do SEU lance:");

        btn_arrematar.setBackground(new java.awt.Color(51, 102, 255));
        btn_arrematar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_arrematar.setText("ARREMATAR");
        btn_arrematar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arrematarActionPerformed(evt);
            }
        });

        txt_lanceatual.setEditable(false);
        txt_lanceatual.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_lanceatual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lanceatualActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Valor lance atual:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROLE LANCE PARTICIPANTE");

        cmb_item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_itemItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_lanceatual)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_arremate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmb_item, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_descricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_sair)
                                .addGap(18, 18, 18)
                                .addComponent(btn_lance)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(txt_seulance))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_arrematar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_lanceatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_arremate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_arrematar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_lance, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_seulance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeprodActionPerformed

    private void txt_arremateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_arremateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_arremateActionPerformed

    private void btn_lanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lanceActionPerformed
        float lanceat = Float.parseFloat(txt_seulance.getText());
        float lanceold =  Float.parseFloat(txt_lanceatual.getText());
        if(lanceat <= lanceold){
            JOptionPane.showMessageDialog(rootPane,
                    "O valo do lance deve ser MAIOR!",
                    "Mensagem ao Usuário",
                    JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane,
                    "Seu lance sera enviado!",
                    "Mensagem ao Usuário",
                    JOptionPane.WARNING_MESSAGE);
            itemAt.setValormin(lanceat);
//            server.
            txt_lanceatual.setText(String.valueOf(lanceat));
            txt_seulance.setText("");
        }
        
    }//GEN-LAST:event_btn_lanceActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        new controleLeilaoParticipanteView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_arrematarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arrematarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_arrematarActionPerformed

    private void txt_lanceatualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lanceatualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lanceatualActionPerformed

    private void cmb_itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_itemItemStateChanged
        int i = cmb_item.getSelectedIndex();
        itemAt = itemsG.get(i);
        txt_nomeprod.setText(itemAt.getNome());
        txt_lanceatual.setText(String.valueOf(itemAt.getValormin()));
        txt_arremate.setText(String.valueOf(itemAt.getArremate()));
        
    }//GEN-LAST:event_cmb_itemItemStateChanged

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
            java.util.logging.Logger.getLogger(vizualiarLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vizualiarLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vizualiarLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vizualiarLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vizualiarLeilaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_arrematar;
    private javax.swing.JButton btn_lance;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox<String> cmb_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_arremate;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_lanceatual;
    private javax.swing.JTextField txt_nomeprod;
    private javax.swing.JFormattedTextField txt_seulance;
    // End of variables declaration//GEN-END:variables
}
