package all;
import java.util.Scanner;
public class RegularPlan {
    static private double Equity;
    static private double Gold;
    static private double Bonds;
    static private double surplus;
    static private int years;


    static public void setEquity(double Equity1) {
        Equity=Equity1;
    }

    static public double getEquity() {
        return Equity;
    }

    static public double getGold() {
        return Gold;
    }

    static public void setGold(double Gold1) {
        Gold=Gold1;
    }


    static public double getBonds() {
        return Bonds;
    }

    static public void setBonds(double Bonds1) {
        Bonds=Bonds1;
    }



    //normal plan



    static public void setYears(int years1) {

        years = years1;
    }

    static public int getYears() {
        return years;
    }
    static public double emergency() {
        return (30 * surplus / 100);
    }
    static public double save() {
        return surplus - emergency();
    }

    static double stockRange = ((Math.random() * 80) - 40) / 100;
    static double goldRange = ((Math.random() * 80) - 40) / 100;

    static public double stockReturn() {
        double stockResult = (Equity*save())/100;

        for (int i = 0; i < years; i++) {
            stockResult += stockResult * stockRange;
        }
        return stockResult;
    }


    static public double BondReturn()
    {
        double bondresults = (Bonds * save()) / 100;
        for (int i = 0; i < years; i++) {
            bondresults += (bondresults * 0.078);
        }
        return bondresults;
    }


    static public double GoldReturn(){
        double goldresults=(Gold*save())/100;
        for (int i = 0; i < years; i++) {
            goldresults += (goldresults * goldRange);
        }
        return goldresults;

    }

    public void printRegularPlan() {
        System.out.println("Emergency funds:\u20B9" + emergency());
        System.out.println(" Investment Name: Equity \n Investment Amount: \u20B9" + (Equity * save()) / 100 + "\n Random Return: " + stockReturn() + " \n Risklevel: HIGH ");
        System.out.println("Investment Name: Gold \n Investment Amount: \u20B9" + (Gold*save())/100 + "\n Return : " + GoldReturn() );
        System.out.println("Investment Name: Bonds \n Investment Amount: \u20B9" + (Bonds*save())/100 + "\n Return : " + BondReturn() + "\n Risklevel: LOW");
    }
}