/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class RadioShow {
   
    public static void main(String[] args) {
        LinkedQueue phoneline=new LinkedQueue();
        //3 people call in
        phoneline.enqueue(new Caller("Bob"));
        phoneline.enqueue(new Caller("Cindy"));
        phoneline.enqueue(new Caller("Joe"));
        //take the next caller
        System.out.println("Take next caller");
        System.out.println(phoneline.dequeue());
        phoneline.enqueue(new Caller("Mary"));
        phoneline.enqueue(new Caller("Larry"));
        System.out.println("Take the next 3 callers");
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        //who is next?
        System.out.println("Next Caller will be: "+phoneline.peekFront());
        //how many callers left??
        System.out.println("Callers Still waiting: "+phoneline.size());
    }
    
}
