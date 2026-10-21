import java.util.regex.*;
public class Exp12 {
    public static void main(String[] args) {
        String input = "Contact: student@example.com";
        Matcher m = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}").matcher(input);
        System.out.println(m.find() ? "Email found: " + m.group() : "No email found");
    }
}