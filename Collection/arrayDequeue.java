import java.util.*;

public class arrayDequeue {
    public static void main(String[] args) {
        
        ArrayDeque ad = new ArrayDeque();
        ad.add(200);
        ad.add(300);
        System.out.println(ad);
        ad.addFirst("First");
        ad.addLast("last");
        System.out.println(ad);

        ad.offerFirst(10);
        ad.offerLast(20);
        System.out.println(ad);
    }
}
