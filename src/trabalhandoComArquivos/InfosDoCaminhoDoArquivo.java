package trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;

public class InfosDoCaminhoDoArquivo {
    public static void main(String[] args) throws IOException {
        // String com diretorio do path
        String strPath = "C:\\Users\\mathe\\Desktop\\redbullracing.txt";

        // Instanciando objeto do tipo File e passando como argumento o path
        File path = new File(strPath);

        // Acessar apenas o nome do arquivo
        System.out.println("getname: " + path.getName());

        // Acessar o caminho para o arquivo
        System.out.println("getparent: " + path.getParent());

        // Acessar o caminho completo para o arquivo
        System.out.println("getpath: " + path.getPath());

        // Acessar a ultima modificação do arquivo
        System.out.println("lastmodified: " + path.lastModified());

        // Acessar se o arquivo existe
        System.out.println("exists: " + path.exists());

        // Acessar o tamanho do arquivo em bytes
        System.out.println("lenght: " + path.length());

        // Acessar se é um arquivo
        System.out.println("isfile: " + path.isFile());

        // Acessar se o arquivo pode ser escrito
        System.out.println("canWrite: " + path.canWrite());

        // Acessar se o arquivo pode ser lido
        System.out.println("canRead: " + path.canRead());

        // Criar um novo arquivo
        String path2 = "C:\\Users\\mathe\\Desktop";
        File arquivo = new File(path2 + "\\myname.txt");
        boolean arquivoCriado = arquivo.createNewFile();
        System.out.println("Arquivo criado: " + arquivoCriado);

        // Criar uma pasta
        File pasta = new File(path2 + "\\pastacriada");
        boolean pastaCriada = pasta.mkdir();
        System.out.println("Pasta criada: " + pastaCriada);

        // Excluir um arquivo ou diretorio
        if (arquivo.exists()){
            boolean arquivoApagado = arquivo.delete();
            System.out.println("Arquivo apagado: " + arquivoApagado);
        }
        if (pasta.exists()) {
            boolean pastaApagada = pasta.delete();
            System.out.println("Pasta apagada: " + pastaApagada);
        }
    }
}
