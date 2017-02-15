package pkg146.hw1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Move-to-front. 
 * Read in a sequence of characters from standard input and maintain the characters 
 * in a linked list with no duplicates. When you read in a previously unseen character, 
 * insert it at the front of the list. When you read in a duplicate character, delete it 
 * from the list and reinsert it at the beginning. Name your program MoveToFront: it implements 
 * the well-known move-to-front strategy, which is useful for caching, data compression, and many 
 * other applications where items that have been recently accessed are more likely to be reaccessed.
*/

import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class moveToFront {
    
    LinkedList myLL;
    HashMap myHM;
    Scanner in = new Scanner(System.in);
    
    public moveToFront(){
        myLL = new LinkedList();
        myHM = new HashMap();
    }
    
    
    public static void readInput(){
        System.out.println("Enter a sequence of characters: ");
        String input = in.next();
        char current;
        
        for (int i = 0; i < input.length();i++){
            current = input.charAt(i);
            if (!myHM.containsKey(current)) {
                myHM.put(current,true);
                myLL.add(current);
            }
            else{
                myLL.remove(current);
                myLL.addFirst(current);
            }
        }
    }
    
    public static void print(){
        Iterator myIter = myLL.iterator();
        while (myIter.hasNext()){
            System.out.println(myIter.next());
        }
    }
        
        public static void main (String [] args){
            readInput();
            print();
            
        
            
        }
    }
    
    
    
}
