package uk.hybriditec.expenses.java.consul.app.main;

import uk.hybriditec.expenses.java.consul.app.model.ExpensesModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final List<ExpensesModel> expensesList = new ArrayList<ExpensesModel>();
    public static void main(String[] args){
        System.out.println("Welcome to Expenses APP.\nPlease choose blow option");
        System.out.println("a Add Expense\nb. Display all expenses.\nc. Sum of all expenses.");
        Scanner scanner = new Scanner(System.in);
        loop: while (scanner.hasNext()) {
            switch (scanner.nextLine().charAt(0)) {
                case 'a':
                    addExpense(scanner.nextLine());
                    break;
                case 'b':
                    displayAllExpenses();
                    break;
                case 'c':
                    sumOfAllExpenses();
                    break;
                case 'e': break loop;
            }
        }
    }

    private static void addExpense(String line) {
        String[] input = line.split(" ");
        ExpensesModel obj = new ExpensesModel(input[0], Double.valueOf(input[1]));
        expensesList.add(obj);
    }

    private static void sumOfAllExpenses() {
        double sumOfAllExp = 0;
        for (ExpensesModel model : expensesList) {
            sumOfAllExp = model.getAmount() + sumOfAllExp;
        }
        System.out.println("Sum of All Expenses " + sumOfAllExp);
    }

    public static void displayAllExpenses(){
        for (ExpensesModel model : expensesList) {
            System.out.println(model);
        }
    }
}

