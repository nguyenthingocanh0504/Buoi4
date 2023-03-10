package Day2.BT_Collection;

public class Diem{
    private String MaSV;
    private String MaMonHoc;
    private int diemSo;

    public Diem() {
    }

    public Diem(String maSV, String maMonHoc, int diemSo) {
        MaSV = maSV;
        MaMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }
}

