package estruturaRepetitiva.whileStructure;

import java.util.Scanner;

public class ExerciciosWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Exercicio 01
        int senha = 2002;

        System.out.println("Digite o valor da senha: ");
        int password = sc.nextInt();

        while (password != senha) {
            System.out.println("Senha invalida");
            System.out.println("----------------------------");
            System.out.println("Digite a senha corretamente: ");
            password = sc.nextInt();
        }
        System.out.println("----------------------------");
        System.out.println("Acesso permitido");
        System.out.println("----------------------------");

        //Exercicio 02
        System.out.println("Digite o valor da cordenada X: ");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o valor da cordenada y: ");
        int y = sc.nextInt();
        sc.nextLine();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            } else if (x > 0 && y < 0){
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            System.out.println("Valor de X: ");
            x = sc.nextInt();
            sc.nextLine();
            System.out.println("Valor de Y: ");
            y = sc.nextInt();
            sc.nextLine();
        }

        //Exercicio 03
        System.out.println("Digite o tipo de combustivel abastecido: ");
        System.out.println("1 - Alcool ");
        System.out.println("2 - Gasolina ");
        System.out.println("3 - Disel");
        System.out.println("4 - Sair");
        int resultado = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int disel = 0;
        int clientes = 0;

        while (resultado != 4) {
            clientes++;
            if (resultado == 1) {
                alcool += 1;
            }else if (resultado == 2){
                gasolina += 1;
            } else {
                disel += 1;
            }
            System.out.println("Digite novamente: ");
            resultado = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("\n");
        System.out.println("Total de clientes: " + clientes);
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);

        sc.close();
    }
}
