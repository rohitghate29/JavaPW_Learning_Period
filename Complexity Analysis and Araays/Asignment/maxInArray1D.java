package Asignment;

// Q3: Write a program to calculate the maximum element in the array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 65
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 7

public class maxInArray1D {

    public static int getMaxElementOfArray(int []arr2){
        int maxElement = arr2[0];
        for (int element : arr2) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }
    public static void main(String args[]){
        
        int arr2[] = {4,3,6,7,1};
        System.out.println("Maximum Element is " + getMaxElementOfArray(arr2));
    }
}
