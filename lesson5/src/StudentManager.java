import java.util.*;

public class StudentManager {

    private ArrayList<Student> studentArrayList;


    public StudentManager(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public void addStudent(Student student) {
        studentArrayList.add(student);
        System.out.println("Thêm sinh viên " + student.getName() + " thành công!");
    }

    public void updateStudent(String name, Scanner sc) {
        for (Student s : studentArrayList) {
            if (s.getName().equalsIgnoreCase(name)) {
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

                System.out.println("✅ Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên tên " + name);
    }

    public void deleteStudent(String name) {
        Iterator<Student> iterator = studentArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("✅ Đã xóa sinh viên " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên tên " + name);
    }

    public void sortByAge() {
        studentArrayList.sort(Comparator.comparing(Student::age));
    }

    public void sortByGpa() {
        studentArrayList.sort(Comparator.comparing(Student::getGPA));
    }

    public void sortBySoTietNghi() {
        studentArrayList.sort(Comparator.comparing(Student::getSotietnghi));
    }

    public void printArrayStudent() {
        System.out.println("\n Danh sách sinh viên:");
        for (Student s : studentArrayList) {
            System.out.println(s);
        }
    }
}
