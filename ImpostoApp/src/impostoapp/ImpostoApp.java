
package impostoapp;

import java.util.Scanner;

public class ImpostoApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o nome da empresa: ");
        String nomeEmpresa = entrada.nextLine();
        
        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        System.out.println("Bem-vindo ao sistema de cálculo de impostos!");

        while (true) {
            System.out.print("Informe o tipo de imposto (PIS ou IPI) ou 'pare' para encerrar: ");
            String tipoImposto = entrada.nextLine();

            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }

            if (tipoImposto.equalsIgnoreCase("PIS")) {
                System.out.print("Informe o valor total de débito: ");
                double debito = entrada.nextDouble();
                System.out.print("Informe o valor total de crédito: ");
                double credito = entrada.nextDouble();

                PIS pis = new PIS(debito, credito);
                pagamentos.adicionarImposto(pis);
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.print("Informe o valor do produto: ");
                double valorProduto = entrada.nextDouble();
                System.out.print("Informe o valor do frete: ");
                double frete = entrada.nextDouble();
                System.out.print("Informe o valor do seguro: ");
                double seguro = entrada.nextDouble();
                System.out.print("Informe o valor de outras despesas: ");
                double outrasDespesas = entrada.nextDouble();
                System.out.print("Informe a alíquota (%): ");
                double aliquota = entrada.nextDouble();

                IPI ipi = new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota);
                pagamentos.adicionarImposto(ipi);
            } else {
                System.out.println("Tipo de imposto não reconhecido. Tente novamente.");
            }
            System.out.println();
        }

        System.out.println("\nResumo dos pagamentos de impostos:");
        pagamentos.exibirPagamentos();

        entrada.close();
    }
    
}
