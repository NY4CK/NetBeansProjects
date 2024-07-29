
package listatestes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ListaTestes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        HashSet<String> livros = new HashSet<String>();
        String nomeLivro;
        
        System.out.println("Primeiro inclua 3 títulos de livros");
        for(int i=0; i<3; i++)
        {
            //incluindo novo valor informado pelo usuário
            nomeLivro = entrada.nextLine();
            livros.add(nomeLivro);
            
            System.out.println("> Coleção agora: ");
            for(String l : livros)
            {
                System.out.println(l);
            }
        }
        
        System.out.println("Agora faça buscas. Digite PARE para encerrar");
        nomeLivro = entrada.nextLine();
        while(!nomeLivro.equals("PARE"))
        {
            //buscando o valor informado no HashSet
            if(livros.contains(nomeLivro))
            {
                System.out.println("Valor '" + nomeLivro + "' foi encontrado na posição ");
            }
            else
            {
                System.out.println("Valor '" + nomeLivro + "' não foi encontrado.");
            }
            
            nomeLivro = entrada.nextLine();
        }
        
    }
    
}
