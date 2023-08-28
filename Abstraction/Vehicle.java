abstract class Vehicle 
{
     public static void main(String[] args) {
        // Vehicle v= new Vehicle();
        Car c= new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
    abstract void start();
}

class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car starts with a key");
    }
}

class Scooter extends Vehicle
{
    void start()
    {
        System.out.println("Scooter starts with a key");
    }

    // public static void main(String[] args) {
    //     // Vehicle v= new Vehicle();
    //     Car c= new Car();
    //     c.start();

    //     Scooter s = new Scooter();
    //     s.start();
    // }
}