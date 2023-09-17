import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class typesOfHashmap {
    public static void main(String []args){
        //order of insertion is not preserved
        HashMap <Integer,String> hmap = new HashMap<>();
        hmap.put(3,"Riya");
        hmap.put(5,"emilly");
        hmap.put(1,"cat");
        hmap.put(6,"john");
        hmap.put(4,"minato");

        System.out.println("HashMap class map looks like: "+ hmap);

        //Order of insertion is preserved
        LinkedHashMap <Integer,String> lmap = new LinkedHashMap<>();
        lmap.put(3,"Riya");
        lmap.put(5,"emilly");
        lmap.put(1,"cat");
        lmap.put(6,"john");
        lmap.put(4,"minato");

        System.out.println("LinkedHashMap class map looks like: "+ lmap);

        //Sorted output on the basis of the keys
        TreeMap <Integer,String> tmap = new TreeMap<>();
        tmap.put(3,"Riya");
        tmap.put(5,"emilly");
        tmap.put(1,"cat");
        tmap.put(6,"john");
        tmap.put(4,"minato");

        System.out.println("TreeMap class map looks like: "+ tmap);
    }
}
