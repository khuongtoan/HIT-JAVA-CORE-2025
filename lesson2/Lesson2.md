# Hướng dẫn Cấu trúc Chương trình Java Cơ Bản

Tài liệu này trình bày các thành phần cơ bản trong lập trình Java dành cho người mới bắt đầu.

---

## 1. Nhập, Xuất, Kiểu Dữ liệu

### Nhập từ bàn phím:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Xin chào " + name);
    }
}
```

### Xuất ra màn hình:

```java
System.out.println("Hello World"); // Xuống dòng
System.out.print("Hello");         // Không xuống dòng
```

### Kiểu dữ liệu cơ bản:

| Kiểu      | Mô tả                 | Ví dụ                  |
| --------- | --------------------- | ---------------------- |
| `int`     | Số nguyên             | `int x = 5;`           |
| `double`  | Số thực               | `double pi = 3.14;`    |
| `boolean` | Kiểu logic (đúng/sai) | `boolean isOk = true;` |
| `char`    | Ký tự                 | `char c = 'A';`        |
| `String`  | Chuỗi ký tự           | `String name = "An";`  |

### Ép kiểu dữ liệu:

* **Ép kiểu tường minh (explicit):**

```java
int a = 10;
double b = (double) a; // a được ép sang double
```

* **Ép kiểu ngầm định (implicit):**

```java
int a = 5;
double b = a; // Java tự động chuyển int sang double
```

* **Từ kiểu lớn về kiểu nhỏ (có thể mất dữ liệu):**

```java
double d = 9.7;
int i = (int) d; // i = 9, phần thập phân bị cắt bỏ
```

---

## 2. Biến, Quy tắc đặt tên

### Khai báo biến:

```java
int age = 20;
double height = 1.75;
boolean isStudent = true;
String fullName = "Nguyen Van A";
```

### Quy tắc đặt tên:

* Tên biến: dùng chữ cái thường, kiểu `camelCase`: `studentName`, `maxValue`
* Tên class: viết hoa chữ cái đầu mỗi từ: `StudentInfo`, `MainClass`
* Không dùng tiếng Việt có dấu
* Không bắt đầu bằng số
* Không trùng với từ khóa Java

---

## 3. Phép toán và Toán tử

### Toán tử số học:

```java
+, -, *, /, %
int a = 10;
int b = 3;
System.out.println(a + b); // 13
```

### Toán tử so sánh:

```java
==, !=, >, <, >=, <=
if (a == b) {
    System.out.println("a bằng b");
}
```

### Toán tử logic:

```java
&& (AND), || (OR), ! (NOT)

if (a > 5 && b < 10) {
    System.out.println("Điều kiện đúng");
}
```

---

## 4. Mảng

### Khai báo và khởi tạo:

```java
int[] numbers = new int[5]; // Mảng 5 phần tử
String[] names = {"An", "Binh", "Cuong"}; // Khởi tạo trực tiếp
```

### Truy cập phần tử:

```java
numbers[0] = 10;
System.out.println(names[1]); // In ra "Binh"
```

---

## 5. Vòng lặp

### Vòng lặp for:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

### Vòng lặp while:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### Vòng lặp do...while:

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

### Vòng lặp foreach (dùng với mảng):

```java
int[] arr = {1, 2, 3, 4, 5};
for (int num : arr) {
    System.out.println(num);
}
```

---

## 6. Câu lệnh điều kiện `if`, `else if`, `switch`

### Câu lệnh `if`:

```java
int score = 85;

if (score >= 90) {
    System.out.println("Giỏi");
} else if (score >= 70) {
    System.out.println("Khá");
} else {
    System.out.println("Trung bình");
}
```

### Câu lệnh `switch`:

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Thứ Hai");
        break;
    case 2:
        System.out.println("Thứ Ba");
        break;
    case 3:
        System.out.println("Thứ Tư");
        break;
    default:
        System.out.println("Không hợp lệ");
}
```

---

## 7. Hàm (Phương thức)

```java
public class Main {
    public static void sayHello(String name) {
        System.out.println("Xin chào, " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        sayHello("Toan");
        int result = add(3, 4);
        System.out.println("Tổng là: " + result);
    }
}
```

---

## 8. Ghi chú (Comment)

```java
// Đây là comment 1 dòng

/*
 Đây là comment nhiều dòng
 Dùng để ghi chú cho đoạn code dài
*/

```
```
javDoc

/**
 * Lớp mô tả một sinh viên.
 */
public class Student {
   
}
```
---

## 9. Kiểu dữ liệu tham chiếu và chuỗi

### So sánh chuỗi:

```java
String a = "Hello";
String b = new String("Hello");

System.out.println(a == b);        // false (so sánh địa chỉ)
System.out.println(a.equals(b));   // true (so sánh nội dung)
```

### Null và kiểm tra null:

```java
String name = null;
if (name != null) {
    System.out.println(name.length());
}
```

---

> 💡 Đây là những kiến thức nền tảng bạn cần nắm vững trước khi đi sâu vào lập trình hướng đối tượng hoặc các framework Java nâng cao như Spring Boot.
