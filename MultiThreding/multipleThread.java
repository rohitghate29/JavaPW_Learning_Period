import java.util.*;

class calc extends Thread
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

class message extends Thread 
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


public class multipleThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        calc t1 = new calc();
        message t2 =new message();

        t1.start();
        t2.start();
    }
}
