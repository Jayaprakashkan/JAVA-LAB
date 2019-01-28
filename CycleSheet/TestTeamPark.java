
/**
 * Lab Expriment 6
 * Game booking
 * @author (JAYAPRAKASH K) 
 * (28-1-2019)
 */
import java.util.*;

abstract class Temepark
{
   protected int adults_fee=500;
   protected int children_fee=300;
   
   public int totalfee(int n, int m)
   {
       int total=(n*adults_fee)+(m*children_fee);
       return total;
   }
   
   abstract public boolean playGame(int code);  
}

class Queensland extends Temepark
{
   boolean Games[] = new boolean[30];
   
   public boolean playGame(int code)
  {
     if(Games[code-1]==true)
      { 
        return false;
       }
     else
     {
        Games[code-1]=true;
        return true;
      }

   }
  
  public int calGames()
 {  
    int count=0;
    for(int i=0;i<Games.length;i++)
    {
        if(Games[i]==true)
          count++;
    }

    return count;
  }
 
}

class Wonderla extends Temepark
{
    int Games[] = new int[40];
   
   public boolean playGame(int code)
  {
      Games[code-1]=Games[code-1]+1;
      return true;
   }

  public void countingGames()
  {
    int notplayed=0;
    int repeated=0;
    for(int i=0;i<Games.length;i++)
    {
        if(Games[i]>1)
          { 
             System.out.println("The Game code "+(i+1)+" is Repeated "+Games[i]+" times");
             repeated++;
           }
        else if(Games[i]==0)
          {  
             notplayed++;
           }
    }
     System.out.println("No.Of Games Not played: "+notplayed);
     System.out.println("No.Of Games repeated: "+repeated);
    }
}

public class TestTeamPark
{

    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter your choice:\n1.Queensland\n2.Wonderla");
      int choice = in.nextInt();
      switch(choice)
      {
          case 1:
              Queensland obj=new Queensland();
              System.out.println("Enter the no.of adults");
              int a=in.nextInt();
              System.out.println("Enter the no.of Children");
              int c=in.nextInt();
              int total=obj.totalfee(a,c);
              System.out.println("Total Ticket Amount is "+total);
              int ch=100;
              while(ch!=0){
                   System.out.println("Book your Game\nEnter the choice 1 to 30\n0 for exit");
                   ch=in.nextInt();
                   if(ch==0)
                   {
                     System.out.println("Thank you for your booking..");
                    }
                   else{
                   boolean v=obj.playGame(ch);
                   if(v==false) 
                   {
                      System.out.println("You already Booked This Game, Choose another one");
                   }
                   }
                 }
              System.out.println("No of Games You booked in Queensland "+obj.calGames());
              break;
          case 2:
              Wonderla obj1=new Wonderla();
              System.out.println("Enter the no.of adults");
              int q=in.nextInt();
              System.out.println("Enter the no.of Children");
              int j=in.nextInt();
              int total1=obj1.totalfee(q,j);
              System.out.println("Total Ticket Amount is "+total1);
              int cha=100;
              while(cha!=0){
                   System.out.println("Book your Game\nEnter the choice 1 to 40\n0 for exit");
                   cha=in.nextInt();
                   if(cha==0)
                   {
                     System.out.println("Thank you for your booking..");
                    }
                   else
                   obj1.playGame(cha); 
                   }
                  obj1.countingGames();
                  break;
          default :
                      System.out.println("Enter correct choice..");
       }
    }
}

