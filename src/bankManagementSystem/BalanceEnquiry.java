package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String PinNo;
    JButton back;
    BalanceEnquiry(String PinNo){
        this.PinNo=PinNo;

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);

        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);



        back=new JButton("Back");
        back.setFont(new Font("Ralewey", Font.BOLD,18));
        back.setBounds(355,520,150,30);
        image.add(back);
        back.addActionListener(this);

        Conn c=new Conn();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("select * from bank where PinNo='" + PinNo + "'");

            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("ammount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("ammount"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        JLabel text= new JLabel("Your Current Balance is : Rs. "+balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,30);
        text.setFont(new Font("Ralewey", Font.BOLD, 20));
        image.add(text);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(PinNo);
        }
    }
}
