/*
Move-to-front. 
Read in a sequence of characters from standard input and maintain the characters in a linked list with no duplicates. 
When you read in a previously unseen character, insert it at the front of the list. 
When you read in a duplicate character, delete it from the list and reinsert it at the beginning. 
Name your program MoveToFront: it implements the well-known move-to-front strategy, which is useful for caching, data compression, and many other applications where items that have been recently accessed are more likely to be reaccessed.
*/
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class MoveToFront {
    private Scanner in = new Scanner(System.in);
    
    public LinkedList readInput(){
        LinkedList myLL = new LinkedList();
        
        System.out.println("Enter a sequence of characters: ");
        String input = in.next();
        char current;
        
        for (int i = 0; i < input.length();i++){
            current = input.charAt(i);
            if (myLL.contains(current) == true && myLL.isEmpty() == false){
                myLL.removeFirstOccurrence(current);
                myLL.addFirst(current);
            }
            else
                myLL.addLast(current);
        }
        return myLL;
    }
    
    public void print(LinkedList myLL){
        Iterator myIter = myLL.iterator();
        
        while (myIter.hasNext()){
            System.out.print(myIter.next() + " ");
        }
        System.out.print("\n");
    }
    
    /*  MAIN METHOD
    public static void main (String [] args){
        MoveToFront myMTF = new MoveToFront();
        LinkedList myLL = myMTF.readInput();
        myMTF.print(myLL);
    }
    */
}
    
    
    

