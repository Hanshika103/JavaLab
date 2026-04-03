package mypackage;

public class A {
    private int a = 10;
    int b = 20; // default
    protected int c = 30;
    public int d = 40;

    public void show() {
        System.out.println(a); // accessible inside class
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}