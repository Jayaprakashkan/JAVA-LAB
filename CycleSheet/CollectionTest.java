
/**
 * Collections  
 * @author (K.JAYAPRAKASH) 
 */
import java.util.*;
import java.io.*;
public class CollectionTest {
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     HashMap<String,ArrayList<String>> h1 = new HashMap<String,ArrayList<String>>();
     HashMap<String,String> h2 = new HashMap<String,String>();
     System.out.println ("Enter the Number of courses offered in weekend semester");
     int noofcourse = in.nextInt();
     for(int i=0;i<noofcourse;i++)
     {
         System.out.println("Enter the Course Name: ");
         String cname = in.next();
         System.out.println("Enter the Faculty Name who handle this course :");
         String fname = in.next();
         //Adding the course name and faculty for that course into h2
         h2.put(cname,fname);
       }
       
      //adding a student into h1
      System.out.println("Enter the Number of students;");
      int noofstu = in.nextInt();
      System.out.println("Registration start......");
       for(int j=0;j<noofstu;j++)
       {
           System.out.println("Enter the student Name :");
           String sname = in.next();
           ArrayList<String> ar = new ArrayList<String>();
           int c=0;
           while(true)
           {
            if(c==3)
            { 
                System.out.println("Maximum 3 courses only");
                break; 
            }
            System.out.println("Enter the Course Name : \n 'completed' for complete your registration");
            String cn = in.next();
            if(cn.equals("completed"))
            {
                break;
            }
            if(h2.keySet().contains(cn))
            {
            ar.add(cn);
            c=c+1;
            }
            else
            {
              System.out.println(cn+" Course Not Offerd for Weekend Semester");
            }
           }
          h1.put(sname,ar); 
          
        }
        
        //removing students from h1
        System.out.println("Enter the Student name who you want to remove");
        String res = in.next();
        h1.remove(res);
        System.out.println(res+" removed succesfully");
        System.out.println(h1);
        //Iterating h1
        System.out.println("Students and Course list");
        Set t1 = h1.keySet();
        Iterator ith1 = t1.iterator();
        while(ith1.hasNext())
        {  
           String name =(String) ith1.next();
           System.out.println(name+" registered.. :");
           ArrayList<String> re =  h1.get(name);
           for(String a:re)
           {
            System.out.println(a);
            }
        }
        
        //Iterating h2
        System.out.println("Coure and Faculty List");
        Set t2 = h2.keySet();
        Iterator ith2 = t2.iterator();
        while(ith2.hasNext())
        {  
           String cname = (String) ith2.next();
           System.out.println(cname+" Course Handle by " + h2.get(cname));
        }
        
        //faculties for particular student
        System.out.println("Enter Student name:");
        String na=in.next();
        ArrayList<String> regc=h1.get(na);
        for(String cn:regc)
        {
           System.out.println("Course Name: " + cn + "Faculty Name: " + h2.get(cn));
        }
        
  }
}