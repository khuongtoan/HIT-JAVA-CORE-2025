# 📚 Java Cơ Bản – List, ArrayList, Kế Thừa và Ghi Đè Phương Thức

## 1. **List và ArrayList**

### 1.1. Khái niệm
- **List**: Interface trong Java, lưu trữ danh sách các phần tử theo thứ tự, cho phép trùng lặp.
- **ArrayList**: Lớp triển khai (implementation) của `List` sử dụng mảng động.
- `ArrayList` tự động thay đổi kích thước khi thêm hoặc xóa phần tử.

### 1.2. Khai báo
```java
import java.util.List;
import java.util.ArrayList;

List<String> names = new ArrayList<>();
```
> **Lưu ý**: Luôn nên khai báo kiểu `List` thay vì `ArrayList` để dễ thay đổi triển khai sau này.

### 1.3. Một số phương thức thường dùng
| Phương thức                | Chức năng |
|---------------------------|-----------|
| `add(E element)`          | Thêm phần tử |
| `get(int index)`          | Lấy phần tử theo vị trí |
| `set(int index, E element)` | Gán giá trị tại vị trí |
| `remove(int index)`       | Xóa phần tử |
| `size()`                   | Trả về số lượng phần tử |
| `contains(Object o)`      | Kiểm tra có tồn tại hay không |
| `clear()`                  | Xóa tất cả phần tử |

### 1.4. Ví dụ
```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Danh sách trái cây: " + fruits);

        fruits.remove("Banana");
        System.out.println("Sau khi xóa: " + fruits);

        System.out.println("Phần tử đầu tiên: " + fruits.get(0));
    }
}
```

---

## 2. **Kế thừa (Inheritance)**

### 2.1. Khái niệm
- **Kế thừa** là cơ chế cho phép một lớp **con** (subclass) kế thừa các thuộc tính và phương thức từ một lớp **cha** (superclass).
- Giúp tái sử dụng mã và tạo mối quan hệ “IS-A” (là một).

### 2.2. Cú pháp
```java
class Cha {
    // thuộc tính, phương thức
}

class Con extends Cha {
    // thêm thuộc tính, phương thức riêng
}
```

### 2.3. Lưu ý
- Java **chỉ hỗ trợ kế thừa đơn** (một lớp con chỉ có 1 lớp cha).
- Constructor của lớp cha được gọi trước khi constructor của lớp con chạy.
- Từ khóa `super` dùng để gọi constructor hoặc phương thức của lớp cha.

### 2.4. Ví dụ
```java
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " đang ăn.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + " đang sủa.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Milo";
        dog.eat();  // từ lớp cha
        dog.bark(); // từ lớp con
    }
}
```

---

## 3. **Ghi đè phương thức (Method Overriding)**

### 3.1. Khái niệm
- **Ghi đè phương thức** xảy ra khi **lớp con định nghĩa lại** một phương thức đã có trong lớp cha.
- Mục đích: Thay đổi hoặc mở rộng hành vi của phương thức lớp cha.

### 3.2. Quy tắc ghi đè
1. Tên phương thức và tham số phải **giống y hệt**.
2. Kiểu trả về phải **giống hoặc là kiểu con** của kiểu trả về trong lớp cha.
3. Không được giảm mức truy cập (`public` → `protected` là sai).
4. Dùng annotation `@Override` để tránh lỗi nhầm cú pháp.

### 3.3. Ví dụ
```java
class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu!");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        a.sound(); // Động vật phát ra âm thanh
        b.sound(); // Chó sủa: Gâu gâu!
    }
}
```

### 3.4. Lưu ý
- Ghi đè không áp dụng cho phương thức `static` hoặc `final`.
- Để gọi phương thức lớp cha, dùng `super.methodName()`.

---

## 💡 Tổng kết
- `List` và `ArrayList` dùng để lưu danh sách phần tử, thao tác linh hoạt.
- **Kế thừa** giúp tái sử dụng code, tạo quan hệ “IS-A”.
- **Ghi đè phương thức** cho phép tùy biến hành vi của lớp cha trong lớp con.

## 4. **Cấu trúc dữ liệu enum**

### 1. Enum là gì?

- **Enum** (viết tắt của *enumeration*) là **kiểu dữ liệu đặc biệt** trong Java, dùng để **định nghĩa tập hợp các hằng số cố định**.
- Enum giúp code **dễ đọc hơn** và **an toàn hơn** so với việc dùng nhiều `public static final`.
- Enum trong Java **là một class đặc biệt** nên có thể chứa:
  - Thuộc tính
  - Phương thức
  - Constructor (luôn là `private` hoặc mặc định)

---

### 2. Cú pháp khai báo enum

```java
enum Mua {
    XUAN, HA, THU, DONG
}
```

- Mỗi phần tử (`XUAN`, `HA`, `THU`, `DONG`) là **hằng số** (ngầm định là `public static final`).
- Tên hằng số **nên viết hoa toàn bộ** theo convention.

---

### 3. Sử dụng enum

```java
public class TestEnum {
    public static void main(String[] args) {
        Mua muaHienTai = Mua.XUAN;

        System.out.println(muaHienTai);       // XUAN
    }
}
```

---

### 4. Duyệt qua các giá trị của enum

```java
for (Mua m : Mua.values()) {
    System.out.println(m);
}
```

- `values()` trả về mảng các giá trị của enum.

---

### 5. Enum có thể có thuộc tính & phương thức

```java
enum TrangThai {
    NEW("Mới tạo"),
    PROCESSING("Đang xử lý"),
    DONE("Hoàn thành");

    private String moTa;

    // Constructor (luôn private)
    TrangThai(String moTa) {
        this.moTa = moTa;
    }

    public String getMoTa() {
        return moTa;
    }
}

public class TestTrangThai {
    public static void main(String[] args) {
        TrangThai tt = TrangThai.PROCESSING;
        System.out.println(tt.getMoTa()); // Đang xử lý
    }
}
```

---

### 6. Khi nào dùng enum?

- Khi bạn có **tập giá trị cố định**, ví dụ:
  - Ngày trong tuần (`MONDAY, TUESDAY, ...`)
  - Trạng thái đơn hàng (`PENDING, SHIPPED, DELIVERED`)
  - Vai trò người dùng (`ADMIN, USER, GUEST`)
- Khi cần **type safety** (tránh nhầm lẫn giữa các giá trị).

---

### 7. Ưu điểm so với `public static final`

- **An toàn kiểu dữ liệu** (type-safe)
- Có thể **thêm logic, phương thức**
- Hỗ trợ **switch-case**
- Dễ bảo trì và mở rộng

---

