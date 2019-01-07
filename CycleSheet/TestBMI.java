/**
 * LAB EXPRIMENT 1
 * Calculating BMI
 * @author K.JAYAPRAKASH
 * @07-01-2019
 */


import java.io.*;

 class BMI
{ 
   //This is the method calculate the BMI
   public void calculateBMI(String args[])
    {  
       
       String result="";
     
       //Convert String to float 
       float weight=Float.parseFloat(args[2]);
       float height=Float.parseFloat(args[3]);

       //calculating BMI
       float BMI=weight/(height*height);
       
       //checking the category
       if(BMI<18.5)
        {  
            result= "Underweight"; 
          }
        if(BMI>18.5&&BMI<25)
        {  
            result= "Normal (healthy weight)"; 
          }
         if(BMI>25&&BMI<30)
        {  
            result= "Overweight"; 
          }
        if(BMI>30)
        {  
            result= "Obse Class"; 
          }
    
       //printing the result with BMI
       System.out.println(args[0]+" "+args[1]+" "+ "in "+result+" category and BMI is "+BMI);
     }  
}

public class TestBMI
{ 

    public static void main(String args[])
    { 
      BMI obj=new BMI();
      obj.calculateBMI(args);
      
     }
}
