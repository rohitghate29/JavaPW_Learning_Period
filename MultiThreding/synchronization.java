class car implements Runnable
{
    
    public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
            Thread.sleep(2000);
            
            synchronized (this) 
            {
            System.out.println(Thread.currentThread().getName() + " get into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " came back and parked the car");
            Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


public class synchronization {
    public static void main(String[] args) {

        car c = new car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
