// Q3.Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.

// Input: 1,2,3,4
// Output: No
// ------------------
// Input: 1, 2, 3, 4, 1
// Output: Yes.


package Asg;

import java.util.HashMap;
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int num[] = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> hmap = new HashMap();
        int flag = 0;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(num[i])){
                System.out.println("Yes");
                flag = 1;
                break;
            }
            hmap.put(num[i], 1);
        }
        if (flag == 0){
            System.out.println("No");
        }
    }
}
