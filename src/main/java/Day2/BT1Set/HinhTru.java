package Day2.BT1Set;

public class HinhTru implements HinhHoc3D {
    private double chieuCao=1.0;
    private double banKinh=1.0;

    public HinhTru() {
    }

    public HinhTru(double chieuCao, double banKinh) {
        this.chieuCao = chieuCao;
        this.banKinh = banKinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return Math.PI*Math.pow(banKinh,2)*chieuCao;
    }

    @Override
    public int compareTo(HinhHoc3D o) {
        return HinhHoc3D.super.compareTo(o);
    }
}
