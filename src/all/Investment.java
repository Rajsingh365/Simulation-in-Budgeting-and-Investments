package all;
import java.util.Scanner;
public class Investment {
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
                        System.out.println("Bank: birla bond");
                        bondresults = amount;
                        for (int i = 0; i < years; i++) {
                            bondresults += (bondresults * 0.078);
                        }
                        break;

                    case 2:
                        System.out.println("Bank: icici bond");
                        bondresults = amount;
                        for (int i = 0; i < years; i++) {
                            bondresults += (bondresults * 0.070);
                        }
                        break;
                    case 3:
                        System.out.println("Bank: hdfc bond");
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
                System.out.println("select your desired bank \n1. Axis bank \n2. citi bank \n3. Yes bank");
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
