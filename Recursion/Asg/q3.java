// Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

public class q3 {

    //Function Definition
    public static int printMax(int arr[],int index){
        if (index >= arr.length) {
            return Integer.MIN_VALUE;
        }

        int maxElem = printMax(arr, index + 1);

        return Math.max(arr[index], maxElem);
    }
    public static void main(String []mew){
        int arr[] = {13,1,-3,22,5};

        int max = printMax(arr, 0);
        System.out.println("Maximum value in the array: " + max);
    }
}
