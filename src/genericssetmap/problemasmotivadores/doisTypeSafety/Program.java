package genericssetmap.problemasmotivadores.doisTypeSafety;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();

        /*
        Trabalhar com a classe object nos faz ter portabilidades com classes e tipos
        Mas pode nos causar trÊs tipos de problemas:

        01 - Converter um valor object para um tipo Wrapper, como Ex.: Integer x = ps.first(); Sendo ps == Object
        01 - Esse problema é resolvido realizando um casting Integer x = (Integer) ps.first();

        02 - Problema com Type Safety (Segurança de tipos) que é quando temos tipos diferentes dentro da estrutura
        02 - E tentamos converter um tipo para outro em operação não possivel, como por ex.: String to Integer

        03 - Problema de performance pois será necessário realizar operações de casting, boxing e unboxing
         */

        System.out.print("Quantos número deseja ler: ");
        int n = sc.nextInt();

        // Adicionando um valor String
        ps.addValue("Maria");

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número #" + (i+1) + ": ");
            ps.addValue(sc.nextInt());
        }

        ps.print();
        // Tentando converter o valor First que é String para inteiro
        Integer x = (Integer) ps.first(); // Necessário fazer o cast para transpor o erro 01
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
