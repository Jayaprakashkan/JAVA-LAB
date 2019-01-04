
/**
 * LAB EXPRIMENT 4
 * Class and Object
 * @author K.JAYAPRAKASH
 * @19-12-2018
 */
import java.io.*;
import java.util.*;

 class Author {
    
      //Fields with private scope
     private String FirstName;
     private String LastName;
      
      
    //set first name
    public void setFirstName(String FirstName)
    {
        this.FirstName=FirstName;
    }
    
    //set last name
    public void setLastName(String LastName)
    {
        this.LastName=LastName;
    }
    
    //Getting the First name 
    public String getFirstName()
    {   
       
        return FirstName;  //return the first name
    }
    
    //Getting the Last Name
    public String getLastName()
    {
        
        return LastName;   //return the last name
    }    
}

public class TestAuthor
{
    public static void main(String [] args)
    {  
        //Creating object for Scanner
        Scanner in=new Scanner(System.in);
        Author obj=new Author();   //object for Author class
        System.out.println("Enter the First Name of the Author:");
        String fname=in.next();
        System.out.println("Enter the Last Name of the Author:");
        String lname=in.next();
        obj.setFirstName(fname);   //passing the first name to setFirstName
        obj.setLastName(lname);    //passing the last name to setLastName
         
        //checking the class and object by printing the Author's name
        System.out.println("Author Name is: "+obj.getFirstName()+" "+obj.getLastName()); 
    }
}

