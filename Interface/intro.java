interface A  // We use interface keyword to create interface
{
    void show();
}

interface X   // We use interface keyword to create interface
{
    void abc();
}

class B implements A,X  //We use implements to access interface
{
    public void show()
    {
        System.out.println("in show");
    }

    public void abc()
    {
        System.out.println("in abc");
    }
}
public class intro
{
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
        obj.abc();
    }
}