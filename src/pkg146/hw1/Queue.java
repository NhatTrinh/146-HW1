
package pkg146.hw1;

import java.util.LinkedList;

public class Queue<E> {
    
    Node<E> last;
    
    public Queue(){
        LinkedList <E> Queue = new LinkedList<>();
        Node <E> first = new Node<>();
        Node <E> last = new Node<>();
        
        
    }
    
    public static class Node<E>{
        E data;
        Node next;
        Node previous;
    }
    
    public static void enqueue(){
        
    }
    
    public static Node dequeue(){
        
    }
    
    
    public static void setNext(Node current, Node arg){current.next = arg;}
    
    public static Node getNext(Node arg){return arg.next;}
    
    public static Node getPrevious(Node arg){return arg.previous;}
    
    public static void setPrevious(Node current, Node arg){current.previous = arg;}
}
