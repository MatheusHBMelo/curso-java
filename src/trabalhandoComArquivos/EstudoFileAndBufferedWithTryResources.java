package trabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EstudoFileAndBufferedWithTryResources {
    public static void main(String[] args) {
        // String para armazenar o path
        String path = "C:\\Users\\mathe\\Desktop\\redbullracing.txt";

        // Try-with-resources para instanciar e encerrar de forma automatica os objetos
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // String para ler o conteudo do arquivo
            String line = br.readLine();

            // While para verificar se a linha ainda possui dados e continuar capturando-os
            while (line != null){
                // Printando o conteudo da linha
                System.out.println(line);
                // Capturando o conteudo da próxima linha
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
