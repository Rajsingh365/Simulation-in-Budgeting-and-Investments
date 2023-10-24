package all;

import java.util.Scanner;

import javax.swing.*;
import java.awt.*;

public class RegularPlan {


    private double Equity;
    private double Gold;
    private double Bonds;
    private double surplus;


    public RegularPlan(double surplus) {

        this.surplus = surplus;
        Scanner input = new Scanner(System.in);



        System.out.println("How much % of your surplus do you want to invest (in %) :");
        System.out.println("Equity:");
        setEquity(input.nextDouble());
        System.out.println("Gold:");
        setGold(input.nextDouble());
        System.out.println("Debt investment(bonds):");
        setBonds(input.nextDouble());
        System.out.println("Enter the number of years to hold the investment: ");
        years = input.nextInt();


    }



    public double emergency() {
        return (30 * surplus / 100);

    }


    public double getEquity() {
        return Equity;
    }

    public void setEquity(double Equity) {
        this.Equity=Equity;
    }

    public double save() {

        return surplus - emergency();
    }



    public double getGold() {
        return Gold;
    }

    public void setGold(double Gold) {
        this.Gold=Gold;
    }


    public double getBonds() {
        return Bonds;
    }

    public void setBonds(double Bonds) {
        this.Bonds=Bonds;
    }



    //normal plan

    private int years;


    public void setYears(int years) {

        this.years = years;
    }

    public int getYears() {
        return years;
    }



    double stockRange = ((Math.random() * 80) - 40) / 100;
    double goldRange = ((Math.random() * 80) - 40) / 100;

    public double stockReturn() {
        double stockResult = (Equity*save())/100;

        for (int i = 0; i < years; i++) {
            stockResult += stockResult * stockRange;
        }
        return stockResult;
    }


    public double BondReturn()
    {
        double bondresults = (Bonds * save()) / 100;
        for (int i = 0; i < years; i++) {
            bondresults += (bondresults * 0.078);
        }
        return bondresults;
    }


    public double GoldReturn(){
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
