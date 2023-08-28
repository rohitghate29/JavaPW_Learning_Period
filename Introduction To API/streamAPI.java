import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class streamAPI {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(12,31,2,34,2,11,7,5);

        //This line will provide the no. of elements in list
        // long count = list.stream().count();
        // System.out.println(count);

        //Here we use chaining method, beacause all the methods refers to same class i.e Stream.
        Stream<Integer> finalStream = list.stream()
        .filter(n->n%2==0)
        .sorted()
        .map(n->n*2);

        // Stream filData = streamData.filter(n->n%2==0);

        //This line will sort the elements in ascending order
        // Stream<Integer> sortedStream = filData.sorted();

        //only work one time 
        // sortedStream.forEach(n->System.out.print(n+","));

        // Stream mapStream = sortedStream.map(n->n*2);
        
        finalStream.forEach(n->System.out.print(n+",")); 
    }
}
