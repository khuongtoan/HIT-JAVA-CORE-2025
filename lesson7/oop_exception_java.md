# Các đặc tính OOP và Xử lý ngoại lệ trong Java

---

## 1. Tính trừu tượng (Abstraction)

**Định nghĩa ngắn**  
Tính trừu tượng là cơ chế ẩn đi chi tiết triển khai phức tạp, chỉ hiển thị những thuộc tính và hành vi cần thiết. Trong Java, hiện thực bằng `abstract class` và `interface`.

**Khi nào dùng**  
- Muốn định nghĩa *cái gì* làm mà không nêu *làm như thế nào*.  
- Tách rời API (giao tiếp) và triển khai.

**Ví dụ (Java)**

```java
// Abstract class
abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }
    abstract void makeSound(); // phương thức trừu tượng
    void info() { System.out.println("Name: " + name); } // phương thức có cài đặt
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    @Override
    void makeSound() { System.out.println("Gâu gâu"); }
}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog("Buddy");
        a.info();         // Name: Buddy
        a.makeSound();    // Gâu gâu
    }
}
```

**Lợi ích**
- Giảm độ phức tạp, tăng khả năng tái sử dụng và mở rộng.  
- Cho phép nhiều lớp chia sẻ khuôn mẫu chung.


---

## 2. Tính đa hình (Polymorphism)

**Định nghĩa ngắn**  
Đa hình là khả năng một lời gọi phương thức có thể dẫn tới các hành vi khác nhau tùy vào kiểu thực sự của đối tượng (runtime polymorphism). Java có 2 dạng chính: nạp chồng (overloading, compile-time) và ghi đè (overriding, runtime).

**Ví dụ (đa hình runtime)**

```java
interface Printer {
    void print(String msg);
}

class ConsolePrinter implements Printer {
    public void print(String msg) { System.out.println(msg); }
}

class UpperPrinter implements Printer {
    public void print(String msg) { System.out.println(msg.toUpperCase()); }
}

public class Demo {
    static void run(Printer p) {
        p.print("Hello Poly");
    }
    public static void main(String[] args) {
        run(new ConsolePrinter()); // Hello Poly
        run(new UpperPrinter());   // HELLO POLY
    }
}
```

**Lợi ích**
- Viết code tổng quát (loose coupling).  
- Dễ mở rộng, test, hoán đổi chiến lược (strategy).

**Phân biệt Overloading vs Overriding**
- Overloading: cùng tên, khác tham số, xảy ra lúc biên dịch.  
- Overriding: con ghi đè phương thức cha, chọn thực thi lúc chạy.

---

## 3. Interface và Abstract Class 

### Tóm tắt
- **Interface**: là 1 giao diện . Lớp có thể `implements` nhiều interface. Các biến là hằng số (`public static final`).
- **Abstract class**: là lớp đặc biệt (bán trừu tượng) có chứa các phương thức abstract, và các phương thức bình thường

### Bảng so sánh

| Tiêu chí               | Interface                                                | Abstract Class                            |
|------------------------|----------------------------------------------------------|-------------------------------------------|
| Biến                   | public static final (hằng số)                            | có thể có fields bình thường              |
| Kế thừa                | implements nhiều interface                               | extends một abstract class                |
| Mục đích               | định nghĩa các method cần triển khai / khả năng (can-do) | chia sẻ trạng thái + hành vi chung (is-a) |
| Khởi tạo               | không thể khởi tạo                                       | không thể khởi tạo trực tiếp              |

### Khi chọn cái nào
- Dùng **interface** khi bạn cần mô tả khả năng mà nhiều lớp khác nhau có thể có (ví dụ `Serializable`, `Comparable`).  
- Dùng **abstract class** khi các lớp con có nhiều logic hoặc trạng thái chung cần chia sẻ.

### Ví dụ minh họa

```java
interface Flyable {
    void fly();
    default void land() { System.out.println("Landing"); }
}

abstract class Bird {
    String name;
    Bird(String name) { this.name = name; }
    abstract void sing();
    void info() { System.out.println("Bird: " + name); }
}

class Sparrow extends Bird implements Flyable {
    Sparrow(String name) { super(name); }
    @Override void sing() { System.out.println("Chirp"); }
    public void fly() { System.out.println("Sparrow flying"); }
}
```

**Sai lầm hay gặp**
- Cố gắng `extends` nhiều class.  
- Viết interface chứa logic trạng thái phức tạp (nên dùng abstract class).  
- Quên override method interface/abstract dẫn lỗi biên dịch.

---

## 4. Xử lý ngoại lệ (Exception Handling)

### Khái niệm
Ngoại lệ (exception) là những tình huống bất thường xảy ra lúc chạy chương trình. Mục tiêu xử lý ngoại lệ: không để chương trình sập, log/đưa ra phản hồi hợp lý, dọn dẹp tài nguyên.

### 1 số ngoại lệ
- **Exception** : là lớp cha của hầu hết các ngoại lệ (trừ Error), bao gồm cả checked và unchecked exceptions.
- **NumberFormatException** – khi chuyển chuỗi sang số mà chuỗi không hợp lệ.

- **InputMismatchException** – khi Scanner nhận kiểu dữ liệu khác yêu cầu.

- **IllegalArgumentException** – khi tham số truyền vào phương thức không hợp lệ.

- **NoSuchElementException** – khi Scanner hoặc iterator không còn phần tử mà vẫn cố đọc.

- **ArithmeticException** – khi thực hiện phép toán không hợp lệ, ví dụ chia cho 0.

- **NullPointerException** – khi thao tác trên đối tượng null (ví dụ gọi phương thức trên null).

- **ArrayIndexOutOfBoundsException** – khi truy cập mảng vượt ngoài chỉ số hợp lệ.

### Cấu trúc `try-catch-finally`

```java
try {
    // code có thể ném ngoại lệ
} catch (SpecificException e) {
    // xử lý
} catch (AnotherException e) {
    // xử lý khác
} finally {
    // luôn chạy (trừ khi JVM bị terminate)
}
```
### `throw` và `throws`

```java
// Lớp Box giữ số táo
class Box {
    private int apples = 5; // bắt đầu với 5 quả táo

    // Method để lấy táo
    public void take(int n) {
        // Nếu lấy nhiều hơn số táo còn lại, ném exception
        if (n > apples) {
            throw new IllegalArgumentException(
                "Want " + n + " apples, but only " + apples + " left"
            );
        }
        // Nếu đủ táo, trừ số lượng đã lấy
        apples -= n;
        System.out.println("Took " + n + " apples, remaining: " + apples);
    }

    // Method để xem còn bao nhiêu táo
    public int getApples() {
        return apples;
    }
}

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // tạo hộp táo

        try {
            box.take(3);   // Lấy 3 quả, còn 2 quả, OK
            box.take(4);   // Muốn lấy 4 quả, quá số táo, sẽ ném exception
        } catch (IllegalArgumentException e) {
            // Bắt và in ra lỗi
            System.out.println("Error: " + e.getMessage());
        }

        // In ra số táo còn lại
        System.out.println("Apples left: " + box.getApples());
    }
}

```
