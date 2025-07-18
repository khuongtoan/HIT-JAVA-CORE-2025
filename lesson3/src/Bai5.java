import java.util.Scanner;

public class Bai5 {

    public static int[][] genMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) matrix[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
            left++;
        }

        return matrix;
    }

    // Hàm in ma trận
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    // Hàm tính tổng 2 đường chéo
    public static int sum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - 1 - i];
        }

        // Nếu n lẻ thì phần tử giữa bị cộng 2 lần
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước n: ");
        int n = sc.nextInt();

        int[][] spiral = genMatrix(n);

        System.out.println("Ma trận xoắn ốc:");
        printMatrix(spiral);

        int diagonalSum = sum (spiral);
        System.out.println("Tổng các phần tử trên đường chéo: " + diagonalSum);
    }
}
