package beginnerContestThree;

/*
* Given 2D Array A of size N*N return an array in which arr[i] have the sum of ith diagonal elements from 2D array
*
* NOTE
* 1 Diagonal starting from 0th row or last column
* 2 Diagonal direction Top Right Bottom left
* */

import java.sql.Array;

public class TwoDimensionArraySum {
    public static void main(String[] args) {
    int A[][] = {{12,34, 56}, {76, 78, 34}, {90, 67, 45}};
    int N = A.length;
    int M = A[0].length;
    int ans[] = new int[N];
    // print diagnols starting from 0th row
        for(int j=0; j<M; j++){
            int rows = 0;
            int columns = j;
            int sum = 0;
            while(rows<N && columns>=0){
                sum = sum + A[rows][columns];
                rows++;
                columns--;
            }
            ans[j] = sum;
        }

        //print diagnols starting from last row
        for(int i=0; i<M; i++){
            int rows = 0;
            int columns = 0;
            int sum = 0;
            while(rows<N && columns>=0){
                sum = sum + A[rows][columns];
                rows++;
                columns--;
            }

            ans[i] = sum;
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ") ;
        }

    }
}
