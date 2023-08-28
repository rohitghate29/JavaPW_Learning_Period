class A
{
    void show()
    {
        System.out.println("In Show");
    }

    // inner class 
    static class B
    {
        void display()
        {
            System.out.println("In display");
        }
    }            
}

public class InnerClass {
    public static void main(String[] args) {
      
        A obj = new A();
        obj.show();

        // inner class object creating
        A.B obj1 = new A.B();
        obj1.display();

  
    }
}
