package classesAbstratas.conta;

import classesAbstratas.conta.entities.Account;
import classesAbstratas.conta.entities.BusinessAccount;
import classesAbstratas.conta.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /* Não é póssivel pois a super classe ACCOUNT é abstrata, ou seja, não é possivel instanciar
            Account conta1 = new Account(1, "Matheus Henrique", 500.00);
        */

        // Criando uma lista para colocar contas
        List<Account> list = new ArrayList<>();

        // Instanciando varias contas para a lista
        Account conta1 = new BusinessAccount(1, "Matheus Henrique", 300.00, 100.00);
        Account conta2 = new BusinessAccount(2, "Luana Silva", 700.00, 150.00);
        Account conta3 = new BusinessAccount(3, "Vivian Laila", 600.00, 50.00);
        Account conta4 = new BusinessAccount(4, "Renata Silva", 500.00, 130.00);
        Account conta5 = new BusinessAccount(5, "Tarcila Santos", 400.00, 80.00);
        Account conta6 = new SavingsAccount(6, "Pietra dos Santos", 250.00, 0.01);
        Account conta7 = new SavingsAccount(7, "Malu Albuquerque", 260.00, 0.011);
        Account conta8 = new SavingsAccount(8, "Polyane Cabral", 205.00, 0.010);
        Account conta9 = new SavingsAccount(9, "Amanda Moura", 125.00, 0.03);
        Account conta10 = new SavingsAccount(10, "Marcela idontknow", 258.00, 0.02);

        // Adicionando as contas na lista
        list.add(conta1);
        list.add(conta2);
        list.add(conta3);
        list.add(conta4);
        list.add(conta5);
        list.add(conta6);
        list.add(conta7);
        list.add(conta8);
        list.add(conta9);
        list.add(conta10);

        // Saldo de todas as contas juntas
        double sum = 0.0;
        for (Account acc: list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: $%.2f%n", sum);

        // Dar $10.00 de deposito em todas as contas
        for (Account acc: list){
            acc.deposit(10.00);
        }

        // Imprimindo o valor atualizado dos saldos
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
