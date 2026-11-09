package FileCreator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreatorTwo {
    public static void main(String[] args)  throws IOException{
        //1. Defining path that we want to work on.
        //unix- home/gamp/Desktop... windows - C:\\Users\Desktop...

            String fileLocation = "/home/gamp/Desktop/snowman.txt";
            //2. Use a method of class Files to work with the path
            Path path = Path.of(fileLocation);
            Files.write(path, "I'm still dancing with the Ghost in my Head(-,-).".getBytes());
            System.out.println("File Created Successfully");
    }
}
