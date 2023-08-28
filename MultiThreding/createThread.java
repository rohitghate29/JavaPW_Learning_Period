class MyThread extends Thread 
{
    public void run()
    {
        System.out.println("Child Thread");
    }
}

public class createThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        MyThread mt = new MyThread();
        mt.start();
    }
}

