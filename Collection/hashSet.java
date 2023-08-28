import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
    
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);

        //We use LinkedHashSet to preserve order of insertion
        // i.e JVM will print the values in order as we given 
        LinkedHashSet hs2 = new LinkedHashSet();
    
        hs2.add(100);
        hs2.add("PWW"); //we can add multiple data in one set
        hs2.add(20);
        hs2.add(30);
        hs2.add(40);
        System.out.println(hs2);
    }
}
