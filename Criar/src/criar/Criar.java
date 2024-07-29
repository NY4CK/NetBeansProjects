
package criar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Criar {


    public static void main(String[] args) {
         File obj = new File("C://arquivo.txt");
              if (obj.delete()) {
                  System.out.println("Excluido o arquivo : " + obj.getName());
              }
              else {
                  System.out.println("Falha ao excluir o arquivo");
              }
          }
      
    }
    

