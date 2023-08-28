import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        
        //Type safety 
        // String ar[] = new String[10];
        // ar[0] = "Monkey";
        // ar[1] = "D";
        // // ar[2] = 20; CE

        //No Type safety
        // ArrayList al = new ArrayList();

        //Type safety achieved using generics
        ArrayList<String> al = new ArrayList<String>();

        al.add("Rodd");
        al.add("WWW");
        // al.add(10); //No CE

        // String n1=(String)al.get(0); //Type casting 
        // String n2=(String)al.get(1);
        // String n3=(String)al.get(2);  //RE

        String name1 = al.get(0);
        String name2 = al.get(1);
    }
}