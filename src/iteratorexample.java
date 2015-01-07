
import java.util.ArrayList;
import java.util.ListIterator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class iteratorexample {
    
    static ArrayList list = new ArrayList();
   static  ListIterator li;
   static int pos=0;
    
   public static void main(String[] args)
    {
      list.add('A');  
      list.add('B') ;
      list.add('C') ;
              li=list.listIterator();
              showList();
              //move
              System.out.println("1-move over item: " +li.next());
              pos++;
               System.out.println("2-move over item2 : " +li.next());
              pos++;
              System.out.println("3 remove : ");
              li.remove();
              pos--;
              System.out.println("4 add b back in: " );
              li.add("B");
              pos++;
              System.out.println("5-move over item2 : " +li.next());
              pos++;
              showList();
              
    }
   public static void showList()
   {
       for (int x=0; x<list.size(); x++)
       {
           if (x==pos) System.out.print("*");
           System.out.print((list.get(x)));
                      
       }
       if (pos==list.size()) System.out.print("*");
       System.out.println("");
   }
}
