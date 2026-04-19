package exercicio_resolvido_01.entities;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return this.valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return this.hours;
    }

    public double totalValue() {
        return this.valuePerHour * this.hours;
    }
}
