import java.util.Scanner;

public class powerOfNumber {

    public static int powerOfelem(int a, int b) {
        int mid = 0, result = 0, finalResult = 0;
        if (b == 1) {
            return a;
        } else {
            mid = b / 2;
            result = powerOfelem(a, mid);
            finalResult = result * result;

            if (b % 2 == 0) {
                result = finalResult;
            } else {
                result = finalResult * a;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        System.out.println("a: "+a);
        int b = sc.nextInt();
        System.out.println("b: "+b);


        int result = powerOfelem(a, b);
        System.out.println("a^b is: " + result);
    }
}
