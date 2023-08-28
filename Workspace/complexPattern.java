public class complexPattern {
    public static void main(String[] args) {
        int n = 21;
        // First pattern 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1 || i + j == (n - 1) / 2
                        || i - j == (n - 1) / 2 || i + j == n - 1 + (n - 1) / 2 || j - i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("     ");

            // Second pattern 
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || i + j == n - 1 + (n - 1) / 2
                        || j - i == (n - 1) / 2 || i==0 || j==0 || i==n-1 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");

            // Third Pattern 
            for (int j = 0; j < n; j++) {
                if (i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
                    j==n-1 && i<=(n-1)/2 || i==0 && j>=(n-1)/2 || j-i>=(n-1)/2 ||
                    i==(n-1) && j<=(n-1)/2 || i>=(n-1)/2 && j==0 || i-j>=(n-1)/2 ||
                    i==n-1 && j>=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2) 
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
