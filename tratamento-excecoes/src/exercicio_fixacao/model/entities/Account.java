package exercicio_fixacao.model.entities;

import exercicio_fixacao.exceptions.RegraDeNegocioException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double initialBalance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(Double amount) {

        if (amount > balance) {
            throw new RegraDeNegocioException("Not enough balance");
        }

        if (amount > withdrawLimit) {
            throw new RegraDeNegocioException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }
}
