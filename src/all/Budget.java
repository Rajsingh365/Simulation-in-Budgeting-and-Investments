package all;

import java.util.Scanner;

public class Budget {
    private double income;
    private double expenses;
    private double savingsGoals;
    private double currentAccountBalance;

    //    4 parameter constructor
    public Budget(double income, double expenses, double savingsGoals, double currentAccountBalance) {
        this.income = income;
        this.expenses = expenses;
        this.savingsGoals = savingsGoals;
        this.currentAccountBalance = currentAccountBalance;
    }
    //    0 parameter Constructor
    public Budget(){}
    //Initialization Block
    {
        this.income=0;
        this.expenses=0;
        this.savingsGoals=0;
        this.currentAccountBalance=0;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getSavingsGoals() {
        return savingsGoals;
    }

    public void setSavingsGoals(double savingsGoals) {
        this.savingsGoals = savingsGoals;
    }

    public double getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    public void setCurrentAccountBalance(double currentAccountBalance) {
        this.currentAccountBalance = currentAccountBalance;
    }

    public double calculateMonthlySurplus() {
        return income - expenses;
    }

    public double calculateMonthlySavings() {
        return calculateMonthlySurplus() - savingsGoals;
    }

    public double calculateTimeToReachSavingsGoal() {
        return savingsGoals / calculateMonthlySavings();
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Monthly Income: ");
        this.setIncome(input.nextDouble());
        System.out.println("Enter Your Monthly Expenses: ");
        this.setExpenses(input.nextDouble());
        System.out.println("Enter Saving Target: ");
        this.setSavingsGoals(input.nextDouble());
        System.out.println("Enter Current Balance: ");
        this.setCurrentAccountBalance(input.nextDouble());
        input.close();
    }
    public void printBudget() {
        System.out.println("Income:" +this.getIncome());
        System.out.println("Expenses:" +this.getExpenses());
        System.out.println("Savings goals:" +this.getSavingsGoals());
        System.out.println("Current account balance:" +this.getCurrentAccountBalance());
        System.out.println("Monthly surplus:" +this.calculateMonthlySurplus());
        System.out.println("Monthly savings:" +this.calculateMonthlySavings());
        System.out.println("Time to reach savings goal:" +this.calculateTimeToReachSavingsGoal());
    }


}
