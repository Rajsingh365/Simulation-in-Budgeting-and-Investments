package all;
import java.util.Scanner;

public class Investment {
    private double initialInvestmentAmount;
    private double expectedReturns;

    public double getInitialInvestmentAmount() {
        return initialInvestmentAmount;
    }
    public void setInitialInvestmentAmount(double initialInvestmentAmount) {
        this.initialInvestmentAmount = initialInvestmentAmount;
    }
    double stockRange = ((Math.random() * 80) - 40) / 100;

    public double stockReturn(int years) {
        // Generate a random number between -10% and 10%.
        double stockResult = initialInvestmentAmount;
        for (int i = 0; i < years; i++) {
            stockResult += stockResult * stockRange;
        }
        return stockResult;
    }

    private double mutualRange = ((Math.random() * 40) - 20) / 100;

    public double mutualReturn(int years) {
        double mutualResult = initialInvestmentAmount;
        for (int i = 0; i < years; i++) {
            mutualResult += mutualResult * mutualRange;
        }
        return mutualResult;
    }

    public double bondReturn(int years, double bondInterestRate) {
        double bondResult = initialInvestmentAmount;
        for (int i = 0; i < years; i++) {
            bondResult += bondResult * bondInterestRate;
        }
        return bondResult;
    }

    public double savingsReturn(int years, double savingsInterestRate) {
        double savingsResult = initialInvestmentAmount;
        for (int i = 0; i < years; i++) {
            savingsResult += savingsResult * savingsInterestRate;
        }
        return savingsResult;
    }

    public void driver() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter where you want to invest");
        System.out.println("1. Stocks\n2. Bonds\n3. Mutual Funds\n4. Savings Accounts");
        int investmentOption = input.nextInt();
        System.out.println("Enter Initial Investment amount: ");
        this.setInitialInvestmentAmount(input.nextDouble());

        System.out.println("Enter the number of years to hold the investment: ");
        int years = input.nextInt();

        switch (investmentOption) {
            case 1:
                System.out.println("Investment Name: Stocks \n Initial Investment Amount: \u20B9" +
                        getInitialInvestmentAmount() + "\n Random Return after " + years + " years: " + stockReturn(years) + " \n Risk level: HIGH");
                break;

            case 2:
                System.out.println("Select your desired bond \n1. Birla Bond \n2. ICICI Bond \n3. HDFC Bond");
                int bondOption = input.nextInt();
                double bondInterestRate = 0.0;
                switch (bondOption) {
                    case 1:
                        bondInterestRate = 0.074;
                        System.out.println("Bank: Birla Bond");
                        break;
                    case 2:
                        bondInterestRate = 0.070;
                        System.out.println("Bank: ICICI Bond");
                        break;
                    case 3:
                        bondInterestRate = 0.078;
                        System.out.println("Bank: HDFC Bond");
                        break;
                    default:
                        System.out.println("Invalid bond option");
                }
                System.out.println("Investment Name: Bonds \n Initial Investment Amount: \u20B9" +
                        getInitialInvestmentAmount() + "\n Return after " + years + " years: " + bondReturn(years, bondInterestRate) + "\n Risk level: LOW");
                break;

            case 3:
                System.out.println(" Investment Name: Mutual Funds \n Initial Investment Amount: \u20B9" +
                        getInitialInvestmentAmount() + "\n Return after " + years + " years: " + mutualReturn(years) + " \n Risk level: MEDIUM");
                break;

            case 4:
                System.out.println("Select your desired bank \n1. Axis Bank \n2. Citi Bank \n3. Yes Bank");
                int savingOption = input.nextInt();
                double savingsInterestRate = 0.0;
                switch (savingOption) {
                    case 1:
                        savingsInterestRate = 0.033;
                        System.out.println("Bank: Axis Bank");
                        break;
                    case 2:
                        savingsInterestRate = 0.025;
                        System.out.println("Bank: Citi Bank");
                        break;
                    case 3:
                        savingsInterestRate = 0.054;
                        System.out.println("Bank: Yes Bank");
                        break;
                    default:
                        System.out.println("Invalid savings account option");
                }
                System.out.println("Investment Name: Savings Accounts \n Initial Investment Amount: \u20B9" +
                        getInitialInvestmentAmount() + "\n Return after " + years + " years: " + savingsReturn(years, savingsInterestRate) + "\n Risk level: LOW");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Investment investment = new Investment();
        investment.driver();
    }
}
