package classesAbstratas.taxa.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){
        double totalTax = 0.0;
        if (numberOfEmployees > 10){
            totalTax = getAnualIncome() * 0.14;
        } else {
            totalTax = getAnualIncome() * 0.16;
        }
        return totalTax;
    }
}
