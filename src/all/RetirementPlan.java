package all;
import java.util.Scanner;

/*public class Investment {
    private int years;
    private double amount;

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;

    }

    double stockRange = ((Math.random() * 80) - 40) / 100;

    public double stockReturn() {
        double stockResult = amount;

        for (int i = 0; i < years; i++) {
            stockResult += stockResult * stockRange;
        }
        return stockResult;
    }

    private double mutualRange = ((Math.random() * 40) - 20) / 100;

    public double mutualReturn() {
        double mutualResult = amount;

        for (int i = 0; i < years; i++) {
            mutualResult += mutualResult * mutualRange;
        }
        return mutualResult;

    }


    public void driver() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter where you want to invest");
        System.out.println("1. Stocks\n2. Bonds\n3. Mutual Funds\n4. Savings Accounts");
        int investmentOption = input.nextInt();
        System.out.println("Enter Initial Investment amount: ");
        this.setAmount(input.nextDouble());
        System.out.println("Enter the number of years to hold the investment: ");
        years = input.nextInt();

        switch (investmentOption) {
            case 1:
                System.out.println(" Investment Name: Stocks \n Initial Investment Amount: \u20B9" + getAmount() + "\n Random Return: " + stockReturn() + " \n Risklevel: HIGH \n ");
                if (this.amount > this.stockReturn()) {
                    System.out.println("loss : " + (this.amount - this.stockReturn()));
                } else {
                    System.out.println("profit : " + (this.stockReturn() - this.amount));
                }
                break;

            case 2:
                System.out.println("select your desired bond \n1. birla bond \n2. icici bond \n3. hdfc bond");
                int bondOption = input.nextInt();
                double bondresults = 0;
                switch (bondOption) {
                    case 1:
                        System.out.println("Bank: Birla Bond");
                        bondresults = amount;
                        for (int i = 0; i < years; i++) {
                            bondresults += (bondresults * 0.078);
                        }
                        break;

                    case 2:
                        System.out.println("Bank: ICICI Bond");
                        bondresults = amount;
                        for (int i = 0; i < years; i++) {
                            bondresults += (bondresults * 0.070);
                        }
                        break;
                    case 3:
                        System.out.println("Bank: HDFC Bond");
                        bondresults = amount;
                        for (int i = 0; i < years; i++) {
                            bondresults += (bondresults * 0.074);
                        }
                }
                System.out.println("Investment Name: Savings Accounts \n Initial Investment Amount: \u20B9" + getAmount() + "\n Return : " + bondresults + "\n Risklevel: LOW");

                System.out.println("profit : " + (bondresults - amount));
                break;


            case 3:
                System.out.println(" Investment Name: mutual funds \n Initial Investment Amount: \u20B9" + getAmount() + "\n Return: " + mutualReturn() + " \n Risklevel: MEDIUM");
                if (amount > mutualReturn()) {
                    System.out.println("loss : " + (amount - mutualReturn()));
                } else {
                    System.out.println("profit : " + (mutualReturn() - amount));
                }
                break;

            case 4:
                System.out.println("select your desired bank \n1. Axis bank \n2. Citi bank \n3. Yes bank");
                int savingOption = input.nextInt();
                double savingresults = 0;
                switch (savingOption) {
                    case 1:
                        System.out.println("Bank: axis bank");
                        savingresults = amount;
                        for (int i = 0; i < years; i++) {
                            savingresults += (savingresults * 0.078);
                        }
                        break;
                    case 2:
                        System.out.println("Bank: citi bank");
                        savingresults = amount;
                        for (int i = 0; i < years; i++) {
                            savingresults += (savingresults * 0.028);
                        }
                        break;
                    case 3:
                        System.out.println("Bank: yes bank");
                        savingresults = amount;
                        for (int i = 0; i < years; i++) {
                            savingresults += (savingresults * 0.054);
                        }

                }
                System.out.println("Investment Name: Savings Accounts \n Initial Investment Amount: \u20B9" + getAmount() + "\n Return : " + savingresults + "\n Risklevel: LOW");

                System.out.println("profit : " + (savingresults - amount));
                input.close();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

public class RetirementPlan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Determine the user's age group bracket
        String ageGroupBracket;
        if (age >= 18 && age < 35) {
            ageGroupBracket = "18-35";
        } else if (age >= 35 && age < 60) {
            ageGroupBracket = "35-60";
        } else if (age >= 60 && age < 80) {
            ageGroupBracket = "60-80";
        } else {
            System.out.println("Please enter a valid age.");
            return;
        }

        // Generate the retirement plan based on the user's age group bracket
        switch (ageGroupBracket) {
            case "18-35":
                System.out.println("Retirement plan for age group 18-35:");
                System.out.println("Stocks-  50-60%");
                System.out.println("Mutual funds- 20-30%");
                System.out.println("Gold-  5-10%");
                System.out.println("Bonds- 5-10%");
                System.out.println("Saving account- 5-10%");
                break;
            case "35-60":
                System.out.println("Retirement plan for age group 18-35:");
                System.out.println("Stocks-  40-50%");
                System.out.println("Mutual funds- 30-40%");
                System.out.println("Gold-  5-10%");
                System.out.println("Bonds- 10-20%");
                System.out.println("Saving account- 5-10%");
                break;
            case "60-80":
                System.out.println("Retirement plan for age group 18-35:");
                System.out.println("Stocks-  30-40%");
                System.out.println("Mutual funds- 40-50%");
                System.out.println("Gold-  5-10%");
                System.out.println("Bonds- 20-30%");
                System.out.println("Saving account- 10-15%");
                break;
        }
        Scanner sc = new Scanner(System.in);

        // Get the user's input
        System.out.println("Enter the amount saved  ");
        double amount = sc.nextDouble();

        System.out.println("Enter the percentage you want to invest in : ");

        System.out.println("stocks: ");
        double stocksPercentage = sc.nextDouble();
        double stockRange = (((Math.random() * 80) - 40) / 100) * ((stocksPercentage / 100) * amount);


        System.out.println("mutual funds: ");
        double mutualFundsPercentage = sc.nextDouble();
        double mutualRange = (((Math.random() * 40) - 20) / 100) * ((mutualFundsPercentage / 100) * amount);

        System.out.println(" gold: ");
        double goldPercentage = sc.nextDouble();
        double goldRange = 0.07 * ((goldPercentage / 100) * amount);

        System.out.println("bonds: ");
        double bondsPercentage = sc.nextDouble();
        double bondRange = 0.089 * ((bondsPercentage / 100) * amount);

        System.out.println("saving accounts: ");
        double savingAccountsPercentage = sc.nextDouble();
        double savingRange = 0.04 * ((savingAccountsPercentage / 100) * amount);
//calculate total profit
        double total = amount + stockRange + mutualRange + goldRange + bondRange + savingRange;


    }
        public void printRetirementPlan(){
        //Display the user's investment plan
        System.out.println("Your investment plan:");
        System.out.println("Stocks: " +stockRange );
        System.out.println("Mutual funds: " +mutualRange);
        System.out.println("Gold: " + goldRange);
        System.out.println("Bonds: " + bondRange);
        System.out.println("saving account " + savingRange);
        System.out.println("total:" + total);
        //System.out.println("profit" + (amount-total));
        if (amount > total) {
            System.out.println("loss : " + (amount - total));
        } else {
            System.out.println("profit : " + (total - amount));
     }


}


}*/

