import java.util.Scanner;

public class AverageRainFall {
    public static void main(String[] args) {
//        Create an array of size N, which can store rainfall size for N days.
//        Take rainfall measurement for N days from user and print floor of average rainfall for N days.
//        Note :
//        1. Rainfall measurement is non-decimal number.
//        2. For Floor of number use Math.Floor(NUM) function.
//        3. Average = (Sum of entries) / (number of entries)
//        0 < N <= 10000
//        0<= arr[i] <= 50

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] T = new int[N];
        for(int i=0; i<T.length; i++){
            T[i] = scanner.nextInt();
        }

        rainFall(T);
    }

    public static void rainFall(int[] arr){
        int sum = 0;
        double avg = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        avg = Math.floor(sum/ arr.length);
        System.out.println((int)avg);
    }
}
