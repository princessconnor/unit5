/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public interface Queue{
	public Object peekFront();
	public Object dequeue();
	public void enqueue(Object o);
	public int size();
}