public class RetirementPlan {
    private double stockRange;
    private double mutualRange;
    private double goldRange;
    private double bondRange;
    private double savingRange;
    private double total;
    private double amount;

    public static void main(String[] args) {
        RetirementPlan retirementPlan = new RetirementPlan();
        retirementPlan.executeRetirementPlan();

    }
    public void executeRetirementPlan()
    {
        RetirementPlan retirementPlan = new RetirementPlan();
        //retirementPlan.executeRetirementPlan();
        Scanner scanner = new Scanner(System.in);
        // Get the user's age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Determine the user's age group bracket
        String ageGroupBracket;
        if (age >= 18 && age < 35) {
            ageGroupBracket = "18-35";
        } else if (age >= 35 && age < 60) {
            ageGroupBracket = "35-60";
        } else if (age >= 60 && age < 80) {
            ageGroupBracket = "60-80";
        } else {
            System.out.println("Please enter a valid age.");
            return;
        }

        // Generate the retirement plan based on the user's age group bracket
        switch (ageGroupBracket) {
            case "18-35":
                System.out.println("Retirement plan for age group 18-35:");
                System.out.println("Stocks-  50-60%");
                System.out.println("Mutual funds- 20-30%");
                System.out.println("Gold-  5-10%");
                System.out.println("Bonds- 5-10%");
                System.out.println("Saving account- 5-10%");
                break;
            case "35-60":
                System.out.println("Retirement plan for age group 35-60:");
                System.out.println("Stocks-  40-50%");
                System.out.println("Mutual funds- 30-40%");
                System.out.println("Gold-  5-10%");
                System.out.println("Bonds- 10-20%");
                System.out.println("Saving account- 5-10%");
                break;
            case "60-80":
                System.out.println("Retirement plan for age group 60-80:");
                System.out.println("Stocks-  30-40%");
                System.out.println("Mutual funds- 40-50%");
                System.out.println("Gold-  5-10%");
                System.out.println("Bonds- 20-30%");
                System.out.println("Saving account- 10-15%");
                break;
        }

        // Get the user's input
        System.out.println("Enter the amount you want to invest: ");
        retirementPlan.amount = scanner.nextDouble();

        System.out.println("Enter the percentage you want to invest in: ");

        System.out.println("stocks: ");
        double stocksPercentage = scanner.nextDouble();
        retirementPlan.stockRange = (((Math.random() * 80) - 40) / 100) * ((stocksPercentage / 100) * retirementPlan.amount);

        System.out.println("mutual funds: ");
        double mutualFundsPercentage = scanner.nextDouble();
        retirementPlan.mutualRange = (((Math.random() * 40) - 20) / 100) * ((mutualFundsPercentage / 100) * retirementPlan.amount);

        System.out.println(" gold: ");
        double goldPercentage = scanner.nextDouble();
        retirementPlan.goldRange = 0.07 * ((goldPercentage / 100) * retirementPlan.amount);

        System.out.println("bonds: ");
        double bondsPercentage = scanner.nextDouble();
        retirementPlan.bondRange = 0.089 * ((bondsPercentage / 100) * retirementPlan.amount);

        System.out.println("saving accounts: ");
        double savingAccountsPercentage = scanner.nextDouble();
        retirementPlan.savingRange = 0.04 * ((savingAccountsPercentage / 100) * retirementPlan.amount);

        // Calculate total profit
        retirementPlan.total = retirementPlan.amount + retirementPlan.stockRange + retirementPlan.mutualRange +
                retirementPlan.goldRange + retirementPlan.bondRange + retirementPlan.savingRange;

        System.out.println("Your investment plan:");
        System.out.println("Stocks: " + retirementPlan.stockRange);
        System.out.println("Mutual funds: " + retirementPlan.mutualRange);
        System.out.println("Gold: " + retirementPlan.goldRange);
        System.out.println("Bonds: " + retirementPlan.bondRange);
        System.out.println("Saving account: " + retirementPlan.savingRange);
        System.out.println("Total: " + retirementPlan.total);
        if (retirementPlan.amount > retirementPlan.total) {
            System.out.println("Loss: " + (retirementPlan.amount- retirementPlan.total));
        } else {
            System.out.println("Profit: " + (retirementPlan.total - retirementPlan.amount));
        }


        scanner.close();
}



}

