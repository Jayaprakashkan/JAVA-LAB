import java.io.*;
import java.util.*;

public class Display{

   //Variable declaration
      public static void main(String [] args){
      Scanner in=new Scanner(System.in);
      String Reg_num=new String();
      String F_name = new String();
      String M_name=new String();
      String L_name=new String();
      Float CGPA=0.00f;
      boolean ex=true;
      String prog=new String();
      String school=new String();
      String p_name=new String();
      
      //Continue while Condition is true
     do
         {
          //Get the Input From User
             System.out.println("Enter Your Regiter Number:");
             Reg_num=in.next();
             System.out.println("Enter Your First name:");
             F_name=in.next();
             System.out.println("Enter Your Middle name:");
             M_name=in.next();
             System.out.println("Enter Your Last name:");
             L_name=in.next();
             System.out.println("Enter Your CGPA:");
             CGPA=in.nextFloat();
             System.out.println("Enter Your Programme:");
             in.nextLine(); //Clear the Buffer
             prog=in.nextLine();
             System.out.println("Enter Your School name:");
             school=in.next();
             system.out.println("Enter Your Proctor name:");
             p_name=in.next();
             
           //Display User Details
           
             System.out.println("Your Register Number is "+Reg_num);
             System.out.println("Your Name is "+F_name+" "+M_name+" "+L_name);
             System.out.println("Your CGPA is: "+CGPA);
             System.out.println("Your Proggame is "+prog);
             System.out.println("Your School is "+school);
             System.out.println("Your proctor Name is "+p_name);
             System.out.println("Enter false for Exit or true for continue ");
             ex=in.nextBoolean();
            }while(ex==true);
      }
}
