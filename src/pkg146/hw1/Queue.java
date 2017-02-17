
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

        public Node(E data){this.data=data; next=null;}
    }

    public boolean isEmpty(){return size == 0;}

    public int size(){return size;}

    public void enqueue(E data){
        Node newNode = new Node(data);
        
        if (last == null){
            last = newNode;
            last.next = last;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public E dequeue(){
        
        if (isEmpty())
            return null;
        
        E data =  last.next.data;
        
        if (last == last.next){ last = null; }
        else{ last.next = last.next.next; }
        size--;
        
        return data;
    }
    
    /* MAIN METHOD
    public static void main (String [] args){
        Queue myQ = new Queue();
        myQ.enqueue(5);
        myQ.enqueue(7);
        System.out.println(myQ.dequeue() + " " + myQ.dequeue());
    }
    */
    /* INPUT
        5 7
    */
    /* OUTPUT
        5 7
    */
}

