
/**
 * CYCLE Expriment 7
 * Exception handling
 * @author (K.JAYAPRAKASH) 
 * @version (9-2-2019)
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class TestException
{

   public static void main(String args[])
   {

        Scanner in = new Scanner(System.in);
        System.out.println("Register Number???");
        String reg = in.next();
        System.out.println("Mobile Number???");
        String mb = in.next();
        String result="Valid";
        try{
              if(reg.length()!=9||mb.length()!=10)
              {
                  result="invalid";
                  throw new Exception("IllegalArgumentException");
              }
             }
        catch(Exception e)
        {
          System.out.println(e);
        }

        try{
                 Pattern p = Pattern.compile("[0-9]+");
                 Matcher m = p.matcher(mb);
                 if(!m.matches())
                  {
                     result="invalid";
                     throw new Exception("NumberFormatException");
                  }
             }
        catch(Exception e)
       {
          System.out.println(e);
       }
         
        try{ 
             
                 Pattern p1 = Pattern.compile("[A-Za-z0-9]+");
                 Matcher m1 = p1.matcher(reg);
                 if(!m1.matches())
                  {
                    result="invalid";
                     throw new Exception("NoSuchElementException");
                  }
               }
        catch(Exception e)
       {
          System.out.println(e);
       }     
            
      System.out.println(result);
      
    }
}
