import java.util.Scanner;

public class Bai3 {
    /*
        Xoá các khoảng trắng ở đầu và cuối chuỗi.
        Kiểm tra xem chuỗi có phải là palindrome (chuỗi đối xứng) hay không.
        Ví dụ: "madam", "RaceCar" là đối xứng.
        In chuỗi đảo ngược.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine().trim();

        // Đảo chuỗi bằng for
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Kiểm tra đối xứng (không phân biệt chữ hoa/thường)
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        // Kết quả
        System.out.println("Chuỗi đảo ngược: " + reversed);
        System.out.println("Là chuỗi đối xứng? " + isPalindrome);
    }
}
