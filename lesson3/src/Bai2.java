import java.util.Scanner;

public class Bai2 {
    public static final double PI = 3.14;

    public static double chuVi(double r) {
        return 2 * PI * r;
    }

    public static double dienTich(double r) {
        return PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r: ");
        double r = sc.nextDouble();
        System.out.print("Nhập số mũ k: ");
        int k = sc.nextInt();

        System.out.printf("Chu vi: %.2f\n", chuVi(r));
        System.out.printf("Diện tích: %.2f\n", dienTich(r));
        System.out.println("r^k = " + Math.pow(r, k));
        System.out.println("Căn bậc hai của (r + k): " + Math.sqrt(r + k));
        System.out.println("Giá trị tuyệt đối của (r - k): " + Math.abs(r - k));
    }
}
