import java.util.HashMap;
import java.util.Map;

public class hashMapfunctions {
    public static void main(String [] args){
        HashMap<Integer,String> hashmap = new HashMap<>();

        //functionality of put() function
        hashmap.put(1,"Rohit");
        hashmap.put(3,"Aaam");
        hashmap.put(4,"Angur");
        hashmap.put(5,"Lasan");
        System.out.println(hashmap);

        //functionality of get() function
        String result = hashmap.get(3);
        System.out.println("Value of given key is: "+result);

        //functionality of containsKey() function
        hashmap.containsKey(2);
        
        //functionality of removal() function
        hashmap.remove(1);
        System.out.println("After removing: "+ hashmap);

        //iterating using for loop
        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.out.println("Hashmap is: ");
            System.out.println(e.getKey() + ":"+ e.getValue());
        }
    }
}
