# Bài Tập Java - OOP Trong Java – Cơ Bản và Tổng Quan

---

## Bài 1: Tạo class `Student`

**Yêu cầu:**
1. Tạo class `Student` với hai thuộc tính:
   - `String name`
   - `int age`
2. Viết phương thức không trả về `sayHello()` để in ra màn hình:
   > Xin chào, tôi tên là [name], năm nay [age] tuổi

---

## Bài 2: Sử dụng Constructor và Getter/Setter

**Yêu cầu:**
1. Cập nhật class `Student`:
   - Đặt hai thuộc tính `name` và `age` thành `private`
   - Viết constructor có hai tham số `(String name, int age)`
   - Viết các phương thức:
     - `public String getName()`
     - `public void setName(String name)`
     - `public int getAge()`
     - `public void setAge(int age)`
2. Trong phương thức `main()`:
   - Tạo một đối tượng `Student` bằng constructor
   - Sử dụng `setName()` và `setAge()` để thay đổi thông tin
   - Sử dụng `getName()` và `getAge()` để in ra màn hình tên và tuổi mới

---

## Bài 3: Tạo class `Car` với hành vi

**Yêu cầu:**
1. Tạo class `Car` với hai thuộc tính:
   - `String brand`
   - `int maxSpeed`
2. Viết constructor để khởi tạo cả hai thuộc tính trên
3. Viết phương thức không trả về `run()` để in ra màn hình:
   > Xe [brand] đang chạy với tốc độ tối đa [maxSpeed] km/h
4. Trong phương thức `main()`:
   - Tạo một đối tượng `Car`
   - Gọi phương thức `run()` để kiểm tra kết quả
