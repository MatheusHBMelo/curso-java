package composicaoDeClasses.entities;

import composicaoDeClasses.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;


    private Department department;                              // Associação com a entidade de departamento, um apenas.
    private List<HourContract> contracts = new ArrayList<>();   // Usar lista e instanciar quando for uma relação de muitos Ex: Um Worker tem muitos contratos

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // Métodos
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer month, Integer year) {

        double sum = baseSalary;

        for (HourContract cc: contracts){
            LocalDate date = LocalDate.parse(cc.getDate().toString());
            int contract_year = date.getYear();
            int contract_month = date.getMonthValue();
            if (year == contract_year && month == contract_month) {
                sum += cc.totalValue();
            }
        }
        return sum;
    }
}
