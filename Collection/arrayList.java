import java.util.*;

public class arrayList 
{
    public static void main(String [] args)
    {
    
       ArrayList intArr = new ArrayList();
       intArr.add(22);
       intArr.add(23);
       intArr.add(24);
       System.out.println(intArr);
       System.out.println("========================");
       
       ArrayList variousArr = new ArrayList();
       variousArr.add("PW Skills");
       variousArr.add(1);
       variousArr.add("R");
       variousArr.add(1.1);
       System.out.println(variousArr);
       System.out.println("========================");

       variousArr.add(200); //We can add data to ArrayList any time 
       System.out.println(variousArr);
       System.out.println("========================");

       ArrayList containsCollection = new ArrayList();
       containsCollection.add(1);
       containsCollection.add(2);
       containsCollection.add(3);
       
       System.out.println(containsCollection);
       System.out.println("============================");

       containsCollection.addAll(variousArr);
       System.out.println("After adding collection");
       System.out.println(containsCollection);  //Now we have added a collection inside the list

       containsCollection.add(2,"Pw"); //We can add element on any index, but it is not good practice
       System.out.println(containsCollection);
    }
}