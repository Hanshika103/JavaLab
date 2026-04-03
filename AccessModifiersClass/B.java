package mypackage;

public class B {
    public static void main(String[] args) {
        A obj = new A();

        // System.out.println(obj.a);  private not accessible
        System.out.println(obj.b); // ✅ default
        System.out.println(obj.c); // ✅ protected
        System.out.println(obj.d); // ✅ public
    }
}