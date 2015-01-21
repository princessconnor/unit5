/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author conn6070
 */
public class Patient 
{
     private String name;
    private String condition;
    
    public Patient(String nm, String c)
    {
        name = nm;
        condition = c;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String checkCond(){
        return condition;
    }
    
    public boolean setName(String nm)
    {
        if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
                }
    }
    
    public String toString()
    {
        return condition + " condition " + name + " ";
    }
}
