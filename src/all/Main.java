package all;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Compute Budget\n2. Simulate in investment");
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        switch(choice) {
            case 1:
            Budget b = new Budget();
            b.printBudget();
            break;
            case 2:
                Investment I = new Investment();
                I.driver();
        }
    }
}
