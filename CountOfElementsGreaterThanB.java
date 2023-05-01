import java.util.Scanner;

public class CountOfElementsGreaterThanB  {
//    Given an array A[] and an element B.
//    Return Count of element which are greater than B.
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int B = 9;
    int N = scn.nextInt();
    int[] A = new int[N];
    int count = 0;
    for(int i=0; i<A.length; i++){
        A[i] = scn.nextInt();
        if(A[i] > B){
            count++;
        }
    }

    System.out.println(count);
}
}
