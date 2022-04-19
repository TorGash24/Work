import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainApp {
    public static void main(String[] args) {

        Path path = Path.of("testFile.txt");

        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        UtilsClass.printLine();

    }
}
