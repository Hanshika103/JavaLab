package otherpackage;

import mypackage.A;

public class D extends A {
    public static void main(String[] args) {
        D obj = new D();

        // System.out.println(obj.a); private
        // System.out.println(obj.b); default
        System.out.println(obj.c); // ✅ protected (via inheritance)
        System.out.println(obj.d); // ✅ public
    }
}