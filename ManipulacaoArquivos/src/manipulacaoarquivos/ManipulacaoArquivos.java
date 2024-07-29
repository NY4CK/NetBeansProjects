
package manipulacaoarquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulacaoArquivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    lerConteudoDoArquivo();
                    break;
                case 2:
                    escreverNoArquivo();
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Adeus!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Ler o conteúdo do arquivo");
        System.out.println("2. Escrever no arquivo");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void lerConteudoDoArquivo() {
        try {
            File arquivo = new File("C://teste//arquivo.txt");

            if (!arquivo.exists()) {
                System.out.println("O arquivo não existe ainda. Use a opção 2 para escrever nele.");
                return;
            }

            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;

            System.out.println("Conteúdo do arquivo:");

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static void escreverNoArquivo() {
        try {
            File arquivo = new File("C://teste//arquivo.txt");
            FileWriter escritor = new FileWriter(arquivo, true);

            System.out.println("Digite o texto para escrever no arquivo (Digite 'FIM' para encerrar):");

            Scanner scanner = new Scanner(System.in);
            String texto;

            while (!(texto = scanner.nextLine()).equalsIgnoreCase("FIM")) {
                escritor.write(texto + "\n");
            }

            escritor.close();
            System.out.println("Texto escrito no arquivo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

    
    

