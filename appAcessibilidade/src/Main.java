 import java.awt.event.KeyEvent;
public class Main extends javax.swing.JFrame {
    //IMPORT DA CLASSE PARA USO DAS TECLAS DE ATALHO
    
    
 /**
            * CONSTRUTOR COM MÉTODO geraAcessbilidade SENDO CHAMDO
            */
    public Main() {
        initComponents();
        geraAcessbilidade();
    }
    
    public void geraAcessbilidade(){
        //DEFINE MÉTODO QUE ASSOCIA TECLA DE ATALHO "ATL + D" PARA O BOTÃO
        btnCadastrar.setMnemonic(KeyEvent.VK_D);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interfaceApp = new javax.swing.JLayeredPane();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        itMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interfaceApp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações Cadastrais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(51, 102, 255))); // NOI18N
        interfaceApp.setToolTipText("Insira os seus dados para o cadastro");

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome completo");

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTelefone.setLabelFor(txtTelefone);
        lblTelefone.setText("Telefone");

        lblEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEndereco.setLabelFor(txtEndereco);
        lblEndereco.setText("Endereço");

        txtNome.setNextFocusableComponent(txtTelefone);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtTelefone.setNextFocusableComponent(txtEndereco);

        txtEndereco.setNextFocusableComponent(txtConta);
        txtEndereco.setOpaque(false);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(txtConta);
        jLabel1.setText("Dados Bancários");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Conta");

        txtConta.setNextFocusableComponent(btnCadastrar);
        txtConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContaActionPerformed(evt);
            }
        });

        interfaceApp.setLayer(lblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(lblTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(lblEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(jLabel1, javax.swing.JLayeredPane.PALETTE_LAYER);
        interfaceApp.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtConta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout interfaceAppLayout = new javax.swing.GroupLayout(interfaceApp);
        interfaceApp.setLayout(interfaceAppLayout);
        interfaceAppLayout.setHorizontalGroup(
            interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceAppLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interfaceAppLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addContainerGap(353, Short.MAX_VALUE))
                    .addGroup(interfaceAppLayout.createSequentialGroup()
                        .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1)
                                .addComponent(txtConta, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        interfaceAppLayout.setVerticalGroup(
            interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceAppLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interfaceAppLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblTelefone))
                    .addGroup(interfaceAppLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(26, 26, 26))
        );

        txtConta.getAccessibleContext().setAccessibleDescription("Insira os seus dados para cadastro");

        menu.setText("Menu");

        itMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menu.add(itMenuSair);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(interfaceApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(interfaceApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        interfaceApp.getAccessibleContext().setAccessibleName("Cadastro");
        interfaceApp.getAccessibleContext().setAccessibleDescription("Tela de cadastro do usuário");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
System.exit(0);       
    }//GEN-LAST:event_itMenuSairActionPerformed

    private void txtContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContaActionPerformed

   
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLayeredPane interfaceApp;
    private javax.swing.JMenuItem itMenuSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JMenu menu;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    
}
