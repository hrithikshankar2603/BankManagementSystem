package bankManagementSystem;

import javax.swing.*; // jframe available in swing;
import java.awt.*; // color class available in awt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener {
    JTextField   PanNo , AadharNo ;
    JButton next;
    JRadioButton seniorYes, seniorNo, accountYes, accountNo;
    JComboBox Religion, Category ,Income, EducationalQualification, Occupation;
    String formNo;
    SignUpTwo(String formNo){
        this.formNo=formNo;
        //to remove default layout
        setLayout(null);

        // to set page title
        setTitle("New Account Application Form- Page 2");
        //application form

        //additional details page2
        JLabel additionalDetails=new JLabel("Page 2 : Additional Details" );
        additionalDetails.setFont(new Font("Ralwey", Font.BOLD, 22));
        additionalDetails.setBounds(240,80,400,30);
        add(additionalDetails);

        //label religion
        JLabel religion=new JLabel("Religion" );
        religion.setFont(new Font("Ralwey", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);

        // religion combo box

        // string array for religion
        String[] valReligion;
        valReligion = new String[]{"Hindu", "Muslim", "Christian", "Sikh", "Others"};

        //combo box religion
        Religion=new JComboBox(valReligion);
        Religion.setBounds(300,140,400,30);
        Religion.setFont(new Font("Ralewey", Font.BOLD,14));
        Religion.setBackground(Color.WHITE);
        add(Religion);

        //label Category
        JLabel category=new JLabel("Category" );
        category.setFont(new Font("Ralwey", Font.BOLD, 20));
        category.setBounds(100,190,200,30);

        add(category);

        // string array for category
        String[] valCategory;
        valCategory = new String[]{"General", "OBC", "SC" , "ST", "Others"};

        //combo box Category
        Category=new JComboBox(valCategory);
        Category.setBounds(300,190,400,30);
        Category.setFont(new Font("Ralewey", Font.BOLD,14));
        Category.setBackground(Color.WHITE);
        add(Category);



        // income label
        JLabel income=new JLabel("Income" );
        income.setFont(new Font("Ralwey", Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);

        // string array for income
        String[] valIncome;
        valIncome = new String[]{"nil", "<1,50,000", "< 2,50,000" , "< 5,00,000", "<10,00,000","> 10,00,000"};

        //combo box income
        Income=new JComboBox(valIncome);
        Income.setBounds(300,240,400,30);
        Income.setFont(new Font("Ralewey", Font.BOLD,14));
        Income.setBackground(Color.WHITE);
        add(Income);



        // education label
        JLabel educational=new JLabel("Educational" );
        educational.setFont(new Font("Ralwey", Font.BOLD, 20));
        educational.setBounds(100,290,200,30);
        add(educational);
        //Qualification
        JLabel qualification=new JLabel("Qualification" );
        qualification.setFont(new Font("Ralwey", Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);

        // string array for qualifications
        String[] valQualification;
        valQualification= new String[]{"Graduate", "Doctorate / PhD", "Post - Graduate", "Diploma" , "High School", "Matriculation", "Others"};

        //combo box educational qualification
        EducationalQualification=new JComboBox(valQualification);
        EducationalQualification.setBounds(300,300,400,30);
        EducationalQualification.setFont(new Font("Ralewey", Font.BOLD,14));
        EducationalQualification.setBackground(Color.WHITE);
        add(EducationalQualification);

        //occupation
        JLabel occupation=new JLabel("Occupation" );
        occupation.setFont(new Font("Ralwey", Font.BOLD, 20));
        occupation.setBounds(100,390,200,30);
        add(occupation);


        // string array for occupation
        String[] valOccupation;
        valOccupation = new String[]{"Govt-Job", "Non Govt -Job", "Business" , "Self - Employed","Student" ,"Unemployed","Retired","Others"};

        //combo box occupation
        Occupation=new JComboBox(valOccupation);
        Occupation.setBounds(300,390,400,30);
        Occupation.setFont(new Font("Ralewey", Font.BOLD,14));
        Occupation.setBackground(Color.WHITE);
        add(Occupation);

        // Pan Number
        JLabel panNo=new JLabel("PAN No." );
        panNo.setFont(new Font("Ralwey", Font.BOLD, 20));
        panNo.setBounds(100,440,200,30);
        add(panNo);

        //pan No  text field
        PanNo =new JTextField();
        PanNo.setFont(new Font("Ralewey " , Font.BOLD, 14));
        PanNo.setBounds(300,440, 400,30);
        add(PanNo);

        //aadhaar no
        JLabel aadharNo=new JLabel("Aadhaar No." );
        aadharNo.setFont(new Font("Ralwey", Font.BOLD, 20));
        aadharNo.setBounds(100,490,200,30);
        add(aadharNo);

        //aadhar text field
        AadharNo =new JTextField();
        AadharNo.setFont(new Font("Ralewey " , Font.BOLD, 14));
        AadharNo.setBounds(300,490, 400,30);
        add(AadharNo);

        //Senior Citizen
        JLabel seniorcitizen=new JLabel("Senior Citizen" );
        seniorcitizen.setFont(new Font("Ralwey", Font.BOLD, 20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);

        //radio Button for senior citizen
        seniorYes =new JRadioButton("Yes");
        seniorYes.setBounds(320,540,60,30);
        seniorYes.setBackground(Color.WHITE);
        add(seniorYes);

        seniorNo =new JRadioButton("No");
        seniorNo.setBounds(420,540,60,30);
        seniorNo.setBackground(Color.WHITE);
        add(seniorNo);

        //Group radio button senior-citizens
        ButtonGroup seniorCitizens=new ButtonGroup();
        seniorCitizens.add(seniorYes);
        seniorCitizens.add(seniorNo);

        add(seniorYes);
        add(seniorNo);


        //existing account
        JLabel existingAccount=new JLabel("Existing Account" );
        existingAccount.setFont(new Font("Ralwey", Font.BOLD, 20));
        existingAccount.setBounds(100,590,200,30);
        add(existingAccount);

        // account existing or not
        accountYes=new JRadioButton("Yes");
        accountYes.setBounds(320,590,60,30);
        accountYes.setBackground(Color.WHITE);
        add(accountYes);

        accountNo=new JRadioButton("No");
        accountNo.setBounds(420,590,60,30);
        accountNo.setBackground(Color.WHITE);
        add(accountNo);

        //Group radio button senior-citizens
        ButtonGroup existing=new ButtonGroup();
        existing.add(accountYes);
        existing.add(accountNo);

        add(accountYes);
        add(accountNo);


        // next button
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralewey", Font.BOLD, 14));
        next.setBounds(600,660,100,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
//        String formNo="";
        String sReligion= (String) Religion.getSelectedItem();  // getSelectedItem() function retrieves the value entered in the combo box field;
        
        //getSelextedItem() returns object , therfore manually typecast to String data type
        String sCategory=(String) Category.getSelectedItem();
        String sIncome=(String) Income.getSelectedItem();
        String sEducation=(String) EducationalQualification.getSelectedItem();
        String sOccupation=(String) Occupation.getSelectedItem();

        String seniorS=null;
        if(seniorYes.isSelected()){
            seniorS="Yes";
        } else if (seniorNo.isSelected()) {
            seniorS="No";
        }

        String sExisting="null";
        if(accountYes.isSelected()){
            sExisting="Yes";
        } else if (accountNo.isSelected()) {
            sExisting="No";
        }

        String sPan= PanNo.getText();
        String sAadhar= AadharNo.getText();

        try{

                Conn c=new Conn();
                String query= "insert  into signuptwo values( '"+formNo+"','"+sReligion+"','"+sCategory+"' ,'"+sIncome+"','"+sEducation+"','"+sOccupation+"', '"+seniorS+"', '"+sExisting+"','"+sPan+"','"+sAadhar+"')";

                // Inset Into Signup(table -sReligion) values;

                // now to execute this query ;
                c.s.executeUpdate(query);

                //call SignUpThree;

        }

        catch(Exception e){
            System.out.println(e);
        }


    }

    public static void main(String[] args) {

        new SignUpTwo("");
    }
}
