package Day2.BT_Collection;

import Day2.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> arr = new ArrayList<>();
        SinhVien sinhVien1 = new SinhVien("ST200","Nguyen Thi Ngoc Anh","05/04/2000","Bac Giang");
        SinhVien sinhVien2 = new SinhVien("ST201","Nguyen Thi Ngoc Anh","05/04/2000","Bac Giang");
        SinhVien sinhVien3 = new SinhVien("ST202","Nguyen Thi Ngoc Anh","05/04/2000","Bac Giang");
        arr.add(sinhVien1);
        arr.add(sinhVien2);
        arr.add(sinhVien3);
        System.out.println(arr);
    }
}
