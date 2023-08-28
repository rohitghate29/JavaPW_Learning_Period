//  Write a program and create a constructor with parameters and initialise the variable using a constructor. 

class car 
{
    String name;
    int price;

    // Creating Constructor 
    car(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    void show()
    {
        System.out.println(name);
        System.out.println(price + "cr");
    }
}
public class constructor 
{
    public static void main(String[] args) 
    {
    //initialising variable using constructor
        car c1 = new car("BMW", 2);
        c1.show();
    }
}
