import java.io.*;

public class fileWriter
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        dir.mkdir();
        File fl = new File(dir, "PW.txt");
        fl.createNewFile();
        FileWriter fw = new FileWriter(fl);
        fw.write("String ssss");
        fw.write("\n");
        fw.write("null");        
        fw.write("\n");
        fw.write("Eonn");
        fw.write("\n");
        fw.write("leoowow");

        fw.close();
        // fw.flush();

    }
}