import java.util.*;
public class Exp14 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(List.of("red", "blue"));
        LinkedList<String> l = new LinkedList<>(a); l.addFirst("green");
        Vector<Integer> v = new Vector<>(List.of(1, 2));
        Set<String> s = new HashSet<>(List.of("red", "red", "blue"));
        System.out.println("ArrayList=" + a + ", LinkedList=" + l);
        System.out.println("Vector=" + v + ", HashSet size=" + s.size());
    }
}