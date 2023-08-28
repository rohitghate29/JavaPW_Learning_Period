// Time Complexity: O(N) where N = length of the array
// Auxiliary Space: O(1)

public class missing {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,6,5,7};
        int n = arr.length;

        //Sum of natural numbers
        int sumOFNaturalNumbers = ((n+1)*(n+2))/2;
        int sum = 0;
        //Sum of current elements present in array
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        //Missing element in an array
        int missing_ele = 0;
        missing_ele = sumOFNaturalNumbers - sum;
        System.out.println("The Missing Element is : "+missing_ele);

    }
}
