
package pkg146.hw1;

import java.util.Iterator;

public class Queue<E>{
    
    Node last;
    protected int size = 0;
    
    public Queue(){
        Node last = new Node();
        
        last.next = last;
    }
        
    
    
    public class Node{
        E data;
        Node next;
        
        public Node(){data=null; next=null;}
        
        public Node(E data){this.data=data;}
    }
    
    public boolean isEmpty(){return size == 0;}
    
    public int size(){return size;}
    
    public void enqueue(E data){
        Node newNode = new Node(data);
        
        if (isEmpty()){last.next = newNode; size++;}
        else{
            last.next = newNode;
            newNode.next = last;
            size++;
        }
    }
    
    public E dequeue(){
        E data =  last.next.data;
        last.next = last.next.next;
        
        if (last.next == last){last = null;}
        
        size--;
        return data;
    }
}
