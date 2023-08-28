import java.io.*;

public class bufferredReader {
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        File fl = new File(dir, "pw.txt");

        FileReader fr = new FileReader(fl);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while(line != null)
        {
            System.out.println(line);
            line=br.readLine();
        }
    }
}
