package genericssetmap.map.exercicioproposto.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o path do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> votos = new HashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)) {
                    int valor = votos.get(name);
                    votos.put(name, count + valor);
                } else {
                    votos.put(name, count);
                }
                line = br.readLine();
            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
