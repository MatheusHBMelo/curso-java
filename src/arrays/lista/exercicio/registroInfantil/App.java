package arrays.lista.exercicio.registroInfantil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Registro> list = new ArrayList<>();

        System.out.print("Quantas crianças deseja cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("\nDigite o RG da criança #" + (i+1) + ": ");
            int rg = sc.nextInt();
            sc.nextLine();
            while (temRG(list, rg) != null){
                System.out.println("\nJá existe criança com esse RG - Digite outro: ");
                rg = sc.nextInt();
                sc.nextLine();
            }
            System.out.print("Digite o NOME da criança #" + (i+1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite a IDADE da criança #" + (i+1) + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            Registro res = new Registro(rg, nome, idade);

            list.add(res);
        }

        System.out.print("\nDigite o RG da criança que deseja pesquisar: ");
        int rgCrianca = sc.nextInt();
        sc.nextLine();
        while (temRG(list, rgCrianca) == null){
            System.out.print("\nRg não encontrado, digite um valor valido: ");
            rgCrianca = sc.nextInt();
            sc.nextLine();
        }

        // Encontrando criança por RG
        for (Registro registro : list) {
            if (registro.getRg().equals(rgCrianca)) {
                System.out.println("\nRG: " + registro.getRg());
                System.out.println("Nome: " + registro.getNome());
                System.out.println("Idade: " + registro.getIdade());
            }
        }
        sc.close();
    }
    public static Integer temRG(List<Registro> list, int rg){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRg() == rg){
                return i;
            }
        }
        return null;
    }
}
