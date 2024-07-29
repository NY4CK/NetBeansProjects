
package atv1quest2;

import java.util.Scanner;


public class Atv1quest2 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
           String nomeHospede1;
        String nomeHospede2;
        int idadeHospede1;
        int idadeHospede2;
        
        System.out.println("Primeiro hospede");
        System.out.println("Digite o nome: ");
        nomeHospede1 = read.nextLine();
        System.out.println("Digite a idade: ");
        idadeHospede1 = read.nextInt();
        
        read.nextLine();
        
        System.out.println("Segundo hospede");
        System.out.println("Digite o nome: ");
        nomeHospede2 = read.nextLine();
        System.out.println("Digite a idade: ");
        idadeHospede2 = read.nextInt();
        
        read.close();
        
        boolean hospede1Idoso = idadeHospede1 >= 60;
        boolean hospede2Idoso = idadeHospede2 >= 60;
        
        if (idadeHospede2 > idadeHospede1) {
            System.out.println("Quarto A: " + nomeHospede2);
            if (hospede2Idoso) {
                System.out.println("Desconto de 40% aplicado");
            }
            System.out.println("Quarto B: " + nomeHospede1);
        } else {
            System.out.println("Quarto A: " + nomeHospede1);
            if (hospede1Idoso) {
                System.out.println("Desconto de 40% aplicado");
            }
            System.out.println("Quarto B: " + nomeHospede2);
        }
    }
}