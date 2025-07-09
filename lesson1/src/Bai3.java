import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + ((double) a / b));
        System.out.println("Chia dư: " + (a % b));

        if (a == b) {
            System.out.println("Hai số bằng nhau.");
        } else {
            System.out.println("Hai số KHÁC nhau.");
        }
    }
}
