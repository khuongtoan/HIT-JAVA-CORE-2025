package bai6TongHop;

import java.util.Scanner;

public class Bai6TongHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa sau nextInt()

        Student[] students = new Student[n];
        double totalGpa = 0;
        double maxGpa = -1;
        int indexMax = 0;

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            students[i].name = sc.nextLine();
            System.out.print("Tuổi: ");
            students[i].age = sc.nextInt();
            System.out.print("Điểm TB: ");
            students[i].gpa = sc.nextDouble();
            sc.nextLine(); // bỏ dòng thừa sau nextDouble()

            totalGpa += students[i].gpa;

            if (students[i].gpa > maxGpa) {
                maxGpa = students[i].gpa;
                indexMax = i;
            }
        }

        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        for (Student s : students) {
            System.out.println("Tên: " + s.name + " | Tuổi: " + s.age + " | GPA: " + s.gpa);
        }

        System.out.println("\nĐiểm TB cả lớp: " + (totalGpa / n));
        System.out.println("Sinh viên có điểm cao nhất: " + students[indexMax].name + " - " + students[indexMax].gpa);
    }
}
