package Day2.BT1Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HinhHoc3D> arrHoc3DS = new ArrayList<>();

        HinhCau hinhCau1=new HinhCau(1);
        HinhLapPhuong hinhLapPhuong1=new HinhLapPhuong(4);
        HinhCau hinhCau2=new HinhCau(3);
        HinhLapPhuong hinhLapPhuong2=new HinhLapPhuong(4);

        arrHoc3DS.add(new HinhCau(3));
        arrHoc3DS.add(new HinhLapPhuong(3));
        arrHoc3DS.add(new HinhCau(4));
        arrHoc3DS.add(new HinhLapPhuong(4));
        arrHoc3DS.add(new HinhTru(1,1));

        System.out.println(arrHoc3DS);

        double min = hinhCau1.tinhTheTich();
        for (HinhHoc3D hinhHoc3D: arrHoc3DS) {
            if(hinhHoc3D.tinhTheTich()<min)
            {
                min=hinhHoc3D.tinhTheTich();
            }
        }
        System.out.println("The tich nho nhat "+min);
        int count=0;
        double tong=0;
        for (HinhHoc3D hinhHoc3D: arrHoc3DS) {
            tong=tong+hinhHoc3D.tinhTheTich();
            count++;
        }
        double avg=tong/count;
        System.out.println("\nTrung binh cong "+avg);

        //sap xep tang dan
        Collections.sort(arrHoc3DS);
        System.out.println(arrHoc3DS);

        //Sap xep giam dan
        Collections.sort(arrHoc3DS, new Comparator<HinhHoc3D>() {
            @Override
            public int compare(HinhHoc3D o1, HinhHoc3D o2) {
                if(o1.tinhTheTich()>o2.tinhTheTich()){
                    return -1;
                } else if (o1.tinhTheTich()>o2.tinhTheTich()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(arrHoc3DS);
    }
}
