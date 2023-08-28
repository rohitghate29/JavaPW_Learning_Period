class student1 {
    String name;
    int age;

    public student1() 
    {
        // super();  // super() method is called by default.
        System.out.println("default constructor is called ");
        name = "Rohan";
        age = 18;
    }

    public student1(String name) 
    {
        this(); // as a programmer we need to call this() method.
        this.name = name;
        age = 19;
    }
    public student1(String name, int age) 
    {
        this();
        this.name=name;
        this.age=age;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class thisSupermethod 
{
    public static void main(String[] args) 
    {
        student1 s1 = new student1();
        s1.disp();
        student1 s2 = new student1("Rohit");
        s2.disp();
        student1 s3 = new student1("Ram", 100000);
        s3.disp();
    }
}