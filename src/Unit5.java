
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Unit5 {
static ArrayList al = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        al.add("A");
        
        //bump A down the list
        al.add(0,"B");
        al.add("banana");
        al.add("pear");
        al.add(1,"orange");
        show();
        //change babnana to kiwi
        System.out.println("banana is at: " + al.indexOf("banana"));
        al.set(3, "kiwi"); 
        al.remove("A"); 
        //or
        al.remove(0);
        
    }
    public static void show()
    {
        for (int x=0; x<al.size(); x++ )
        {
            String letter = String.valueOf(al.get(x));
            System.out.println("Location " + x + "->" +letter);
        }
    }
}
