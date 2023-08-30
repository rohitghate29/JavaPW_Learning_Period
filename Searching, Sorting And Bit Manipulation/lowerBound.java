import java.util.*;

public class lowerBound {
    
    public static int findFirstOccurrence(int [] arr,int target){
            int low=0, high=arr.length -1;
            int result = -1;

            while(low <= high){
                //to avoid overflow
                int mid = low + (high-low)/2;
                if(arr[mid]==target){
                    result =  mid ;
                    //traverse to the left side of an array
                    high = mid - 1;
                }

                else if(arr[mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid +1;
                }
            }

            return result;
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();

        int arr [] =new int[n];
        System.out.println("Enter the elements.");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element.");
        int target = sc.nextInt();

        //Function Calling
        int result = findFirstOccurrence(arr,target);
        if(result == -1){
            System.out.print("target element is not present in an array");
        }
        else{
            System.out.println("Target element first occurrence is present at index: "+ result);
        }
    }
}
