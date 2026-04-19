## INDEX

[Program - 01 WAP for add, sub, mul and div using Command Line Arguments](#assi-1)

[Program - 02 WAP to perform Single Inheritance](#assi-2)

[Program - 03 Write a Class to perform a Calculator class using single inheritance](#assi-3)

[Program - 04 Write a Class to add two distances which is in form of meter, centimeter and milimeter](#assi-4)

[Program - 05 Write a Class to add two times which is in the form of hours, min and second](#assi-5)

[Program - 06 Write a Class to perform reverse of 1-D array](#assi-6)

[Program - 07 Write a Class to perform Transpose of a matrix](#assi-7)

[Program - 08 Write a Class to perform Sum of matrixes](#assi-8)

[Program - 09 Write a Class to perform Multiplication of matrix](#assi-9)

[Program - 10 Write a Class to print Sum of Each Rows](#assi-10)

[Program - 11 Write a Class to print Sum of Each Columns](#assi-11)

[Program - 12 Write a Java Class to Demonstrate Constructor Chaining in Student Details Class](#assi-12)

[Program - 13 Write a Java Class to print factorial of a number](#assi-13)

[Program - 14 Write a Java Class to check palindrome number](#assi-14)

[Program - 15 Write a Java Class to check armstrong number](#assi-15)

[Program - 16 Write a program using three classes to print 1-100, 1-100, 1-100 with ans without thread and analyse the output and repeate the same program using runnable interface.](#assi-16)

[Program - 17  WAC Using the concept of multithreading the output of all three threads must be synchronised (use join method).](#assi-17)

[Prohram - 18 WAC to perform Addition of 2 numbers using swing](#assi-18)

[Program - 19 WAC to make a registration form with 10 elements and send the data into database (use jdbc connectivity)](#assi-19)

[Program - 20 WAC to make one calculator in swing](#assi-20)

[Program - 21 WAC to make matrix addition using swing class](#assi-21)

[Program - 22 WAC Create one jframe apply 10 buttons on that after clicking on each button a new structure is created.(Circle, Oval, Rectangle etc.)](#assi-22)

[Program - 23 WAC just using mouse event create a frame like paint brush with selection of colour and width.](#assi-23)

[Program - 24 WAC create a package of any 5 classes of your choice and import it.](#assi-24)

[Program - 25 WAC create one package import and test it](#assi-25)

[Program - 26 WAC create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same function demonstrate arithmetic exception.](#assi-26)

[Program - 27 WAC to test the range of age of one student write a program using user defined exception.](#assi-27)

[Program - 28 WAC File Handling Programs ( Read, Write, Stream,Copy etc)](#assi-28)

[Program - 29 WAC WAC Inheritance Programs , using interface and abstract classes.](#assi-29)





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


















