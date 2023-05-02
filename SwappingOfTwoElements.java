import java.util.Scanner;

public class SwappingOfTwoElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }

        int i =0;
        int j =N-1;
        int temp = 0;
        while (i<j){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

        for(int k= 0;k<A.length; k++){
            System.out.println(A[k]);
        }
    }
}
