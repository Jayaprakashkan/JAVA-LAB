/**
 * Lab Expriment 3
 * Class And Object
 * @author K.JAYAPRAKASH 
 * 18-12-2018
 */
import java.io.*;
import java.util.*;
class BankDeposit {
    
            //declaring private Variables
            private String NameOfHolder;
            private Long AccountNumber;
            private String AccountType;
            private int  Balance;
            
            //Initializing the values
            public void ToAssingInitialValues(String NameOfHolder,Long AccountNumber,String AccountType,int Balance)
            {
              this.NameOfHolder=NameOfHolder;
              this.AccountNumber=AccountNumber;
              this.AccountType=AccountType;
              this.Balance=Balance;
            }
            
            //Deposit 
            public int Deposit(int amount)
            {
             Balance=Balance+amount;
             System.out.println("Succesfully "+amount+" deposited in Your Account");
             return Balance;
            }
            
            //Withdraw
            public int Withdraw(int amount)
            {    
                //Check Balance
                 if(amount>Balance) {
                    System.out.println("Not Sufficient Balance.. Please Check your Balance..");    
                   
                    }
                    else{
                      Balance=Balance-amount;
                      System.out.println("Collect Cash..");
                     }
               return Balance;
            }
            
            //Dispay Holder Name and Current Balance
            public void display()
            {
             System.out.println("Your Name is: "+NameOfHolder);
             System.out.println("Your Account Balance is: "+Balance);
            }
}

public class TestBankAccount{
            
        public static void main(String [] args)
        {
          Scanner in=new Scanner(System.in);
          BankDeposit obj=new BankDeposit();
          System.out.println("You Must Initialize Your Account Before Acces...");
          System.out.println("Enter Your Name:");
          String name=in.next();
          System.out.println("Enter Your Account Number:");
          Long AC=in.nextLong();
          System.out.println("Enter Your Account Type:");
          String type=in.next();
          System.out.println("Enter Available balance:");
          int bal=in.nextInt();
          
          obj.ToAssingInitialValues(name,AC,type,bal);
          int choice=0;
          do{
          System.out.println("Enter Your Coice:\n1.Deposit\n2.Withdraw\n3.Balace Check\nOther for Exit");
           choice=in.nextInt();
          switch(choice)
          {
              case 1:
                 System.out.println("Enter the Amount:" );
                 int money= in.nextInt();
                 bal=obj.Deposit(money);
                 break;
              case 2:
                 System.out.println("Enter the Amount:" );
                 int wid= in.nextInt();
                  bal=obj.Withdraw(wid);
                      break;
                   
              case 3:
                  obj.display();
                  break;
              default:
                 System.out.println("Wrong Choice ... Better Try Next time..");
                 break;
        }
    }while(choice<4);
  }
}
