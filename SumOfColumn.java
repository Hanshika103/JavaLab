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