package view;

import Controllers.sistemaLeilao;
import Models.Item;
import Models.Leilaomodel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 * @author Lucas
 */
public class abriLeilaoView extends javax.swing.JFrame {

    private Leilaomodel leilaoModel;
     //TEM QUE FAZER UMA PESQUISA COM ID DO USUARIO QUE CRIOU O LEILAO
    public abriLeilaoView(Leilaomodel leilaoModel) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102,204,255));
        this.leilaoModel = leilaoModel;
    }
    DefaultListModel model = new DefaultListModel();

    private abriLeilaoView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void limparcampos(){
        txt_descricao.setText("");
        txt_nomeprod.setText("");
        txt_senhaprod.setText("");
        txt_nomeprod.requestFocus();
    }
    sistemaLeilao server = new sistemaLeilao();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nomeprod = new javax.swing.JTextField();
        txt_senhaprod = new javax.swing.JTextField();
        txt_descricao = new javax.swing.JTextField();
        btn_addprod = new javax.swing.JButton();
        btn_voltartela = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_valormin = new javax.swing.JTextField();
        txt_arremate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente Leilão");
        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(578, 421));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABRIR LEILAO");

        jList1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText(" Items do Leilao:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Nome Produto:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Descricao Produto:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Senha Produto:");

        txt_nomeprod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txt_nomeprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeprodActionPerformed(evt);
            }
        });

        txt_senhaprod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txt_descricao.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        btn_addprod.setBackground(new java.awt.Color(51, 255, 51));
        btn_addprod.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_addprod.setText("ADICIONAR");
        btn_addprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addprodActionPerformed(evt);
            }
        });

        btn_voltartela.setBackground(new java.awt.Color(255, 51, 51));
        btn_voltartela.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_voltartela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout-icon (1).png"))); // NOI18N
        btn_voltartela.setText("VOLTAR");
        btn_voltartela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltartelaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Valor minimo:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Valor Arremate:");

        txt_valormin.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txt_arremate.setEditable(false);
        txt_arremate.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

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
                            .addComponent(txt_descricao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_nomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(txt_senhaprod, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_voltartela)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_valormin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_arremate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addprod)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senhaprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_valormin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_arremate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addprod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btn_voltartela, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeprodActionPerformed

    private void btn_addprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addprodActionPerformed
        // TODO add your handling code here:
       if ((txt_descricao.getText().length() == 0) || (txt_nomeprod.getText().length() == 0) || (txt_senhaprod.getText().length() == 0) || (txt_valormin.getText().length() == 0)){
           JOptionPane.showMessageDialog(rootPane,
                    "Um ou mais campos vazios!!!",
                    "Mensagem ao Usuário",
                    JOptionPane.WARNING_MESSAGE);
       }
       else{
           try {
                leilaoModel = server.pesquisarL(server.conectarServidor());
               //Montar a model para salvar
                Item item = new Item();
                item.setNome(txt_nomeprod.getText());
                item.setVendedor("teste");
                item.setCpf("11111111111");
                item.setDescricao(txt_descricao.getText());
                item.setValormin(Float.parseFloat(txt_valormin.getText()));
                item.setSenha(txt_senhaprod.getText());
                item.setArremate(item.getValormin() * 3);
                item.setIdLeilao(leilaoModel.getId());
                if (server.inserirItem(item, server.conectarServidor())) {
                    JOptionPane.showMessageDialog(rootPane, "Cadastro com sucesso!", "Mensagem ao Usuário", JOptionPane.WARNING_MESSAGE);
                    limparcampos();
                } else {
                    limparcampos();
                    JOptionPane.showMessageDialog(rootPane, "ERRO AO CADASTRAR", "Mensagem ao Usuário", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(rootPane, "ERRO AO CADASTRAR", "Mensagem ao Usuário", JOptionPane.WARNING_MESSAGE);
            }
            jList1.setModel(model);
            model.addElement(txt_nomeprod.getText());
            limparcampos();
       }
       
    }//GEN-LAST:event_btn_addprodActionPerformed

    private void btn_voltartelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltartelaActionPerformed
        // TODO add your handling code here:
        //        Usuario usuarioCon
        new loginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltartelaActionPerformed

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
            java.util.logging.Logger.getLogger(abriLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abriLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abriLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abriLeilaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abriLeilaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addprod;
    private javax.swing.JButton btn_voltartela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_arremate;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_nomeprod;
    private javax.swing.JTextField txt_senhaprod;
    private javax.swing.JTextField txt_valormin;
    // End of variables declaration//GEN-END:variables
}
