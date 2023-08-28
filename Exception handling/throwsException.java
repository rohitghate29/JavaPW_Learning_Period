class demo {
    //This is an Example of 
    //Ducking
    public void a() throws Exception
    {
        b();
    }
    public void b() throws Exception
    {
        int a = 10;
        int b=0;
        int res = a/b;
        System.out.println(res);
    }


}
public class throwsException {
    public static void main(String[] args) {
        demo obj = new demo();
        // This is Error Handling 
        try
        {
           obj.a();
        }
        catch(Exception e)
        {
            System.out.println("Error\n"+ e.getMessage()); // getMessage prints message of the error
        }
    }
}
