// Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.
// Input 1:

// Output 1: 1 3 5 7 9

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m =3;
        int n =3;
        int arr1 [][]= new int[m][n];

        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int i,j;
        System.out.println("Elements above secondary diagonal are as follows : ");    
        for(i = 0 ; i < m ; i++){    
            for(j = 0 ; j < n ; j++){    
                if(i+j!= 1 && i+j != 3)System.out.print(arr1[i][j] + "  ");
            }    
        } 
    }
}
