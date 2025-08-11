package baitapnhanvien;

public class NhanVien {
    private String maNV;
    private String ten;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public NhanVien(String maNV, String ten, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public double tinhLuong() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Email: " + email);
        System.out.println("SĐT: " + soDienThoai);
        System.out.println("Lương: " + tinhLuong());
    }

    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public int getTuoi() { return tuoi; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }
}
