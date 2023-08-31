// Q1 : Given an integer, find out the sum of its digits using recursion.
// Input: n= 1234
// Output: 10
// Explanation: 1+2+3+4=10

public class q1{

    //Function Definition
    public static int sumOfDigits(int n){
        int result = 0;
        // 1. Base case conditon
        if(n == 0){
            return 0;
        }
        // 2. Recursive function calling
        else{
            result = (n % 10) + sumOfDigits(n/10);
        }
        return result;
    }
    
     public static void main(String []args){
         int n = 1234;
         //Function calling
         int result = sumOfDigits(n);
         System.out.println("Output: "+result);
     }
}
