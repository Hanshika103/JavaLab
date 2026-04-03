import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            System.out.print("Enter a number: ");
            int b = sc.nextInt();

            System.out.println("You entered: " + a);
            System.out.println("You entered: " + b);

            int c = a / b;

            System.out.println("Result : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program run successfully");
        }
    }
}
