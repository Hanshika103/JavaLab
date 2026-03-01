class Cal {
    void add(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction is : " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication is : " + (a * b));
    }

    void div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Division is : " + (a / b));
        }
    }
}

class Cal1 extends Cal {
    public static void main(String[] args) {
        Cal1 c1 = new Cal1();
        c1.add(2, 8);
        c1.sub(7, 2);
        c1.mul(4, 6);
        c1.div(10, 5);

    }
}