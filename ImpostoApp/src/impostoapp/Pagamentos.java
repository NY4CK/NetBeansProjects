
package impostoapp;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    
    private String nomeEmpresa;
    private List<Imposto> impostos;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void exibirPagamentos() {
        System.out.println("Empresa: " + nomeEmpresa);
        System.out.println("Resumo dos pagamentos de impostos:");

        for (Imposto imposto : impostos) {
            String descricao = imposto.Descricao();
            double valorImposto = imposto.calcularImposto();
            System.out.println(descricao + ": R$" + valorImposto);
        }
    }
}
