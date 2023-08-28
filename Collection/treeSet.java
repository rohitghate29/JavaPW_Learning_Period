import java.util.*;

public class treeSet {

    //TreeSets contains only single type of data in one Set.
    //It can not allow duplicate values
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(175);

        System.out.println(ts);
        
        ts.add(25); // Duplicate values are not allowed in TreeSet
        System.out.println(ts); 

        TreeSet ts2 = new TreeSet();
        ts2.add("H");
        ts2.add("e");
        ts2.add("l"); // Duplicate Value
        ts2.add("l");
        ts2.add("o");
        System.out.println(ts2);

    }
}
