package uk.hybriditec.expenses.java.consul.app.model;

public class ExpensesModel {
    private String name;
    private double amount;

    public ExpensesModel(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name + " " + amount + "\n";
    }
}
