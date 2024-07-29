
package testeuc8;

import javax.swing.JOptionPane;
public class TesteUC8 {

    public static void main(String[] args) {
        
        //Variáveis
        double peso;
        double altura;
        double imc;
        String nome;
        String mensagem = "";
     
   
        //Janelas Iniciais
        JOptionPane.showMessageDialog(null, "Olá\nVamos calcular a melhor dieta para você!");
        
        nome    = JOptionPane.showInputDialog("Digite seu nome");
        peso    = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
        altura  = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
        
        //Cálculo
        imc = peso/(altura/100 * altura/100);
        if(imc < 18.5){
            mensagem = nome+" você está muito magro.\nPrecisa de uma dieta para engordar";
        }else if (imc < 24.9){
            mensagem = nome+" você está no peso ideial.\nNão precisa de dieta";
        }else if (imc < 29.9) {
            mensagem = nome+" você está com sobrepeso.\nPrecisa de uma dieta para emagrecer";
            
        }else if (imc < 30) {
            mensagem = nome+" você está com obesidade.\nPrecisa de uma dieta, exercicios e uma mudança de vida";
        } else {
            mensagem = nome+" você está com obesidade grave.\nPrecisa procurar um médico";

        }
        
        //mensagem final
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
