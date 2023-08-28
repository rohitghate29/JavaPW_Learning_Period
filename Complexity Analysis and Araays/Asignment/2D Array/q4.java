// Q4: Write a program to find the largest element of a given 2D array of integers.
// Input 1:

// Output : 9


public class q4 {
    static public void main(String[] args) {
        
        int [][] arr = {
            {1,2,4,0 },
            {2,5,7,-1},
            {4,2,6,9}
        };
        int m=arr.length;
        int n = arr[0].length;
        int max =-1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (max < arr [i][j]){
                    max = arr[i] [j];
                }
            }
        }
        System.out.println(max);
    }
}
