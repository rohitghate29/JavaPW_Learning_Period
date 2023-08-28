import java.util.Arrays;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        System.out.println(list);
        
        // for(Integer i:list)
        // {
        //     System.out.print(i+",");
        // }

        //ForEach method using 
        //lambda expression
        list.forEach(i->System.out.print(i+","));
    }
}
