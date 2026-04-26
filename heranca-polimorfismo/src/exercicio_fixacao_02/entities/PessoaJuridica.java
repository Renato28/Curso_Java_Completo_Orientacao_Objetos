package exercicio_fixacao_02.entities;

public class PessoaJuridica extends Pessoa {

    private int numberOfEmployees;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTax() {
        double tax;
        if (numberOfEmployees < 10) {
           tax = super.getAnnualIncome() * 0.16;
        } else {
           tax = super.getAnnualIncome() * 0.14;
        }
        return tax;
    }
}
