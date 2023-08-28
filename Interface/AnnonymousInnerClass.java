interface Car 
{
    void drive();
}

// class WagonR implements Car{
//     public void drive()
//     {
//         System.out.println("Driving...");
//     }
// }
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        // Car obj = new Car();  we cannont not make object of interface
        Car obj = new Car() {
            //Anonymous inner class
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}
