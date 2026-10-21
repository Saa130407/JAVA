import java.util.Arrays;
public class Exp03 {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1}; Arrays.sort(a);
        int[][] m = {{9, 3}, {7, 1}};
        for (int[] row : m) Arrays.sort(row); // sort each row
        System.out.println("1D: " + Arrays.toString(a));
        System.out.println("2D rows: " + Arrays.deepToString(m));
    }
}