//Approach: Modified Binary Search
//Time complexity: O(log n)
//Space Complexity: O(1)

import java.util.Scanner;

public class squareRoot {

    public static int findSquareRoot(int num) {
        int low=0,high=num,result=-1;

        //Modified Binary search
        while(low<=high) {
            int mid = low + (high - low)/2;
            int val = mid * mid;

            if(val == num){
                //Perfect square root
                return mid;
            }
            else if(val < num){
                //Print the floor value incase the number is not a perfect square root
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root: ");
        int num = sc.nextInt();

        int result = findSquareRoot(num);
        System.out.println("Square root of the given number is: "+result);
    }
}
