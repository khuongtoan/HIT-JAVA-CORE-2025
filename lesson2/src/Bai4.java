import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.print("Các số đã nhập: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nTổng các phần tử: " + sum);
        System.out.println("Giá trị lớn nhất: " + max);
    }
}
