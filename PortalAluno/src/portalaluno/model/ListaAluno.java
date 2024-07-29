
package portalaluno.model;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {
   
    // Declaração das variáveis
    private static final List<Aluno> lista = new ArrayList<>();
    
    // Métodos para acessar a lista e adicionar novos itens
    public static List<Aluno> Listar(){
        return lista;
    }
    
      public static void Adicionar( Aluno aluno){
          lista.add(aluno);
      }      
}
