
package relatorioapp;

public class RelatorioApp {

    public static void main(String[] args) {
        
        Relatoriovenda relVendas = new Relatoriovenda();
    relVendas.vendas = new Venda[]{new Venda(100, "Maria"), new Venda(150, "Joao"), new Venda(100, "Antonio")};  
    relVendas.nomeEmpresa = "Empresa XYZ S.A.";
    relVendas.emiteRelatorio(); 
    }
    
}
