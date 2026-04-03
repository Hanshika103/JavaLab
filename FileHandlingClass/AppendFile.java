import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demo.txt", true);
            writer.write("\nAppending new line!");
            writer.close();

            System.out.println("Data appended");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
