
package exercicio2Pack;


public class UIExercicio2 extends javax.swing.JFrame {

  
    public UIExercicio2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputPanel = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        LbWeight = new javax.swing.JLabel();
        LbHeight = new javax.swing.JLabel();
        TxWeight = new javax.swing.JTextField();
        TxHeight = new javax.swing.JTextField();
        BtCalc = new javax.swing.JButton();
        OutPanel = new javax.swing.JPanel();
        LbResp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Welcome.setText("Bem vindo, informe os dados abaixo para conhecer sua dieta ideal");

        LbWeight.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        LbWeight.setText("Peso (Em quilos):");

        LbHeight.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        LbHeight.setText("Altura (Em Cm):");

        TxWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxWeightActionPerformed(evt);
            }
        });

        BtCalc.setText("Calcular");
        BtCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addComponent(Welcome)
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LbHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addComponent(Welcome)
                .addGap(18, 18, 18)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        OutPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbResp, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxWeightActionPerformed
        
    }//GEN-LAST:event_TxWeightActionPerformed

    private void BtCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcActionPerformed
        calc();
    }//GEN-LAST:event_BtCalcActionPerformed

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
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIExercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalc;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JLabel LbHeight;
    private javax.swing.JLabel LbResp;
    private javax.swing.JLabel LbWeight;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JTextField TxHeight;
    private javax.swing.JTextField TxWeight;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables
                  

  public void  calc(){
    //Variáveis
    Double Altura;
    Double Peso;
    Double Imc;
    String mensagem;
    //Capturando o que o usuário digitou
    Altura = Double.parseDouble(TxHeight.getText());
    Peso   = Double.parseDouble(TxWeight.getText());
    
    // Cálculo
    Imc = Peso/(Altura/100 * Altura/100);
    // Gravando a Mensagem
    if(Imc < 18.5){
        mensagem = "Você está muito magro. Precisa de uma dieta para engordar";
    }else if(Imc < 24.9){
        mensagem = "Você está com peso ideal. Não precisa de dieta";
    }else if(Imc < 29.9){
        mensagem = "Você está com sobrepeso. Precisa de uma dieta para emagrecer";
    }else if(Imc < 30){
        mensagem = "Você está com obesidade. Precisa de uma dieta, exercícios e uma mudança de vida";
    }else {
        mensagem = "Você está com obesidade grave. Precisa procurar um médico";
    }
    // Mostrando a mensagem para o usuário
    LbResp.setText(mensagem);

  }                    
}