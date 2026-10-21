public class Exp09 {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        StringBuilder b = new StringBuilder(text.trim());
        b.append("!");
        System.out.println("trim/lower=" + text.trim().toLowerCase());
        System.out.println("substring=" + text.trim().substring(0, 4));
        System.out.println("builder=" + b + ", length=" + b.length());
    }
}