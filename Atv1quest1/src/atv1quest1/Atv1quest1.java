package atv1quest1;

import java.util.Scanner;

/**
 * String
 * char
 * Int
 * double
 * boolean
 * Pablo
 */
public class Atv1quest1 {

    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
                    
                int Alfa = 150;
                int Beta = 350;
                int convidados;
                
                System.out.println("Bem vindo, para darmos continuidade responda abaixo");
                System.out.println("Qual o número de convidados? : ");
                convidados = read.nextInt();
                
                if (convidados <= 0 || convidados > 350) {
                
                    System.out.println("Número de convidados inválido");
                    
               }else {
                    if (convidados <=150 ) {
                        System.out.println("Use o auditório Alfa");
                        
              } else if (convidados <=220) {
                  int cadeirasAdicionais = Math.min(70, convidados - 150);
                  int totalPessoas = convidados + cadeirasAdicionais;
                  System.out.println("Use o auditório Alfa");
                  System.out.println("cadeiras adicionais necessárias " + cadeirasAdicionais);
                  System.out.println("total de pessoas " + totalPessoas);
              }
                    else {
                        System.out.println("use o auditório Beta");
                    }
                }
          }
    
}
