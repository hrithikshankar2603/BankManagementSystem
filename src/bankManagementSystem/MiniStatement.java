package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame  {
    String PinNo;
//    JLabel balance;


    MiniStatement(String PinNo) {
        this.PinNo = PinNo;
        setLayout(null);

        setTitle("Mini Statement");
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);

        JLabel bankName = new JLabel("Indian Bank ");
        bankName.setBounds(150, 20, 100, 20);
        add(bankName);

        JLabel balance=new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);



        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where Pin ='" + PinNo + "'");
            while (rs.next()) {
                card.setText("Card Number : " + rs.getString("CardNumber").substring(0, 4) + "-XXXX-XXXX-" + rs.getString("CardNumber").substring(12));

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        int bal=0;
        try {
            Conn con = new Conn();


            ResultSet rs2 = con.s.executeQuery("select * from bank where PinNo='" + PinNo + "'");

            while (rs2.next()) {
                // generally set text over writes the text value;
                mini.setText(mini.getText() + "<html>" + rs2.getString("Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs2.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs2.getString("Ammount")+"<br>"+"<br>"+"<html>");

                if(rs2.getString("type").equals("Deposit")){
                    bal+=Integer.parseInt(rs2.getString("ammount"));
                }
                else{
                    bal-=Integer.parseInt(rs2.getString("ammount"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        balance.setText("Your Current Account Balance is Rs. "+ bal);


        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}

