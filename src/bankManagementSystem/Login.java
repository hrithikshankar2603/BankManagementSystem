package bankManagementSystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Login extends JFrame implements ActionListener
    {

        JButton login, clear, signUp; // to provide global access to the buttons
        JTextField cardTextField;

        JPasswordField pinTextField; // so that our password is hidden while being entered
        Login(){ //Constructor of Login class;
            // To set the title of Frame
            setTitle("Automated Teller Machine");

            // by default the jframe layouts are set to border where every items aligns to the center
            // we need to create our own custom layout so remove default layouts;
            setLayout(null);

            //To retrieve the image from our icons folder, we use Image ICon within awt class;
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
            Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);

            //to create  a frame using swing , using the icon to overlap on the frame;
            JLabel label=new JLabel(i3);
            add(label);
            // to set the position of the icon on the frame;
            label.setBounds(70,10,100, 100);
            // to change background color of the frame ;
            getContentPane().setBackground(Color.white);

            //to write content on the jframe
            JLabel text=new JLabel("WELCOME TO ATM");
            //to change font of the text;
            text.setFont(new Font("Osward " , Font.BOLD, 38));
            //to set positon of the text;
            text.setBounds(200,40,400,40);
            add(text);


            //for Card Number
            JLabel cardNumber=new JLabel("CARD No.");
            //to change font of the text;
            cardNumber.setFont(new Font("Ralwey " , Font.BOLD, 28));
            //to set positon of the text;
            cardNumber.setBounds(120,150,150,40);
            add(cardNumber);

            //to add the tab to enter the card number , using text field

            cardTextField=new JTextField();
            cardTextField.setBounds(300,150,230,30);
            cardTextField.setFont(new Font("Arial", Font.BOLD,14));
            add(cardTextField);


            //for Pin
            JLabel pin=new JLabel("PIN ");
            //to change font of the text;
            pin.setFont(new Font("Ralwey" , Font.BOLD, 28));
            //to set positon of the text;
            pin.setBounds(120,210,400,40);
            add(pin);

            //to add entry box for pin
            pinTextField=new JPasswordField();
            pinTextField.setBounds(300,210,230,30);
            pinTextField.setFont(new Font("Arial", Font.BOLD,14));
            add(pinTextField);

            // for the sign in button

            login=new JButton("Sign In ");
            login.setBounds(300,300,100,30);
            //to modify the button colors
            login.setBackground(Color.black);
            login.setForeground(Color.white);
            login.addActionListener(this);
            add(login);


            //for the clear button
            clear=new JButton("Clear");
            clear.setBounds(430,300,100,30);
            //to modify the button colors
            clear.setBackground(Color.black);
            clear.setForeground(Color.white);
            clear.addActionListener(this);
            add(clear);


            // for the signup button
            signUp=new JButton("Sign Up ");
            signUp.setBounds(300,350,230,30);
            //to modify the button colors
            signUp.setBackground(Color.black);
            signUp.setForeground(Color.white);
            signUp.addActionListener(this);
            add(signUp);


            setSize(800,480);   // to set the size of the frame;
            setVisible(true); //  enables the frame to be visible ;
            setLocation(350,200);  // set the location of the frame on the screen ;
        }
        public static void main(String args[]){
            new Login();

        }

        //to use action function, we must define and override the function here as it is only declared in the parent  class
        public void actionPerformed(ActionEvent ae){

            // to define what happens when we click the button

            if(ae.getSource()==clear) {
                cardTextField.setText("");
                pinTextField.setText("");
            }

            else if (ae.getSource()==login) {
                
            }

            else if (ae.getSource()==signUp) {
                setVisible(false);
                new SignUpOne().setVisible(true);
            }

        }
    }
