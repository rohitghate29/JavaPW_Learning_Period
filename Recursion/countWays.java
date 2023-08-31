import java.util.*;

public class countWays {

    //function Definition
    public static int countNumbers(int n){
        int result = 0; 
        if( n<=1 ){
            return 1;
        }
        else{
            result = countNumbers(n-1) + countNumbers(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n = sc.nextInt();

        //function calling
        int result = countNumbers(n);
        System.out.println("No of ways are: "+result);
        sc.close();
    }
}
