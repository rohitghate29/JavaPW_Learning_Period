// Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].


public class q4 {

    public static int sumArray(int arr[],int index){
        // Base case condition
        if(index >=arr.length){
            return 0;
        }

        // Recursive function calling
        int sum = sumArray(arr, index+1);
        return arr[index] + sum;
    }
    public static void main(String[] args) {
        
        int arr [] = {92,23,15,-20,10};

        int sum = sumArray(arr,0);
        System.out.println("Sum of the array is: "+sum);
    }
}
