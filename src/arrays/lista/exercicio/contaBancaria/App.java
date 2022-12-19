package arrays.lista.exercicio.contaBancaria;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<ContaCorrente> list = new ArrayList<>();

        System.out.print("Digite quantas contas você deseja criar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nConta Corrente #" + (i+1) + ": ");

            System.out.print("Numero da conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();
            while (temNumero(list, numeroConta) != null){
                System.out.println("\nJá existe uma conta com esse número!!!\n");
                System.out.print("Numero da conta: ");
                numeroConta = sc.nextInt();
                sc.nextLine();
            }
            System.out.print("Titular da conta: ");
            String titularConta = sc.nextLine();
            System.out.print("Saldo da conta: ");
            double saldoConta = sc.nextDouble();

            ContaCorrente conta = new ContaCorrente(numeroConta, titularConta, saldoConta);

            list.add(conta);
        }

        System.out.println("\nLista de operações:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar\n");
        System.out.print("Opção escolhida: ");
        int resposta = sc.nextInt();
        sc.nextLine();

        if (resposta == 1){
            System.out.print("\nDigite o numero da conta: ");
            int numeroDaConta = sc.nextInt();
            sc.nextLine();
            while (temNumero(list, numeroDaConta) == null) {
                System.out.println("\nEssa conta não existe\n");
                System.out.print("Digite um numero válido de conta: ");
                numeroDaConta = sc.nextInt();
                sc.nextLine();
            }
            System.out.print("\nDigite o valor que deseja depositar: ");
            Double valorDeposito = sc.nextDouble();
            sc.nextLine();
            for (ContaCorrente contaCorrente : list) {
                if (contaCorrente.getNumero().equals(numeroDaConta)) {
                    contaCorrente.depositar(valorDeposito);
                }
            }
        }

        if (resposta == 2){
            System.out.print("\nDigite o numero da conta: ");
            int numeroDConta = sc.nextInt();
            sc.nextLine();
            while (temNumero(list, numeroDConta) == null) {
                System.out.println("\nEssa conta não existe\n");
                System.out.print("Digite um numero válido de conta: ");
                numeroDConta = sc.nextInt();
                sc.nextLine();
            }
            System.out.print("\nDigite o valor que deseja sacar: ");
            Double valorSaque = sc.nextDouble();
            sc.nextLine();
            for (ContaCorrente contaCorrente : list) {
                if (contaCorrente.getNumero().equals(numeroDConta)) {
                    contaCorrente.sacar(valorSaque);
                }
            }
        }

        System.out.println("\nConta correntes registradas: ");
        for (ContaCorrente cc: list) {
            System.out.println(cc);
        }

        sc.close();
    }
    public static Integer temNumero(List<ContaCorrente> list, int numero){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumero() == numero){
                return i;
            }
        }
        return null;
    }
}