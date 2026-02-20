## INDEX

[Program - 01 WAP for add, sub, mul and div using Command Line Arguments](#assi-1)

[Program - 02 WAP to perform Single Inheritance](#assi-2)

## assi-1
```
public class C_L_
{
    public static void main(String[] args)// main method
    {
        int a=Integer.parseInt(args[0]);// converting string to integer
        int b=Integer.parseInt(args[1]);// converting string to integer

        add(a,b);// calling the add method
        sub(a,b);// calling the sub method
        mul(a,b);   // calling the mul method
        div(a,b);// calling the div method
    }
    public static void add(int a,int b)// method for addition
    {
        System.out.println("Addition: "+(a+b));// printing the sum of a and b
    }
    public static void sub(int a,int b)// method for subtraction
    {
        System.out.println("Subtraction: "+(a-b));// printing the difference of a and b
    }
    public static void mul(int a,int b)//   method for multiplication
    {
        System.out.println("Multiplication: "+(a*b));// printing the product of a and b
    }
    public static void div(int a,int b)// method for division
    {
        System.out.println("Division: "+(a/b));// printing the quotient of a and b
    }
}
```

<img width="270" height="119" alt="C_L_Output" src="https://github.com/user-attachments/assets/50291119-76ab-4d80-9a8a-e10c76185f63" />

## assi-2
```
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
```
<img width="322" height="69" alt="MainClass_Output" src="https://github.com/user-attachments/assets/abaeac00-80b7-4416-8ba1-d71f0743fe83" />
