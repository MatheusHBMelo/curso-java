package trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EstudoFileScanner {
    public static void main(String[] args) {
        // Cria um objeto da classe File e passa como argumento o diretorio do arquivo
        File file = new File("C:\\Users\\mathe\\Desktop\\redbullracing.txt");

        // Declara um objeto scanner como nulo
        Scanner sc = null;

        try {
            // Instancia o scanner passando como argumento o path informado
            sc = new Scanner(file);
            // While para verificar se ainda possui linhas com conteudo para o scanner capturar
            while (sc.hasNextLine()){
                // Capturando a linha no arquivo e printando o conteudo.
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            // Encerrando o objeto Scanner caso ele não seja nulo, isso evita NullPointerException
            if (sc != null){
                sc.close();
            }
        }
    }
}
