/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Caller {
    String name;
    int id;
    static int nextid=0;
    public Caller (String mk)
    {
        name=mk;
        nextid++;
        id = nextid;
    }
    public String toString()
    {
        return ("id: " + id + "name: " +name);
    }
}

