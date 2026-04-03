import java.io.*;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("demo.txt");

        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Size: " + file.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
