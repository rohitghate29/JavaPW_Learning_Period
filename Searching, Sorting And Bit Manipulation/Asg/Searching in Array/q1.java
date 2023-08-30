// Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
// else print “Element not found in array”. Input the size of array, array from user and the element X from user.
// Use Linear Search to find the element.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt(); //size of an array
        int arr [] = new int[n]; 
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int x = sc.nextInt();
        int indx = 0;
        
        //Linear Search
        for(int i=0;i<n;i++){
            if (arr[i]==x){
                indx = i;
            }
        }
        if(indx !=0){
            System.out.println("Element found at index: "+ indx);
        }
        else {
            System.out.println("Element not found in array");
        }
    }
}