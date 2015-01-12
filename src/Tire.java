/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Tire {
    String make;
    int id;
    static int nextid=0;
    public Tire (String mk)
    {
        make=mk;
        nextid++;
        id = nextid;
    }
    public String toString()
    {
        return ("id: " + id + "make: " +make);
    }
}
