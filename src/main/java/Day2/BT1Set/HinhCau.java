package Day2.BT1Set;

public class HinhCau implements HinhHoc3D{
    private double banKinh=1.0;

    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhCau() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return 4/3*Math.PI*Math.pow(banKinh,3);
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh +
                '}';
    }

}
