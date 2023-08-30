import java.util.*;

public class alternationSumSeries {

    static int alternateSumFind(int n){
        int result = 0;
        if(n == 0){
            return 0;
        }
        else {
            if(n % 2 == 0){
                result = alternateSumFind(n-1) - n;
            }
            else {
                result = alternateSumFind(n-1) + n;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //function calling
        int result = alternateSumFind(n);
        System.out.println("Alternate sum is: "+ result);
    }

}
