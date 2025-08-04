import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("An", 2000, "Hà Nội", 2.5, 8.5, 8.5, 5));
        arrayList.add(new Student("Bình", 1999, "HCM", 2.75, 2, 5.5, 1));
        arrayList.add(new Student("Châu", 2005, "Huế", 2.25, 2.5, 4.5, 8));
        arrayList.add(new Student("Dũng", 2002, "Đà Nẵng", 3.25, 3.5, 6.5, 2));

        StudentManager studentManager = new StudentManager(arrayList);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choose) {
                case 1 -> {
                    Student s = new Student();
                    System.out.print("Nhập tên: ");
                    s.setName(sc.nextLine());

                    System.out.print("Nhập năm sinh: ");
                    s.setNamsinh(sc.nextInt()); sc.nextLine();

                    System.out.print("Nhập địa chỉ: ");
                    s.setAddress(sc.nextLine());

                    System.out.print("Nhập điểm TX1: ");
                    s.setPoint1(sc.nextDouble());

                    System.out.print("Nhập điểm TX2: ");
                    s.setPoint2(sc.nextDouble());

                    System.out.print("Nhập điểm KTHP: ");
                    s.setKTHP(sc.nextDouble());

                    System.out.print("Nhập số tiết nghỉ: ");
                    s.setSotietnghi(sc.nextInt());

                    studentManager.addStudent(s);
                }
                case 2 -> {
                    System.out.print("Nhập tên sinh viên cần sửa: ");
                    String name = sc.nextLine();
                    studentManager.updateStudent(name, sc);
                }
                case 3 -> {
                    studentManager.sortByAge();
                    studentManager.printArrayStudent();
                }
                case 4 -> {
                    studentManager.sortByGpa();
                    studentManager.printArrayStudent();
                }
                case 5 -> {
                    studentManager.sortBySoTietNghi();
                    studentManager.printArrayStudent();
                }
                case 6 -> {
                    System.out.print("Nhập tên sinh viên cần xóa: ");
                    String name = sc.nextLine();
                    studentManager.deleteStudent(name);
                }
                case 7 -> {
                    studentManager.printArrayStudent();
                }
                case 8 -> System.out.println("🚪 Thoát chương trình.");
                default -> System.out.println("❌ Lựa chọn không hợp lệ.");
            }
        } while (choose != 8);
    }

    public static void menu() {
        System.out.println("""
                \n======= MENU =======
                1. Thêm sinh viên mới
                2. Sửa thông tin sinh viên
                3. Sắp xếp theo tuổi
                4. Sắp xếp theo GPA
                5. Sắp xếp theo số tiết nghỉ
                6. Xóa sinh viên
                7. In danh sách sinh viên
                8. Thoát
                ===================
                Nhập lựa chọn: """);
    }
}
