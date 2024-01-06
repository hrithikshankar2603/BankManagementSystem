package bankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SignUpThree extends JFrame implements ActionListener {

    JRadioButton accountSavings, accountRecuuring, accountCurrent, accountFixed;
    JCheckBox s1,s2,s3,s4,s5,s6,s7;
    JButton submit , cancel;
    String formNo;
    SignUpThree(String formNo){

        this.formNo=formNo;

        setLayout(null);

        // to set the heading of the third page for account details ;
        JLabel page3=new JLabel("Page 3: Account Details");
        page3.setFont(new Font("Ralewey", Font.BOLD, 22));
        page3.setBounds(280,40,400,40);
        add(page3);

        // First Field : Account Type
        JLabel accountType=new JLabel("Account Type: ");
        accountType.setFont(new Font("Ralewey", Font.BOLD,22));
        accountType.setBounds(100,140,200,30);
        add(accountType);

        // savings account
        accountSavings=new JRadioButton("Savings Account");
        accountSavings.setBackground(Color.WHITE);
        accountSavings.setFont(new Font("Ralewey", Font.BOLD, 18));
        accountSavings.setBounds(100,180,200,20);
        add(accountSavings);

        //current account
        accountCurrent=new JRadioButton("Current Account");
        accountCurrent.setBackground(Color.WHITE);
        accountCurrent.setFont(new Font("Ralewey", Font.BOLD, 18));
        accountCurrent.setBounds(400,180,200,20);
        add(accountCurrent);

        //recurring account
        accountRecuuring=new JRadioButton("Reccuring Account");
        accountRecuuring.setBackground(Color.WHITE);
        accountRecuuring.setFont(new Font("Ralewey", Font.BOLD, 18));
        accountRecuuring.setBounds(100,220,200,20);
        add(accountRecuuring);

        //fixed deposit account
        accountFixed=new JRadioButton("Fixed Deposit Account");
        accountFixed.setBackground(Color.WHITE);
        accountFixed.setFont(new Font("Ralewey", Font.BOLD, 18));
        accountFixed.setBounds(400,220,200,20);
        add(accountFixed);

        //button group
        ButtonGroup accType=new ButtonGroup();
        accType.add(accountCurrent);
        accType.add(accountRecuuring);
        accType.add(accountSavings);
        accType.add(accountFixed);

        // card no
        JLabel cardNo=new JLabel("Card No: ");
        cardNo.setFont(new Font("Ralewey", Font.BOLD,22));
        cardNo.setBounds(100,300,200,30);
        add(cardNo);

        //card no display
        JLabel cardNumber=new JLabel("XXXX-XXXX-XXXX-4184 ");
        cardNumber.setFont(new Font("Ralewey", Font.BOLD,22));
        cardNumber.setBounds(350,300,300,30);
        add(cardNumber);

        //card detail statement
        JLabel cardDetail=new JLabel("This is your 16 digit card Number. ");
        cardDetail.setFont(new Font("Ralewey", Font.BOLD,12));
        cardDetail.setBounds(100,330,300,20);
        add(cardDetail);

        //PIN
        JLabel pin=new JLabel("PIN ");
        pin.setFont(new Font("Ralewey", Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        //pin number
        JLabel pinNumber=new JLabel("XXXX");
        pinNumber.setFont(new Font("Ralewey", Font.BOLD,22));
        pinNumber.setBounds(350,370,200,30);
        add(pinNumber);

        //pin details
        JLabel pindetail=new JLabel("This is your 4 digit pin ");
        pindetail.setFont(new Font("Ralewey", Font.BOLD,12));
        pindetail.setBounds(100,410,300,20);
        add(pindetail);

        //services required
        JLabel services=new JLabel("Services Required ");
        services.setFont(new Font("Ralewey", Font.BOLD,22));
        services.setBounds(100,440,200,30);
        add(services);

        //check box 1; : Atm card
        s1=new JCheckBox("ATM CARD");
        s1.setBackground(Color.WHITE);
        s1.setFont(new Font("Raleway", Font.BOLD,18));
        s1.setBounds(100,500,200,30);
        add(s1);

        //check box 2: net banking
        s2=new JCheckBox("INTERNET BANKING");
        s2.setBackground(Color.WHITE);
        s2.setFont(new Font("Raleway", Font.BOLD,18));
        s2.setBounds(350,500,200,30);
        add(s2);

        //check box 3; mobile banking
        s3=new JCheckBox("Mobile Banking");
        s3.setBackground(Color.WHITE);
        s3.setFont(new Font("Raleway", Font.BOLD,18));
        s3.setBounds(100,550,200,30);
        add(s3);

        //check box 4; email and sms alerts
        s4=new JCheckBox("Email and SMS Alerts");
        s4.setBackground(Color.WHITE);
        s4.setFont(new Font("Raleway", Font.BOLD,18));
        s4.setBounds(350,550,200,30);
        add(s4);

        //check box 5;cheque book
        s5=new JCheckBox("Cheque Book");
        s5.setBackground(Color.WHITE);
        s5.setFont(new Font("Raleway", Font.BOLD,18));
        s5.setBounds(100,600,200,30);
        add(s5);

        //check box 6; e-statements
        s6=new JCheckBox("E-Statements");
        s6.setBackground(Color.WHITE);
        s6.setFont(new Font("Raleway", Font.BOLD,18));
        s6.setBounds(350,600,200,30);
        add(s6);


        //check box 7; declaration check box;
        s7=new JCheckBox("I hereby declare that  the above entered details are correct to the best of my knowledge");
        s7.setBackground(Color.WHITE);
        s7.setFont(new Font("Raleway", Font.BOLD,15));
        s7.setBounds(100,680,700,30);
        add(s7);

        //submit button
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("Ralewey",Font.BOLD,20));
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 730, 250, 30);
        submit.addActionListener(this);
        add(submit);

        // cancel button
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Ralewey",Font.BOLD,20));
        cancel.setBounds(550, 730, 250, 30);
        cancel.addActionListener(this);
        add(cancel);

        //first to create a Frame;
        setSize(900,820);
        setLocation(350,0);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==submit){
            // when submit is clicked we need to enter all details into the database;
            String accType="";
            if(accountCurrent.isSelected()){
                accType="Current Account";
            } else if (accountFixed.isSelected()) {
                accType="Fixed Deposit Account";
            } else if (accountRecuuring.isSelected()) {
                accType="Reccuring Deposit Account";
            } else if (accountSavings.isSelected()) {
                accType="Savings Account";
            }

            Random random=new Random();
            // randomly generate a random no for card no but starting with 5040 9360 **** ****;
            String CardNo=""+Math.abs((random.nextLong()%90000000)+5040936000000000L);

            // randomly assign the pin value;
            String PinNo=""+(Math.abs((random.nextLong()%9000)+1000L));

            String facility="";

            if(s1.isSelected()){
                facility = facility+"ATM Card";
            }
            if (s2.isSelected()) {
                facility=facility +"Internet Banking";
            }
            if (s3.isSelected()) {
                facility=facility +"Mobile Banking";
            }
            if(s4.isSelected()){
                facility=facility +"Email and SMS Alerts";
            }
            if(s5.isSelected()){
                facility=facility +"Cheque Book ";
            }
            if(s6.isSelected()){
                facility=facility +"E-Statement";
            }


            // exception handling as third party databse management, so may give rise to run time errors
            try {
                if (accType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account type is required");
                }
                else {
                    Conn c = new Conn();
                    String query = "insert into signupthree values('" + formNo + "', '" + accType + "', '" + CardNo + "','" + PinNo + "','" + facility + "')";
                    String query2 = "insert into login values('" + formNo + "',  '" + CardNo + "','" + PinNo + "')";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card No :" + CardNo + "\n" + "PIN :" + PinNo);
                }
            }
            catch(Exception e){
                    System.out.println(e);
                }
        } else if (ae.getSource()=="cancel") {
            
        }
    }
    public static void main(String[] args) {

        new SignUpThree("");
    }
}
