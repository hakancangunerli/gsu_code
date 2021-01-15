import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add("The");
         list.add("optimist");
         list.add("thinks");
         list.add("this" );
         list.add("is");
         list.add("the" );
         list.add("best");
         list.add("of");
         list.add("all");
         list.add("possible");
         list.add("worlds");
         list.add("The");
           list.add("pessimist");
             list.add("fears"); 
              list.add("it");
                list.add("is"); 
                 list.add("true");
                 System.out.print("the original array: ");  
                 System.out.println(list);   
                 

// The optimist thinks this is the best of all possible worlds. The pessimist fears it is true.
      removeOddLength(list);
      }
   
   public static void removeOddLength(ArrayList<String> list)
   {
      for(int i = 0; i < list.size(); i++)
      {
         if(list.get(i).length() % 2 == 1)
         {
            list.remove(i);
         }
      }
      System.out.println(list);
   }
}