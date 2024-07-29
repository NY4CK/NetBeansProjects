
package RegistroConsulta;

public class Registro {
    
    private int id;
    private String nome;
    private String telefone;
    private String cpf;
    private String data;
    private String checkbox;
private boolean Fifi;
    
    Registro() {
        
    }

    public Registro(int id,String nome, String telefone, String cpf, String data, String checkbox, boolean Fifi) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.checkbox = checkbox;
        this.Fifi = Fifi;
    }

  
    

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }

    public boolean isFifi() {
        return Fifi;
    }

    public void setFifi(boolean Fifi) {
        this.Fifi = Fifi;
    }
  
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
}
