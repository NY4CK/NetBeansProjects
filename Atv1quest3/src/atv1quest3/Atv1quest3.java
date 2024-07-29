
package atv1quest3;

import java.util.Scanner;

public class Atv1quest3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int diaria;
        int idade;
        int totalDiaria=0;
        int countGratuidade=0;
        int countMeia=0;
      
        String hospede = "";
        
        System.out.println("Escreva o valor da diária: ");
        diaria = read.nextInt();
        
        while(true) {
            
            System.out.println("nome do hóspede");
            hospede = read.next();
            
            if (hospede.equals("PARE")) {
                System.out.println("Entrada de dados interrompida");
                break;
            }
            
            System.out.println("idade do hóspede " + hospede + ":");
            idade = read.nextInt();
            
            if (idade<4){
                System.out.println(hospede + " Possui gratuidade\n");
                countGratuidade++;
            }
            
            if (idade>80) {
                System.out.println(hospede + " Paga meia\n");
                countMeia++;
                totalDiaria = totalDiaria +(diaria/2);
            }
            
            else if (idade>= 4 && idade <=80) {
                totalDiaria = diaria + totalDiaria;
            }
            
        }
        System.out.println("gratuidades: " + countGratuidade +"\n" + "Meia: " + countMeia + "\n" + "Total diária: " + totalDiaria);

    }
    
}
