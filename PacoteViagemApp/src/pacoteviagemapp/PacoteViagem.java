
package pacoteviagemapp;

public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    private double cotacaoDolar;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }
    
    public void setCotacaoDolar(double cotacaoDolar){
        this.cotacaoDolar = cotacaoDolar;
        
    }
    
    public double getCotacaoDolar(){
        return cotacaoDolar;
    }
    
    public double calcularTotalHospedagem(){
        return (hospedagem.getValorD()) *quantidadeDias / cotacaoDolar;
    }
    
    public double calcularValorLucro(double margemPorcentagem, double valorAdicional){
        
        double lucro = (valorAdicional + transporte.getValorT()) + (1 + (margemPorcentagem/100)) / cotacaoDolar;
        return lucro;
    }
    
    public double totalPacote(double margemPorcentagem, double valorAdicional){
        
        double totalHospedagem = calcularTotalHospedagem();
        double lucro = calcularValorLucro(margemPorcentagem, valorAdicional);
        return (totalHospedagem + lucro);   
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    
}
