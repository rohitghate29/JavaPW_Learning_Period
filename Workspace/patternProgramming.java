import java.util.Scanner;

public class patternProgramming {
    public static void main(String[] args) {
        int n = 10;

        // Z
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || i == n - 1)
        // {
        // System.out.print("*");
        // }
        // else if (j == n - i - 1)
        // {
        // System.out.print("*");
        // }
        // else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 8
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == (n - 1) / 2 || j == n - 1 || i==n-1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // A
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == (n - 1) / 2
        // && j <= (n - 1) / 2 ||
        // j == (n - 1) / 2 && i > 0) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // D 
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == 0 && j < (n - 1) / 2 || j == 0 || i == n - 1 && j < (n - 1) / 2 || j == (n - 1) / 2 && i > 0 &&
        //                 i < n - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // I
        // for(int i=0; i<n; i++)
        // {
        // for(int j=0; j<n; j++)
        // {
        // if(i==0 || j==(n-1)/2 || i==n-1)
        // {
        // System.out.print("*");
        // }
        // else
        // {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // L
        // for(int i=0; i<n; i++)
        // {
        // for(int j=0; j<n; j++)
        // {
        // if(j==0 || i==n-1)
        // {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // E
        // for(int i=0; i<n; i++)
        // {
        // for(int j=0; j<n; j++)
        // {
        // if(i==0 || j==0 || i==(n-1)/2 || i==n-1)
        // {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // F
        // for(int i=0; i<n; i++){
        // for(int j=0; j<n; j++){
        // if(i==0 || j==0 || i==(n-1)/2)
        // {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // H
        // for(int i=0; i<n; i++)
        // {
        // for(int j=0; j<n; j++)
        // {
        // if(i==(n-1)/2 || j==0 || j==n-1)
        // {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

            // S
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( (i == 0 || i == n / 2
                || i == n - 1)) {
                    System.out.print("*");
                } 
                else if(i<n/2 && j==0) {
                    System.out.print("*");
                }
                else if(i>n/2 && j==n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // T
        // for(int i=0; i<n; i++)
        // {
        // for(int j=0; j<n; j++)
        // {
        // if(i==0 || j==(n-1)/2)
        // {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

    }
}
