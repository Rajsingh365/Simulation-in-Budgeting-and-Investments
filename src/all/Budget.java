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

//        Monthly Income
        System.out.println("Enter Your Monthly Income: ");
        this.setIncome(input.nextDouble());

//        Monthly Expenses
        System.out.println("Enter Your Monthly Expenses: ");
        this.setExpenses(input.nextDouble());
        if(this.getIncome()<this.getExpenses()) {
            System.out.println("Invalid, Expenses must be less than Income");
            // Terminate the program with an exit status of 0
            System.exit(0);
        }

//        Saving Goals
        System.out.print("Do you have any savings goals? (yes/no): ");
        String response = input.next();
        if(response.equalsIgnoreCase("yes")) {
            System.out.println("Enter Saving Target: ");
            this.setSavingsGoals(input.nextDouble());
            if (this.getIncome() < this.getSavingsGoals()) {
                System.out.println("Invalid, Saving Target must be less than Income");
                // Terminate the program with an exit status of 0
                System.exit(0);
            }
        }

//        Current Account Balance
        System.out.println("Enter Current Balance: ");
        this.setCurrentAccountBalance(input.nextDouble());
        input.close();
    }
    public void printBudget() {
        System.out.println("Income: \u20B9" +this.getIncome());
        System.out.println("Expenses: \u20B9" +this.getExpenses());
        if(getSavingsGoals()!=0) {
            System.out.println("Savings goals: \u20B9" + this.getSavingsGoals());
        }
        System.out.println("Current account balance: \u20B9" +this.getCurrentAccountBalance());
        System.out.println("Monthly surplus: \u20B9" +this.calculateMonthlySurplus());
        System.out.println("Monthly savings: \u20B9" +this.calculateMonthlySavings());
        if(this.calculateTimeToReachSavingsGoal()!=0) {
            System.out.println("Time to reach savings goal: " + this.calculateTimeToReachSavingsGoal());
        }
    }


}
