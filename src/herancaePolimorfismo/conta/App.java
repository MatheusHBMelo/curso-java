package herancaePolimorfismo.conta;

import herancaePolimorfismo.conta.entities.Account;
import herancaePolimorfismo.conta.entities.BusinessAccount;
import herancaePolimorfismo.conta.entities.SavingsAccount;

public class App {
    public static void main(String[] args) {
        // Instanciando uma conta business
        BusinessAccount ba = new BusinessAccount(12345, "Matheus Henrique", 200.00, 1000.00);

        // Testando dados
        System.out.println("Dados:");
        System.out.println(ba.getHolder());
        System.out.println(ba.getNumber());
        System.out.println(ba.getBalance());
        System.out.println(ba.getLoanLimit() + "\n");

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
            System.out.println("Update!\n");
        }

        // Testes com Override
        Account conta1 = new Account(1001, "Matheus Henrique", 1000.00);
        conta1.withDraw(500.00);
        System.out.println("Saque de 500.00 com -5.0 de taxa: " + conta1.getBalance());

        Account conta2 = new SavingsAccount(1002, "Matheus Henrique", 1000.00, 0.01);
        conta2.withDraw(500.00);
        System.out.println("Saque de 500.00 sem taxa: " + conta2.getBalance());

        Account conta3 = new BusinessAccount(1003, "Matheus Henrique", 1000.00, 500.00);
        conta3.withDraw(500.00);
        System.out.println("Saque de 500.00 com -5.0 de taxa padrão e -2.0 de taxa extra: " + conta3.getBalance());
    }
}
