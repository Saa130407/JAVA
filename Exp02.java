import java.util.Scanner;
public class Exp02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0) { System.out.println("Enter a non-negative integer"); return; }
        long factorial = 1;
        for (int i = 1; i <= n; i++) factorial *= i;
        System.out.println("Factorial of " + n + " = " + factorial);
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
