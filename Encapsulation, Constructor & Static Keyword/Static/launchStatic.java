package Static;


class demo1 
{
    static int a;
    static int b;

    int m;
    int n;

    {
        System.out.println("Control in non-static block");
        m=30;
        n=40;
    }

     static 
    {
        System.out.println("Control in static block.");
        a=10;
        b=20;
    }
    
    static void disp1()
    {
        System.out.println("Value of static var a: " + a);
        System.out.println("Value of static var b: " + b);

    }

    void disp2()
    {
        System.out.println("value of non static var m: "+m);
        System.out.println("value of non static var n: "+n);
    }
}

public class launchStatic {
    public static void main(String[] args) {
        demo1 d = new demo1();
        demo1.disp1();
        d.disp2();
    }
}
