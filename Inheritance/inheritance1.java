class human  // Super class, Base class, Parent class
{
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

}

public class inheritance1 {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.sleep();
    }
}