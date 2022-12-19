package composicaoDeClasses.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {
    private LocalDate date;
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}

    public HourContract(String date, Double valuePerHour, Integer hours){
        this.date = LocalDate.parse(date, fmt1);
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }
}
