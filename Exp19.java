import java.io.*;
import java.nio.charset.StandardCharsets;
public class Exp19 {
    public static void main(String[] args) throws IOException {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("sample.txt"))) {
            out.write("Hello Java".getBytes(StandardCharsets.UTF_8)); // byte stream
        }
        try (BufferedReader in = new BufferedReader(new FileReader("sample.txt"))) { // character + buffered stream
            System.out.println("Read: " + in.readLine());
        }
    }
}