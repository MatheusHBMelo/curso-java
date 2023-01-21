package trabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EstudoFileWriterAndBufferedWriter {
    public static void main(String[] args) {
        /*
            CRIAÇÃO - É criado um arquivo no path com a mensagem informada caso não exista um arquivo de mesmo nome no diretorio
            CRIAÇÃO - Caso exista um arquivo com mesmo nome no diretorio, esse será recriado com a mensagem informada
            EDIÇÃO  - Para adicionar texto ao arquivo sem afetar o conteudo atual, usa-se o valor TRUE ao lado do path no contrutor da fileWriter (append)
         */
        // Criando um array de string para adicionar no arquivo
        String[] lines = new String[]{"João 16:14"};

        // Criando uma string para armazenar o diretorio do arquivo
        String path = "C:\\Users\\mathe\\Desktop\\msg.txt";

        // Usando try-with-resources
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String linha: lines){
                bw.write(linha);    // Escreve o conteudo da linha no arquivo
                bw.newLine();       // Pula para a próxima linha
            }
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
