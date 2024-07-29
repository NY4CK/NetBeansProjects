
package testeexemplos;

import java.util.Date;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TesteExemplos {

    public static void main(String[] args) {
      
       Queue<String> text = new LinkedList<>();
       
       Scanner entrada = new Scanner (System.in);
       
       for(int i=0; i < 5; i ++){
           System.out.println("Digite a frase desejada: ");
           String frase = entrada.nextLine();
           text.add(frase);
           
        
    }
       
       int ordem = 1;
       while(!text.isEmpty())
       {
           String nome = text.remove();
           System.out.println(ordem + "º a ser atendido(a): " + nome);
           ordem++;
       }
        
    }
    
}
