package programacaofuncionalAndExpressoesLambda.exercicioresolvido.application;

import programacaofuncionalAndExpressoesLambda.exercicioresolvido.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            // Mapeando o preço dos produtos, realizando a somatoria total e gerando a média da soma pela qtd de itens
            double avg = list.stream()
                    .map(p -> p.getPrice()) // p.getPrice() or Product::getPrice
                    .reduce(0.0, (x, y) -> x + y) / list.size(); // (x, y) -> x + y) or Double::sum
            System.out.println("Average price: R$" + String.format("%.2f", avg));

            // Criando um comparator para fazer o sorted da list com base nos nomes
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            // (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase() ou Comparator.comparing(String::toUpperCase);

            // Gerando os preços abaixo da média, capturando o nome dos produtos e imprimindo na ordem inversa
            List<String> list2 = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())// p.getName or Product::getName
                    .sorted(comp.reversed()) // Reversed é um método de comparato para inverter a sequência
                    .toList(); // toList() or .collect(Collectors.toList())

            // Realizando um forEach com reference method para imprimir a list2
            list2.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
