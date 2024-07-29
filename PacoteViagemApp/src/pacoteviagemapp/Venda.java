
package pacoteviagemapp;

public class Venda {
   
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }
    
    public double converterDolarParaReais(double valorEmDolar) {
        double cotacaoDolar = pacoteViagem.getCotacaoDolar();
        return valorEmDolar * cotacaoDolar; 
    }
    
    public void mostrarTotalPacote(){
        double totalPacoteDolar = pacoteViagem.totalPacote(0,0);
        double totalPacoteReais = converterDolarParaReais(totalPacoteDolar);
        
        System.out.println("Total do Pacote em Dólar: $" + totalPacoteDolar);
        System.out.println("Total do Pacote em Reais: R$" + totalPacoteReais);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }
    
    
    
}
