import java.io.*;

class Cricketer implements Serializable
{
    private String name;
    transient private int age; // due to transient age wont add in serialization.
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;

    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}


public class deserialization
{
    public static void main(String[] args) throws Exception
    {
        
        Cricketer c = new Cricketer("null", 0, 0);
        c.disp();
        
        FileOutputStream fos = new FileOutputStream("pw.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
}