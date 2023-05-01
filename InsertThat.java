import java.util.Scanner;

public class InsertThat {
    /*
    * Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X.
    * X is based on 1-based indexing.
    * Note: When an element is inserted at position X,
    * all elements that were already present at position >= X, gets shifted to one position right, not replaced.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for(int i=0; i<A.length; i++){
            A[i] = scanner.nextInt();
        }

        int X = scanner.nextInt(); // position
        int Y = scanner.nextInt(); // element

        int index = X-1; // index


        int ans[] = new int[N+1]; // new array

        for(int j=0; j<index; j++){ // fill the elements into  new  array
            ans[j] =  A[j];
        }

        ans[index] = Y; // to insert the new element into the array

        for(int k=index; k<N; k++){ // to insert all the elements after index+1
            ans[k+1] = A[k];
        }

        for(int h=0; h<ans.length; h++){
            System.out.println(ans[h]+" "); // to print space N +1 elements
        }
    }
}
