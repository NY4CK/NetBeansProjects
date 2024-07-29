
package rhapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RhApp {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        int numeroFuncionarios = 0;
        while (numeroFuncionarios < 1 || numeroFuncionarios > 10) {
            System.out.print("Quantos funcionários deseja cadastrar (1-10)? ");
            numeroFuncionarios = entrada.nextInt();
        }

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("\nInforme os dados do funcionário " + (i + 1));
            entrada.nextLine();

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("CPF: ");
            String cpf = entrada.nextLine();
            
            System.out.println();
    
            System.out.print("Endereço: ");
            String endereco = entrada.nextLine();

            System.out.print("Telefone: ");
            String telefone = entrada.nextLine();
            
            System.out.println();
            
            System.out.print("Setor: ");
            String setor = entrada.nextLine();

            System.out.print("Tipo de funcionário (1 - Assalariado, 2 - Horista): ");
            int tipo = entrada.nextInt();

            if (tipo == 1) {
                System.out.print("Salário Mensal: ");
                double salarioMensal = entrada.nextDouble();
               funcionarios.add(new Assalariado(nome, cpf, endereco, telefone, setor, salarioMensal));
            } else if (tipo == 2) {
                System.out.print("Horas Trabalhadas: ");
                double horasTrabalhadas = entrada.nextDouble();

                System.out.print("Valor da Hora: ");
                 double valorDaHora = entrada.nextDouble();
                funcionarios.add(new Horista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorDaHora));
            }
        }

        System.out.println("\nDados dos funcionários e pagamentos:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Endereço: " + funcionario.getEndereco());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Setor: " + funcionario.getSetor());
            System.out.println("Pagamento: R$" + funcionario.calcularPagamento());
            System.out.println("------------------------");
        }
        
        System.out.println("Digite a porcentagem de aumento desejado");
        double percentualAumento = entrada.nextDouble();
        
        for( Funcionario funcionario : funcionarios){
            funcionario.aplicarAumento(percentualAumento);
        }

        entrada.close();
    }
    
}
