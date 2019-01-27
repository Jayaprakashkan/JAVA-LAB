
/**
 * Lab expriment 5
 * @author (JAYAPRAKASH) 
 * @27-1-2019
 */

import java.util.*;

public class FilmMain {
      
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       Vector<Film> vec=new Vector<Film>();
       System.out.println("Enter the No.Of Film");
       int n=in.nextInt();
       while(n-->0)
       {
        System.out.println("Enter Name of the  Film");
        String name=in.next();
        System.out.println("Enter Language of the Film");
        String language=in.next();
        System.out.println("Enter Lead Actor of the Film");
        String lead_actor=in.next();
        System.out.println("Enter the category of the film");
        String category=in.next();
        System.out.println("Enter duration of the Film");
        int duration=in.nextInt();
        
        Film obj=new Film(name,language,lead_actor,category,duration);
        vec.add(obj);
        
        }
       Enumeration en2=vec.elements();
       String ShortestMovie="";
       int Shortpe=10;
       while(en2.hasMoreElements())
       {
        Film obj3=(Film)en2.nextElement();
        if(obj3.getLanguage().equalsIgnoreCase("english")&&obj3.getLeadActor().equalsIgnoreCase("Arnold"))
        {
           if(obj3.getDuration()<Shortpe)
           {
            ShortestMovie=obj3.getName();
            Shortpe=obj3.getDuration();
            }
        }
        }
       System.out.println("Shortest Arnold Movie "+ShortestMovie);
       
       Enumeration en=vec.elements();
       int j=1;
       System.out.println("All the Tamil film(s) with Rajini as lead actor");
       while(en.hasMoreElements())
       {
         Film obj2=(Film)en.nextElement();
         if(obj2.getLanguage().equalsIgnoreCase("tamil")&&obj2.getLeadActor().equalsIgnoreCase("Rajini"))
         {
            System.out.println(j+"."+obj2.getName());
            j++;
          }
        }
       
       Enumeration en1=vec.elements();
       System.out.println("All the Comedy movies");
       int k=1;
       while(en1.hasMoreElements())
       {
           Film obj1=(Film)en1.nextElement();
           if(obj1.getCategory().equalsIgnoreCase("comedy"))
           {
               System.out.println(k+"."+obj1.getName());
               k++;
            } 
       }
    }
   
}

class Film
{

   private String name;
   private String language;
   private String lead_actor;
   private String category;
   private int duration;
   
   
   public Film()
   {
    this.name=null;
    this.language=null;
    this.lead_actor=null;
    this.category=null;
    this.duration=0;
    }
   
   public Film(String name,String language, String lead_actor, String category, int duration)
   {
    this.name=name;
    this.language=language;
    this.lead_actor=lead_actor;
    this.category=category;
    this.duration=duration;   
    }
   
   public String getName()
   {
      return this.name;
    }
    
   public String getLanguage()
   {
      return this.language;
    }
    
   public String getLeadActor()
   {
      return this.lead_actor;
    }  
   
   public String getCategory()
   {
      return this.category;
    }
   
   public int getDuration()
   {
      return this.duration;
    }
}
