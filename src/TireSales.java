/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class TireSales {
    public static void main(String[] args)
    {
        ArrayStack pole = new ArrayStack();
        pole.pop(new Tire ("goodyear"));
        pole.pop(new Tire ("goodyear"));
        pole.pop(new Tire ("goodyear"));
        pole.pop(new Tire ("goodyear"));
        //sell 2
        System.out.println("selling 2 tires");
           System.out.println(pole.pop());
           System.out.println(pole.pop());
           pole.pop(new Tire ("Michilen"));
           pole.pop(new Tire ("michelan"));
           
    }
}

