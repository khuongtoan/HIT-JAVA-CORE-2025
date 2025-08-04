# Buổi 5

## 🔑 4 tính chất quan trọng của OOP (Lập trình hướng đối tượng)
1. Kế thừa (Inheritance)
Là khả năng một lớp có thể kế thừa các thuộc tính và phương thức từ lớp khác. Giúp tái sử dụng mã và mở rộng chức năng của lớp mà không cần viết lại mã từ đầu.

2. Đóng gói (Encapsulation)
Là việc ẩn dữ liệu và chỉ cho phép truy cập thông qua các phương thức được cung cấp (getter, setter). Điều này giúp bảo vệ dữ liệu và kiểm soát quyền truy cập.

3. Đa hình (Polymorphism)
Là khả năng một đối tượng có thể có nhiều hình thức khác nhau. Trong Java, điều này thường thể hiện qua việc override hoặc overload phương thức.

4. Trừu tượng (Abstraction)
Là khả năng ẩn đi chi tiết triển khai và chỉ hiển thị những gì cần thiết. Trong Java, tính trừu tượng được thể hiện qua abstract class hoặc interface.
## 1. Static và final

- Static: Trong Java, từ khóa "static" được sử dụng để khai báo một thành phần (biến hoặc phương thức) thuộc về lớp chứ không thuộc về các thể hiện cụ thể của lớp đó. Điều này có nghĩa là khi một biến hoặc phương thức được khai báo là static, chúng có thể được truy cập thông qua tên lớp mà không cần tạo ra một thể hiện của lớp đó.

- Final: Khi một biến được khai báo là "final", giá trị của biến đó không thể thay đổi sau khi đã được gán khi khởi tạo. Điều này có nghĩa là biến final chỉ có thể được gán giá trị một lần và sau đó không thể thay đổi nữa.


```java
public class MathUtils {
    public static final double PI = 3.14159;  // Biến static final - hằng số PI
    public static int counter = 0;           // Biến static đếm số lượng thể hiện đã được tạo
    
    public MathUtils() {
        counter++;
    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.PI);     // Truy cập biến static final PI thông qua tên lớp
        System.out.println(MathUtils.add(5, 3));  // Gọi phương thức static add
        System.out.println(MathUtils.counter);    // Truy cập biến static counter
        
        MathUtils utils1 = new MathUtils();
        MathUtils utils2 = new MathUtils();
        System.out.println(MathUtils.counter);    // In ra số lượng thể hiện đã được tạo
    }
}

```

## 2. Con trỏ ‘this’

- Trong Java, từ khóa "this" tham chiếu đến thể hiện của lớp đang thực thi, cho phép truy cập vào các thành viên (biến và phương thức) của thể hiện đó.


```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name; // Gán giá trị tham số name cho biến name của thể hiện đang được tạo
    }
    
    public void printName() {
        System.out.println("My name is " + this.name); // Sử dụng biến name của thể hiện hiện tại
    }


    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.printName();
    }
}

```


## 3. Nạp chồng phương thức( Method Overloading)

- Nạp chồng phương thức cho phép bạn định nghĩa nhiều phương thức cùng tên trong cùng một lớp, nhưng có tham số khác nhau (kiểu tham số hoặc số lượng tham số).

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));       // Gọi phương thức int add(int a, int b)
        System.out.println(calculator.add(2.5, 3.5));   // Gọi phương thức double add(double a, double b)
    }
}
```

## 4. Quan hệ HAS-A (Sở hữu một...)

- Quan hệ HAS-A xuất hiện khi một đối tượng chứa một thể hiện của một lớp khác như một thành viên của nó (Nó tương tự như kết tập trong c++ nếu bạn nào đã học OOP C++).

``` java

public class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println("Engine started");
    }
}

public class Car {
    private String brand;
    private Engine engine; // Quan hệ HAS-A với động cơ

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType);
    }
    
    public void startCar() {
        System.out.println("Starting the " + brand + " car");
        engine.start(); // Gọi phương thức của đối tượng động cơ
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Gasoline");
        car.startCar();
    }
}


```

## 5. Mảng đối tượng

- Mảng đối tượng trong java cho phép khởi tạo và lưu trữ 1 danh sáhc gồm nhiều đối tượng của 1 lớp.


``` java


public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class School {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Tạo mảng chứa các đối tượng Student
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        
        for (Student student : students) {
            System.out.println("Student name: " + student.getName());
        }
    }
}


```













