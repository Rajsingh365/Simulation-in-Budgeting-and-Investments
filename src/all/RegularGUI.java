package all;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegularGUI extends JFrame implements ActionListener {

    JPanel investmentTaker;
    JRadioButton age18_35;
    JRadioButton age36_60;
    JRadioButton age61_80;
    JButton submitAge;
    JTextField equityRangePercentageText;
    JTextField goldRangePercentageText;
    JTextField bondRangePercentageText;
    JButton submitInvestmentInfo;
    public RegularGUI(){
        this.setTitle("BudgetSim");
        this.setSize(700, 800);
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
//        investmentTaker.setVisible(false);
        investmentTaker.setBounds(0, 53, 700, 600);
        investmentTaker.setBackground(new Color(0x123456));
        investmentTaker.setLayout(null);
        JLabel ageRange = new JLabel("Age Range:- ");
        ageRange.setFont(new Font("Proxima Nova", Font.BOLD,20));
        ageRange.setForeground(Color.WHITE);
        ageRange.setBounds(60,60,150,30);

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

        JLabel equityRangePercentage = new JLabel("Equity (in %): ");
        JLabel goldRangePercentage = new JLabel("Gold (in %): ");
        JLabel bondRangePercentage = new JLabel("Bond (in %): ");

        equityRangePercentage.setForeground(Color.WHITE);
        goldRangePercentage.setForeground(Color.WHITE);
        bondRangePercentage.setForeground(Color.WHITE);

        equityRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        goldRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));
        bondRangePercentage.setFont(new Font("Copperplate", Font.BOLD, 20));

        equityRangePercentage.setBounds(20, 200, 200, 50);
        goldRangePercentage.setBounds(20, 250, 200, 50);
        bondRangePercentage.setBounds(20, 300, 200, 50);

        equityRangePercentageText = new JTextField("");

        goldRangePercentageText = new JTextField("");
        bondRangePercentageText = new JTextField("");

        equityRangePercentageText.setEditable(false);
        goldRangePercentageText.setEditable(false);
        bondRangePercentageText.setEditable(false);

        equityRangePercentageText.setBounds(270, 215, 330, 30);
        goldRangePercentageText.setBounds(270, 265, 330, 30);
        bondRangePercentageText.setBounds(270, 315, 330, 30);

        submitInvestmentInfo = new JButton("Submit");
        submitInvestmentInfo.addActionListener(this);
        submitInvestmentInfo.setBounds(270, 450, 200, 50);
        submitInvestmentInfo.setFocusable(false);
        submitInvestmentInfo.setEnabled(false);
        submitInvestmentInfo.setFont(new Font("Futura", Font.BOLD, 25));

        this.add(header, BorderLayout.NORTH);
        header.add(appName, BorderLayout.CENTER);

        this.add(investmentTaker, BorderLayout.CENTER);
        investmentTaker.add(ageRange);
        investmentTaker.add(age18_35);
        investmentTaker.add(age36_60);
        investmentTaker.add(age61_80);
        investmentTaker.add(submitAge);
        investmentTaker.add(equityRangePercentage);
        investmentTaker.add(goldRangePercentage);
        investmentTaker.add(bondRangePercentage);

        investmentTaker.add(equityRangePercentageText);
        investmentTaker.add(goldRangePercentageText);
        investmentTaker.add(bondRangePercentageText);
        investmentTaker.add(submitInvestmentInfo);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitAge){
            submitAge.setEnabled(false);
            submitInvestmentInfo.setEnabled(true);
            equityRangePercentageText.setEditable(true);
            goldRangePercentageText.setEditable(true);
            bondRangePercentageText.setEditable(true);
            if(age18_35.isSelected()){
                JOptionPane.showMessageDialog(null,"Regular plan for age group 18-35:\nEquity-  50-60%\nGold-  20-25%\nBonds- 10-15%","Tips",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(age36_60.isSelected()){
                JOptionPane.showMessageDialog(null,"Regular plan for age group 36-60:\nEquity-  40-50%\nGold-  40-50%\nBonds- 10-20%");
            }
            else {
                JOptionPane.showMessageDialog(null,"Regular plan for age group 61-80:\nEquity-  30-40%\nGold-  50-55%\nBonds- 5-10%");
            }
        }
        if(e.getSource()==submitInvestmentInfo){
                new RegularPlan(Double.parseDouble(equityRangePercentageText.getText()),Double.parseDouble(goldRangePercentageText.getText()),Double.parseDouble(bondRangePercentageText.getText()));
                JOptionPane.showMessageDialog(null,"Your investment plan:\nEmergency Funds: "+RegularPlan.emergency()*(-1)+"\nEquity: "+(RegularPlan.getEquity()*RegularPlan.save())*(-1)/100+"\nGold: "+(RegularPlan.getGold()*RegularPlan.save())*(-1)/100+"\nBonds:- "+(RegularPlan.getBonds()*RegularPlan.save())*(-1)/100,"INVESTMENT PLAN",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
