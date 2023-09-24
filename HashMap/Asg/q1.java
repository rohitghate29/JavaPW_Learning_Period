// Q1. Implement a Map in java which takes the input and print the list in sorted order based on key.
// Input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay,
// Output: {1=Ram, 2=Lakshay, 4=Krrish, 5=Rahul, 7=lakshman}

package Asg;

import java.util.TreeMap;

public class q1 {
    public static void main(String[] args) {
        //TreeMap prints the output in sorted order based on the key values
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(5, "Rahul");
        tmap.put(7, "Lakshman");
        tmap.put(1, "Ram");
        tmap.put(4, "Krrish");
        tmap.put(2, "Lakshay");

        System.out.println(tmap);
    }
}
