public class productOfElementsInOneDArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        long productIn1DArray = productOfAllElements(arr);
        System.out.println(productIn1DArray);
    }

    public static long productOfAllElements(int[] arr){
        long product = 1L;
        for (int j : arr) {
            product = product * j;
        }
        return  product;
    }
}
