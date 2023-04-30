import java.util.Scanner;

public class sumOfOneDimensionArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++){
            sum =  sum + arr[i];
        }
        System.out.print(sum);
    }

}
