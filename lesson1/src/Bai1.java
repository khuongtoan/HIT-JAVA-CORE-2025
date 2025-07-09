import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập chiều cao (m): ");
        double height = sc.nextDouble();

        System.out.println("Xin chào " + name + ", bạn " + age + " tuổi và cao " + height + " mét.");
    }
}
