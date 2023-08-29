import java.util.*;

public class fibonacci {

    static int fibonacciSeries(int n){
        int result = 0;
        //1. Base Case condition
        if(n <=1) {
            return n;
        }
        //2. Recursive Function calling
        else {
            result = fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of fibonacci series: ");
        int n = sc.nextInt();

        //Function calling 
        int result = fibonacciSeries(n);
        System.out.println("The fibonacci number is: "+ result);
        sc.close();
    }
}
