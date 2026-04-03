import java.io.*;

public class Example5 {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("demo.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
