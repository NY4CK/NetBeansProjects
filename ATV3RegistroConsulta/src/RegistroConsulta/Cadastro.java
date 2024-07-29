package RegistroConsulta;

import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        outNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        outTelefone = new javax.swing.JTextField();
        outCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ouData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JCheckBox();
        CadastrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Nome:");

        outNome.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Telefone:");

        outTelefone.setPreferredSize(new java.awt.Dimension(64, 25));

        outCPF.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("CPF:");

        ouData.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Data:");

        cbPaciente.setText("Já é Paciente");
        cbPaciente.setFocusable(false);

        CadastrarButton.setText("Cadastrar");
        CadastrarButton.setFocusable(false);
        CadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPaciente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(outNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(outTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(outCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(ouData, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(outNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(outTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(outCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ouData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarButtonActionPerformed

        Registro ca = new Registro();

       
        
        ca.setNome(outNome.getText());
        ca.setTelefone(outTelefone.getText());
        ca.setCpf(outCPF.getText());
        ca.setData(ouData.getText());
        ca.setCheckbox(cbPaciente.isSelected() ? "Sim" : "Não");
        ca.setFifi(false);
        
        
         if (validarCampos(ca)) {
        Listagem.checagem(ca);
        // Feche a tela após cadastrar os dados
        this.dispose();
         }
    }//GEN-LAST:event_CadastrarButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    
    private boolean validarCampos(Registro ca) {
    try {
        if (ca.getNome().isEmpty() || ca.getNome().isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do paciente", "Erro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!Listagem.validatePhoneNumber(ca.getTelefone()) || ca.getTelefone().isBlank() || ca.getTelefone().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Telefone inválido. Preencha corretamente!\nExemplo: (12) 34567-8910", "Erro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!Listagem.validarCPF(ca.getCpf()) || ca.getCpf().isBlank() || ca.getCpf().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CPF inválido. Preencha corretamente!\nExemplo: 123.456.789-10", "Erro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!Listagem.validarData(ca.getData()) || ca.getData().isBlank() || ca.getData().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data inválida. Preencha corretamente!\nExemplo: 02/02/2006", "Erro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao adicionar na lista", "Erro", JOptionPane.WARNING_MESSAGE);
        return false;
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarButton;
    private javax.swing.JCheckBox cbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ouData;
    private javax.swing.JTextField outCPF;
    private javax.swing.JTextField outNome;
    private javax.swing.JTextField outTelefone;
    // End of variables declaration//GEN-END:variables
}
