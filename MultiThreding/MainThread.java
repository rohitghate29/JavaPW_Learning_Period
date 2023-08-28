public class MainThread 
{
    public static void main(String[] args) throws Exception
    {
        
        System.out.println("Before Changing");
        String name = Thread.currentThread().getName();
        System.out.println(name);

        System.out.println("After Changing");
        Thread t = Thread.currentThread();
        
        t.setName("Kitretsu");
        t.setPriority(3);

        String name2 = Thread.currentThread().getName();
        System.out.println("Changed thread name is "+name2 + " And priority is "+ Thread.currentThread().getPriority());

    }
}