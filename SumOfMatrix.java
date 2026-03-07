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

public class SumOfMatrix {
    public static void main(String[] args) {
        Matrix obj = new Matrix();  // object creation
        obj.addMatrix();            // method call
        obj.display();              // display result
    }
}