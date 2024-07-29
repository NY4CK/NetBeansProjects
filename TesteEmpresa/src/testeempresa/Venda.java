
package testeempresa;

public class Venda {
    
private double totalVendas;
private Funcionario vendedor;

public Venda(double totalVendas, Funcionario vendedor){
    this.totalVendas = totalVendas;
    this.vendedor = vendedor;
}

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }



}
