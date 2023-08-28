import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.*;

// Serialization 
class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;

    }
}
public class one
{
    public static void main(String[] args) throws IOException
    {
        Cricketer c = new Cricketer("Sachin", 43, 33330);

        File dir = new File("PW");
        dir.mkdir();
        File fl= new File(dir,"pw.txt");
        fl.createNewFile();
        FileOutputStream fos = new FileOutputStream("pw.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
}