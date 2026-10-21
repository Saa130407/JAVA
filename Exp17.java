import java.util.*;
public class Exp17 {
    public static void main(String[] args) {
        int total = List.of(5, 2, 8, 3).stream()
            .filter(n -> n % 2 == 0).map(n -> n * n).sorted()
            .peek(n -> System.out.println("square=" + n))
            .reduce(0, Integer::sum);
        System.out.println("Total=" + total);
    }
}