package baitapnhanvien;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public void hienThiTatCa() {
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tong += nv.tinhLuong();
        }
        return tong;
    }
}
