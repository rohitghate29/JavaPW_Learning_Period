public class ReversalOfArray {
    public static void main(String[] args) {

        int array[] = { 2, 4, 8, 10, 12, 14 };
        int n = array.length;

        // My approach
        // for(int i=n-1;i>=0;i--){
        //     System.out.print(array[i]+" ");
        // }

        // 2nd approach
        // This approach is better than 1st approach
        for (int i = 0; i < n / 2; i++) {
            // Swap the elements between array[i] and array[n-i-1]
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        System.out.println("Reversal of an array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
