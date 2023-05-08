package beginnerContestThree;

/*
* Given an integer array A of size N return count of
elements which occurs more than one time in array
* */
public class FrequencyOfElementsinOneDArrayApp2 {
    public static void main(String[] args) {
        int []A = {1,2,5,3,7,4,5,4,7,4,2};
        int N = A.length;
        int countOfRepeated = 0;
        for(int i=0; i<N; i++){
            int count =0;
            for(int j=0; j<N; j++){
                if(A[j] == A[i]){
                    count++;
                }
            }
            if(count > 1){
                countOfRepeated++;
            }
        }
        System.out.println(countOfRepeated);
    }
}
