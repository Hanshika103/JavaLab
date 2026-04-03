public class Example2 {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 3 };
            System.out.println("Value of 2nd index is " + arr[2]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } finally {
            System.out.println("Program run successfully");
        }
    }
}