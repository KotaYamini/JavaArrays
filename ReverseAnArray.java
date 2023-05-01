import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scn.nextInt();
        }

        // to reverse an array
        for(int i=N-1; i>=0; i--){
            System.out.println(A[i]+" ");
        }
    }
}
