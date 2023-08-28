public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int res = 0;

        try
        {
            res = a/b;
            System.out.println("in try block");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong...");
            // System.out.println("Something went wrong..." + e); // e in the end use to show the error message to user. but it is good to avoid writing it
        }

        System.out.println(res);
        System.out.println("Over");
    }
}
