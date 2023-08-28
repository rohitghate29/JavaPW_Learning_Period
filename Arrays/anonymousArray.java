class calc {
    public int add(int nums[]) {
        
        int result = 0;
        for(int n : nums) {
            result = result + n;
        }
        return result;
    }
}

public class anonymousArray {
    public static void main(String[] args) {
        calc obj = new calc();
        // int nums[] = {4,6,4,3,7};
        int result = obj.add(new int[]{4,6,4,3,7}); //Anonymous array
        System.out.println(result);

        int myList[] = {3,2,3444,3};
        for(int i:myList) {
            System.out.print(i + " ");
        }
        System.out.println();

        int arr[] = {1, 2, 3, 4, 5};
        for ( int i = 0; i < arr.length - 2; ++i) {
            System.out.println(arr[i] + " ");
        }
    }
}
