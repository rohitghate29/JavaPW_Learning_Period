class Demo1 
{
    int a,b;

    public Demo1() {
        System.out.println("Parent class constructor.");
    }
    public Demo1(int x, int y) {
        System.out.println("Parameterized Parent class constructor.");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1
{
    int n,m;

    public Demo2(){
        System.out.println("Child class constructor.");
    }
    public Demo2(int x, int y){
        this();
        System.out.println("Parameterized Child class constructor.");
        System.out.println(x+y);
    }
}


public class ConstructorExecution {
    public static void main(String[] args) {
        Demo2 d = new Demo2(2,2);

        // Demo1 d1 = new Demo1();
    }   
}
