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