public class binarySearch {

    // Function Definition
    public static int binarySearch(int arr[], int low, int high, int x){
        int result = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                //traverse right side of an array
                return binarySearch(arr, mid+1, high, x);
            }
            else {
                //traverse left side of an array
                return binarySearch(arr, low, mid-1, x);

            }
        }
        return result;
    }
    public static void main(String []args ){
        int arr [] = {10,22,43,55,76,98,112,123};
        int low = 0;
        int high = arr.length - 1;
        int x = 76;

        // Function Calling
        int result = binarySearch(arr,low,high,x);
        System.out.println("The element is at index : " + result);
    }
}
