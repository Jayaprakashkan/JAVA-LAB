import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
class Donor implements Serializable
{
  int age;
  String name;
  String address;
  String contact_number;
  String blood_group;
  String date;
  
  public Donor(String name,int age,String address,String cont,String bgroup,String date)
  {
    this.name=name;
    this.age=age;
    this.address=address;
    this.contact_number=cont;
    this.blood_group=bgroup;
    this.date=date;
  }
  
}
public class TestDonor
{
  public static void main(String args[]) throws Exception
   {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number of Donors");
       int n=in.nextInt();
       ObjectOutputStream objos = new ObjectOutputStream(new FileOutputStream("donorlist.txt"));
       ArrayList<Donor> ar=new ArrayList<Donor>();
       for(int i=0;i<n;i++)
       {
       System.out.println("Enter name: ");
       String name=in.next();
       System.out.println("Enter Age: ");
       int age=in.nextInt();
       System.out.println("Enter address: ");
       String address=in.next();
       System.out.println("Enter contact number: ");
       String cnt=in.next();
       System.out.println("Enter blood group: ");
       String blg=in.next();
       System.out.println("Enter the last donated date(dd-mm-yyyy) ");
       String date=in.next();
       ar.add(new Donor(name,age,address,cnt,blg,date)); 
       System.out.println("'''NEXT'''");
       }
       objos.writeObject(ar);
       
       FileInputStream finp=new FileInputStream("Donorlist.txt");
       ObjectInputStream inp=new ObjectInputStream(finp);
       ArrayList list=(ArrayList)inp.readObject();
       System.out.println("A+ve Blood donors that are ready to give blood");
         for(Object o1:list)
            {
             Donor o=(Donor)o1;
             if(o.blood_group.equals("A+ve"))
             { 
                Calendar now=Calendar.getInstance();
                SimpleDateFormat fr=new SimpleDateFormat("dd-MM-yyyy");
                String tod=fr.format(now);
                 if((Integer.parseInt(today.substring(3,5)))-(Integer.parseInt(o.date.substring(3,5)))>6)
                  {
                       System.out.println("Name is " + o.name);
                       System.out.println("Age is " + o.age);
                       System.out.println("Contact Number is "+o.contact_number);
                       System.out.println("Address is " + o.address);
                   
                     }
             }

       } 
       
    }
} 