
package estruturadados;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {
    
    List<Site> sites;
    
    public Favoritos()
    {
        sites = new ArrayList<Site  >();
    }
    
    public void mostrarFavoritos()
    {
        System.out.println("Lista de favoritos: ");
        for(Site s : sites)
            System.out.println(s.nome + " ("+ s.url + ")");
    }
    
    
    public void executa()
    {
        sites.add(new Site("Site 1" , " www.um.com"));
        sites.add(new Site("Site 2" , " www.dois.com"));
        sites.add(new Site("Site 3" , " www.tres.com"));
        mostrarFavoritos();
        sites.remove(1);
        mostrarFavoritos();
        sites.add(new Site("Site 4" , " www.quatro.com"));
        mostrarFavoritos();
    }
    
}
