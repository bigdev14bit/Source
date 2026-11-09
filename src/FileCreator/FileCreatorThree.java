package FileCreator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileCreatorThree {
    public static void main(String[] args)  throws IOException{
        String jsonUrl = "https://jsonplaceholder.typicode.com/comments";
        URI uri = URI.create(jsonUrl);
        try(InputStream inputStream = uri.toURL().openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("posts.json");
        ) {
            byte[] bytes = inputStream.readAllBytes();
            System.out.println("Raw Bytes:: " + Arrays.toString(bytes));
            fileOutputStream.write(bytes);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


}
