
/**
 * Lab Expriment two
 * Array
 * @author K.JAYAPRAKASH 
 * 17-12-1018
 */

import java.io.*;                                                               
import java.util.*;

public class CourseSelect {
        
          public static void main(String [] args){
              Scanner in=new Scanner(System.in);
              
              //declaring the 2-D Array
              String Course[][]={{"ITA1001","ITA1002","ITA1003","ITA1004","ITA1005","ITA1006"},
              {"ITA2001","ITA2002","ITA2003","ITA2004","ITA2005","ITA2006"},{"ITE1001","ITE1002","ITE1003","ITE1004","ITE1005","ITE1006"},
              {"ITE2001","ITE2002","ITE2003","ITE2004","ITE2005","ITE2006"},{"SWE1001","SWE1002","SWE1003","SWE1004","SWE1005","SWE1006"},
              {"SWE2001","SWE2002","SWE2003","SWE2004","SWE2005","SWE2006"}};
                
               //Found the Lenght of Array from command Line
               int SelectedCourses = args.length;
               
               //This is the Array Declaration for Checking purpose
               int []SelectedRow=new int[5];
               
               //Declaration of Array for Result 
               String [] FinalCourse=new String[5];
               
               //Finding the Occurance of the row for Input Course
               for(int s=0;s<SelectedCourses;s++){
                   FinalCourse[s]=args[s]; // Add  Input to Result
                 for(int i=0;i<6;i++)
                 {
                    for(int j=0;j<6;j++)
                    {
                       if(args[s]==Course[i][j])
                       {
                         SelectedRow[s]=i;
                         break;
                        }
                    }
                    }  
                }
                
                 //Initialize the remaining Index of the Array 
                 //with some Non related value
                 for(int i=4;i>=SelectedCourses;i--){
                    SelectedRow[i]=9;
                    }
               
                //for next Index that require to put the random Course
                int nextIndex=SelectedCourses;
                              
               //If Faculty Entered Five Courses
               //then Add those Courses to result
               if(SelectedCourses==5){
                   for(int i=0;i<5;i++){
                        FinalCourse[i]=args[i];
                   }
               }
               //Faculty Missed Some Courses
               else{
                   //Find the No.Of Unselected Courses
                   int UnSelected=5-SelectedCourses;
                   //Declare row and column
                   int  rand=0,r=0,c=0;
                   //For condition
                   boolean con=false;
                      //Find UnSelected no.of New Courses 
                      //by for loop
                     for(int i=0;i<UnSelected;i++){
                         //this do while for check whether the row 
                         //allready exist or Not
                       do{
                         rand=RandomGen(); //get the random number
                          r=rand/6;
                          c=rand%6;
                            
                          //This is the Part of Checking
                           for(int z=0;z<SelectedRow.length;z++){
                                       if(SelectedRow[z]==r){
                                       con=true;
                                       break;
                                      }
                                      else
                                      {
                                        con=false;
                                        }
                                    }
                          
                        }while(con==true);
                        
                       //Add to the Course into result Array 
                       FinalCourse[nextIndex]= Course[r][c];
                       //Add the Added Course row Number to 
                       //the SelectedRow
                       SelectedRow[nextIndex]=r;
                       //Increment the index value
                       nextIndex+=1;
               }
            }
            
            //Printing the final Result Array
            for(String course:FinalCourse){
            System.out.println(course);
            }
            
}        
        //Calculation Of Random Number
        static int RandomGen(){
                int max = 35;
                int min = 0;
                int range = max - min + 1;
                int g=(int)(Math.random() * range) + min;
                return g;
}         
}

