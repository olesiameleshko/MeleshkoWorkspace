import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) throws Exception {
        String separator = File.separator;
        Path file1 = Paths.get(separator + "Users", "Olesia", "OneDrive", "Documents", "Java.txt");
        Path file2 = Paths.get(separator + "Users", "Olesia", "OneDrive", "Desktop", "Java1.txt");
        byte[] read = Files.readAllBytes(file1);
        try {
            Files.write(file2, read);
            System.out.println("The file1 copied successfully to file2");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.delete(file1);
            System.out.println("The initial file1 deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


