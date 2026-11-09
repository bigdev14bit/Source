package FileCreator;

import java.io.IOException;
import java.nio.file.*;

public class FileCreator {
    public static void main(String[] args) {
        //1. Defining path that we want to woik on.
        //unix- home/gamp/Desktop... windows - C:\\Users\Desktop...

        try {
            String fileLocation = "/home/gamp/Desktop/";
            //2. Use a method of class Files to work with the path
            Path path = Path.of(fileLocation);
            Files.createFile(path);
        } catch(IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
