# Buổi 3 - Hằng, Math, và String trong Java


---

## 1 Hàm Phương thức (`method`) 

Phương thức (method) là một khối lệnh thực hiện một chức năng cụ thể. Giúp chương trình rõ ràng, dễ bảo trì và tái sử dụng.

### cú pháp tổng quát
```
<phạm_vi_truy_cập> [static] <kiểu_trả_về> <tên_phương_thức>([tham_số]) {
    // Khối lệnh xử lý
}
```
### ví dụ

```
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
## 2 Hằng số (`final`)
```java
public class TimeConstants {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;
}

int secondsInADay = TimeConstants.SECONDS_IN_MINUTE 
    * TimeConstants.MINUTES_IN_HOUR 
    * TimeConstants.HOURS_IN_DAY;

System.out.println("Số giây trong một ngày: " + secondsInADay);
```

## 3. Thư viện Math trong Java

```java
double x = 3.0, y = 4.0;

// Căn bậc hai
double squareRoot = Math.sqrt(x);

// Lũy thừa
double power = Math.pow(x, y);

// Giá trị tuyệt đối
double abs = Math.abs(-10.5);

// Làm tròn
double rounded = Math.round(7.85);
double ceil = Math.ceil(7.2);
double floor = Math.floor(7.8);
```

**Hàm lượng giác**
```java
double angle = Math.toRadians(30);
double sin = Math.sin(angle);
double cos = Math.cos(angle);
double tan = Math.tan(angle);

double asin = Math.asin(sin);
double acos = Math.acos(cos);
double atan = Math.atan(tan);
```

**Hàm log và exponential**
```java
double value = 5.0;
double log10 = Math.log10(value);
double ln = Math.log(value);
double exp = Math.exp(value);
```

**Hàm random**
```java
double randomValue = Math.random(); // [0, 1)
```
## 4. Lớp String trong Java

**Tạo và nối chuỗi**

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
String fullNameConcat = firstName.concat(" ").concat(lastName);
```

**So sánh chuỗi**

```java
String str1 = "Hello";
String str2 = "World";
boolean areEqual = str1.equals(str2); // false
boolean ignoreCase = str1.equalsIgnoreCase("HELLO"); // true
```

**Trích xuất và tìm kiếm chuỗi**

```java
String sentence = "Java programming is fun and powerful.";
String sub = sentence.substring(5, 15); // "programming"
int index = sentence.indexOf("fun"); // 21
```

**Thay thế và chuyển đổi**

```java
String text = "I like apples and apples are tasty.";
String text2 = text.replace("apples", "bananas");
String text3 = text.toUpperCase();
String text4 = text.toLowerCase();
```

**Kiểm tra chuỗi**

```java
String msg = "Hello, Java programming.";
boolean starts = msg.startsWith("Hello"); // true
boolean ends = msg.endsWith("programming."); // true
boolean contains = msg.contains("Java"); // true
```

**Cắt bỏ khoảng trắng ở hai đầu**

```java
String name = "   John   ";
String trimmedName = name.trim(); // "John"
```

**So sánh theo thứ tự từ điển**

```java
String a = "Apple";
String b = "Banana";
int result = a.compareTo(b); // < 0
```

**Tách chuỗi**

```java
String fruits = "apple,banana,orange";
String[] arr = fruits.split(",");
```

**Chuyển số <-> chuỗi**

```java
int number = 123;
String str = String.valueOf(number); // "123"

String s = "456";
int n = Integer.parseInt(s); // 456
```

**Lấy ký tự tại vị trí bất kỳ**

```
String s = "Hello";
char c = s.charAt(1); // e
```
### Bảng tổng hợp phương thức String

| Phép xử lý       | Phương thức                                |
|------------------|--------------------------------------------|
| Nối chuỗi        | `+`, `concat()`                            |
| So sánh          | `equals()`, `equalsIgnoreCase()`           |
| Tìm vị trí       | `indexOf()`, `lastIndexOf()`               |
| Trích xuất       | `substring(start, end)`                    |
| Thay thế         | `replace(old, new)`                        |
| Viết hoa/thường  | `toUpperCase()`, `toLowerCase()`           |
| Xóa khoảng trắng | `trim()`                                   |
| Tách chuỗi       | `split(String regex)`                      |
| Kiểm tra chuỗi   | `startsWith()`, `endsWith()`, `contains()` |
| So sánh thứ tự   | `compareTo()`                              |
| Lấy ký tự        | `charAt()`                                 |
## 📌 Ghi nhớ

- `final`: tạo ra hằng số không thay đổi.
- `Math`: hỗ trợ đầy đủ các hàm tính toán toán học.
- `String`: lớp quan trọng với nhiều phương thức thao tác chuỗi.