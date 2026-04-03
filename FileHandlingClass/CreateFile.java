import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("demo.txt");// file name is demo with extension .txt so compiler can easily
                                             // underanstand

            if (file.createNewFile()) {// method for create file it works on true or false
                System.out.println("File created: " + file.getName());// if file does not exists then it will create new
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {// in built input output extension for file handling
            e.printStackTrace();
        }
    }
}