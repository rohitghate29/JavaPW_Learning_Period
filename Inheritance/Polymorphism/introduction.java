package Polymorphism;

import javax.sql.rowset.spi.SyncResolver;

class Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane1 extends Aeroplane1
{
    //This is Method Overriding 
    public void takeOff(){
        System.out.println("CargoPlane Requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at lower height");
    }
}

class PassengerPlane1 extends Aeroplane1 
{
    //This is Method Overriding 
    public void takeOff(){
        System.out.println("PassengerPlane Requires Medium size runway");
    }
    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class introduction {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();

        PassengerPlane1 pp = new PassengerPlane1();

        Aeroplane1 ref;
        ref = cp;
        ref.takeOff();
        ref.fly();
        System.err.println("_____________\n_____________");
        ref=pp;
        ref.takeOff();
        ref.fly();
    }
}
