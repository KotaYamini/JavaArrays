import java.util.Scanner;

public class ReversePartOfArray {
    public static void main(String[] args) {
        /*
        * Given an Array A[], starting index B and ending index C.Reverse an array from index B to index C.
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for(int i=0;i<N; i++){
            A[i] = scanner.nextInt();
        }
        int B= 1; // starting index
        int C= 3; // ending index


        reversePartOfArray(A, B, C);
    }

    public static void reversePartOfArray(int[] A, int B, int C){
        int temp = 0;
        int i =B;
        int j =C;
        while (i< j){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        for(int k=0; k<A.length; k++){
            System.out.println(A[k]);
        }
    }
}