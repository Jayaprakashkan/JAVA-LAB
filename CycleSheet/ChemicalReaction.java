
/**
 * count of the number of molecules of each reactant and product.
 * Expriment 3
 * @author (K.JAYAPRAKASH) 
 * @date (8-1-2019)
 */
import java.io.*;
import java.util.*;
public class ChemicalReaction {
    
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       //get the eqn from user
       String eqn=in.nextLine();
       //find the index of middle (middle is ->)
       int middleindex=eqn.indexOf("->");
       //split the eqn into reactant and products part
       String reactant=eqn.substring(0,middleindex);
       String products=eqn.substring(middleindex+2);
       
       ChemicalReaction obj=new ChemicalReaction();
       
       //call the display by passing reactants
       System.out.println("Reactants are :");
       obj.display(reactant);
       //call the display by passing products
       System.out.println("Products are :");
       obj.display(products);
 
    }
    
    public void display(String cheq)
    {   
       //remove the space 
       cheq=cheq.replaceAll("\\s", "");
       
       //create HashMap for store mole and compenent pair
       HashMap<Integer,String> map=new HashMap<Integer,String>();
       
       //split the string by + 
       String []compenent=cheq.split("[+]");
       
       //find the no.of moles for each compenent
       for(String com:compenent)
       {
           char first=com.charAt(0);
           if(Character.isDigit(first))
           {
               map.put(Integer.parseInt(String.valueOf(first)),com.substring(1));
               
            }
            
            else
            {
                map.put(1,com);
            
            }
        
        }
        
        //display each compenent with moles
        for(int mole:map.keySet())
        {
           System.out.println(mole+" moles of "+map.get(mole));
        }
        
    }
}


