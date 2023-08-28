import java.util.*;

class demo
{

}
class calc1 extends demo implements Runnable
{
    public void run()
    {
        System.out.println("Calculator Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);

        System.out.println("Calculation Ends");
    }
}


class message1 implements Runnable
{
    public void run()
    {
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
            }
        }
        catch(Exception e){
            System.out.println("Some problem");
        }

        System.out.println("Displaying important message task ended");
    }
}

public class threadInterface {
    public static void main(String[] args) {
        
        calc1 c1 = new calc1();
        message1 m1 = new message1();

        // c1.run();
        // m1.run();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);
        
        t1.start();
        t2.start();
    }
}
