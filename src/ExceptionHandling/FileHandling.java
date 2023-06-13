package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("d:\\myFile.txt");
        System.out.println("file read successfully");
    }
}
