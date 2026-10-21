class Box<T> {
    private T value;
    Box(T value) { this.value = value; }
    T get() { return value; }
}
public class Exp13 {
    static <T> void show(T value) { System.out.println("Value=" + value); }
    public static void main(String[] args) {
        Box<String> b = new Box<>("Java");
        System.out.println(b.get()); show(42);
    }
}