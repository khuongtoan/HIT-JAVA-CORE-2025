# HƯỚNG DẪN SỬ DỤNG GIT CƠ BẢN

## Cài đặt Git  (video)

## Cấu hình ban đầu  
```
git config --global user.name "Tên của bạn"
git config --global user.email "email_của_bạn@example.com"
```
## Lệnh Git cơ bản

## Khởi tạo repo
```git init```

# Thêm file thay đổi
``` 
git add tên_file  # Thêm file cụ thể
git add .         # Thêm tất cả thay đổi
```
# Commit thay đổi
```
git commit -m "Ghi chú commit"
```
# Đẩy code lên remote
```
git push origin tên nhánh
```

# *Lưu ý quan trọng*
các bước cấu hình và init chỉ cần làm lần đầu tiên
sau đó hay dùng 3 lệnh 
```
git add .
git commit -m "comment"
git push origin main
```
Viết commit message rõ ràng, mô tả thay đổi
```
DELL@dell-Khuong-Xuan-Toan MINGW64 /d/HIT-JAVA-CORE-2025 (main)
$ -> tên nhánh hiện tại là main
```
