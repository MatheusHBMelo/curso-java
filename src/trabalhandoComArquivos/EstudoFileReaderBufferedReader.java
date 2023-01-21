package trabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EstudoFileReaderBufferedReader {
    public static void main(String[] args) {
        // String para receber o path
        String path = "C:\\Users\\mathe\\Desktop\\redbullracing.txt";
        // Declarando um objeto FileReader como nulo
        FileReader fr = null;
        // Declarando um objeto BufferedReader como nulo
        BufferedReader br = null;

        try {
            // Instanciando o objeto FileReader e passando como argumento do construtor o path
            fr = new FileReader(path);
            // Instanciando o objeto BufferedReader e passando como argumento a instancia do FileReader
            br = new BufferedReader(fr);

            // String para ler o conteudo capturado do arquivo
            String line = br.readLine();

            // While para saber se ainda possui conteudo nas linhas
            while (line != null){
                // Pritando o conteudo da linha capturada
                System.out.println(line);
                // Capturando o conteudo da próxima linha
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            // Try com verificação de nulidade dos objetos para poder realizar o encerramento de ambos
            // Isso evita um NullPointerException
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
