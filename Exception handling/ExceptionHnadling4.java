import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHnadling4 {
    public static void main(String[] args) {
        int num =0;
        
        
        // try with resource 
        // this is the upgraded version of finally
        try(Scanner sc = new Scanner(System.in);) 
        {
            num = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a Number");
        }


        // finally {
        //     sc.close();  //this code will always run.
        //     System.out.println("Resource closed");
        // }

        System.out.println(num);
    }
}
