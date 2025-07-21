import java.util.Scanner;

public class Bai1 {
    /*
        mảng.
        Đếm và in ra:
        Tổng các số chẵn.
        Tổng các số lẻ.
        Số lượng số nguyên tố trong mảng.
    */

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int x : arr)
            if (x % 2 == 0) sum += x;
        return sum;
    }

    public static int sumOdd(int[] arr) {
        int sum = 0;
        for (int x : arr)
            if (x % 2 != 0) sum += x;
        return sum;
    }

    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (isPrime(x)) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Tổng số chẵn: " + sumEven(arr));
        System.out.println("Tổng số lẻ: " + sumOdd(arr));
        System.out.println("Số nguyên tố: " + countPrimes(arr));
    }
}
