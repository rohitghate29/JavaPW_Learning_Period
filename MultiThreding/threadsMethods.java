class printing implements Runnable
{
    public void run()
    {
        try{
            for(int i=0;i<2;i++){
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}

public class threadsMethods {
    public static void main(String[] args) 
    {
        
        System.out.println("Main thread is started");

        printing p = new printing();
        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive()); 

        t1.start();
        System.out.println(t1.isAlive());
        try{
            t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Main thread finished the work");
    }
}
