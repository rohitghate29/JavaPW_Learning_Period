import java.util.Arrays;
import java.util.Scanner;

public class prefixSumOA2D {
    public static int findSumMatrix(int[][] arr, int r1, int r2, int c1, int c2) 
    {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

     public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2) 
    {
        int sum = 0, up = 0, left = 0, repeated_region = 0, result1 = 0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];

        result1 = sum - up - left + repeated_region;
        return result1;
    }
    
    public static void prefixSumMatrix(int[][] arr) 
    {
        int m = arr.length;
        int n = arr[0].length;

        // traverse the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        // traverse the array column-wise to calculate the column-wise prefix sum
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();

        System.out.println("Enter number of columns");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter the matrix elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int r1, r2, c1, c2;
        System.out.println("Enter the r1 coordinate");
        r1 = sc.nextInt();
        
        System.out.println("Enter the c1 coordinate");
        c1 = sc.nextInt();

        System.out.println("Enter the r2 coordinate");
        r2 = sc.nextInt();

        System.out.println("Enter the c2 coordinate");
        c2 = sc.nextInt();

        // Function Calling
        // int result = findSumMatrix(arr, r1, r2, c1, c2);
        // System.out.println("Sum of elements of given coordinates is: "+ result1);

        prefixSumMatrix(arr);
        int result1 = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of element of given rectangle is: " + result1);

    }

}
