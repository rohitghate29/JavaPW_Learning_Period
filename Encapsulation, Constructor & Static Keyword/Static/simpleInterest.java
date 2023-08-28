package Static;

import java.util.Scanner;

class farmer 
{
    int pa;
    float td;
    static float ri;
    float si;

    static {
        ri=4.5f;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount required: ");
        pa = sc.nextInt();
        System.out.println("Enter the time duration: ");
        td = sc.nextFloat();

        // instead of using this in different classes make it static. 
        // ri=4.5f;
    }

    void compute()
    {
        si=(pa*ri*td)/100f;
    }

    void disp()
    {
        System.out.println("SI is: "+si);
    }

}
public class simpleInterest {
    public static void main(String[] args) {
        farmer f1 = new farmer();
        farmer f2 = new farmer();

        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();

    }
}
