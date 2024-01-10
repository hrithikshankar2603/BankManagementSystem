package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Withdrawal extends JFrame implements ActionListener {
    JTextField ammount;
    JButton withdraw, back;
    String pinNo;
    Withdrawal(String pinNo){
        this.pinNo=pinNo;

        setLayout(null); // so that we manually aligh location of items
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        //we cannot add image directly over the frame;so use image icon ;
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel(" Enter ammount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170, 300, 400,20);
        image.add(text);

        // input box for ammount
        ammount=new JTextField();
        ammount.setFont(new Font("Ralewey", Font.BOLD,16));
        ammount.setBounds(170,350,300,25);
        image.add(ammount);


        // deposit button
        withdraw =new JButton("Withdraw");
        withdraw.setFont(new Font("Ralewey",Font.BOLD,16));
        withdraw.setBounds(355,485,150,20);
        withdraw.addActionListener(this);
        image.add(withdraw);

        // back button
        back =new JButton("Back");
        back.setFont(new Font("Ralewey",Font.BOLD,16));
        back.setBounds(355,520,150,20);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == withdraw) {
            String ammountDeposited=ammount.getText();
            Date date=new Date();
            if(ammountDeposited.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Ammount you want to withdraw");
            }
            else{
                try {
                    Conn c = new Conn();
                    String query = "insert into bank values('" + pinNo + "', '" + date + "', '" + "Withdraw" + "','" + ammountDeposited + "')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, " Rs  "+ammountDeposited+"Withdrawal Successfully");
                    setVisible(false);
                    new FastCash(pinNo).setVisible(true);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }

        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
