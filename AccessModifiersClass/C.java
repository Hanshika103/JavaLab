package otherpackage;

import mypackage.A;

public class C {
    public static void main(String[] args) {
        A obj = new A();

        // System.out.println(obj.a); private
        // System.out.println(obj.b); default
        // System.out.println(obj.c); protected
        System.out.println(obj.d); // ✅ public
    }
}