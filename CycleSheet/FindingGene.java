
/**
 * CycleSheet Finding genes 
 * Expriment 4
 * @author (K.JAYAPRAKASH) 
 * @date (8-1-2019)
 */
import java.io.*;
import java.util.*;

public class FindingGene {
   
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       //get the input DNA from user
       System.out.println("Enter a genome string:");
       String dna=in.nextLine();
       
       List<String> dnaresult=new ArrayList<String>();
       FindingGene obj=new FindingGene();
       //find the first occurance of ATG (starting codon)
       int startindex=dna.indexOf("ATG");
       //if DNA Not contain Statring codon.. then no gene
       if(startindex==-1)
       {
        System.out.println("no gene ");
        }
        
        //DNA contain Starting codon find gene
        else
        {
          while(true)
           {  
              //no more genes then exit
              if(startindex==-1)
               {
                  break;
                }
        
               String rdna=obj.findGene(dna,startindex);
               if(rdna==null)
               {
                   break;
                }
               //check the length of the gene
               if(rdna!=null&&rdna.length()%3==0)
               {
                   dnaresult.add(rdna);
                   startindex=dna.indexOf("ATG",startindex+rdna.length());
               }
               
            }
            
             if(dnaresult.isEmpty())
             {
                System.out.println("no gene");
               }
             else
             {
                for(String gene:dnaresult)
                {
                  System.out.println(gene);
                }
              }
        }
    }
    
    public String findGene(String dna,int startindex)
    {
        //find the index of the TAG in DNA
        int tagindex=dna.indexOf("TAG",startindex);
        //find the index of the TAG in DNA
        int taaindex=dna.indexOf("TAA",startindex);
        //find the index of the TAG in DNA
        int tgaindex=dna.indexOf("TGA",startindex);
        int minimumindex=-1;
        
        //find minimum from  these three index
        if(tagindex==-1||(taaindex!=-1&&taaindex<tagindex))
        {
          minimumindex=taaindex;
        }
        else
        {
           minimumindex=tagindex;
        }
        
        if(minimumindex==-1||(tgaindex!=-1&&tgaindex<minimumindex))
        {
          minimumindex=tgaindex;
        }
        if(minimumindex==-1)
        {
           return null;
        }
        
        //find gene
        return dna.substring(startindex+3,minimumindex);
    }   
}
