/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public interface Stack{
	public Object peekTop();
	public Object pop();
	public void push(Object o);
	public int size();
}
