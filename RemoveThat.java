import java.util.Scanner;

public class RemoveThat {
    /*
    * Write a program to input N numbers array from user and
    * an integer X and print the array by deleting element at specified position X.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i =0;i <N; i++){
            arr[i] = scanner.nextInt();
        }

        int X = scanner.nextInt(); // element
        int index = X-1; // index

        for(int j = index; j<N-1; j++){
            arr[j] = arr[j+1];
        }

        for(int k=0; k<N-1; k++){
            System.out.println(arr[k]+" ");
        }
    }
}
