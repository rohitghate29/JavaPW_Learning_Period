class human  // Super class, Base class, Parent class
{

    human()
    {
        System.out.println("This is a Constructor class ");
    }

    private String name;
    int age;
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }

}

class student extends human  // child class, subclass, derived class 
{
     void disp()
    {
        System.out.println("The age is " + age);
        // System.out.println(name); // private variables cannot be accessed using inheritance.
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.sleep();
        // s1.name;  // private variables cannot be accessed using inheritance.
    }
}