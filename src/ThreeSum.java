/*
3-SUM in quadratic time. Design an algorithm for the 3-SUM problem that takes time proportional to n^2 in the worst case. 
You may assume that you can sort the n integers in time proportional to n^2 or better.
*/

import java.util.HashMap;
import java.util.Arrays;

public class ThreeSum <K,V>{
    private HashMap <Integer,int[]> myHM = new HashMap<Integer,int[]>();
    private int [] myArr = {-3,-2,-1,0,1,2,2};

    public void find3S(){
        Arrays.sort(myArr);
        for (int i = 0; i < myArr.length - 2; i++){
            myHM.clear();
            if (i == 0 || myArr[i] > myArr[i -1]){
            for (int j = i+1; j < myArr.length;j++){
                if (myHM.containsKey(myArr[j])){
                   System.out.println(myArr[j] + "," + myHM.get(myArr[j])[0] + "," + myHM.get(myArr[j])[1]);
                   while (j < myArr.length - 1 && myArr[j] == myArr[j+1]){
                       j++;
                   }
                }
                else{
                    int [] pair = new int[2];
                    pair[0] = myArr[i];
                    pair[1] = myArr[j];
                    myHM.put(0-(pair[0]+pair[1]), pair);
                }

            }
            }
        }
    }

    /*  MAIN METHOD
    public static void main(String [] args){
        ThreeSum myTS = new ThreeSum();
        myTS.find3S();
    }
    */
    /* INPUT
        {-3,-2,-1,0,1,2,2}
    */
    /* OUTPUT
        2,-3,1
        2,-2,0
        1,-1,0
    */
}
