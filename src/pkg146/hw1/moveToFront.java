
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
    
    
    

