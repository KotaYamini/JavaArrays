package beginnerLanguageTest;

public class SumOfMaxAndMinInTwoDArray {
    public static void main(String[] args) {
        int A[][] = {{10,20,30}, {15,25,35}, {27,17,22}};
        System.out.println(solve(A));

    }

     static int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        if(N == 0|| M == 0){
            return 0;
        }
        int sum = 0;
        // iterate over each row
        for(int i=0; i<N; i++){
            int max = A[i][0];
            int min = A[i][0];

             //iterate over each column
            for(int j=0; j<M; j++){
                if(A[i][j] > max){
                    max = A[i][j];
                }else if(A[i][j] < min){
                    min = A[i][j];
                }
            }

            sum = sum +max-min;
        }
        return sum;
    }
}
