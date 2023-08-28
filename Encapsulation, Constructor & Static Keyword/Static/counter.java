package Static;


class demo 
{
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
        System.out.println("Value of a : " + a);

    }
    public int getA() {
        return a;
    }
    public void setB(int b) {
        this.b = b;
        System.out.println("Value of b : " + b);

    }
    public int getB() {
        return b;
    }

}
public class counter
{
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo();

        d1.setA(100);
        d1.getA();
        
        d2.setA(200);
        d2.getA();
    }
}