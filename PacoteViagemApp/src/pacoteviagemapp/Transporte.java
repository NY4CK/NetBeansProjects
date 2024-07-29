
package pacoteviagemapp;    

public class Transporte {
    
    private String tipo;
    private double valorT;

    public Transporte(String tipo, double valorT) {
        this.tipo = tipo;
        this.valorT = valorT;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorT() {
        return valorT;
    }

    public void setValorT(double valorT) {
        this.valorT = valorT;
    }
    
    
   
}
