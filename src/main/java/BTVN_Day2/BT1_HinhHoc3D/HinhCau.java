package BTVN_Day2.BT1_HinhHoc3D;

public class HinhCau implements HinhHoc3D{
    private double banKinh=1.0;

    public HinhCau() {
    }

    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh +
                '}';
    }

    @java.lang.Override
    public double tinhTheTich() {
        return 4/3*Math.PI*Math.pow(banKinh,3);
    }
}
