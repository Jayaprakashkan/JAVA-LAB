package primepackage;
public class Primes
  {
      public static boolean checkForPrime(int n)
        {
           for(int i=2;i<n/2;i++)
            if(n%i==0)
             return false;
          return true;
       }
}
