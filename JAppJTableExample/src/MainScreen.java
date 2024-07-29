
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class MainScreen extends javax.swing.JFrame {


    public MainScreen() {
        initComponents();
    }
/**
      * Passo A. 1
      * Definição do vetor com os títulos de cada coluna da tabela
    */
    private final String[] tableColumns = {"Nome", "Email", "Idade"};
    
    /*
      * Passo A. 2
      * Definição do table model que vai conter a nossa lista de alunos
      * o primeiro parâmetro é nosso vetor com os títulos das colunas
      * e o segundo parâmetro é o índice da linha que se quer exibir os
      * títulos. Nesse caso na primeira linha.
    */
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    
    /*
      * Passo C.
      * Definição do vetor com os títulos de cada coluna da tabela
    */
   private List<Aluno> alunosList = new ArrayList<>();
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDataInput = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlDataOutput = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDataInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada de dados"));

        lblNome.setText("Nome:");

        lblEmail.setText("Email:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblIdade.setText("Idade:");

        txtIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDataInputLayout = new javax.swing.GroupLayout(pnlDataInput);
        pnlDataInput.setLayout(pnlDataInputLayout);
        pnlDataInputLayout.setHorizontalGroup(
            pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataInputLayout.createSequentialGroup()
                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDataInputLayout.createSequentialGroup()
                        .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataInputLayout.setVerticalGroup(
            pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataInputLayout.createSequentialGroup()
                .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)))
                    .addGroup(pnlDataInputLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnlDataOutput.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        javax.swing.GroupLayout pnlDataOutputLayout = new javax.swing.GroupLayout(pnlDataOutput);
        pnlDataOutput.setLayout(pnlDataOutputLayout);
        pnlDataOutputLayout.setHorizontalGroup(
            pnlDataOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataOutputLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDataOutputLayout.setVerticalGroup(
            pnlDataOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataOutputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDataOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlDataInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDataOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         /*
      * Antes de fazermos qualquer coisa precisamos
      * saber se há algum campo vazio, como já criamos
      * um método que faz isso, é só chamá-lo. Lembre-se
      * que se algum campo estiver vazio o retorno é "true",
      * caso contrário é false. Usamos ele no if precedido pelo
      * "!" (ponto de exclamação). Desse forma lê-se "se
      * campos não vazios". Dessa maneira se o retorno for
      * "false" podemos executar a inserção do aluno. 
      */
         if(!emptyFields()){
             /*
          * Agora basta enviar o aluno que vai retornar
          * do método getAluno para o método inserir
          * aluno. O método getAluno(), vai ser executado
          * antes do inserirAluno.
          */
             inserirAluno(getAluno());
             
             /*
          * Depois de inserir o aluno é uma boa prática 
          * limpar os campos do formulário e setar o
          * cursor no primeiro campo com o método
          * "requestFocus()";
          */
             txtNome.setText("");
             txtEmail.setText("");
             txtIdade.setText("");
             
             txtNome.requestFocus();
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
          /*
    * Agora basta enviar a posição do aluno para
    * o método excluirAluno(int posAluno).
    * O método getPosicaoAluno(), vai ser executado
    * antes do excluirAluno.
    */
            excluirAluno(getPosicaoAluno());
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlDataInput;
    private javax.swing.JPanel pnlDataOutput;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

     /*
    * Metodo emptyFields(), retorna "true" quando qualquer um dos campos
    * estiver vazio e "false" quando todos estiverem preenchidos.   
  */
    private boolean emptyFields(){
        /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
     */
        boolean empty = true;
        
        /*
     * Agora vamos testar campo a campo e exibir avisos caso encontre
     * algum campo vazio.
     */
        if(txtNome.getText().trim().isEmpty()){
            /*
         * se o campo txtNome estiver vazio exibimos a mensagem
         * de campo vazio. Caso contrário testamos o próximo
         */
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome não pode ser vazio.");
        } else if(txtEmail.getText().trim().isEmpty()){
             /*
         * se o campo txtEmail estiver vazio exibimos a mensagem de campo
         * vazio. Caso contrário testamos o próximo campo.
         */
           JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Email não pode ser vazio.");  
        } else if(txtIdade.getText().trim().isEmpty()){
            /*
          * se o campo txtIdade estiver vazio exibimos a mensagem de campo
          * vazio. Caso contrário testamos o próximo campo.
         */
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Idade não pode ser vazio.");
        } else {
            /*
         * se cairmos nessa condição é porque não existem campos vazios,
         * logo, a variável "empty" deve mudar seu valor para "false".
         */
            empty = false;
        }
        /*
      * Aqui retornamos a variável "empty"  
     */
        return empty;
        
    }
    
    
  /*
  * Metodo getAluno(), retorna um aluno
  * com valor em todos os atributos
  */
    private Aluno getAluno(){
        /*
     * Criação de objeto Aluno, ou seja, uma instância de Aluno
     */
      Aluno aluno = new Aluno();
      
      
     /*
     * Agora que temos um objeto aluno, vamos atribuir os valores
     * que foram digitados nos campos de texto. Nome, email e idade.
     * Para "nome", vamos deixar todas as letras em maiúsculo. Para
     * "email", vamos deixar todas as letras em minúsculo. Para idade, é
     * preciso, converter para inteiro;
     */
     aluno.setNome(txtNome.getText().toUpperCase());
     aluno.setEmail(txtEmail.getText().toLowerCase());
     aluno.setIdade(Integer.parseInt(txtIdade.getText()));
     
     /*
      * Aqui retornamos o objeto "aluno"  
     */
     return aluno;
    }
    /*
  * Metodo inserirAluno(Aluno aluno), insere o aluno
  * na lista de alunos
  */
    private void inserirAluno ( Aluno aluno){
        /*
     * Inserir o aluno na lista
     */
        alunosList.add(aluno);
        
        atualizarTabela();
    }
    
     /*
  * Metodo atualizarTabela(), vai atualizar a tabela toda vez
  * que inserido, removido ou alterado dados de um aluno;
  */
    private void atualizarTabela(){
        /*
     * antes de atualizar a tabela é uma boa prática
     * verificar se a lista de alunos NÃO está vazia, pois,
     * se estiver vazia não precisamos atualizar.
     */ 
        if(!alunosList.isEmpty()){
            /*
         * Como não está vazia, vamos criar um Aluno que será
         * será instanciado em cada ocorrência de aluno na lista,
         * isso dentro de um laço de repetição "for".
         */
            Aluno aluno;
            
             
         /*
         * Também é necessário recriar o tableModel, para limpar
         * os dados anteriores
         */
         tableModel = new DefaultTableModel(tableColumns, 0);
         
         /*
         * Agora vamos criar o for que vai repetir
         * até o tamanho da lista de alunos
         */
         for (int i = 0; i < alunosList.size(); i++){
             
             /*
             * Instância de Aluno com os dados do aluno
             * de cada posição da lista
             */
             aluno = alunosList.get(i);
             
             /*
             * Agora vamos criar um vetor de String com cada um
             * dos valores dos atributos do aluno encontrado.
             * Vamos chamar de "rowData".
             */
             String[] rowData = {aluno.getNome(), aluno.getEmail(), String.valueOf(aluno.getIdade())};
             
             /*
             * Agora adicionamos o vetor de dados na tableModel
             */
             tableModel.addRow(rowData);
        }
        
           /*
         * Após concluído o for e com isso colocar todos os
         * dados antigos e os novos no tableModel, é hora de
         * setar o modelo na tabela.
         */
           tblAlunos.setModel(tableModel);
        }else {
            /*
         * No caso de excluirmos o último aluno da lista
         * teremos de criar uma tableModel nova para "limpar
         * a tabela" e setar na tblAlunos.
         */
            tableModel = new DefaultTableModel(tableColumns,0);
            tblAlunos.setModel(tableModel);
        }
    }
    
    /*
    * Metodo getPosicaoAluno(), vai retornar um valor inteiro maior ou igual
    * a zero, caso algum aluno esteja selecionado ou -1 caso não haja seleção.
  */
    private int getPosicaoAluno(){
        /*
     * Criação da variável posAluno do tipo inteiro que vai receber 
     * o retorno do método getSelectedRow() da tblAlunos
     */
        int posAluno = tblAlunos.getSelectedRow();
        
         
     /*
     * Caso o valor seja -1 vamos informar ao usuário para ele
     * selecionar o aluno
     */
     if(posAluno == -1){
         JOptionPane.showMessageDialog(rootPane, "Selecione um aluno");
     }
     
      /*
     * Aqui retornamos a variável posAluno;  
     */
      return posAluno;
    }
    /*
    * Metodo sem retorno excluirAluno(int posAluno), vai pedir confirmação
    * para excluir o aluno da posição informada.
  */
    private void excluirAluno(int posAluno){
           
     /*
     * Antes de realizar a exclusão precisamos ter certeza que a posição
     * é válida, ou seja, maior ou igual a zero;
     */
     if(posAluno >=0){
         /*
         * Agora vamos pedir ao usuário a confirmação de exclusão.
         * Utilizaremos o método showOptionDialog() que permite
         * uma melhor customização se o usuário clicar "sim" o retorno
         * é 0. Se clicar em "Não" o retorno é 1. Posição do vetor "options";
         */
         String [] options = { "Sim", "Não"};
         
        
         int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir?", 
                 "Exclusão de aluno", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
         
         
         /*
         * Se a variável deletar for 0 vamos deletar. Caso contrário
         * vamos limpar a seleção na tabela
         */
         if(deletar==0){
              /*
                * Agora removemos a ocorrência desse aluno
                * de alunosList por meio do método, remove(int index)
                */
              alunosList.remove(posAluno);
              
               /*
                 * Depois de removido da lista precisamos atualizar a 
                 * tabela. Basta chamar o método atualizarTabela() já
                 * construído anteriormente
                 */
               atualizarTabela();
              
         } else {
             /*
             * Limpar a seleção pois o usuário cancelou a exclusão.
             */
             tblAlunos.clearSelection();
         }
         
     }
    }
   
}

