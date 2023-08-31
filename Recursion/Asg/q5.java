// Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
// of every digit in that number raised to the power of total digits in that number is equal to the number.
// Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
// Input1 : 153
// Output1 : Yes
// Input 2 : 134
// Output2 : No

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    static boolean isArmstrongNumber(int n) {
        int numDigits = countDigits(n);
        return n == armstrongSum(n, numDigits);
    }

    static int armstrongSum(int n, int numDigits) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        return (int) (Math.pow(digit, numDigits) + armstrongSum(n / 10, numDigits));
    }
}
