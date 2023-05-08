package beginnerContestThree;

import java.util.*;

/**
 * Given a Dynamic array of Integers A of Size
 * return a dynamic array of integers which contain
 * the odd negative integers from A in increasing order
 * Note: Dynamic arrays Arraylist
 */
public class OddNegativeIncrement {
    public static void main(String[] args) {
        ArrayList<Integer>  A = new ArrayList<Integer>(Arrays.asList(-15, -14, 17, 8, -8, -15, -1, 33, 93, -1, -1));

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<A.size(); i++){
            int ele = A.get(i);
            if(ele<0 && ele%2 != 0){
                ans.add(ele);
            }
        }
        System.out.println(ans);
    }
}
