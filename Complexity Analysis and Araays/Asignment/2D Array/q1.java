// Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.
// Input 1:

// Output :
// number of positive numbers = 7
// number of negative numbers = 6
// number of odd numbers = 7
// number of even numbers = 9
// number of 0 = 3

import java.util.*;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of m: ");
        int m = sc.nextInt();

        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        int arr [][] = new int[m][n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                int num = arr[i][j];

                if (num > 0) {
                    ++positive;
                } else if (num < 0) {
                    ++negative;
                } else {
                    ++zero;
                }
                if (num % 2 != 0) {
                    ++odd;
                } else {
                    ++even;
                }
            }
        }

        System.out.println("number of positive numbers = " + positive);
        System.out.println("number of negative numbers = " + negative);
        System.out.println("number of odd numbers = " + odd);
        System.out.println("number of even numbers = " + even);
        System.out.println("number of 0 = " + zero);

        sc.close();
    }
}
