# Java Programs Index

## Basic Programs

[ **Program - 01:** WAP to perform addition, subtraction, multiplication, and division using Command Line Arguments.](#assi-1)

[ **Program - 02:** WAP to demonstrate Single Inheritance.](#assi-2)

[ **Program - 03:** Write a class to perform calculator operations using single inheritance.](#assi-3)

[ **Program - 04:** Write a class to add two distances in the form of meter, centimeter, and millimeter.](#assi-4)

[ **Program - 05:** Write a class to add two times in the form of hours, minutes, and seconds.](#assi-5)


## Array & Matrix Programs

[ **Program - 06:** Write a class to reverse a 1-D array.](#assi-6)

[ **Program - 07:** Write a class to perform transpose of a matrix.](#assi-7)

[ **Program - 08:** Write a class to perform sum of matrices.](#assi-8)

[ **Program - 09:** Write a class to perform multiplication of matrices.](#assi-9)

[ **Program - 10:** Write a class to print sum of each row.](#assi-10)

[ **Program - 11:** Write a class to print sum of each column.](#assi-11)


## Core Java Concepts

[ **Program - 12:** Write a Java class to demonstrate constructor chaining in a Student Details class.](#assi-12)

[ **Program - 13:** Write a Java class to print factorial of a number.](#assi-13)

[ **Program - 14:** Write a Java class to check whether a number is palindrome.](#assi-14)

[ **Program - 15:** Write a Java class to check whether a number is an Armstrong number.](#assi-15)


## Multithreading

[ **Program - 16:** Write a program using three classes to print 1–100, 1–100, 1–100 with and without threads, analyze the output, and repeat using Runnable interface.](#assi-16)

[ **Program - 17:** WAC using multithreading such that output of all three threads is synchronized (use join method).](#assi-17)


## Swing Programs

[ **Program - 18:** WAC to perform addition of two numbers using Swing.](#assi-18)

[ **Program - 19:** WAC to create a registration form with 10 elements and store data into database (JDBC).](#assi-19)

[ **Program - 20:** WAC to create a calculator using Swing.](#assi-20)

[ **Program - 21:** WAC to perform matrix addition using Swing.](#assi-21)

[ **Program - 22:** WAC to create a JFrame with 10 buttons where each button creates a shape (Circle, Oval, Rectangle, etc.).](#assi-22)

[ **Program - 23:** WAC to create a paint brush-like frame using mouse events with color and width selection.](#assi-23)


## Packages & Exception Handling

[ **Program - 24:** WAC to create a package of any 5 classes and import it.](#assi-24)

[ **Program - 25:** WAC to create a package, import it, and test it.](#assi-25)

[ **Program - 26:** WAC to demonstrate ArrayIndexOutOfBoundsException and ArithmeticException using try-catch.](#assi-26)


## Advanced Topics

[ **Program - 27:** WAC to validate student age using a user-defined exception.](#assi-27)

[ **Program - 28:** WAC for file handling programs (Read, Write, Stream, Copy, etc.).](#assi-28)

[ **Program - 29:** WAC for inheritance programs using interfaces and abstract classes.](#assi-29)



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

## assi-3
```

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

```
<img width="508" height="173" alt="Cal1_output" src="https://github.com/user-attachments/assets/400d11a3-4744-4c2f-b626-bc05fe61358f" />

## assi-4
```
class Distance {
    int meter;
    int centimeter;
    int millimeter;

    // Method to take input values
    void set(int m, int c, int mm) {
        meter = m;
        centimeter = c;
        millimeter = mm;
    }

    // Method to add two Distance objects
    Distance add(Distance d) {
        Distance result = new Distance();

        result.millimeter = this.millimeter + d.millimeter;
        result.centimeter = this.centimeter + d.centimeter;
        result.meter = this.meter + d.meter;

        // Conversion
        result.centimeter += result.millimeter / 10;
        result.millimeter = result.millimeter % 10;

        result.meter += result.centimeter / 100;
        result.centimeter = result.centimeter % 100;

        return result;
    }

    // Method to display distance
    void display() {
        System.out.println("Distance = " + meter + " m "
                + centimeter + " cm "
                + millimeter + " mm");
    }
}

public class Dis {
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.set(2, 75, 8); // 2m 75cm 8mm
        d2.set(3, 50, 6); // 3m 50cm 6mm

        Distance sum = d1.add(d2);

        System.out.println("First Distance:");
        d1.display();

        System.out.println("Second Distance:");
        d2.display();

        System.out.println("Total Distance:");
        sum.display();
    }
}
```
<img width="489" height="216" alt="Dis_output" src="https://github.com/user-attachments/assets/87d203a8-3fcb-49ed-a36d-108cb2ec8747" />

## assi-5

```
class Time {

    int hr, min, sec;

    // Constructor
    Time(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    // Method to add two objects
    void add(Time t) {

        int totalSec = this.sec + t.sec;
        int totalMin = this.min + t.min;
        int totalHr  = this.hr + t.hr;

        // Adjust seconds
        if (totalSec >= 60) {
            totalMin = totalMin + 1;
            totalSec = totalSec - 60;
        }

        // Adjust minutes
        if (totalMin >= 60) {
            totalHr = totalHr + 1;
            totalMin = totalMin - 60;
        }

        System.out.println("Total Time = " + totalHr + " : " + totalMin + " : " + totalSec);
    }

    public static void main(String[] args) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);

        t1.add(t2);   // Adding two objects
    }
}
```
<img width="512" height="153" alt="Time_output" src="https://github.com/user-attachments/assets/8ce5e220-0895-49e2-b802-c175318fb993" />

## assi-6
```
class ReverseArray {

    void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        ReverseArray obj = new ReverseArray();
        obj.reverse(arr);

        System.out.println("Reversed Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```
<img width="526" height="154" alt="Reverse_output" src="https://github.com/user-attachments/assets/47bad1a9-0ec6-4191-8733-c8cfe5e866a8" />

## assi-7
```
class TransposeMatrix {

    int matrix[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    void transpose() {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int transpose[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Transpose {
    public static void main(String[] args) {

        TransposeMatrix obj = new TransposeMatrix(); // object creation
        obj.transpose(); // method call
    }
}
```

<img width="526" height="226" alt="Transpose_output" src="https://github.com/user-attachments/assets/aabe7901-f7bd-4451-a811-176b1107e261" />

## assi-8
```
class Matrix {
    int A[][] = {{1,2},{3,4}};
    int B[][] = {{5,6},{7,8}};
    int C[][] = new int[2][2];

    void addMatrix() {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    void display() {
        System.out.println("Sum of matrices:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Matrix obj = new Matrix();  // object creation
        obj.addMatrix();            // method call
        obj.display();              // display result
    }
}
```

<img width="538" height="166" alt="SumOfMatrix_output" src="https://github.com/user-attachments/assets/ffc3969b-6c2c-4130-9f3d-ae776cfd939f" />

## assi-9

```
class MatrixMultiplication {
    int a[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 }
    };

    int b[][] = {
            { 7, 8 },
            { 9, 10 },
            { 11, 12 }
    };

    int c[][] = new int[2][2];

    void multiply() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
    }

    void display() {
        System.out.println("Result Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MulMatrix {
    public static void main(String args[]) {
        MatrixMultiplication obj = new MatrixMultiplication();
        obj.multiply();
        obj.display();
    }
}
```
<img width="526" height="152" alt="MulMatrix_output" src="https://github.com/user-attachments/assets/a2f697b9-26a3-4e69-b177-76fe6e673450" />

## assi-10
```
class SumOfRow {

    int matrix[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    void rowSum() {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }

    public static void main(String[] args) {
        SumOfRow obj = new SumOfRow();
        obj.rowSum();
    }

}

```
<img width="517" height="153" alt="Untitled" src="https://github.com/user-attachments/assets/abc87af7-ec9a-404d-83a6-e8d610e740d4" />

## assi-11
```
class SumOfColumn {
    int[][] a = { { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 } };

    void SumofColumn() {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " Column is " + sum);
        }
    }

    public static void main(String[] args) {
        SumOfColumn c = new SumOfColumn();
        c.SumofColumn();
    }

}
```
<img width="383" height="149" alt="SumOfColumn_output" src="https://github.com/user-attachments/assets/3576949f-d57a-43e3-9c9d-4755dc53f2e8" />

## assi-12

```
class Student_Details {
    String name;
    int age;
    int id;
    static int num_of_students = 0;

    Student_Details()
    {
        this("Unknown",0,0);
    }

    Student_Details(String name)
    {
       
        this(name,0,0);
    }

    Student_Details(String name, int id)
    {
       
        this(name,id,0);
    }

    Student_Details(String name,int id , int age)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        num_of_students++;
    }

    void display() {
        System.out.println("##############################################");
        System.out.println("Student name : " + this.name);
        System.out.println("Student id : " + this.id);
        System.out.println("No. of Students : " + num_of_students);
    }

    public static void main(String[] args) {
        Student_Details s1 = new Student_Details();
        Student_Details s2 = new Student_Details("Hanshika");
        Student_Details s3 = new Student_Details("Mukati", 203);
        Student_Details s4 = new Student_Details("Durga", 001, 36);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
```

<img width="575" height="374" alt="Student_Details_output" src="https://github.com/user-attachments/assets/1a4f4b6d-51dc-4be1-beb9-a7d4c28e6916" />

## assi-13
```
class Factorial {

    // Method to calculate factorial
    long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        Factorial obj = new Factorial();
        long result = obj.factorial(number);

        if (result != -1) {
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}
```
<img width="452" height="106" alt="Factorial_output" src="https://github.com/user-attachments/assets/ae899a97-a3a3-4860-8e7a-3dba953cb446" />

## assi-14

```

class Palindrome
{
    int num=0;
    int num1;
    void check(int n)
    {
         num1=n;
        while(n>0)
        {
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        if(num1==num)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not palindrome");
        }
    }

    public static void main(String[] args)
    {
        Palindrome p1 = new Palindrome();
        p1.check(121);
        p1.check(123);
    }
    
}
```

<img width="768" height="614" alt="palindrome_output" src="https://github.com/user-attachments/assets/a8a08937-b1de-45e7-8fde-4ac9f6952e84" />

## assi-15

```

class Armstrong
{
    void check(int n)
    {
        int num = n;
        int num1 = 0;

        int count = 0;
        while(n > 0)
        {
            count++;
            n = n / 10;
        }

        n = num;

        while(n > 0)
        {
            int rem = n % 10;

            int result = 1;
            for(int i = 0; i < count; i++)
            {
                result = result * rem;
            }

            num1 = num1 + result;
            n = n / 10;
        }

        if(num1 == num)
        {
            System.out.println(num + " is Armstrong number");
        }
        else
        {
            System.out.println(num + " is not Armstrong number");
        }
    }

    public static void main(String[] args)
    {
        Armstrong a1 = new Armstrong();
        a1.check(153);
        a1.check(1634);
        a1.check(123);
    }
}
```

<img width="483" height="154" alt="image" src="https://github.com/user-attachments/assets/ae7df72a-5ad0-49bf-bb46-edfa84b87ea7" />

## assi-16

```

class A {
    void print() {
        System.out.print("A : ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}

class B {
    void print() {
        System.out.print("B: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}

class C {
    void print() {
        System.out.print("C : ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class WithoutThread {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.print();
        obj2.print();
        obj3.print();
    }
}
```
<img width="1009" height="233" alt="java_lab" src="https://github.com/user-attachments/assets/910754e6-b0ea-4426-be7f-67a720ab8be5" />

```
class A1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("A: " + i + " ");
        }
    }
}

class B1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("B: " + i + " ");
        }
    }
}

class C1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("C: " + i + " ");
        }
    }
}

public class WithThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A1());
        Thread t2 = new Thread(new B1());
        Thread t3 = new Thread(new C1());

        t1.start();
        t2.start();
        t3.start();
    }
}
```

<img width="1006" height="296" alt="java_lab" src="https://github.com/user-attachments/assets/6e66c7d1-9d85-4ce8-9051-47a8a9edebfe" />

## assi-17

```
class A2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B: " + i );
        }
    }
}

class C2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class ThreadWithSynchronization {
    public static void main(String[] args) {
        A2 t1 = new A2();
        B2 t2 = new B2();
        C2 t3 = new C2();

        try {
            t1.start();
            t1.join(); // wait for t1 to finish

            t2.start();
            t2.join(); // wait for t2 to finish

            t3.start();
            t3.join(); // wait for t3 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
```

<img width="664" height="349" alt="java_lab" src="https://github.com/user-attachments/assets/82d28d21-be2b-489c-baa3-063678928253" />

## assi-18

```
import javax.swing.*;
import java.awt.event.*;

public class AddSwing {
    public static void main(String[] args) {

        JFrame f = new JFrame("Addition Program");

        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(50, 50, 150, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(200, 50, 150, 30);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(50, 100, 150, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(200, 100, 150, 30);

        JButton btn = new JButton("Add");
        btn.setBounds(150, 150, 100, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(50, 200, 300, 30);

        // Button Action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;

                result.setText("Result: " + sum);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(btn);
        f.add(result);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

```

<img width="387" height="290" alt="java_lab" src="https://github.com/user-attachments/assets/592b25c5-abf8-4202-b173-27f26c96749d" />

## assi-19

```
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 30, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 150, 30);

        JLabel l2 = new JLabel("Email:");
        l2.setBounds(50, 70, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(150, 70, 150, 30);

        JLabel l3 = new JLabel("Password:");
        l3.setBounds(50, 110, 100, 30);
        JPasswordField t3 = new JPasswordField();
        t3.setBounds(150, 110, 150, 30);

        JLabel l4 = new JLabel("Gender:");
        l4.setBounds(50, 150, 100, 30);
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(150, 150, 70, 30);
        r2.setBounds(220, 150, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l5 = new JLabel("Course:");
        l5.setBounds(50, 190, 100, 30);
        JTextField t5 = new JTextField();
        t5.setBounds(150, 190, 150, 30);

        JLabel l6 = new JLabel("Address:");
        l6.setBounds(50, 230, 100, 30);
        JTextField t6 = new JTextField();
        t6.setBounds(150, 230, 150, 30);

        JLabel l7 = new JLabel("Phone:");
        l7.setBounds(50, 270, 100, 30);
        JTextField t7 = new JTextField();
        t7.setBounds(150, 270, 150, 30);

        JLabel l8 = new JLabel("City:");
        l8.setBounds(50, 310, 100, 30);
        JTextField t8 = new JTextField();
        t8.setBounds(150, 310, 150, 30);

        JLabel l9 = new JLabel("State:");
        l9.setBounds(50, 350, 100, 30);
        JTextField t9 = new JTextField();
        t9.setBounds(150, 350, 150, 30);

        JButton btn = new JButton("Submit");
        btn.setBounds(150, 400, 100, 30);

        // Button Action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = t1.getText();
                    String email = t2.getText();
                    String password = t3.getText();
                    String gender = r1.isSelected() ? "Male" : "Female";
                    String course = t5.getText();
                    String address = t6.getText();
                    String phone = t7.getText();
                    String city = t8.getText();
                    String state = t9.getText();

                    // JDBC Connection
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/studentdb", "root", "1111@Han1111");

                    String query = "INSERT INTO registration(name,email,password,gender,course,address,phone,city,state) VALUES(?,?,?,?,?,?,?,?,?)";

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, name);
                    pst.setString(2, email);
                    pst.setString(3, password);
                    pst.setString(4, gender);
                    pst.setString(5, course);
                    pst.setString(6, address);
                    pst.setString(7, phone);
                    pst.setString(8, city);
                    pst.setString(9, state);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(f, "Data Inserted Successfully!");

                    con.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(r1);
        f.add(r2);
        f.add(l5);
        f.add(t5);
        f.add(l6);
        f.add(t6);
        f.add(l7);
        f.add(t7);
        f.add(l8);
        f.add(t8);
        f.add(l9);
        f.add(t9);
        f.add(btn);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```
<img width="887" height="91" alt="java_lab" src="https://github.com/user-attachments/assets/cb0ab295-d3af-4446-b075-40ec2748332e" />

<img width="380" height="466" alt="java_lab" src="https://github.com/user-attachments/assets/e5b044eb-c0b7-45c3-a0cb-815404de4dc7" />

<img width="379" height="464" alt="java_lab" src="https://github.com/user-attachments/assets/9fac599d-1be1-4f6e-bb75-fac87dafb482" />

<img width="1315" height="149" alt="java_lab" src="https://github.com/user-attachments/assets/5055ca91-e88b-499a-b3d8-af9faefac641" />

## assi-20

```
import javax.swing.*;
import java.awt.event.*;

public class Calculator {

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(50, 30, 120, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 120, 30);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(50, 70, 120, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 70, 120, 30);

        JButton add = new JButton("+");
        add.setBounds(50, 120, 50, 40);

        JButton sub = new JButton("-");
        sub.setBounds(110, 120, 50, 40);

        JButton mul = new JButton("*");
        mul.setBounds(170, 120, 50, 40);

        JButton div = new JButton("/");
        div.setBounds(230, 120, 50, 40);

        JLabel result = new JLabel("Result:");
        result.setBounds(50, 180, 200, 30);

        // ADD
        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a + b));
        });

        // SUBTRACT
        sub.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a - b));
        });

        // MULTIPLY
        mul.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a * b));
        });

        // DIVIDE
        div.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            if (b == 0) {
                result.setText("Cannot divide by zero");
            } else {
                result.setText("Result: " + (a / b));
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(result);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```
<img width="595" height="53" alt="java_lab" src="https://github.com/user-attachments/assets/9a487c0d-a29d-4b07-a140-f029e97d4dc1" />

<img width="327" height="283" alt="java_lab" src="https://github.com/user-attachments/assets/f1f3d416-ced1-4185-835f-425f3fc803d6" />

## assi-21

```
import javax.swing.*;
import java.awt.event.*;

public class MatrixAddition {

    static JFrame f;
    static JTextField[][] A, B, R;

    public static void main(String[] args) {

        f = new JFrame("Matrix Addition");

        JLabel l1 = new JLabel("Rows:");
        l1.setBounds(50, 20, 50, 30);
        JTextField rowsField = new JTextField();
        rowsField.setBounds(100, 20, 50, 30);

        JLabel l2 = new JLabel("Cols:");
        l2.setBounds(180, 20, 50, 30);
        JTextField colsField = new JTextField();
        colsField.setBounds(230, 20, 50, 30);

        JButton createBtn = new JButton("Create Matrix");
        createBtn.setBounds(100, 60, 150, 30);

        f.add(l1); f.add(rowsField);
        f.add(l2); f.add(colsField);
        f.add(createBtn);

        createBtn.addActionListener(e -> {

            int rows = Integer.parseInt(rowsField.getText());
            int cols = Integer.parseInt(colsField.getText());

            A = new JTextField[rows][cols];
            B = new JTextField[rows][cols];
            R = new JTextField[rows][cols];

            int yOffset = 120;

            // Matrix A
            int xOffset = 20;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    A[i][j] = new JTextField();
                    A[i][j].setBounds(xOffset + j * 50, yOffset + i * 40, 40, 30);
                    f.add(A[i][j]);
                }
            }

            // Matrix B
            xOffset = 200;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    B[i][j] = new JTextField();
                    B[i][j].setBounds(xOffset + j * 50, yOffset + i * 40, 40, 30);
                    f.add(B[i][j]);
                }
            }

            // Result Matrix
            xOffset = 400;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    R[i][j] = new JTextField();
                    R[i][j].setBounds(xOffset + j * 50, yOffset + i * 40, 40, 30);
                    R[i][j].setEditable(false);
                    f.add(R[i][j]);
                }
            }

            JButton addBtn = new JButton("Add");
            addBtn.setBounds(250, yOffset + rows * 50, 100, 30);

            addBtn.addActionListener(ev -> {
                try {
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            int a = Integer.parseInt(A[i][j].getText());
                            int b = Integer.parseInt(B[i][j].getText());
                            R[i][j].setText(String.valueOf(a + b));
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f, "Invalid Input!");
                }
            });

            f.add(addBtn);

            f.repaint(); // IMPORTANT
        });

        f.setSize(650, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```
<img width="601" height="56" alt="java_lab" src="https://github.com/user-attachments/assets/48c28db5-6a00-4797-a1a6-57923db25e6b" />


<img width="621" height="284" alt="java_lab" src="https://github.com/user-attachments/assets/b9a21929-aa42-423e-b87b-8ee5e5142088" />

## assi-22

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapesGUI extends JPanel implements ActionListener {

    String shape = "";

    public static void main(String[] args) {

        JFrame f = new JFrame("Shapes");

        ShapesGUI panel = new ShapesGUI();
        panel.setLayout(null);

        String[] buttons = { "Circle", "Oval", "Rectangle", "Square",
                "Line", "Triangle", "Arc", "RoundRect",
                "Ellipse", "Clear" };

        int x = 20;

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setBounds(x, 20, 100, 30);
            btn.addActionListener(panel);
            panel.add(btn);
            x += 110;
        }

        f.add(panel);
        f.setSize(1200, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (shape.equals("Circle")) {
            g.drawOval(200, 100, 100, 100);
        }

        else if (shape.equals("Oval")) {
            g.drawOval(200, 100, 150, 100);
        }

        else if (shape.equals("Rectangle")) {
            g.drawRect(200, 100, 150, 100);
        }

        else if (shape.equals("Square")) {
            g.drawRect(200, 100, 100, 100);
        }

        else if (shape.equals("Line")) {
            g.drawLine(200, 100, 350, 200);
        }

        else if (shape.equals("Triangle")) {
            int x[] = { 250, 200, 300 };
            int y[] = { 100, 200, 200 };
            g.drawPolygon(x, y, 3);
        }

        else if (shape.equals("Arc")) {
            g.drawArc(200, 100, 150, 100, 0, 180);
        }

        else if (shape.equals("RoundRect")) {
            g.drawRoundRect(200, 100, 150, 100, 30, 30);
        }

        else if (shape.equals("Ellipse")) {
            g.drawOval(200, 100, 200, 100);
        }

        else if (shape.equals("Clear")) {
            shape = "";
            repaint();
        }
    }
}
```
<img width="593" height="70" alt="java_lab" src="https://github.com/user-attachments/assets/c75d520f-07b3-4a40-9dc2-1f109653a637" />

<img width="1130" height="255" alt="java_lab" src="https://github.com/user-attachments/assets/f301fdd1-dbad-4871-976c-019a11177098" />

## assi-23

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintBrush extends JPanel implements MouseMotionListener, ActionListener {

    int x = -1, y = -1;
    Color currentColor = Color.BLACK;
    int brushSize = 5;

    public PaintBrush() {
        addMouseMotionListener(this);
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Paint Brush");

        PaintBrush panel = new PaintBrush();
        panel.setLayout(null);

        // Color buttons
        JButton red = new JButton("Red");
        red.setBounds(20, 20, 80, 30);

        JButton blue = new JButton("Blue");
        blue.setBounds(110, 20, 80, 30);

        JButton green = new JButton("Green");
        green.setBounds(200, 20, 80, 30);

        // Brush size
        JLabel sizeLabel = new JLabel("Size:");
        sizeLabel.setBounds(300, 20, 40, 30);

        JTextField sizeField = new JTextField("5");
        sizeField.setBounds(340, 20, 50, 30);

        JButton setSize = new JButton("Set");
        setSize.setBounds(400, 20, 60, 30);

        // Add listeners
        red.addActionListener(panel);
        blue.addActionListener(panel);
        green.addActionListener(panel);
        setSize.addActionListener(e -> {
            try {
                panel.brushSize = Integer.parseInt(sizeField.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Invalid size!");
            }
        });

        panel.add(red);
        panel.add(blue);
        panel.add(green);
        panel.add(sizeLabel);
        panel.add(sizeField);
        panel.add(setSize);

        f.add(panel);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // Mouse Drag Drawing
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(currentColor);
        g.fillOval(e.getX(), e.getY(), brushSize, brushSize);
    }

    public void mouseMoved(MouseEvent e) {
    }

    // Button Actions
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Red")) {
            currentColor = Color.RED;
        } else if (cmd.equals("Blue")) {
            currentColor = Color.BLUE;
        } else if (cmd.equals("Green")) {
            currentColor = Color.GREEN;
        }
    }
}
```
<img width="773" height="489" alt="java_lab" src="https://github.com/user-attachments/assets/16e4bc4c-ea21-4625-925b-7844a6d25341" />

## assi-24

```
// File: mypack/ClassA.java
package mypackage;
public class A {
    public void show() {
        System.out.println("This is Class A");
    }
}
```
```
// File: mypack/ClassB.java
package mypackage;
public class B {
    public void show() {
        System.out.println("This is Class B");
    }
}
```
```
// File: mypack/ClassC.java
package otherpackage;
public class C {
    public void show() {
        System.out.println("This is Class C");
    }
}
```
```
// File: mypack/ClassD.java
package otherpackage;
public class ClassD {
    public void show() {
        System.out.println("This is Class D");
    }
}
```
```
// File: mypack/ClassE.java
package mypackage;
public class ClassE {
    public void show() {
        System.out.println("This is Class E");
    }
}
```
```
import mypackage.*;
import otherpackage.*;

public class TestPackage {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassD d = new ClassD();
        ClassE e = new ClassE();

        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
    }
}
```
<img width="918" height="327" alt="java_lab" src="https://github.com/user-attachments/assets/635aec8e-4309-47ee-b651-791a8df0ad89" />

## assi-25

```
// File: mypack/Message.java
package mypack;

public class Message {
    public void display() {
        System.out.println("Hello from package!");
    }
}
```
```
// Main class
import mypack.Message;

public class Test {
    public static void main(String[] args) {
        Message obj = new Message();
        obj.display();
    }
}
```
## assi-26

```
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];

            // Array Index Exception
            arr[10] = 50;

            // Arithmetic Exception
            int x = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero!");
        }
    }
}
```
<img width="611" height="74" alt="java_lab" src="https://github.com/user-attachments/assets/e8c57e8d-4616-40fd-a9e4-e109e55acfae" />

## assi-27

```
import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeTest {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Age is not in valid range (18-60)");
        } else {
            System.out.println("Valid Age!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

<img width="571" height="94" alt="java_lab" src="https://github.com/user-attachments/assets/431b3565-49a3-4117-8ca6-50c02d61de02" />

## assi-28

```
import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        try {
            // Write
            FileWriter fw = new FileWriter("file1.txt");
            fw.write("Hello Java File Handling!");
            fw.close();

            // Read
            FileReader fr = new FileReader("file1.txt");
            int ch;
            System.out.println("Reading file:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

            // Copy
            FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("file2.txt");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("\nFile copied successfully!");

        } catch (IOException e) {
            System.out.println("File Error: " + e);
        }
    }
}
```
<img width="626" height="108" alt="java_lab" src="https://github.com/user-attachments/assets/e5f00c87-f766-431d-acf0-d5def32c8eb9" />

<img width="880" height="197" alt="java_lab" src="https://github.com/user-attachments/assets/8016898d-5ee5-484c-b0c4-a352318aebb7" />


## assi-29

```
// Abstract class
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Interface
interface Pet {
    void play();
}

// Child class
class Dog extends Animal implements Pet {
    void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
        d.play();
    }
}
```
<img width="664" height="141" alt="java_lab" src="https://github.com/user-attachments/assets/c131ab25-40d1-4dc2-bb4a-7f9a8a1d58ea" />











