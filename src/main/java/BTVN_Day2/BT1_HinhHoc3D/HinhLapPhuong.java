package BTVN_Day2.BT1_HinhHoc3D;

public class HinhLapPhuong implements HinhHoc3D{
    private double canh=1.0;

    public HinhLapPhuong() {
    }

    public HinhLapPhuong(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhLapPhuong{" +
                "canh=" + canh +
                '}';
    }

    @Override
    public double tinhTheTich() {
        return Math.pow(canh,3);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
}
