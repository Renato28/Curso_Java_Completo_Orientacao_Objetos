package exercicio_fixacao_02.entities;

public class PessoaFisica extends Pessoa {

    private Double healthcareExpenses;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double annualIncome, Double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double calculateTax() {
        double tax;
        if (super.getAnnualIncome() < 20000.00) {
            tax = super.getAnnualIncome() * 0.15;
        } else {
            tax = (super.getAnnualIncome() * 0.25);
        }

        tax -= healthcareExpenses * 0.50;

        return tax;
    }
}
