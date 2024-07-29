
public class Aluno {
    
    /*
    * Definição e encapsulamento dos atributos da classe.
    * Representam as características de um aluno. Geralmente
    * são encapsuladas como private.
    */
    private String nome;
    private String email;
    private int idade;
    
    /*
    * Abaixo estão os métodos acessores e modificadores.
    * Os setters servem para atribuir valores aos atributos privados
    * Os getters servem para pegar os valores dos atributos privados
    */

    /**
      * @return the nome
      */
    
    public String getNome(){
        return nome;
        
    }
    
     /**
      * @param nome the nome to set
      */
    public void setNome(String nome){
        this.nome = nome;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
      * @return the email
      */
    
}
