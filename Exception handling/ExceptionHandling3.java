// Try, Catch

public class ExceptionHandling3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int res = 0;
        int values [] = {2,3,4,6};
        String name = null;

        try
        {
            res = a/name.length();
            System.out.println(values[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not divide by zero.");
            // System.out.println("Something went wrong..." + e); // e in the end use to show the error message to user. but it is good to avoid writing it
        }
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(values[values.length-1]);
            System.out.println("Out of limit.");
        }
        catch(Exception e) {
            System.out.println("Something went wrong."); //This is to be safe from our side 
        }

        System.out.println(res);
        System.out.println("Over");
    }
}
