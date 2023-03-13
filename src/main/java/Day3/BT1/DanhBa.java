package Day3.BT1;

public class DanhBa {
    private String hoTen;
    private int sdt;

    @Override
    public String toString() {
        return "DanhBa{" +
                "hoTen='" + hoTen + '\'' +
                ", sdt=" + sdt +
                '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public DanhBa(String hoTen, int sdt) {
        this.hoTen = hoTen;
        this.sdt = sdt;
    }

    public DanhBa() {
    }
}
