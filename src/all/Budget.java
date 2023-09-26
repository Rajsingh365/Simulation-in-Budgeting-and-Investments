package all;

import java.util.Scanner;

public class Budget {
    private double income;
    private double rent;
    private double tax;
    private double utilities;
    private double luxuries;
    private double buffer;
    private double expenses;
    private double savingsGoals;

    public Budget() {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Your Monthly Income: ");
        setIncome(input.nextDouble());


        System.out.println("Enter your following Expenses: \n Rent: \n Property Tax: \n Utilities: \n Luxuries: \n Buffer:");
        setRent(input.nextDouble());
        setTax(input.nextDouble());
        setUtilities(input.nextDouble());
        setLuxuries(input.nextDouble());
        setBuffer(input.nextDouble());
        setExpenses(getRent() + getTax() + getUtilities() + getLuxuries() + getBuffer());
        if (getIncome() < getExpenses()) {
            System.out.println("Invalid, Expenses must be less than Income");

            System.exit(0);
        }


        System.out.print("Do you have any savings goals? (yes/no): ");
        String response = input.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter Saving Target: ");
            setSavingsGoals(input.nextDouble());
            if (getIncome() < getSavingsGoals()) {
                System.out.println("Invalid, Saving Target must be less than Income");
                System.exit(0);
            }
        }

    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getUtilities() {
        return utilities;
    }

    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }

    public double getLuxuries() {
        return luxuries;
    }

    public void setLuxuries(double luxuries) {
        this.luxuries = luxuries;
    }

    public double getBuffer() {
        return buffer;
    }

    public void setBuffer(double buffer) {
        this.buffer = buffer;
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

    public double surplus() {
        return income - expenses;
    }

    public double savings() {
        return surplus() - savingsGoals;
    }

    public void printBudget() {
        System.out.println("Income: \u20B9" + getIncome());
        System.out.println("Total Expenses: \u20B9" + getExpenses());
        if (getSavingsGoals() != 0) {
            System.out.println("Savings goals: \u20B9" + getSavingsGoals());
        }
        System.out.println("Monthly surplus: \u20B9" + surplus());
        System.out.println("Monthly savings: \u20B9" + savings());
    }
}