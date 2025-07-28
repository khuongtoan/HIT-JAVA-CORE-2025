
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] a=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int value=1;
        while(value<=n*n) {
            for (int i = left; i <= right; i++) {
                a[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                a[i][left] = value++;
            }
            left++;
        }
        System.out.println("ma trận n x n xoắn ốc tăng dần từ 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][i];
            sum+=a[i][n-i-1];
        }
        System.out.println(" tổng các phần tử trên 2 đường chéo chính và phụ: "+sum);
    }
}
