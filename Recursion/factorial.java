import java.util.*;

public class factorial {

    static int findFact(int n) {
        int result = 0;
        //Base Case Condition
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            result = n * findFact(n-1); 
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        //Function Calling
        int result = findFact(n);
        System.out.println("Factorial of given number is: "+ result);

        sc.close();
    }
}