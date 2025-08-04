# BÀi Tập Trên Lớp: Quản Lý Trại Chăm Sóc Thú Cưng (Phiên bản Đơn Giản)

## 🎯 Yêu cầu:

### 1. Lớp `Pet` – Đại diện cho thú cưng

#### Thuộc tính:

* `String name` – tên thú cưng
* `double weight` – cân nặng (kg)
* `String species` – loài (VD: "Cat", "Dog")

#### Constructor:

* Sử dụng `this` để gán giá trị cho thuộc tính.

#### Phương thức:

* `void printInfo()` – in tên, loài, và cân nặng.
* `boolean isOverweight()` – trả `true` nếu cân nặng > 10.
* `String getBasicInfo()` – trả về tên + loài.

---

### 2. Lớp `Cage` – Lồng chứa thú cưng (HAS-A với Pet)

#### Thuộc tính:

* `String cageCode` – mã lồng
* `Pet[] pets` – mảng các thú trong lồng
* `int currentPetCount` – số thú hiện tại trong lồng
* `static int totalCages` – biến đếm số lồng đã tạo
* `final int MAX_CAPACITY = 3` – số thú tối đa trong một lồng

#### Constructor:

* Khởi tạo mã lồng, mảng Pet, tăng `totalCages`.

#### Phương thức:

* `void addPet(Pet pet)` – thêm thú vào lồng nếu chưa đầy.
* `void printAllPets()` – in thông tin các thú trong lồng.

---

### 3. Lớp `Main`

* Tạo 2 lồng
* Thêm vài thú cưng vào mỗi lồng
* In ra:

  * Số lồng đã tạo
  * Danh sách thú trong từng lồng
  * Danh sách thú nặng hơn 10kg

## 🔹 Mục tiêu:

* Sử dụng `this`, `static`, `final`, mảng đối tượng, HAS-A.
* Biết tổ chức code theo nhiều class liên quan.
