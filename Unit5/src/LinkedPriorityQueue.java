/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author conn6070
 */
import java.util.ArrayList;

public class LinkedPriorityQueue implements Priorityqueue{
    private ArrayList list[];
    private int size;
    
    public LinkedPriorityQueue(int s)
    {
        size = s;
        list = new ArrayList[size];
        for(int x = 0;x < size;x++){
            list[x] = new ArrayList();
        }
    }
    
    public void enqueue(Object obj)
    {
        throw new IllegalStateException("Must give a priority");
    }
    
    public void enqueue(Object obj, int i) 
    {
        list[i].add(obj);
    }

    public Object dequeue() 
    {
        if(list[0].isEmpty())
        {
            if(list[1].isEmpty())
            {
                if(list[2].isEmpty())
                {
                    return "";
                }
                else return list[2].remove(0);
            }
            else return list[1].remove(0);
        }
        else return list[0].remove(0);
    }
    
    public int size()
    {
        return list.length;
    }
    
    public int queueSize(int i)
    {
        return list[i].size();
    }
    
    public boolean hasData()
    {
        for(int i = 0;i < size;i++)
        {
            if(queueSize(i) > 0)
                return true;
        }
        return false;
    }
}