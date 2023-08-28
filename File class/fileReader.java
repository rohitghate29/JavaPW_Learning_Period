import java.io.*;


public class fileReader {
    public static void main(String[] args) throws IOException
    {
        
        File dir = new File("PW");
        File fl = new File(dir, "PW.txt");

        FileReader fr = new FileReader(fl);

        char ch[] = new char[(int)fl.length()];

        fr.read(ch);
        for(char data:ch)
        {
            System.out.print(data);
        }
        // int i = fr.read();
        // // System.out.println((char)i);

        // while(i!=-1)
        // {
        //     System.out.print(i+"-->>");
        //     System.out.println((char)i);
        //     i=fr.read();
        // }

    }
}
