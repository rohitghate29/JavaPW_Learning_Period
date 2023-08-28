import java.io.*;

public class bufferedWriter {
    
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PW");
        File fl = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(fl);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("This is written by buffered writer");
        bw.newLine();
        bw.write("Next line");
        bw.newLine();
        bw.write("Last line");

        bw.close();
    }

}
