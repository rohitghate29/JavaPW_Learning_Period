// Types of methods in inheritance 

class Aeroplane  
{
    public void takeoff()
    {
        System.out.println("Plane is taking off");
    }

    public void fly()
    {
        System.out.println("Plane is flying");
    }
}

class cargoPlane extends Aeroplane 
{
    public void fly()
    {
        //This is overriden method in Java.
        System.out.println("CargoPlane flies at lower height. ");
    }

    //This is specialized method in Java
    public void carryGoods(){
        System.out.println("CargoPlane carries Goods");
    }
}
class passengerPlane extends Aeroplane 
{
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height. ");
    }

    public void carryPasenger(){
        System.out.println("PassengerPlane carries Passenger");
    }
}

public class inheritance5 {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        cp.takeoff();
        cp.fly();

        passengerPlane pp = new passengerPlane();
        pp.takeoff();
        pp.fly();

    }
}
