import java.util.Arrays;
import java.util.Scanner;

// Using Brute force approach.

//Time complexity : O(m*n)
//Space complexity : O(1)
public class prefixSum2D {

    public static int findSumMatrix(int [][]arr, int r1, int r2, int c1, int c2){
        int sum = 0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum += arr [i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();

        System.out.println("Enter number of columns");
        int n = sc.nextInt();

        int arr [][] = new int [m][n];

        System.out.println("Enter the matrix elements");
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int r1,r2,c1,c2;
        System.out.println("Enter the r1 coordinate");
        r1 = sc.nextInt();
        
        System.out.println("Enter the c1 coordinate");
        c1 = sc.nextInt();

        System.out.println("Enter the r2 coordinate");
        r2 = sc.nextInt();
        
        System.out.println("Enter the c2 coordinate");
        c2 = sc.nextInt();
        
        //Function Calling 
        int result = findSumMatrix(arr, r1, r2, c1, c2);
        System.out.println("Sum of elements of given coordinates is: "+ result);

    }
    
}
