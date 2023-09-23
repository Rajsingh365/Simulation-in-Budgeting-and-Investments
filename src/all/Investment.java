package all;
import java.util.Scanner;
public class Investment {
    private String name;
    private double initialInvestmentAmount;
    private double expectedReturns;
    private int riskLevel;

//    public Investment(String name, double initialInvestmentAmount, double expectedReturns, int riskLevel) {
//        this.name = name;
//        this.initialInvestmentAmount = initialInvestmentAmount;
//        this.expectedReturns = expectedReturns;
//        this.riskLevel = riskLevel;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialInvestmentAmount() {
        return initialInvestmentAmount;
    }

    public void setInitialInvestmentAmount(double initialInvestmentAmount) {
        this.initialInvestmentAmount = initialInvestmentAmount;
    }

    public double getExpectedReturns() {
        return expectedReturns;
    }

    public void setExpectedReturns(double expectedReturns) {
        this.expectedReturns = expectedReturns;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(int riskLevel) {
        this.riskLevel = riskLevel;
    }
    public void driver(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter where you want to invest");
        System.out.println("1. Stocks\n2. Bonds\n3. Mutual Funds\n4. Savings Accounts");
        int investmentOption = input.nextInt();
        System.out.println("Enter Initial Investment amount: ");
        this.setInitialInvestmentAmount(input.nextDouble());
        System.out.println("Enter expected Return rate: ");
        this.setExpectedReturns(input.nextDouble());
        switch(investmentOption){
            case 1:
                System.out.println("Investment Name: Stocks, Initial Investment Amount: \u20B9"+getInitialInvestmentAmount()+", Expected Return rate: "+getExpectedReturns()+"%, Risklevel: HIGH");
                break;
            case 2:
                System.out.println("Investment Name: Bonds, Initial Investment Amount: \u20B9"+getInitialInvestmentAmount()+", Expected Return rate: "+getExpectedReturns()+"%, Risklevel: MEDIUM");
                break;
            case 3:
                System.out.println("Investment Name: Mutual Funds, Initial Investment Amount: \u20B9"+getInitialInvestmentAmount()+", Expected Return rate: "+getExpectedReturns()+"%, Risklevel: MEDIUM");
                break;
            case 4:
                System.out.println("Investment Name: Savings Accounts, Initial Investment Amount: \u20B9"+getInitialInvestmentAmount()+", Expected Return rate: "+getExpectedReturns()+"%, Risklevel: LOW");
            default:
                System.out.println("Invalid choice");
        }
    }
}


