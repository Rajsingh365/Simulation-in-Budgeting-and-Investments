 package all;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class RetirementGUI extends JFrame implements ActionListener {
    JPanel investmentTaker;
    JPanel outputLabel;
    JRadioButton age18_35;
    JRadioButton age36_60;
    JRadioButton age61_80;
    JButton submitAge;
    JTextField stockRangePercentageText;
    JTextField mutualRangePercentageText;
    JTextField goldRangePercentageText;
    JTextField bondRangePercentageText;
    JTextField savingRangePercentageText;
    JButton submitInvestmentInfo;

    public RetirementGUI() {
        this.setTitle("BudgetSim");
        this.setSize(700, 600);
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

        investmentTaker = new JPanel();
        // investmentTaker.setVisible(false);
        investmentTaker.setBounds(0, 53, 700, 600);
        investmentTaker.setBackground(new Color(0x123456));
        investmentTaker.setLayout(null);
        JLabel ageRange = new JLabel("Age Range:- ");
        ageRange.setFont(new Font("Proxima Nova", Font.BOLD, 20));
        ageRange.setForeground(Color.WHITE);
        ageRange.setBounds(60, 60, 150, 30);

        ButtonGroup plans = new ButtonGroup();
        age18_35 = new JRadioButton("18-35");
        age36_60 = new JRadioButton("36-60");
        age61_80 = new JRadioButton("61-80");
        plans.add(age18_35);
        plans.add(age36_60);
        plans.add(age61_80);
        age18_35.setBounds(200, 60, 108, 30);
        age36_60.setBounds(310, 60, 108, 30);
        age61_80.setBounds(420, 60, 108, 30);
        age18_35.setFont(new Font("Roboto", Font.BOLD, 20));
        age36_60.setFont(new Font("Roboto", Font.BOLD, 20));
        age61_80.setFont(new Font("Roboto", Font.BOLD, 20));

        age18_35.setFocusable(false);
        age36_60.setFocusable(false);
        age61_80.setFocusable(false);

        submitAge = new JButton("Submit");
        submitAge.addActionListener(this);
        submitAge.setBounds(270, 100, 200, 50);
        submitAge.setFocusable(false);
        submitAge.setFont(new Font("Futura", Font.BOLD, 25));

        JLabel stockRangePercentage = new JLabel("Stocks (in %): ");
        JLabel mutualRangePercentage = new JLabel("MutualFunds (in %): ");
        JLabel goldRangePercentage = new JLabel("Gold (in %): ");
        JLabel bondRangePercentage = new JLabel("Bond (in %): ");
        JLabel savingRangePercentage = new JLabel("saving: ");

        stockRangePercentage.setForeground(Color.WHITE);
        mutualRangePercentage.setForeground(Color.WHITE);
        goldRangePercentage.setForeground(Color.WHITE);
        bondRangePercentage.setForeground(Color.WHITE);
        savingRangePercentage.setForeground(Color.WHITE);

        stockRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        mutualRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        goldRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        bondRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        savingRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));

        stockRangePercentage.setBounds(20, 200, 200, 50);
        mutualRangePercentage.setBounds(20, 250, 200, 50);
        goldRangePercentage.setBounds(20, 300, 220, 50);
        bondRangePercentage.setBounds(20, 350, 220, 50);
        savingRangePercentage.setBounds(20, 400, 220, 50);

        stockRangePercentageText = new JTextField("");
        mutualRangePercentageText = new JTextField("");
        goldRangePercentageText = new JTextField("");
        bondRangePercentageText = new JTextField("");
        savingRangePercentageText = new JTextField("");

        stockRangePercentageText.setEditable(false);
        mutualRangePercentageText.setEditable(false);
        goldRangePercentageText.setEditable(false);
        bondRangePercentageText.setEditable(false);
        savingRangePercentageText.setEditable(false);

        stockRangePercentageText.setBounds(270, 215, 330, 30);
        mutualRangePercentageText.setBounds(270, 265, 330, 30);
        goldRangePercentageText.setBounds(270, 315, 330, 30);
        bondRangePercentageText.setBounds(270, 365, 330, 30);
        savingRangePercentageText.setBounds(270, 415, 330, 30);

        submitInvestmentInfo = new JButton("Submit");
        submitInvestmentInfo.setEnabled(false);
        submitInvestmentInfo.addActionListener(this);
        submitInvestmentInfo.setBounds(270, 450, 200, 50);
        submitInvestmentInfo.setFocusable(false);
        submitInvestmentInfo.setFont(new Font("Futura", Font.BOLD, 25));

        // outputLabel = new JPanel();
        // outputLabel.setBounds(0, 53, 700, 600);
        // outputLabel.setBackground(new Color(0x123456));
        // outputLabel.setLayout(null);
        //// outputLabel.setVisible(false);

        this.add(header, BorderLayout.NORTH);
        header.add(appName, BorderLayout.CENTER);

        this.add(investmentTaker, BorderLayout.CENTER);
        investmentTaker.add(ageRange);
        investmentTaker.add(age18_35);
        investmentTaker.add(age36_60);
        investmentTaker.add(age61_80);
        investmentTaker.add(submitAge);
        investmentTaker.add(stockRangePercentage);
        investmentTaker.add(mutualRangePercentage);
        investmentTaker.add(goldRangePercentage);
        investmentTaker.add(bondRangePercentage);
        investmentTaker.add(savingRangePercentage);

        investmentTaker.add(stockRangePercentageText);
        investmentTaker.add(mutualRangePercentageText);
        investmentTaker.add(goldRangePercentageText);
        investmentTaker.add(bondRangePercentageText);
        investmentTaker.add(savingRangePercentageText);
        investmentTaker.add(submitInvestmentInfo);
        // this.add(outputLabel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitAge) {
            System.out.println(Budget.getRent() + Budget.getTax() + Budget.getUtilities() + Budget.getLuxuries()
                    + Budget.getBuffer());
            submitAge.setEnabled(false);
            submitInvestmentInfo.setEnabled(true);
            stockRangePercentageText.setEditable(true);
            mutualRangePercentageText.setEditable(true);
            goldRangePercentageText.setEditable(true);
            bondRangePercentageText.setEditable(true);
            savingRangePercentageText.setEditable(true);
            if (age18_35.isSelected()) {
                JOptionPane.showMessageDialog(null,
                        "Retirement plan for age group 18-35:\nStocks-  50-60%\nMutual funds- 20-30%\nGold-  5-10%\nBonds- 5-10%\nSaving account- 5-10%",
                        "Tips", JOptionPane.INFORMATION_MESSAGE);
            } else if (age36_60.isSelected()) {
                JOptionPane.showMessageDialog(null,
                        "Retirement plan for age group 36-60:\nStocks-  40-50%\nMutual funds- 30-40%\nGold-  5-10%\nBonds- 10-20%\nSaving account- 5-10%");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Retirement plan for age group 61-80:\nStocks-  30-40%\nMutual funds- 40-50%\nGold-  5-10%\nBonds- 20-30%\nSaving account- 10-15%");
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        if (e.getSource() == submitInvestmentInfo) {
            new RetirementPlan(Double.parseDouble(stockRangePercentageText.getText()),
                    Double.parseDouble(mutualRangePercentageText.getText()),
                    Double.parseDouble(goldRangePercentageText.getText()),
                    Double.parseDouble(bondRangePercentageText.getText()),
                    Double.parseDouble(savingRangePercentageText.getText()));
            if (RetirementPlan.getTotal() >= RetirementPlan.getAmount())
                JOptionPane.showMessageDialog(null,
                        "Your investment plan:\nStocks: " + decimalFormat
                                .format(RetirementPlan.getStockRange()) + "\nMutual funds: "
                                + decimalFormat
                                .format(RetirementPlan.getMutualRange())
                                + "\nGold: " + decimalFormat
                                .format(RetirementPlan.getGoldRange())
                                + "\nBonds: " + decimalFormat
                                .format(RetirementPlan.getBondRange())
                                + "\nSaving account: " + decimalFormat
                                .format(RetirementPlan.getSavingRange())
                                + "\nProfit: "
                                + decimalFormat
                                .format(RetirementPlan.getTotal() - RetirementPlan.getAmount()),
                        "INVESTMENT PLAN", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,
                        "Your investment plan:\nStocks: " + RetirementPlan.getStockRange() + "\nMutual funds: "
                                + RetirementPlan.getMutualRange() + "\nGold: " + RetirementPlan.getGoldRange()
                                + "\nBonds: " + RetirementPlan.getBondRange()
                                + "\nSaving account: " + RetirementPlan.getSavingRange() + "\nLoss: "
                                + (RetirementPlan.getAmount() - RetirementPlan.getTotal()),
                        "INVESTMENT PLAN", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}