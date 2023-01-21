package trabalhandoComArquivos;

import java.io.File;

public class ManipulandoPastasComFile {
    public static void main(String[] args) {
        /*
            Retornando o nome das pastas presentes e X diretorio
        */
        // String para armazenar o path
        String strPath = "C:\\Users\\mathe\\Desktop";

        // Criando arquivo File e passando como argumento o path
        File path = new File(strPath);

        // Criando o array de Files para armazenar as pastas filtrando se for DIRETORIO
        File[] folders = path.listFiles(File::isDirectory);

        // Retornando o caminho das pastas presentes no diretorio
        System.out.println("FOLDERS:");
        if (folders != null) {
            for (File folder : folders) {
                System.out.println(folder);
            }
        }

        /*
            Retornando o nome das arquivos presentes e X diretorio
        */
        File[] files = path.listFiles(File::isFile);
        System.out.println("\nFILES:");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }

        /*
            Criando uma subpasta a partir do diretorio
        */
        // Boolean para verificar se a função corretamente aplicada
        // + instanciando um objeto File e passando com argumento o path, concatenado com o nome da nova pasta
        // + chamando o metodo mkdir que cria uma pasta no diretorio
        boolean sucesso = new File(strPath + "\\pastadeteste").mkdir();
        System.out.println("\nA operação foi um sucesso? " + sucesso);
    }
}
