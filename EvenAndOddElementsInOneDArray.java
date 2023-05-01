import java.util.Scanner;

public class EvenAndOddElementsInOneDArray {
    public static void main(String[] args) {
        /*
        * You are given T(number of test cases) integer arrays.
        * For each array A, you have to find the value of absolute difference between the counts of even and odd elements in the array.
        * */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++){
            int N = scanner.nextInt();
            int[] A = new int[N];
            for(int j=0; j<A.length; j++){
                A[j] = scanner.nextInt();
            }

            oddEvenCountDiff(A);
        }
    }

    public  static  void oddEvenCountDiff(int[] arr){
        int oddCount = 0;
        int evenCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println(Math.abs(evenCount- oddCount));
    }
}
