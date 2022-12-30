package classesAbstratas.conta.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit){
            deposit(amount);
        }
    }

    // Usando a super para usar a implementação original do metódo + uma logica excedente da subclasse
    @Override
    public final void withDraw(Double amount){
        super.withDraw(amount);
        balance -= 2.0;
    }
}
