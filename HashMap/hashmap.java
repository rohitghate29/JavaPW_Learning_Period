import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashmap {
    public static void main(String [] args)
    {
        HashMap hm = new HashMap();
        hm.put(01, "Rohit");
        hm.put(02, "Sonu");
        hm.put(03, "PWsjils");
        hm.put(04, "idk");
        hm.put(05, "kjls");

        System.out.println(hm);
        // hm.put(01, "eooo");
        hm.put(02, "wooo"); //updating old value
        hm.put(03, "qoo");
        
        System.out.println(hm);

        LinkedHashMap lhm = new LinkedHashMap();
        
    }
}