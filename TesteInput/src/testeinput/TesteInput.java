
package testeinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TesteInput {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
          
                FileReader in = null;
                FileWriter out = null;

                try {
                    in = new FileReader("C:\\teste\\arquivo.txt");
                    out = new FileWriter("C:\\teste\\arquivo.txt");

                    int c;
                    while ((c = in.read()) != -1) {
                        out.write(c);
                    }
                } finally {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                }
            }
        }