package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame  implements ActionListener {

    JButton hundred, fiveHundred, thousand, twoThousand, fiveThousand, tenThousand, back;
    String pinNo;
    FastCash(String pinNo){
        this.pinNo=pinNo;
        // insert the image icon of atm machine
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); //get system resource access files from system
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);

        //to overlap the image onto the frame;
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground( Color.WHITE);
        text.setFont(new Font("Ralewey", Font.BOLD,16));
        // now add(text) adds the text on frame but not over the image;
        // so we use image.add(text) to add text over the image;
        image.add(text);

        // fast cash 100 button
        hundred =new JButton("Rs 100");
        hundred.setBounds(170,400,150,30);
        hundred.addActionListener(this);
        image.add(hundred);

        // 500 button
        fiveHundred =new JButton("Rs 500");
        fiveHundred.setBounds(355,400,150,30);
        fiveHundred.addActionListener(this);
        image.add(fiveHundred);

        //  1000 button
        thousand =new JButton("Rs 1000");
        thousand.setBounds(170,435,150,30);
        thousand.addActionListener(this);
        image.add(thousand);

        // 5000 button
        twoThousand =new JButton("Rs 2000");
        twoThousand.setBounds(355,435,150,30);
        twoThousand.addActionListener(this);
        image.add(twoThousand);

        // 5000 button
        fiveThousand =new JButton("Rs 5000");
        fiveThousand.setBounds(170,470,150,30);
        fiveThousand.addActionListener(this);
        image.add(fiveThousand);

        // 10000 button
        tenThousand =new JButton("Rs 10000");
        tenThousand.setBounds(355,470,150,30);
        tenThousand.addActionListener(this);
        image.add(tenThousand);

        // exit button
        back =new JButton("Back");
        back.setBounds(355,505,150,25);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true); // this should always be last as changes after this would not reflect;

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }
        else{
            // since creating cases would be lengthy ;
            // instead we get the text on the button clicked on and debit that amount
            String ammountWithdraw= ((JButton) ae.getSource()).getText().substring(3);

            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where PinNo='"+pinNo+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("ammount"));
                    }
                       else{
                        balance-=Integer.parseInt(rs.getString("ammount"));
                    }
                }
                if(ae.getSource()!=back && balance<Integer.parseInt(ammountWithdraw)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return ;
                }
                Date date=new Date();
                String query = "insert into bank values('" + pinNo + "', '" + date + "', '" + "Withdraw" + "','" + ammountWithdraw+ "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ammountWithdraw+" Debitted succesfully");

                setVisible(false);
                new Transactions(pinNo).setVisible(true);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        new FastCash("");
    }
}
