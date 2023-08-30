// Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
// Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
// Output 1: 6
// Input 2: arr = [ 0 0 0 0 0 1 1]
// Output 2: 2


//Time Complexity: O(n)
//Space Complexity: O(1)

public class q3 {

    public static int countNum(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] = {0,0,0,0,1,1,1,1,1,1};
        System.out.println("Output: "+ countNum(arr));

        int arr1 [] = {0,0,0,0,0,1,1};
        System.out.println("Output: " + countNum(arr1));
    }
}
