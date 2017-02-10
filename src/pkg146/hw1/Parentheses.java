/**
 * Created by Nhat on 2/7/17.
 */

package pkg146.hw1;

import java.util.Stack;
import java.util.Scanner;

public class Parentheses {
    static Stack<String> stack = new Stack<String>();
    static Scanner in = new Scanner(System.in);

    public static String readInput() {
        System.out.println("Enter parentheses: ");
        String input = in.next();
        return input;
    }

    public static void evaluate(String input){
        String stringElem;
        Boolean isUnbalanced = false;
        
        int i = 0;
        int [] popIndexes = new int[input.length()];
       
        while (isUnbalanced == false && i < input.length()){
            stringElem = input.substring(i,i+1);
            System.out.println("substring: " + stringElem);
            
            if (stringElem.compareTo("[") == 0)
                stack.push("]");
            else if (stringElem.compareTo("{") == 0)
                stack.push("}");
            else if (stringElem.compareTo("<") == 0)
                stack.push(">");
            else if (stringElem.compareTo("(") == 0)
                stack.push(")");
            if (stack.search(stringElem) == -1 && i >= 1 && stack.isEmpty() == false){
                isUnbalanced = true;
                System.out.println("FALSE");
            }
            i++;
        }
        
        
    }

    public static void main (String args[]){
        String userInput = readInput();
        evaluate(userInput);
    }


}