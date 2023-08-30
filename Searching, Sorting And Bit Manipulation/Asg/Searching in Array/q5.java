// Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
// with itself.
// Example 1:
// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
// Example 2:
// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.



//Time Complexity: O(n)
//Space Complexity: O(1)

public class q5 {

    public static boolean peerfectSquare(int num){
        long low = 0, high = num;
        while(low <=high){
            long mid = low + (high - low)/2;
            long square = mid * mid;

            if(square == num){
                return true;
            }
            else if(square < num){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false; //No perfect square number found
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println("Input: "+ num);
        System.out.println("Output: "+ peerfectSquare(num));
        
        int num1 = 14;
        System.out.println("Input: "+ num1);
        System.out.println("Output: "+ peerfectSquare(num1));

    }    
}
