package programacaofuncionalAndExpressoesLambda.exerciciodefixacao.entities;

public class Employee {
    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary){
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){
        return salary;
    }

    public String toString(){
        return "Name: " + name + " | Email: " + email + " | Salary: $" + String.format("%.2f", salary);
    }
}
