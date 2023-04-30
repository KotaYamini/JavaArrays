import java.util.Scanner;

public class MaxAndMinofAnArray {
    public static void main(String[] args) {
        /*
        * Take input an array A of size N and write a program to print maximum and minimum elements of the input.
        *  The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.
        * */

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
<<<<<<< HEAD
        int A[] = new int[N];
=======
        int[] A = new int[N];
>>>>>>> b57b07f (staticSumof1Darray)

        for(int i=0; i<A.length; i++){
            A[i] = scn.nextInt();
        }

        System.out.println(minArr(A) + " " + maxArr(A));
    }

    public static int minArr(int[] arr){
        int N = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static int maxArr(int[] arr){
        int N = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return  max;
    }
}
