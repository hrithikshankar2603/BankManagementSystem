package bankManagementSystem;
import java.sql.*;
public class Conn {

    /** Step 1 : Register the driver
    Step 2 : Create connection
    Step 3 :Create Statement
    Step 4 : Execute Query
    Step 5: Close Connection
     */

    // create an object of connection class;
    Connection c;
    Statement s;

     public  Conn(){

         try{
             // we have to use exception handling because my sql is an external entity and
             // may give rise to errors

             // Register the driver
//              Class.forName(com.mysql.jdbc.Driver); // now automatically my sql connector is in class path, so no need to register manually

             // Creating a connection
             c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "MegamewtoX11#");

             s=c.createStatement();
             if(s==null)
                 System.out.println("here");
         }

         catch(Exception e){
//             System.out.println(e);
             e.printStackTrace();
         }
     }


}
