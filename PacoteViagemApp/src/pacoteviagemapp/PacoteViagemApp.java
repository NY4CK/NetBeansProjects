
package pacoteviagemapp;

import java.util.Scanner;

public class PacoteViagemApp {


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        System.out.print("Tipo de transporte: ");
        String tipoTransporte = entrada.nextLine();
        System.out.print("Valor do transporte em reais: ");
        double valorTransporteReais = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Descrição da hospedagem: ");
        String descricaoHospedagem = entrada.nextLine();
        System.out.print("Valor da hospedagem em reais: ");
        double valorHospedagemReais = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Destino: ");
        String destino = entrada.nextLine();
        System.out.print("Quantidade de dias: ");
        int quantidadeDias = entrada.nextInt();
        
        Transporte transporte = new Transporte(tipoTransporte, valorTransporteReais);
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorHospedagemReais);
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);

        System.out.print("Margem de lucro (em porcentagem): ");
        double margemPorcentagem = entrada.nextDouble();
        System.out.print("Valor adicional em reais: ");
        double valorAdicionalReais = entrada.nextDouble();

        System.out.print("Cotação do dólar no dia: ");
        double cotacaoDolar = entrada.nextDouble();
        pacoteViagem.setCotacaoDolar(cotacaoDolar);

        double totalPacoteDolar = pacoteViagem.totalPacote(margemPorcentagem, valorAdicionalReais);
        
        System.out.println("\nInformações do Pacote de Viagem:");
        System.out.println("Tipo de Transporte: " + pacoteViagem.getTransporte().getTipo());
        System.out.println("Descrição da Hospedagem: " + pacoteViagem.getHospedagem().getDescricao());
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Quantidade de Dias: " + pacoteViagem.getQuantidadeDias());
        System.out.println("Valor Total em Dólar: $" + totalPacoteDolar);

        System.out.println("\nCadastro de Venda");
        System.out.print("Nome do cliente: ");
        entrada.nextLine();
        String nomeCliente = entrada.nextLine();
        System.out.print("Forma de pagamento: ");
        String formaPagamento = entrada.nextLine();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);
        venda.mostrarTotalPacote();

        entrada.close();
    }
    
}
