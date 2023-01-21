package trabalhandoComArquivos.exercicio;

import trabalhandoComArquivos.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Criando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // Recebendo o diretorio path diretamente do teclado
        System.out.print("Enter a file path: ");
        String sourceFileStr = sc.nextLine();

        // Instanciando um objeto File para armazenar o path do arquivo
        File sourceFile = new File(sourceFileStr);

        // Criando uma String para armazenar o path onde a nova pasta será criada
        String sourceFolderStr = sourceFile.getParent();

        // Criando a pasta para armazenar o documento formatado
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        // Criando o novo arquivo para colocar os dados formatados
        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        // Try-with-resources para ler os dados do arquivo inicial
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            // Lendo a primeira linha do arquivo
            String itemCsv = br.readLine();
            // Verificando se ainda possui informações
            while (itemCsv != null){
                // Separando as informações da linha em um array de Strings
                String[] fields = itemCsv.split(",");
                // Armazenando a primeira String na variavel nome
                String name = fields[0];
                // Convertendo o preco de String para double e armazenando na variavel price
                double price = Double.parseDouble(fields[1]);
                // Convertendo a quantidade de produtos de String para int e armazenando na variavel quantity
                int quantity = Integer.parseInt(fields[2]);

                // Instanciando um produto com as informações extraidas da linha e armazenando na lista
                list.add(new Product(name, price, quantity));

                // Lendo a próxima linha
                itemCsv = br.readLine();
            }
            // Outro try-with-resources para fazer a escrita dos dados no arquivo final
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                // navegando pela lista de produtos
                for (Product item: list) {
                    // Escrevendo as informações de nome e total (preco*quantidade) dos produtos no arquivo final
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    // Pulando uma linha
                    bw.newLine();
                }
                System.out.println(targetFileStr + ": CREATED");
            } catch (IOException e){
                System.out.println("ERROR: " + e.getMessage());
            }
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
