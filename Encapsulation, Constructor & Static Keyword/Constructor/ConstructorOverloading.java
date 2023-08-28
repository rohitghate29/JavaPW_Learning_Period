
class data
{
    private String name;
    private int id;

    static int size;
    static String type;

    static
    {
        System.out.println("static block");
        size=2;
        type="main";
        System.out.println(type+","+size);
    }

    //default no argument constructor
    public data()
    {
        System.out.println("No-args constructor");
    }

    //one parameter constructor
    public data(String name)
    {
        this.name=name;
    }

    //two parameter constructor
    public data(String name, int id)
    {
        this.name=name;
        this.id=id;
    }

    public String getName()
    {
        return name;
    }

    void disp1()
    {
        System.out.println(name + "," + id);
    }
}


public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        data d = new data();

		d = new data("Java");
        String name = d.getName();
		System.out.println(name);
		
        d = new data("Pankaj", 25);
        d.disp1();

    }
}