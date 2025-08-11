package baitapnhanvien;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String ten, int tuoi, String email, String soDienThoai,
                            int soGioLam, double luongTheoGio) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loại: Part Time");
        System.out.println("----------------------");
    }

    public int getSoGioLam() { return soGioLam; }
    public void setSoGioLam(int soGioLam) { this.soGioLam = soGioLam; }

    public double getLuongTheoGio() { return luongTheoGio; }
    public void setLuongTheoGio(double luongTheoGio) { this.luongTheoGio = luongTheoGio; }
}
