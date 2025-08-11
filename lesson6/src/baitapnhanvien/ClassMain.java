package baitapnhanvien;

public class ClassMain {
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();

        NhanVien nv1 = new NhanVienFullTime("FT01", "Nguyen Van A", 30, "a@gmail.com", "0123456789", 10000000, 2000000);
        NhanVien nv2 = new NhanVienFullTime("FT02", "Tran Thi B", 28, "b@gmail.com", "0987654321", 12000000, 1500000);

        NhanVien nv3 = new NhanVienPartTime("PT01", "Le Van C", 22, "c@gmail.com", "0112233445", 80, 50000);
        NhanVien nv4 = new NhanVienPartTime("PT02", "Pham Thi D", 21, "d@gmail.com", "0556677889", 60, 60000);

        ql.themNhanVien(nv1);
        ql.themNhanVien(nv2);
        ql.themNhanVien(nv3);
        ql.themNhanVien(nv4);

        System.out.println("=== DANH SÁCH NHÂN VIÊN ===");
        ql.hienThiTatCa();

        System.out.println("Tổng quỹ lương: " + ql.tinhTongLuong());
    }
}
