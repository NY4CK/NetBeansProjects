
package atv1quest5;

import java.util.Scanner;

public class Atv1Quest5 {

    public static void main(String[] args) {  
        Scanner read = new Scanner(System.in);
        
        String[][] quartos = new String[4][3];
        
        for(int andar=0;andar<4;andar++){
            for(int quarto=0;quarto<3;quarto++)
                quartos[andar][quarto] = "O";
        }   
        char resposta='S';
        
        while(resposta!='N' && resposta!='n'){
            
            System.out.println("Informe o andar: ");
            int andar = read.nextInt();
            System.out.println("Informe o quarto: ");
            int quarto = read.nextInt();
            
            if (andar >= 1 && andar <=4 && quarto >=1 && quarto <=3){
                quartos[andar - 1][quarto - 1] = "X";
            }
            else {
                System.out.println("Entrada inválida");
            }
            System.out.println("Deseja informa outra ocupação? S/N: ");
            resposta = read.next().toLowerCase().charAt(0);
        }
        
        System.out.println("Quartos ocupados:");
        
        for(int andar = 3;andar >=0;andar--){
            System.out.println((andar + 1) + " º Andar - ");
            for(int quarto = 0; quarto < 3; quarto++){
                System.out.print(quartos[andar][quarto]);
                    if (quarto<2){
                        System.out.print(" | ");  
                    }
                
            }
            System.out.println();
        }
    }
   }
    

