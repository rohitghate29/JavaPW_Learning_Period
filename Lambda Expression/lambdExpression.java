interface Car
{
    void drive(int avg, int ts);
}

class lambdaExpression
{
    public static void main(String[] args) {
        // Car obj = () -> System.out.println("Driving..."); // No-parameter lambda expression
        
        // Car obj = avg -> System.out.println("Driving..." + avg); // Single parameter lambda expression
        // obj.drive(7);

        Car obj = (avg,ts) -> System.out.println("Driving... with "+ avg + "km Avg at "+ts + "km/hr Speed"); //Two parameter 
        obj.drive(8, 190);
    }
}