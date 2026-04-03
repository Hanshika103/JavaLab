public class Example4 {
    public static void main(String[] args) {
        int age = 19;
        age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Age is : " + age);
        }
    }
}