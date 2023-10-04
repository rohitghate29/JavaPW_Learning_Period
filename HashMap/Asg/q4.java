// Q4. Given an array nums of size n, return the majority element.

// Input: 4,2,7,1,9
// Output: 9


package Asg;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class q4 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //TreeMap will sort the array
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        for(int i=0;i<n;i++){
            tmap.put(arr[i], 1);
        }
        //because the array is sorted last element will be the majority element
        System.out.println(tmap.lastEntry().getKey());
    }    
}
