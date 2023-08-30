//Time complexity: O(n^2)
//Space complexity: O(1)

import java.util.Arrays;

public class bubbleSort {

    public static void BubbleSort(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                //swapp arr[j],arr[j+1]
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            //to stop the loop, if the array is sorted
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        
        int arr [] = {20,50,10,12,45,67,90};
        //function Calling 
        BubbleSort(arr);
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }
}

