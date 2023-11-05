package all;

public class IncomeTaxCalculator {



    public static double calculateIncomeTax(double income)
    {
        double tax;

        if (income <= 0) {
            tax = 0;
        } else if (income <= 50000) {
            tax = income * 0.1;
        } else if (income <= 100000) {
            tax = 50000 * 0.1 + (income - 50000) * 0.2;
        } else {
            tax = 50000 * 0.1 + 50000 * 0.2 + (income - 100000) * 0.3;
        }

        return tax;
    }
}
