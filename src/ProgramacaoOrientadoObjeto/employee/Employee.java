package ProgramacaoOrientadoObjeto.employee;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double var = grossSalary * (percentage / 100);
        grossSalary += var;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
