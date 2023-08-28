import java.util.*;

public class iteratorListiterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(200);
        al.add(10);
        al.add(20);
        al.add(0);
        System.out.println(al);

        Iterator itr = al.iterator();  
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ListIterator litr = al.listIterator(al.size()); // this will print the values from last to first
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous()); 
        }
        // for(int i=0; i<al.size();i++)
        // {
        //     System.out.println(al.get(i));
        // }

        // // for each 
        // for(Object o:al)
        // {
        //     System.out.println(o);
        // }
    }   
}
