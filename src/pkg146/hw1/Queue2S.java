/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg146.hw1;

import java.util.Stack;
/**
 *
 * @author Nhat
 */
public class Queue2S <E> {
    private Stack <E> stack1 = new Stack <> ();
    private Stack <E> stack2 = new Stack <> ();
    
    public void enqueue(E data){
        stack1.push(data);
    }
    
    public E dequeue(){
        E data;
        
        if (stack2.isEmpty()){
            if(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        
        data = stack2.pop();
        return data;
    }
    
    public static void main (String [] args){
        Queue2S myQ2S = new Queue2S();
        
        myQ2S.enqueue(1);
        myQ2S.enqueue(2);
        
        System.out.println(myQ2S.dequeue() + " " + myQ2S.dequeue());
    }
}
