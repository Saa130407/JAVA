class Box {
    int width;
    Box() { this(1); }
    Box(int width) { this.width = width; }
    void show() { System.out.println("Width=" + this.width); }
}
public class Exp04 {
    public static void main(String[] args) { new Box().show(); new Box(5).show(); }
}