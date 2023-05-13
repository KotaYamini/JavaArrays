package beginnerLanguageTest;

public class maxProductPair {
    public static void main(String[] args) {
        int A[] = {7,8,2,1,3,4,5,9};
        System.out.println(solve1(A));
        //System.out.println(solve2(A));
    }
// Approach 1
    static int solve1(int[] A) {
        int max1 = Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE; int min2 = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            if(A[i] > max1){
                max2 = max1;
                max1 = A[i];
            }else if(A[i]> max2){
                max2 = A[i];
            }

            if(A[i] < min1){
                min2 = min1;
                min1 = A[i];
            }else if(A[i] < min2){
                min2 = A[i];
            }
        }




        int product = Math.max(max1*max2, min1*min2);
        return product;
    }

    // Approach -2
     static  int solve2(int[] A) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i< A.length; i++){
            for(int j= i+1; j< A.length; j++){
                int product = A[i] * A[j];

                if(product >max){
                    max = product;
                }
            }
        }
        return max;
    }
}
