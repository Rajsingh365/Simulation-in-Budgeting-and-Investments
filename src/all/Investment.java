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
    double stockRange = ((Math.random() * 80) -40)/100 ;
    public double stockReturn()
    {
        // Generate a random number between -10% and 10%.
        double stockResult = (this.initialInvestmentAmount*stockRange)+this.initialInvestmentAmount;
        return stockResult;
    }
    private double mutualRange = ((Math.random() * 40) -20)/100 ;
    public double mutualReturn(){
        double mutualResult = (this.initialInvestmentAmount*mutualRange)+this.initialInvestmentAmount;
        return mutualResult;
    }
    public double bondReturn()
    {
        double bondResult = (initialInvestmentAmount*0.061)+initialInvestmentAmount;
        return bondResult;
    }

    public double savingsReturn()
    {
        double savingsResult = (initialInvestmentAmount*0.045)+initialInvestmentAmount;
        return savingsResult;
    }
    public void driver(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter where you want to invest");
        System.out.println("1. Stocks\n2. Bonds\n3. Mutual Funds\n4. Savings Accounts");
        int investmentOption = input.nextInt();
        System.out.println("Enter Initial Investment amount: ");
        this.setInitialInvestmentAmount(input.nextDouble());

        switch(investmentOption){
            case 1:
                System.out.println(" Investment Name: Stocks \n Initial Investment Amount: \u20B9" + getInitialInvestmentAmount() +  "\n Random Return: " +stockReturn() + " \n Risklevel: HIGH");
                if(this.initialInvestmentAmount>this.stockReturn())
                {
                    System.out.println("loss : "+(this.initialInvestmentAmount-this.stockReturn()));
                }
                else
                {
                    System.out.println("profit : "+(this.stockReturn()-this.initialInvestmentAmount));
                }
                break;

            case 2:
                System.out.println("Investment Name: Bonds\n Initial Investment Amount: \u20B9"+getInitialInvestmentAmount()+"\nReturn : "+bondReturn()+"\n Risklevel: LOW");
                System.out.println("profit : "+(bondReturn()-initialInvestmentAmount));
                break;

            case 3:
                System.out.println(" Investment Name: mutual funds \n Initial Investment Amount: \u20B9" + getInitialInvestmentAmount() +  "\n Return: " +mutualReturn() + " \n Risklevel: MEDIUM");
                if(initialInvestmentAmount>mutualReturn())
                {
                    System.out.println("loss : "+(initialInvestmentAmount-mutualReturn()));
                }
                else
                {
                    System.out.println("profit : "+(mutualReturn()-initialInvestmentAmount));
                }
                break;
            case 4:
                System.out.println("Investment Name: Savings Accounts \n Initial Investment Amount: \u20B9"+getInitialInvestmentAmount()+"\n Return : "+savingsReturn()+"\n Risklevel: LOW");
                System.out.println("profit : "+(savingsReturn()-initialInvestmentAmount));
            default:
                System.out.println("Invalid choice");
        }
    }
}