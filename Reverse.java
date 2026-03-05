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

public class Reverse {
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