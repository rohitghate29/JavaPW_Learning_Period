// Q2. Implement a Map in java which takes the input and print the list in sorted order based on value
// input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay,
// output: {Rahul=5, krrish=4, lakshay=7, lakshman=2, ram=1}

package Asg;

import java.util.TreeMap;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of key-value pairs: ");
        int n = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        System.out.println("Enter the key-value pairs: ");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(value, key);
        }
        System.out.println(map);
    }
}
