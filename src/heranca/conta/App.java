package heranca.conta;

import heranca.conta.entities.Account;
import heranca.conta.entities.BusinessAccount;
import heranca.conta.entities.SavingsAccount;

public class App {
    public static void main(String[] args) {
        // Instanciando uma conta business
        BusinessAccount ba = new BusinessAccount(12345, "Matheus Henrique", 200.00, 1000.00);

        // Testando dados
        System.out.println("Dados:");
        System.out.println(ba.getHolder());
        System.out.println(ba.getNumber());
        System.out.println(ba.getBalance());
        System.out.println(ba.getLoanLimit());
        System.out.println("\n");

        // Testes com UP e Down
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
