package beginnerContestThree;

import java.util.Scanner;

public class FrequencyOfElementsinOneDArray {
    public static void main(String[] args) {
        int []A = {1,2,3,4,4,4,4,2};
        int countOfElements = 0;
        for(int i=0; i<A.length; i++){
            if(frequencyOfElements(A, A[i])  == 1){
                countOfElements++; // unique elements
            }
        }
        int freq = A.length - countOfElements; // Total array length - unique elements = repeatedElementsCount
        System.out.print(freq);

    }

    public static int frequencyOfElements(int arr[], int arrEle){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arrEle){
                count++;
            }
        }
        return count;
    }
}
