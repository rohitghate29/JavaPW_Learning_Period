import java.util.*;

class MyThread2 extends Thread 
{
    public void run()
    {
        String tname = Thread.currentThread().getName();
        if(tname.equals("Calc"))
        {
            calcLTR();
        }
        else{
            impMessage();
        }
    }

    public void calcLTR() 
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

     public void impMessage()
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

public class comparison {
    public static void main(String[] args) {

        MyThread2 m1 = new MyThread2();
        MyThread2 m2 = new MyThread2();

        m1.setName("Calc");
        m2.setName("SAkura");

        m1.start();
        m2.start();

    }    
}
