
package atv1quest4;

import java.util.Scanner;

public class Atv1Quest4 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String[] hospedes = new String[15];
        String pesquisa = "";
        int resp=0, count=0;
        boolean encontrado = false;
        
        while(true) {
            
            System.out.println("Digite 1-cadastrar; 2-pesquisar; 3-sair\n");
            resp = read.nextInt();
                
            if (resp==1){
                if(count<15){
                    System.out.println("Escreva o nome do hóspede: ");
                    hospedes[count]=read.next();
                    count++;
                } else {
                    System.out.println("Máximo de cadastros atingidos\n");
                }  
            }
            if (resp==2) {
                System.out.println("Pesquisar por: ");
                pesquisa = read.next();
                encontrado = false;
                
                for(int linha=0;linha<count;linha++) {
                    if(hospedes[linha]!=null && hospedes[linha].equalsIgnoreCase(pesquisa)) {
                        int pos = linha+1;
                        System.out.println("Hóspede " + pesquisa + " encontrado na posição " + pos);
                        encontrado=true;
                    }
                }
                if (!encontrado){
                    System.out.println("Hóspede não encontrado");
                }
            } else if(resp==3){
                System.out.println("Finalizando");
                break;
            }
            
        }
        
    }
    
}
