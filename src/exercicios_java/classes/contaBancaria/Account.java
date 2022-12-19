package exercicios_java.classes.contaBancaria;

public class Account {
    // Atributos
    private int number;
    private String holder;
    private double balance;

    // Construtores
    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    // Getters e Setters
    public int getNumber(){
        return number;
    }

    public String getHolder(){
        return holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public double getBalance(){
        return balance;
    }

    // Métodos
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        double tax = 5.00;
        this.balance -= (amount + tax);
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
