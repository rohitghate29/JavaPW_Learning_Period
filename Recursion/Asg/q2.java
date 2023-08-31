// Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
// Constraints : 0<=n<=1e6
// Input1 : n = 10
// Output 1 : -5
// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
// Input 2 : n = 5
// Output 2 : 3

import java.util.*;
public class q2 {

    //Function Definition
    public static int alternateSum(int n){
        int result = 0;
        // 1. Base case conditon
        if(n == 0){
            return 0;
        }
        // 2. Recursive function calling
        else{
            if(n%2==0){
            result = alternateSum(n-1) - n;
            }
            else {
            result = alternateSum(n-1) + n;
            }
        } 
        
        return result;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //Function calling
        int result = alternateSum(n);
        System.out.println("Output: "+result);
    }
}
