import java.util.Scanner;

public class Bai4 {

    /*
        In dãy Fibonacci từ `0` đến `n`.
        Tính tổng các số Fibonacci lẻ trong dãy.
     */

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printSumOdd(int n) {
        int sumOdd = 0;
        System.out.print("Dãy Fibonacci: ");
        for (int i = 0; i <= n; i++) {
            int f = fibonacci(i);
            System.out.print(f + " ");
            if (f % 2 != 0) sumOdd += f;
        }
        System.out.println("\nTổng các số Fibonacci lẻ: " + sumOdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        printSumOdd(n);
    }
}
