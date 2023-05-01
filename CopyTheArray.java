public class CopyTheArray {
    public static void main(String[] args) {
    /*
    * You are given a constant array A and an integer B.
    * You are required to return another array where outArr[i] = A[i] + B.
    * */
        int[] A = {2,4,5,7,8};
        int X = 1;
        int[] output = solve(A, X);
        for (int j : output) System.out.print(j + " ");

    }

    public  static  int[] solve(final  int[] A, int B){
        int N = A.length;
        int[] outArr = new int[N];

        for(int i=0; i<N; i++){
            outArr[i] = A[i] + B;
        }
        return outArr;
    }
}
