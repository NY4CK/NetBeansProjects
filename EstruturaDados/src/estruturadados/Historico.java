
package estruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Historico {
    
    Queue<Site> sites;
    
    public Historico()
    {
        sites = new LinkedList<Site>();
    }
    
    public void executa()
    {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        
        while(continuar.equals ("s"))
        {
            System.out.println("Digite o nome do site: ");
            Site novoSite = new Site();
            novoSite.nome = entrada.nextLine();
            System.out.println("Digite o url: ");
            novoSite.url = entrada.nextLine();
            
            sites.add(novoSite);
            
            if (sites.size() > 3)
            {
                Site removido = sites.remove();
                System.out.println("Site " + removido.url + " foi removido");
            }
            
            System.out.println("Continuar (S/N) ");
            continuar = entrada.nextLine();
        }
    }
}
