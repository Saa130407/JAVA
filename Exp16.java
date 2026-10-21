interface Operation { int apply(int a, int b); }
public class Exp16 {
    public static void main(String[] args) {
        Operation multiply = (a, b) -> a * b;
        System.out.println("Product=" + multiply.apply(6, 7));
    }
}