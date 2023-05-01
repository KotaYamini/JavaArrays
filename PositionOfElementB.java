import java.util.Scanner;

public class PositionOfElementB {
//    Given an array A[] and an element B, return the index of element B in array (0 based indexing).
//    If element is not present in array, return -1.
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int B =10; //let say given element
    int N = scanner.nextInt();
    int[] A = new int[N];

    for(int i=0; i<A.length; i++){
        A[i] = scanner.nextInt();
    }
    System.out.println(positionOfB(A,B));
}

public  static  int positionOfB(int[] A, int B){

    for(int i=0; i<A.length; i++){
        if(A[i] == B){
            return i;
        }
    }
    return -1;
}
}
