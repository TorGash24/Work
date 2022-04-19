import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainApp {
    public static void main(String[] args) {

        Path path = Path.of("testFile.txt");

        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        UtilsClass.printLine();

    }
}
