package Day2.BT1Set;

public class HinhLapPhuong implements HinhHoc3D{
    private double canh=1.0;

    public HinhLapPhuong(double canh) {
        this.canh = canh;
    }

    public HinhLapPhuong() {
    }

    @Override
    public String toString() {
        return "HinhLapPhuong{" +
                "canh=" + canh +
                '}';
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhTheTich() {
        return Math.pow(canh,3);
    }

    public static int inputFromKeyBoard(){
        return 0;
    }

}
