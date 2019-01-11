
/**
 * Strore the mark of the students in different class
 * 
 * @author (K.JAYAPRAKASH) 
 * @ 11-1-2019
 */
import java.util.*;
import java.io.*;
 class MPL {
      private String std;
      private int noofstu;
      private int[] marks;
      private int firstmark;
      
      Scanner inp=new Scanner(System.in);
      public MPL(String std,int noofstu)
      { 
         
        this.std=std;
        this.noofstu=noofstu;
        this.firstmark=0;
        marks=new int[noofstu];
        for(int i=0;i<noofstu;i++)
        {
          System.out.println("Enter the "+(i+1)+"st student mark:");
          marks[i]=inp.nextInt();
          if(marks[i]>this.firstmark)
          {
            this.firstmark=marks[i];
            }
        }
       }
       
      public void  findBestClass()
      {
          System.out.println("The highest Class has  secured the highest first mark: "+this.std);
        
        }
      
       public void  findBestClass(float maxavg)
      {
          System.out.println("The Highest Class Average is "+maxavg+" in Standard "+this.std);
        
        }
      
       
         
      public int getFirstMark()
      { 
          return firstmark;
        
        }
       
      public int[] getMarks()
      { 
          return this.marks;
        
        }
      
      
}

public class TestMPL
{
    public static void main(String args[])
    {   
        Scanner in=new Scanner(System.in);
        MPL [] obj=new MPL[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the Standard:");
            String st=in.next();
            System.out.println("Enter The no of students in the class:");
            int n=in.nextInt();
            obj[i]=new MPL(st,n);
            
        }
        
        MPL maxmarkclass=obj[0];
        int max=0;
        for(int j=0;j<10;j++)
        {
           int currentmax=obj[j].getFirstMark();
           //System.out.println(currentmax);
           if(max<currentmax)
           {
               maxmarkclass=obj[j];
               max=currentmax;
            }  
        }
        
        maxmarkclass.findBestClass();
        float avg=0.0f;
        float maxavg=0.0f;
        
        MPL maxavgobj=obj[0];
        for(int s=0;s<10;s++)
        {
           int total=0;
           int [] m=obj[s].getMarks();
           for(int t=0;t<m.length;t++)
           { 
               total=m[t]+total;
               
            }
           avg=total/m.length;
           //System.out.println(avg);
           if(avg>maxavg)
           {
            maxavg=avg;
            maxavgobj=obj[s];
            }
        
        }
        maxavgobj.findBestClass(maxavg);
      
    }
}
