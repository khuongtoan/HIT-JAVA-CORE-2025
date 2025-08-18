# BÀI TẬP BUỔI 7 JAVA

---

## Bài tập 1 – Giới thiệu Tính trừu tượng, Đa hình, Interface, Abstract class và Ngoại lệ

Xây dựng chương trình quản lý **hình học và phương tiện giao thông**.

### Yêu cầu:

1. **Hình học**
   - Tạo abstract class `Shape` với phương thức trừu tượng `double area()`.
   - Tạo lớp `Circle` (có bán kính r) và `Rectangle` (có chiều dài, chiều rộng) kế thừa `Shape` và cài đặt phương thức `area()`.
   - Trong `main`, tạo mảng `Shape[]` chứa cả hình tròn và hình chữ nhật, in diện tích từng hình.

2. **Phương tiện giao thông**
   - Tạo interface `Movable` với phương thức `move()`.
   - Tạo lớp `Car` và `Bike` cài đặt interface này.
   - Trong `main`, tạo danh sách `ArrayList<Movable>` chứa cả `Car` và `Bike`, gọi `move()` cho từng đối tượng.

3. **Động vật (đa hình)**
   - Tạo lớp `Animal` với phương thức `makeSound()`.
   - Tạo các lớp `Dog`, `Cat`, `Bird` kế thừa `Animal` và ghi đè phương thức `makeSound()`.
   - Trong `main`, tạo mảng `Animal[]` và duyệt để gọi `makeSound()`, thể hiện tính đa hình.

4. **Ngoại lệ**
   - Viết chương trình nhập vào hai số nguyên `a`, `b`, tính `a / b`.
   - Xử lý ngoại lệ khi chia cho 0.
   - Nếu nhập sai dữ liệu (không phải số), yêu cầu người dùng nhập lại.

---

## Bài tập 2 – Quản lý Sách và Sinh viên

Xây dựng chương trình quản lý **sách và sinh viên**.

### Yêu cầu:

1. **Quản lý sách**
   - Viết lớp `Book` gồm các thuộc tính `title`, `author`.
   - Trong `main`, tạo mảng gồm 3 cuốn sách, nhập dữ liệu và in thông tin từng sách.

2. **Quản lý sinh viên**
   - Viết lớp `Student` có các thuộc tính: `id`, `name`, `age`.
   - Viết constructor có tham số để gán giá trị cho các thuộc tính, sử dụng từ khóa `this`.
   - Viết phương thức `printInfo()` in ra thông tin sinh viên.

3. **Quản lý địa chỉ (HAS-A)**
   - Viết lớp `Address` gồm `street`, `city`.
   - Viết lớp `Person` có thuộc tính `Address`.
   - Trong `main`, tạo đối tượng `Person` kèm thông tin địa chỉ, sau đó in ra màn hình.

4. **Máy tính (Overloading)**
   - Viết lớp `Calculator` với các phương thức nạp chồng `sum`:
     - `sum(int a, int b)`
     - `sum(double a, double b)`
     - `sum(int a, int b, int c)`
   - Viết chương trình minh họa việc gọi cả ba phương thức trên.

5. **Sử dụng hằng số và phương thức tĩnh**
   - Viết lớp `MathUtils` có hằng số `PI = 3.14`.
   - Viết phương thức tĩnh `circleArea(double r)` trả về diện tích hình tròn.
   - Trong `main`, gọi `MathUtils.circleArea(5)` để tính diện tích hình tròn bán kính 5.

---

## Bài tập 3 – Quản lý Nhân sự và Hình khối

Xây dựng chương trình quản lý **nhân sự và hình khối**.

### Yêu cầu:

1. **Nhân sự**
   - Viết lớp `Employee` có phương thức `getSalary()` trả về mức lương cơ bản.
   - Viết lớp `Manager` kế thừa `Employee`, ghi đè `getSalary()` để cộng thêm phụ cấp quản lý.
   - Trong `main`, tạo đối tượng `Manager` và in ra mức lương thực nhận.

2. **Động vật (đa hình kế thừa)**
   - Viết lớp `Animal` có phương thức `makeSound()`.
   - Tạo các lớp `Dog`, `Cat`, `Bird` kế thừa `Animal` và ghi đè phương thức này.
   - Trong `main`, tạo mảng `Animal[]` và duyệt gọi `makeSound()` cho từng phần tử.

3. **Hình khối (abstract)**
   - Viết abstract class `Shape` với phương thức `area()`.
   - Tạo các lớp `Circle`, `Rectangle` kế thừa và cài đặt phương thức `area()`.
   - Trong `main`, tính diện tích hình tròn và hình chữ nhật với dữ liệu mẫu.

4. **Nhạc cụ (interface)**
   - Viết interface `Playable` có phương thức `play()`.
   - Tạo các lớp `Guitar`, `Piano` cài đặt interface này.
   - Trong `main`, tạo danh sách nhạc cụ (`ArrayList<Playable>`) và gọi `play()` cho từng đối tượng.

5. **Xử lý ngoại lệ**
   - Viết chương trình nhập vào 2 số nguyên `a` và `b`, tính `a / b`.
   - Xử lý ngoại lệ khi chia cho 0.
   - Nếu nhập sai dữ liệu (không phải số), yêu cầu nhập lại.

---
