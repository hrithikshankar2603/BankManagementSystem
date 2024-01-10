package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame  implements ActionListener {

    JButton deposit, withdrawal,fastCash, miniStatement, pinchange, balanceEniquiry, exit;
    String PinNo;
    Transactions(String pinNo){
        this.PinNo =pinNo;
        // insert the image icon of atm machine
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); //get system resource access files from system
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);

        //to overlap the image onto the frame;
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Please Select Your Transactions");
        text.setBounds(210, 300, 700, 35);
        text.setForeground( Color.WHITE);
        text.setFont(new Font("Ralewey", Font.BOLD,16));
        // now add(text) adds the text on frame but not over the image;
        // so we use image.add(text) to add text over the image;
        image.add(text);

        // deposit button
        deposit=new JButton("Deposit");
        deposit.setBounds(170,400,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        // withdrawal button
        withdrawal=new JButton("Withdrawal");
        withdrawal.setBounds(355,400,150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);

        // fast cash button
        fastCash=new JButton("Fast Cash");
        fastCash.setBounds(170,435,150,30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        // mini statement button
        miniStatement=new JButton("Mini Statement");
        miniStatement.setBounds(355,435,150,30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        // pin change button
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,470,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        // balance enquiry button
        balanceEniquiry=new JButton("Balance Enquiry");
        balanceEniquiry.setBounds(355,470,150,30);
        balanceEniquiry.addActionListener(this);
        image.add(balanceEniquiry);

        // exit button
        exit=new JButton("Exit");
        exit.setBounds(355,505,150,25);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true); // this should always be last as changes after this would not reflect;

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if (ae.getSource()==deposit){
            setVisible(false);
            new Deposit(PinNo).setVisible(true);
        }
        else if (ae.getSource()==withdrawal){
            setVisible(false);
            new Withdrawal(PinNo).setVisible(true);
        }
        else if (ae.getSource()==fastCash){
            setVisible(false);
            new FastCash(PinNo).setVisible(true);
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(PinNo).setVisible(true);
        }
    }

    public static void main(String[] args) {

        new FastCash("");
    }
}
