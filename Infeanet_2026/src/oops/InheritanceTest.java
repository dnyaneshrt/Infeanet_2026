package oops;


class Vehicle
{
    int wheels=2;
    String colour="black";
    String company="honda";
    String modelName="unicorn";

    public void startEngine()
    {
        System.out.println("start engine");
    }
    public void run()
    {
        System.out.println("run with around 60 km/hr");
    }

    public void stopEngine()
    {
        System.out.println("stop engine");
    }
}


class Car extends  Vehicle
{
    int wheels=4;
    String colour="white";
    String company="hyundai";
    String modelName="creta";

    public void displayInfoMethod()
    {
        System.out.println("i am from car class");
    }
}

public class InheritanceTest {

   public static void main(String[] args) {
        Vehicle bike=new Vehicle();
       System.out.println(bike.modelName+":"+bike.company);

       Car creta=new Car();
       creta.startEngine();
       creta.run();
       creta.stopEngine();

       bike.wheels=100;
       System.out.println(bike.wheels);

    }
}
