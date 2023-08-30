// Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
// is not found in the array, report that as well.
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 5
// Output: Target 5 occurs 3 times
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 6
// Output: Target 6 occurs 2 times


//Time Complexity: O(n)
//Space Complexity: O(1)

public class q4 {

    public static int countNum(int arr[], int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count += 1;
            }
        }
        if(count == 0){
            System.out.println("Target "+ target +" Occurs 0 times");
        }
        return count ;
    }
    public static void main(String[] args) {
        
        int nums[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println("Target "+ target +" occurs " + countNum(nums, target) + " times");

        int nums1[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target1 = 6;
        System.out.println("Target "+ target1 +" occurs " + countNum(nums1, target1) + " times");

    }
}
