package excecoes.exercicioDeFixacao.application;

import excecoes.exercicioDeFixacao.models.entities.Account;
import excecoes.exercicioDeFixacao.models.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data");
            System.out.print("\nNumber: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            sc.nextLine();
            Account acc = new Account(number, holder, initialBalance, withdrawLimit);
            System.out.print("\nEnter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();
            sc.nextLine();
            acc.withdraw(amountWithdraw);
            System.out.println("New balance: " + String.format("R$%.2f", acc.getBalance()));
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Input error: enter only allowed characters");
        }
        sc.close();
    }
}
