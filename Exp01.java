public class Exp01 {
    public static void main(String[] args) {
        int count = 7; double price = 12.5; char grade = 'A'; boolean active = true;
        double widened = count;       // implicit conversion
        int narrowed = (int) price;   // explicit cast
        System.out.println("count=" + count + ", price=" + price + ", grade=" + grade + ", active=" + active);
        System.out.println("int to double=" + widened + ", double to int=" + narrowed);
    }
}
