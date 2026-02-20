class Vehicle
{
    int wheels;
    int colour;
    void Start()
    {
        System.out.println("Vehicle Started");
    }
    void display()
    {
        System.out.println("Vehicle has "+wheels+" wheels and colour code is "+colour);
    }
}
class Car extends Vehicle
{
    @Override
    void Start()
    {
        System.out.println("Car Started");
    }
}
 public class MainClass
{
    public static void main(String[] args)
    {
        
        Car c = new Car();
        c.Start();
        c.wheels = 4;
        c.colour = 123;
        c.display();
    }
}