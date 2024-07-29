
package pacoteviagemapp;

public class Hospedagem {
    
    private String descricao;
    private double valorD;

    public Hospedagem(String descricao, double valorD) {
        this.descricao = descricao;
        this.valorD = valorD;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorD() {
        return valorD;
    }

    public void setValorD(double valorD) {
        this.valorD = valorD;
    }
    
    
}
