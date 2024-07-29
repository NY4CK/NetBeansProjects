
package academia;

public class ExercicioMusculacaoResistencia implements ExercicioDeResistencia{

    @Override
    public void realizarResistencia() {
        System.out.println("Realizando resistência durante exercicio de musculação");
    }

    @Override
    public void realizar() {
        System.out.println("Realizando exercicio de musculação de resistência");
    }
    
}
