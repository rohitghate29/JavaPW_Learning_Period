package Asignment;

// Q2: Write a program to traverse over the elements of the array using for each loop and print all even
// elements.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 34 54


public class printEven1D {
    public static void main(String[] args) {
        int arr1[] = {4,3,6,7,1};
        for(var n:arr1) {
            if (n%2==0){
                System.out.print(n+" ");
            }
        }
    }
}
