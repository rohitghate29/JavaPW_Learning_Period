class sample{
    int a;
    int b;

    public sample() {
        System.out.println("Zero parameterized constructor ");
    }
    public sample(int a, int b) {
        this.a=a;
        this.b=b;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class demo {
    public static void main(String[] args) {
        sample c = new sample();
        c.disp();

        sample s = new sample(2,3);
        s.disp();
    }
}
