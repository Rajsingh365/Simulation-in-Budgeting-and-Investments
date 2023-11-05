package all;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JTextField incomeText;
    JTextField LuxuriesText;
    JTextField rentText;
    JTextField taxText;
    JTextField utilitiesText;
    JTextField bufferText;
    JButton submitIncomeInfo;
    JButton submitInvestmentCategory;
    JPanel incomeDisplay;
    JPanel incomeTaker;
    JRadioButton retirementPlans;
    JRadioButton regularPlans;

    GUI() {
        this.setTitle("BudgetSim");
        this.setSize(700, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon("logoIcon.png");
        this.setIconImage(logo.getImage());
        this.setLayout(new BorderLayout());

        JPanel header = new JPanel();
        header.setPreferredSize(new Dimension(100, 53));
        header.setBackground(Color.WHITE);

        JLabel appName = new JLabel("BudgetSim");
        appName.setForeground(Color.BLACK); // Set the text color to black
        appName.setFont(new Font("Proxima Nova", Font.BOLD, 30));

        incomeTaker = new JPanel();
        incomeTaker.setVisible(true);
        incomeTaker.setBounds(0, 53, 700, 600);
        incomeTaker.setBackground(new Color(0x123456));
        JLabel income = new JLabel("Income: ");
        JLabel Luxuries = new JLabel("Luxuries: ");
        JLabel rent = new JLabel("Rent: ");
        JLabel tax = new JLabel("Tax: ");
        JLabel utilities = new JLabel("Utilities: ");
        JLabel buffer = new JLabel("Buffer: ");

        income.setForeground(Color.WHITE);
        Luxuries.setForeground(Color.WHITE);
        rent.setForeground(Color.WHITE);
        tax.setForeground(Color.WHITE);
        utilities.setForeground(Color.WHITE);
        buffer.setForeground(Color.WHITE);

        income.setFont(new Font("Copperplate", Font.BOLD, 20));
        Luxuries.setFont(new Font("Copperplate", Font.BOLD, 20));
        utilities.setFont(new Font("Copperplate", Font.BOLD, 20));
        rent.setFont(new Font("Copperplate", Font.BOLD, 20));
        tax.setFont(new Font("Copperplate", Font.BOLD, 20));
        buffer.setFont(new Font("Copperplate", Font.BOLD, 20));

        income.setBounds(20, 0, 100, 50);
        Luxuries.setBounds(20, 50, 100, 50);
        rent.setBounds(20, 100, 100, 50);
        tax.setBounds(20, 150, 100, 50);
        utilities.setBounds(20, 200, 100, 50);
        buffer.setBounds(20, 250, 100, 50);

        incomeText = new JTextField();
        LuxuriesText = new JTextField();
        rentText = new JTextField();
        taxText = new JTextField();
        utilitiesText = new JTextField();
        bufferText = new JTextField();

        incomeText.setBounds(140, 15, 200, 30);
        LuxuriesText.setBounds(140, 65, 200, 30);
        rentText.setBounds(140, 115, 200, 30);
        taxText.setBounds(140, 165, 200, 30);
        utilitiesText.setBounds(140, 215, 200, 30);
        bufferText.setBounds(140, 265, 200, 30);

        submitIncomeInfo = new JButton("Submit");
        submitIncomeInfo.addActionListener(this);
        submitIncomeInfo.setBounds(250, 320, 200, 50);
        submitIncomeInfo.setFocusable(false);
        submitIncomeInfo.setFont(new Font("Futura", Font.BOLD, 25));

        ButtonGroup plans = new ButtonGroup();
        regularPlans = new JRadioButton("Regular Plan");
        retirementPlans = new JRadioButton("Retirement Plan");
        regularPlans.setVisible(false);
        retirementPlans.setVisible(false);
        plans.add(regularPlans);
        plans.add(retirementPlans);
        regularPlans.setBounds(150, 400, 150, 30); // Adjust the position as needed
        retirementPlans.setBounds(310, 400, 188, 30); // Adjust the position as needed
        regularPlans.setFont(new Font("Roboto", Font.BOLD, 20));
        retirementPlans.setFont(new Font("Roboto", Font.BOLD, 20));

        regularPlans.setFocusable(false);
        retirementPlans.setFocusable(false);

        submitInvestmentCategory = new JButton("Submit");
        submitInvestmentCategory.addActionListener(this);
        submitInvestmentCategory.setVisible(false);
        submitInvestmentCategory.setBounds(250, 450, 200, 50);
        submitInvestmentCategory.setFocusable(false);
        submitInvestmentCategory.setFont(new Font("Futura", Font.BOLD, 25));

        JPanel regularPanel = new JPanel();

        this.add(header, BorderLayout.NORTH);
        header.add(appName, BorderLayout.CENTER);

        this.add(incomeTaker, BorderLayout.CENTER);
        incomeTaker.setLayout(null);
        incomeTaker.add(income);
        incomeTaker.add(Luxuries);
        incomeTaker.add(utilities);
        incomeTaker.add(rent);
        incomeTaker.add(tax);
        incomeTaker.add(buffer);

        incomeTaker.add(incomeText);
        incomeTaker.add(LuxuriesText);
        incomeTaker.add(utilitiesText);
        incomeTaker.add(rentText);
        incomeTaker.add(taxText);
        incomeTaker.add(bufferText);
        incomeTaker.add(submitIncomeInfo);

        incomeTaker.add(regularPlans);
        incomeTaker.add(retirementPlans);
        incomeTaker.add(submitInvestmentCategory);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitIncomeInfo) {
            submitIncomeInfo.setEnabled(false);
            new Budget(Double.parseDouble(rentText.getText()),
                    Double.parseDouble(taxText.getText()),
                    Double.parseDouble(utilitiesText.getText()),
                    Double.parseDouble(LuxuriesText.getText()),
                    Double.parseDouble(bufferText.getText()));
            double income = Double.parseDouble(incomeText.getText());

            double rent = Double.parseDouble(rentText.getText());
            double tax = Double.parseDouble(taxText.getText());
            double utilities = Double.parseDouble(utilitiesText.getText());
            double luxuries = Double.parseDouble(LuxuriesText.getText());
            double buffer = Double.parseDouble(bufferText.getText());

            // Initialize Budget class variables
            Budget.setRent(rent);
            Budget.setTax(tax);
            Budget.setUtilities(utilities);
            Budget.setLuxuries(luxuries);
            Budget.setBuffer(buffer);

            // double totalIncome = rent + tax + utilities + luxuries + buffer;
            double incomeTax = IncomeTaxCalculator.calculateIncomeTax(income);
            double surplus = income - (rent + tax + utilities + luxuries + buffer + incomeTax);
            /*int store = JOptionPane.showConfirmDialog(null,
                    "Do you want to Invest your surplus in our Regular plan or Retirement plan?", "user",
                    JOptionPane.YES_NO_OPTION);*/
            int store = JOptionPane.showConfirmDialog(null,
                    "Your surplus after income tax: $" + surplus +
                            "\n income tax :" +incomeTax+
                            "\nDo you want to Invest your surplus in our Regular plan or Retirement plan?",
                    "Investment Options", JOptionPane.YES_NO_OPTION);
            if (store == 0) {
                retirementPlans.setVisible(true);
                regularPlans.setVisible(true);
                submitInvestmentCategory.setVisible(true);
            }
        }
        if (e.getSource() == submitInvestmentCategory) {
            if (regularPlans.isSelected()) {
                this.dispose();
                new RegularGUI();
            } else if (retirementPlans.isSelected()) {
                this.dispose();
                new RetirementGUI();
            }
        }

    }
}