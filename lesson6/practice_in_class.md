# Bài luyện trên lớp Java – Buổi 6

## **Bài 1**  
    Tạo các class sau:

1. **LopHoc**
   - Thuộc tính: `maLop` (String), `tenLop` (String).
   - Constructor, getter/setter, phương thức `inThongTin()`.

2. **SinhVien**
   - Thuộc tính: `maSV` (String), `hoTen` (String), `diemTB` (double), `LopHoc lop` (HAS-A).
   - Constructor, getter/setter.
   - Phương thức `inThongTin()` in đầy đủ thông tin sinh viên và lớp học.
   - Viết **nạp chồng phương thức** `setDiemTB(double diem)` và `setDiemTB(int diem)`.

3. **Main**
   - Tạo một `ArrayList<SinhVien>`.
   - Thêm 3–5 sinh viên vào danh sách.
   - In danh sách sinh viên.
   - Tìm sinh viên có điểm TB cao nhất và in ra.

---


## **Bài 2 – Kế thừa, ghi đè phương thức, và quản lý thông tin nhân viên**

## **1. Lớp cha – `NhanVien`**
- **Thuộc tính**:
  - `maNV` (String) – mã nhân viên.
  - `ten` (String) – tên nhân viên.
  - `tuoi` (int) – tuổi.
  - `email` (String).
  - `soDienThoai` (String).
- **Phương thức**:
  - `double tinhLuong()` – mặc định trả về `0` (lớp con sẽ ghi đè).
  - `void hienThiThongTin()` – in ra toàn bộ thông tin + lương.

---

### **2. Lớp con – `NhanVienFullTime`** (kế thừa `NhanVien`)
- **Thuộc tính**:
  - `luongCoBan` (double).
  - `tienThuong` (double).
- **Ghi đè**:
  - `tinhLuong()` → `luongCoBan + tienThuong`.
  - `hienThiThongTin()` → thêm dòng `"Loại: Full Time"`.

---

### **3. Lớp con – `NhanVienPartTime`** (kế thừa `NhanVien`)
- **Thuộc tính**:
  - `soGioLam` (int).
  - `luongTheoGio` (double).
- **Ghi đè**:
  - `tinhLuong()` → `soGioLam * luongTheoGio`.
  - `hienThiThongTin()` → thêm dòng `"Loại: Part Time"`.

---

### **4. Lớp `QuanLyNhanVien`**
- **Thuộc tính**:
  - `ArrayList<NhanVien> danhSachNhanVien`.
- **Phương thức**:
  - `void themNhanVien(NhanVien nv)` – thêm nhân viên vào danh sách.
  - `void hienThiTatCa()` – in thông tin tất cả nhân viên.
  - `double tinhTongLuong()` – trả về tổng lương của tất cả nhân viên.
  - (Có thể bổ sung các hàm tìm kiếm, xóa, sửa nếu muốn).

---

### **5. Class `Main`**
- Tạo đối tượng `QuanLyNhanVien`.
- Thêm vào danh sách:
  - 2 nhân viên FullTime.
  - 2 nhân viên PartTime.
- Gọi hàm hiển thị tất cả nhân viên.
- Gọi hàm tính tổng quỹ lương và in ra kết quả.

---

### **Gợi ý**
- Sử dụng **kế thừa** để tái sử dụng thuộc tính & phương thức chung.
- Dùng **ghi đè (override)** để thay đổi cách tính lương của từng loại nhân viên.
- Quản lý nhân viên qua **ArrayList** trong `QuanLyNhanVien`