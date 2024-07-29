
package rhapp;

public class Horista extends Funcionario{
    
    private double horasTrabalhadas;
    private double valorDaHora;

    public Horista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorDaHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

 

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorDaHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
    
    
}
