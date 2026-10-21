public class Exp05 {
    static int objects = 0;
    Exp05() { objects++; }
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int sum(int... values) { int s = 0; for (int v : values) s += v; return s; }
    public static void main(String[] args) {
        new Exp05(); new Exp05();
        System.out.println("int add=" + add(2, 3) + ", double add=" + add(1.5, 2.5));
        System.out.println("varargs sum=" + sum(1, 2, 3, 4) + ", objects=" + objects);
    }
}