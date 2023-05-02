import java.util.Scanner;

public class ReverseArrayToGetNewArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
       reverseArray(A);
    }

    public static void reverseArray(int[] arr){
        int N = arr.length;
        int[] ans= new int[N];
        int i =0; // original Array traversing
        int j =N-1; // reverse Array traversing
        while(i< N){
            ans[i] = arr[j];
            i++;
            j--;
        }

        for(int k=0; k< ans.length; k++){
            System.out.println(ans[k]);
        }
    }
}
