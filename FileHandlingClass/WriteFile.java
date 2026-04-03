import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello! This is Java file handling.");
            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}