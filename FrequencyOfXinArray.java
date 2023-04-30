import java.util.Scanner;

public class FrequencyOfXinArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int B = 50;
        int[] A = new int[N];
        for(int i=0; i< A.length; i++){
            A[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] == B){
                count++;
            }
        }
        System.out.println(count);
    }
}
