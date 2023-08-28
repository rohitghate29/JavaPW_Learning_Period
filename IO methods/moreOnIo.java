import java.io.*;

public class moreOnIo
{
    public static void main(String[] args) {
        
        // File dir = new File("PWJava");
        // System.out.println(dir.isDirectory());

        // dir.mkdir();
        // System.out.println(dir.isDirectory());

        // File fl = new File(dir,"PWSkills.txt");
        // System.out.println(fl.isFile());

        // try {
        //     fl.createNewFile();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // System.out.println(fl.isFile());


        int count = 0;
        File f = new File("PWJava");
        String str[] = f.list();

        for(String name: str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are: "+ count);
    }
}