
package testeempresa;

import java.time.LocalDate;
import java.util.Scanner;
import static javax.management.Query.lt;

public class TesteEmpresa {

  
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        Empresa novaEmpresa;
        
        novaEmpresa = new Empresa("XYZ S.A.", "13.522.667/0001-07", 3);
        
        Funcionario joao = new Funcionario("João", "Gerente", LocalDate.of(1980, 10, 10), 2000.5); 
        
        novaEmpresa.setGerente(joao);

        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = joao;
        funcionarios[1] = new Funcionario("Maria", "Vendas", LocalDate.of(1990, 10, 15), 1500);
        funcionarios[2] = new Funcionario("Joaquim", "Vendedor", LocalDate.of(1997, 1, 30), 1500);
        novaEmpresa.setFuncionarios(funcionarios);

        //acessando recursos dos objetos associados a Empresa        
        System.out.println("A empresa " + novaEmpresa.getNome() 
                + " conta com " + novaEmpresa.getGerente().getNome() + " na gerência"
                + " e possui " + novaEmpresa.getFuncionarios().length + " funcionarios: ");
        
        //percorrendo o vetor “funcionarios" e acessando informações de cada objeto guardado nele
        for(int i = 0; i < novaEmpresa.getFuncionarios().length; i++)
        {
            System.out.println("\t" + novaEmpresa.getFuncionarios()[i].getNome() + "(" + novaEmpresa.getFuncionarios()[i].getCargo() + ")");
            

        }
        
            Venda venda = new Venda(1000.0, novaEmpresa.getFuncionarios()[2]);
            
            System.out.println("Venda realizada por: " + venda.getVendedor().getNome());
            System.out.println("Total vendido: " + venda.getTotalVendas());  
      
    }
    
}
   

