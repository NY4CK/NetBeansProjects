
package academia;


public class Academia {

    public static void main(String[] args) {
      
        //corrida
        ExercicioDeResistencia exercicioCorridaResistencia = new ExercicioCorridaResistencia();
        ExercicioDeVelocidade exercicioCorridaVelocidade = new ExercicioCorridaVelocidade();
        
        //musculação
        ExercicioDeResistencia exercicioMusculacaoResistencia = new ExercicioMusculacaoResistencia();
        ExercicioDeVelocidade exercicioMusculacaoVelocidade = new ExercicioMusculacaoVelocidade();
        
        System.out.println("Exercícios de corrida:");
        exercicioCorridaResistencia.realizar();
        exercicioCorridaResistencia.realizarResistencia();
        exercicioCorridaVelocidade.realizar();
        exercicioCorridaVelocidade.realizarVelocidade();

        System.out.println("\nExercícios de musculação:");
        exercicioMusculacaoResistencia.realizar();
        exercicioMusculacaoResistencia.realizarResistencia();
        exercicioMusculacaoVelocidade.realizar();
        exercicioMusculacaoVelocidade.realizarVelocidade();
    }
    
}
