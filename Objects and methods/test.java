class test 
{
    // Instance Variables
    int a=2;
    String name="naruto";
    public static void main(String[] args) {
        //declare the variable
        //create an object

        //Local variables
        int num = 9;
        test obj1 = new test(); // reference variable
        test obj2 = new test(); 

        obj1.name = "gugu";
        
        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);

    }
}