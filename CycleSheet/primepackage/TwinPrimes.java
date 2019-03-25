import primepackage.Primes;
import java.util.*;
class TwinPrimes
   {
            public static void main(String[] args)
             {

              Scanner sc = new Scanner(System.in);
              System.out.println("starting number???");
              int x = sc.nextInt();
              System.out.println("ending number???");
              int y = sc.nextInt();
              Primes obj=new Primes();
              for(int i=x;i<=y-2;i++)
               {
                if(obj.checkForPrime(i))
                   {
                      if(obj.checkForPrime(i+2))
                          System.out.println("("+i+","+(i+2)+")");
                   }
                }
            }
}
