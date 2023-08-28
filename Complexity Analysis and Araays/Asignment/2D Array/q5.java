// Q5: Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

// Output : 3 5 5 6 37 7 6 4 3

public class q5 {

    public static void displayMiddleElements(int[][] matrix, int size) {
        if (size % 2 == 0) {
            System.out.println("The matrix size should be odd.");
            return;
        }

        int middle = size / 2;

        // Display middle row
        System.out.println("Middle Row:");
        for (int element : matrix[middle]) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Display middle column
        System.out.println("Middle Column:");
        for (int[] row : matrix) {
            System.out.println(row[middle]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,2,3,4,5 },
                { 3,4,5,6,7 },
                { 7,6,5,4,3 },
                { 8,7,6,5,4 },
                { 1,2,37,8,0 }
        };

        int size = matrix.length;
        displayMiddleElements(matrix, size);
    }
}

