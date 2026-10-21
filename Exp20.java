import java.nio.file.*;
import java.io.IOException;
public class Exp20 {
    public static void main(String[] args) throws IOException {
        Path dir = Path.of("nio-demo"), file = dir.resolve("note.txt");
        Files.createDirectories(dir);
        Files.writeString(file, "NIO example");
        System.out.println(Files.readString(file));
        System.out.println("Exists=" + Files.exists(file));
        Files.delete(file); Files.delete(dir);
    }
}