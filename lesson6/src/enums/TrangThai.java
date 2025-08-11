package enums;

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
