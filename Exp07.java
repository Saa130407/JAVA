interface Printable {
    void print();
    default void label() { System.out.println("Printable item"); }
}
abstract class Shape { abstract double area(); }
class Circle extends Shape implements Printable {
    double radius = 2;
    double area() { return Math.PI * radius * radius; }
    public void print() { System.out.printf("Area=%.2f%n", area()); }
}
public class Exp07 {
    public static void main(String[] args) { Circle c = new Circle(); c.label(); c.print(); }
}