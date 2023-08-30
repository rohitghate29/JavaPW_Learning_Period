// Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
// not present return -1.
// Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
// Output 1: 6
// Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
// Output 2: -1

import java.util.Scanner;

public class q2 {

    public static int findLastOccurrence(int arr[],int target){
        int result = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,3,4,4,5,6,6,6,6};
        int target = 4;
        System.out.println("Target element last occurrence is at index: "+ findLastOccurrence(arr,target));

        int arr1 [] = {2,2,2,6,6,18,29,30,30,30};
        int target1 = 15;
        System.out.println(findLastOccurrence(arr1,target1));
    }
}
