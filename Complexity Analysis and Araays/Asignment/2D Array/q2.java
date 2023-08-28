// Q2: write a program to print the elements above the secondary diagonal in a user inputted
// square matrix.
// Input 1:

// Output : 1 2 4

import java.util.Scanner;

public class q2 {
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
                if(i + j < m - 1)System.out.print(arr1[i][j] + "  ");
            }    
        } 
        
    }
}
