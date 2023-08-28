package Static;


class Alpha 
    {
        static int a;
        static int b;

        int m;
        int n;

        //Static initialization Block
        static 
        {
            System.out.println("Static Block.");
            a=10;
            b=20;
        }

        //Non-Static initialization Block
        {
            System.out.println("Non-static block ");
            m=20;
            n=30;
        }
    }

public class StaticVsInstance {
    public static void main(String[] args) {

        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();


    }
}
