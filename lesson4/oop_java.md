# OOP Trong Java - Cơ Bản và Tổng Quan

## 1. Giới thiệu về OOP trong Java

Lập trình hướng đối tượng (Object-Oriented Programming - OOP) là mô hình lập trình dựa trên việc xây dựng các **đối tượng (object)** tương tác với nhau. Java là ngôn ngữ thuần OOP, giúp tổ chức mã rõ ràng, dễ bảo trì và tái sử dụng.

---

## 2. Package (Gói)

- Dùng để **tổ chức các class** thành nhóm có liên quan, tránh xung đột tên.
- Đặt ở đầu file Java:

  ```java
  package com.example.myapp;
  ```
- Sử dụng `import` để gọi class từ package khác:

  ```java
  import com.example.myapp.MyClass;
  ```

---

## 3. Class (Lớp)

- Khuôn mẫu để tạo đối tượng (instance).
- Định nghĩa **thuộc tính** (fields) và **phương thức** (methods).

  ```java
  public class Student {
      String name;
      int age;

      void study() {
          System.out.println(name + " is studying.");
      }
  }
  ```

---

## 4. Thuộc tính (Fields / Attributes)

- Các biến thành viên của class, lưu trữ thông tin của đối tượng.
- Mỗi đối tượng có bản sao riêng.

  ```java
  public class Person {
      String name;
      int age;
  }
  ```

---

## 5. Phương thức (Methods)

- Các hàm thành viên của class, định nghĩa hành vi.
- Có thể nhận tham số và trả về giá trị.

  ```java
  public class Car {
      public void fullThrottle() {
          System.out.println("Xe đang chạy tối đa!");
      }
      public void speed(int maxSpeed) {
          System.out.println("Tốc độ tối đa: " + maxSpeed);
      }
  }
  ```

---

## 6. Phạm vi truy cập (Access Modifiers)

| Modifier    | Phạm vi truy cập                |
| ----------- | ------------------------------- |
| `public`    | Mọi nơi                         |
| `private`   | Chỉ trong class                 |
| `protected` | Trong cùng package hoặc lớp con |
| (default)   | Trong cùng package              |

```java
public class Example {
    public int a;
    private int b;
    protected int c;
    int d; // default
}
```

---

## 7. Constructor (Hàm khởi tạo)

- Phương thức đặc biệt, tên trùng tên class, **không có kiểu trả về**.
- Được gọi khi `new` đối tượng, gán giá trị khởi tạo.

  ```java
  public class Student {
      String name;
      int age;

      public Student(String name, int age) {
          this.name = name;
          this.age = age;
      }
  }
  ```

---

## 8. Getter và Setter

- Đặt fields là `private`, dùng getter/setter để truy cập an toàn.

  ```java
  public class Student {
      private String name;

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }
  }
  ```

---

## 9. Ví dụ tổng hợp

```java
package com.example;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old.");
    }
}
```

```java
package com.example;

import com.example.Student;

public class Main {

    public static void main(String[] args) {

        Student s = new Student("Lan", 20);
        s.sayHello();
        s.setName("Mai");
        System.out.println("Tên mới: " + s.getName());
    }
}
```

---

## 10. Bảng tổng kết

| Thành phần           | Vai trò                                                    |
| -------------------- | ---------------------------------------------------------- |
| `package`            | Tổ chức mã nguồn, tránh xung đột tên                       |
| `class`              | Khuôn mẫu định nghĩa cấu trúc và hành vi                   |
| `thuộc tính` (field) | Biến thành viên, lưu trữ trạng thái của đối tượng          |
| `phương thức`        | Hàm thành viên, định nghĩa hành vi                         |
| Phạm vi truy cập     | Điều khiển ai được phép truy cập (public, private…)        |
| `constructor`        | Hàm khởi tạo, gán giá trị ban đầu cho đối tượng            |
| `getter/setter`      | Truy cập và thay đổi giá trị field an toàn (encapsulation) |
