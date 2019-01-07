
/**
 * CycleSheet - Tutors allocation for slow learners
 * Expriment 2
 * @author (K.JAYAPRAKASH) 
 * @7-01-2019
 */

import java.io.*;
import java.util.*;
public class TestTutors {
     
    public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        
        //array for store no.of slowlearner in each batch
        int [] slowlearner=new int[4];
        
        //get no.of slowlearner in each batch from user
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter the No.Of slow learners in "+(i+1)+"th batch");
            slowlearner[i]=in.nextInt();
        }
        
        // jagged array initially with 4 rows
        int [][]jagged=new int[4][]; 
        
        
        for(int j=0;j<4;j++)
        {   
            int csize=0;
            int n=slowlearner[j];
            int m=n;
            
            //finding the innerarray size
            while(n>0)
            {
               csize+=1;
               n=n-4;
            }
            //assign the colum size
            jagged[j]=new int[csize];
            
            //assign values for jagged array
            for(int k=0;k<csize;k++)
            {
                if(m>4) jagged[j][k]=4;
                else jagged[j][k]=m;
                m=m-4;
            }
            
        }
        
        /*
        for(int s=0;s<jagged.length;s++)
        {     
             System.out.print("Batch "+(s+1)+" :");
             for(int t=0;t<jagged[s].length;t++)
             {
                System.out.print(jagged[s][t]+" ");
                
                }
             System.out.println();
        }
       */
       //prin the jagged array by using for each loop
       int c=1;
       for(int []innerarray:jagged)
           {
           
           System.out.print("Batch "+c+" :");
           for(int tutors:innerarray)
           {
              System.out.print(tutors+" ");
            }
           System.out.println();
           c=c+1;
        
        }
        
        //finding the batches which all tutors have exactly 4 Students
        int n=0;
        System.out.println("Batches which all tutors have exactly 4 Students ");
        for(int i=0;i<jagged.length;i++)
        {
           int lastindex=jagged[i].length-1;
           if(jagged[i][lastindex]==4)
           {
            System.out.println("Batch "+ (i+1));
            n=n+1;
            }
        }
        
       System.out.println("number of batches in which all tutors have exactly 4 students: "+n);
    
    }
    
}

