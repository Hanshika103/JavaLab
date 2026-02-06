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