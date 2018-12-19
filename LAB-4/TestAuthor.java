
/**
 * LAB EXPRIMENT 4
 * Class and Object
 * @author K.JAYAPRAKASH
 * @19-12-2018
 */
import java.io.*;
import java.util.*;

 class Author {
    
      //Creating object for Scanner
      Scanner in=new Scanner(System.in);
      
      //Fields
      String FirstName;
      String LastName;
      
      
    //set first name
    public void setFirstName(String Fname)
    {
        FirstName=Fname;
    }
    
    //set last name
    public void setLastName(String Lname)
    {
        LastName=Lname;
    }
    
    //Getting the First name from user
    public String getFirstName()
    {   
        System.out.print("Enter the Author's First Name: ");
        String Fname=in.next();
        return Fname;  //return the first name
    }
    
    //Getting the Last name from user
    public String getLastName()
    {
        System.out.print("Enter the Author's Last Name: ");
        String Lname=in.next();
        return Lname;   //return the last name
    }    
}

public class TestAuthor
{
    public static void main(String [] args)
    {
        Author obj=new Author();   //object for Author class
        String name1 = obj.getFirstName();  
        String name2 = obj.getLastName();
        obj.setFirstName(name1);   //passing the first name to setFirstName
        obj.setLastName(name2);    //passing the last name to setLastName
         
        //checking the class and object by printing the Author's name
        System.out.println("Author Name is: "+obj.FirstName+" "+obj.LastName); 
    }
}

