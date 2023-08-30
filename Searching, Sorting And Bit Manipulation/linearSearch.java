// Time complexity: O(N)
// Space complexity: O(1)

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Size of Array
        System.out.println("Enter the number of elements present in an array.");
        int n = sc.nextInt();

        //Array Declaration and Inputting Elements into it
        System.out.println("Enter the elements: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Getting target value
        System.out.println("Enter the target element present in the array");
        int x = sc.nextInt();

        //Implementation of Linear Search
        int indx = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == x) {
                indx = i;
                break;
            }
        }

        if(indx == -1){
            System.out.println("The element is not present in an array");
        }
        else{
            System.out.println("The element found at the index: "+indx);
        }
    }
}