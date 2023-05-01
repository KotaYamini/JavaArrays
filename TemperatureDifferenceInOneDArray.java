import java.util.Scanner;

public class TemperatureDifferenceInOneDArray {
    public static void main(String[] args) {
        /*
        * Create an array of size N, which can store  temperature for N days.
        * Take temperature for N days from user and print value of Max-Min.
        * */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] T = new int[N];

        for(int i=0; i<T.length; i++){
            T[i] = scanner.nextInt();
        }

        maxAndMinTemp(T);
    }

    public static void maxAndMinTemp(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int N= arr.length;

        for(int i=0; i<N; i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max - min);
    }
}