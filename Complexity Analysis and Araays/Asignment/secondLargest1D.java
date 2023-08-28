package Asignment;

// Q4: Write a program to find out the second largest element in a given array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 54
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 6

public class secondLargest1D {

    public static int findSecondLargest(int []arr3){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int element : arr3){
            if (element >firstLargest){
                // swaping values of two variables
                secondLargest = firstLargest;
                firstLargest = element;
            }
            else if(element > secondLargest && element != firstLargest){
                secondLargest= element ;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        
        int arr3[] = {4,3,6,7,1};
        int secondLargest = findSecondLargest(arr3);
        System.out.println("Output 1: " + secondLargest);
    }
}
