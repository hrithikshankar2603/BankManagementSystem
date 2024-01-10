package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    String PinNo;
    JTextField newPin, newPinReEntered;
    JButton change,back;
    PinChange(String PinNo){
        setLayout(null);
        this.PinNo=PinNo;

        // overlap image on the frame;
        //image icon created for perfect scale;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);

        //image label created;
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Change Your Pin");
        text.setBounds(280,280,450,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Ralewey", Font.BOLD, 22));
        image.add(text);

        JLabel pinTextNew=new JLabel("New Pin");
        pinTextNew.setBounds(160,320,250,30);
        pinTextNew.setForeground(Color.WHITE);
        pinTextNew.setFont(new Font("Ralewey", Font.BOLD, 16));
        image.add(pinTextNew);

        newPin=new JTextField();
        newPin.setBounds(300,320,200,25);
        newPin.setFont(new Font("Ralewey", Font.BOLD,16));
        image.add(newPin);

        JLabel pinTextNewReEntered=new JLabel("ReEnter New Pin ");
        pinTextNewReEntered.setBounds(160,370,250,30);
        pinTextNewReEntered.setForeground(Color.WHITE);
        pinTextNewReEntered.setFont(new Font("Ralewey", Font.BOLD, 16));
        image.add(pinTextNewReEntered);

        newPinReEntered=new JTextField();
        newPinReEntered.setBounds(300,370,200,25);
        newPinReEntered.setFont(new Font("Ralewey", Font.BOLD,16));
        image.add(newPinReEntered);

        //change button;
        change=new JButton("Change");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);

        //change button;
        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);


        // frame generated;
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);


    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
    public  void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(PinNo).setVisible(true);
        }
        else if(ae.getSource()==change){
            try{
                String pin=newPin.getText();
                String rpin=newPinReEntered.getText();

                if(!pin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered Pins do not match");
                    return;

                }
                else if(pin.isEmpty() || rpin.isEmpty()){
                    JOptionPane.showMessageDialog(null, " Please enter new pin");
                }
                else{
                    Conn c=new Conn();
                    String query1="update bank set PinNo='"+rpin+"'where PinNo='"+PinNo+"'";
                    String query2="update login set Pin='"+rpin+"'where Pin='"+PinNo+"'";
                    String query3="update signupthree set PIN='"+rpin+"'where PIN='"+PinNo+"'";

                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    c.s.executeUpdate(query3);

                    JOptionPane.showMessageDialog(null, " Pin changed Successfully ");
                    setVisible(false);
                    new Transactions(rpin).setVisible(true);

                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
}


