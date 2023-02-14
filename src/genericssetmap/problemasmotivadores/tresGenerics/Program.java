package genericssetmap.problemasmotivadores.tresGenerics;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deve-se instanciar o classe generica com o tipo de dados que será recebido
        PrintService<Integer> ps = new PrintService<Integer>();

        // O tipo generic <T> garante que apenas aquele tipo será autorizado e suportado
        ps.addValue(5);
        // Garantindo dessa forma o type safety
        // ps.addValue("Matheus"); - Não funciona pois a classe não pode ser convertida para esse tipo.

        System.out.print("Quantos elementos deseja ler: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento #" + (i+1) + ": ");
            ps.addValue(sc.nextInt());
        }

        ps.print();
        Integer x = ps.first(); // Agora é possivel realizar essa operação sem necessidade de casting
        System.out.println("First: " + x);
    }
}
