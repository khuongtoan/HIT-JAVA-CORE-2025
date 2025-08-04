

public class Student {

    private String name;
    private int namsinh;
    private String address;
    private double point1;
    private double point2;
    private double KTHP;
    private int sotietnghi;

    public Student(String name, int namsinh, String address, double point1, double point2, double KTHP, int sotietnghi) {
        this.name = name;
        this.namsinh = namsinh;
        this.address = address;
        this.point1 = point1;
        this.point2 = point2;
        this.KTHP = KTHP;
        this.sotietnghi = sotietnghi;
    }

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return " Tên " + this.name + " Tuổi " + this.age() + " Địa chỉ " + this.address +
                " Điểm TX1 " + this.point1 + " Điểm TX2 " + this.point2 +
                " Điểm KTHP " + this.KTHP + "Điểm GPA" + this.getGPA()+ "Số tiết nghỉ " + this.getSotietnghi() ;
    }

    public double getGPA (){
        return point1*0.2 + point2 * 0.3 + KTHP* 0.5;
    }

    public int age (){
        return 2025 - this.namsinh;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public double getKTHP() {
        return KTHP;
    }

    public void setKTHP(double KTHP) {
        this.KTHP = KTHP;
    }

    public int getSotietnghi() {
        return sotietnghi;
    }

    public void setSotietnghi(int sotietnghi) {
        this.sotietnghi = sotietnghi;
    }
}
