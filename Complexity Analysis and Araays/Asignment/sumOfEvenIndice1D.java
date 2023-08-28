package Asignment;

// Q1: Write a program to print the sum of all the elements present on even indices in the given array.
// Input 1: arr[] = {3,20,4,6,9}
// Output 1: 16

public class sumOfEvenIndice1D {
    public static void main(String[] args) {
        int [] arr = {4,3,6,7,1};
        int n = arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum of elements present on even indices in the array is: "+sum);
    }
}
