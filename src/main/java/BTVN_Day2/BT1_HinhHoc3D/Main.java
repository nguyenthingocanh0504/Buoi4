package BTVN_Day2.BT1_HinhHoc3D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HinhHoc3D> hinhHoc3DList= new ArrayList<>();

        hinhHoc3DList.add(new HinhCau(3));
        hinhHoc3DList.add(new HinhLapPhuong(4));
        hinhHoc3DList.add(new HinhCau(4));
        hinhHoc3DList.add(new HinhLapPhuong(5));

        System.out.println(hinhHoc3DList);

        HinhHoc3D minHinhHoc3D=hinhHoc3DList.get(0);
        for (int i = 0; i < hinhHoc3DList.size(); i++) {
            if (minHinhHoc3D.tinhTheTich()>hinhHoc3DList.get(i).tinhTheTich()){
                minHinhHoc3D=hinhHoc3DList.get(i);
            }
        }
        System.out.println("The tich min "+minHinhHoc3D);


    }
}
