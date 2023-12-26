package bankManagementSystem;
import javax.swing.*; // jframe available in swing;
import java.awt.*; // color class available in awt;

import java.util.*; // to use random no , available in util package
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {


    JTextField  FName, Email,  Address, State , City ,Pincode;
    SignUpOne(){

        //to remove default layout
        setLayout(null);

        Random ran=new Random();
        long random=Math.abs((ran.nextLong())%900L + 1000L);

        //application form
        JLabel formNo=new JLabel("Application Form no." + random);
        formNo.setFont(new Font("Ralwey", Font.BOLD, 38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        
        //personal details page1 
        JLabel personalDetails=new JLabel("Page 1 : Personal Details" );
        personalDetails.setFont(new Font("Ralwey", Font.BOLD, 22));
        personalDetails.setBounds(240,80,400,30);
        add(personalDetails);

        //label name
        JLabel name=new JLabel("NAME" );
        name.setFont(new Font("Ralwey", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        // name text field;
        FName =new JTextField();
        FName.setFont(new Font("Ralewey " , Font.BOLD, 14));
        FName.setBounds(300,140, 400,30);
        add(FName);

        //label Father's Name
        JLabel fathersName=new JLabel("Father's Name" );
        fathersName.setFont(new Font("Ralwey", Font.BOLD, 20));
        fathersName.setBounds(100,190,200,30);
        add(fathersName);

        // father's name text field
        FName =new JTextField();
        FName.setFont(new Font("Ralewey " , Font.BOLD, 14));
        FName.setBounds(300,190, 400,30);
        add(FName);

        // date of birth label
        JLabel dob=new JLabel("Date of birth" );
        dob.setFont(new Font("Ralwey", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        // date calender field
        JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);

        // gender label
        JLabel gender=new JLabel("Gender" );
        gender.setFont(new Font("Ralwey", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);

        // gender radio buttons
        JRadioButton male=new JRadioButton("MALE");
        JRadioButton female=new JRadioButton("FEMALE");
        JRadioButton others=new JRadioButton("OTHERS");

        male.setBounds(300,290,90,30);
        female.setBounds(400,290,90,30);
        others.setBounds(500,290,90,30);

        // to set the  bakground to white
        male.setBackground(Color.WHITE);
        female.setBackground(Color.WHITE);
        others.setBackground(Color.WHITE);


        //to group the buttons together so that only one button is clicked ;
        ButtonGroup groupGenders=new ButtonGroup();
        groupGenders.add(male);
        groupGenders.add(female);
        groupGenders.add(others);


        add(male);
        add(female);
        add(others);


        //email
        JLabel emailAddress=new JLabel("Email" );
        emailAddress.setFont(new Font("Ralwey", Font.BOLD, 20));
        emailAddress.setBounds(100,340,200,30);
        add(emailAddress);

        //email text field
        Email=new JTextField();
        Email.setFont(new Font("Ralewey " , Font.BOLD, 14));
        Email.setBounds(300,340, 400,30);
        add(Email);

        //Marital Status
        JLabel maritalStatus=new JLabel("Marital Status" );
        maritalStatus.setFont(new Font("Ralwey", Font.BOLD, 20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);


        // marital status radio buttons, : married, single , widowed ;
        JRadioButton married=new JRadioButton("Married");
        married.setBounds(300,390,90,30);

        JRadioButton single=new JRadioButton("Single");
        single.setBounds(400,390,90,30);

        JRadioButton widowed=new JRadioButton("Widowed");
        widowed.setBounds(500,390,90,30);

        married.setBackground(Color.WHITE);
        single.setBackground(Color.WHITE);
        widowed.setBackground(Color.WHITE);

        ButtonGroup marriageStatus=new ButtonGroup();
        marriageStatus.add(married);
        marriageStatus.add(single);
        marriageStatus.add(widowed);

        add(married);
        add(single);
        add(widowed);

        // Address
        JLabel address=new JLabel("Address" );
        address.setFont(new Font("Ralwey", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        //address text field
        Address=new JTextField();
        Address.setFont(new Font("Ralewey " , Font.BOLD, 14));
        Address.setBounds(300,440, 400,30);
        add(Address);

        //city
        JLabel city=new JLabel("City" );
        city.setFont(new Font("Ralwey", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        //city text field
        City =new JTextField();
        City .setFont(new Font("Ralewey " , Font.BOLD, 14));
        City .setBounds(300,490, 400,30);
        add(City );

        //State
        JLabel state=new JLabel("State" );
        state.setFont(new Font("Ralwey", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);

        // state text field
        State=new JTextField();
        State.setFont(new Font("Ralewey " , Font.BOLD, 14));
        State.setBounds(300,540, 400,30);
        add(State);

        //pincode
        JLabel pincode=new JLabel("Pincode" );
        pincode.setFont(new Font("Ralwey", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        //pincode text field
        Pincode=new JTextField();
        Pincode.setFont(new Font("Ralewey " , Font.BOLD, 14));
        Pincode.setBounds(300,590, 400,30);
        add(Pincode);


        // next button
        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralewey", Font.BOLD, 14));
        next.setBounds(600,660,100,30);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String[] args) {

        new SignUpOne();
    }
}
