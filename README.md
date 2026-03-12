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










