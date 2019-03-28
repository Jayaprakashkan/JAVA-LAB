import java.io.*;
import java.util.*;

class Vote extends Thread
{
    static int []votes=new int[240];
    int A_count,B_count,C_count,start,end;
    static int Total_A,Total_B,Total_C;
    static
    {
      for(int i=0;i<240;i++)
      {
       int random = (int)(Math.random() * 3 + 1);
       votes[i]=random;
       // System.out.println(votes[i]);
       }
    }
    
    public Vote(String t_name,int start, int end)
    {
      Thread t=new Thread(this,t_name);
      this.start=start;
      this.end=end;
      
    }
    synchronized void update_Count()
    {
           Total_A+=this.A_count;
           Total_B+=this.B_count;
           Total_C+=this.C_count;
     }
   public void run()
   { 
    try{
        System.out.println(Thread.currentThread().getName()+" is Started Counting..");
        for(int j=start;j<end;j++)
         {
           if(votes[j]==1)
            {
              A_count+=1;
              //System.out.println("vote for A");
            }
           if(votes[j]==2)
            {
              B_count+=1;
              //System.out.println("vote for B");
             }
           if(votes[j]==3)
             {
              C_count+=1;
              //System.out.println("vote for C");
              }

         }
        }
        catch(Exception e)
        {
          System.out.println(Thread.currentThread().getName()+"Counting is interruoted..");
        }
     
    }
  
  public int getA()
   { 
        return Total_A;
   }
   
   public int getB()
   { 
        return Total_B;
   }
   
   public int getC()
   { 
        return Total_C;
   }
 
}

public class VoteMain
{
    public static void main(String args[])
    {
       Vote v1 = new Vote("First_Thread",0,60);
       Vote v2 = new Vote("Second_Thread",60,120);
       Vote v3 = new Vote("Third_Thread",120,180);
       Vote v4 = new Vote("Fourth_Thread",180,240);
     
       v1.start();
       v2.start();
       v3.start();
       v4.start();
       try
       {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
           System.out.println("MainThread is Interrupted");
        }
        v1.update_Count();
        v2.update_Count();
        v3.update_Count();
        v4.update_Count();
         
       int T_A=v1.getA();
       int T_B=v1.getB();
       int T_C=v1.getC();

      System.out.println("Total Votes for A :"+T_A);
      System.out.println("Total Votes for B :"+T_B);
      System.out.println("Total Votes for C :"+T_C);

     if(T_A>T_B&&T_A>T_C)
     {
        System.out.println("A is the next PR (A won the election)..");
     }
     else if(T_B>T_A&&T_B>T_C)
     {
        System.out.println("B is the next PR (B won the election)..");
     }
     else
     {
      System.out.println("C is the next PR (C won the election)..");
     }
     
     
    }
}