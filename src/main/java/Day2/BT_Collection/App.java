package Day2.BT_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static void mainMenu(){
        System.out.println("1. Dach sach sinh vien");
        System.out.println("2. Nhap thong tin sinh vien");
        System.out.println("3. Tim kiem sinh vien");
        System.out.println("4. Nhap thong tin sinh vien");
        System.out.println("6. Nhap diem mon hoc");
        System.out.println("7. Cap nhat diem");
        System.out.println("8. Xem diem sinh vien theo ma");
        System.out.println("9. In ra danh sach sinh vien theo cac mon hoc");
        System.out.println("10. In ra sinh vien co diem trung binh tat ca cac mon cao nhat");
        System.out.println("0. Thoat chuong trinh");
    }

    public static void main(String[] args) {

        List<SinhVien> sinhVienList=new ArrayList<>();
        sinhVienList.add(new SinhVien("BL1","Anh","2000","BG"));
        List<MonHoc> monHocList=new ArrayList<>();
        monHocList.add(new MonHoc("java","LT java"));
        List<Diem> diemList = new ArrayList<>();
        diemList.add((new Diem("BL1","java",10)));
        Scanner sc=new Scanner(System.in);
        int option=-1;
        do{
            mainMenu();
            System.out.println("nhap lua chon");
            try {
                option = Integer.parseInt(sc.nextLine());
            }catch (Exception e)
            {
                System.out.println("Error");
                continue;
            }
            if(option<1||option>10){
                System.out.println("Lua chon khong hop le");
                continue;
            }
            switch (option){
                case 1:
                    if(sinhVienList.size()==0){
                        System.out.println("Danh sach sinh vien trong");
                        continue;
                    }
                    System.out.println("danh sach sinh vien: ");
                    for (SinhVien s:sinhVienList) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    SinhVien s=new SinhVien();
                    System.out.println("\nNhap ma sinh vien: ");
                    s.setMaSV(sc.nextLine());
                    System.out.println("\nNhap ten sinh vien: ");
                    s.setTenSV(sc.nextLine());
                    System.out.println("\nNhap ngay sinh: ");
                    s.setNgaySinh(sc.nextLine());
                    System.out.println("\nNhap que quan: ");
                    s.setQueQuan(sc.nextLine());

                    sinhVienList.add(s);

                    break;
                case 3:

                    System.out.println("Nhap ma sinh vien can tim: ");
                    String maSV=sc.nextLine();
                    boolean flag = false;
                    for (SinhVien student: sinhVienList) {
                        if(student.getMaSV().equals(maSV)){
                            flag = true;
                            System.out.println(student);
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.println("Khong tim thay sinh vien do");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Nhap ma sinh vien: ");
                    String maSV1=sc.nextLine();

                    boolean flag1 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getMaSV().equals(maSV1)){
                            flag1=true;
                            break;
                        }
                    }
                    if(flag1==false){
                        System.out.println("Khong co sinh vien do");
                        continue;
                    }
                    System.out.println("Nhap ma mon hoc: ");
                    String maMH1=sc.nextLine();

                    boolean flag2 = false;
                    for (MonHoc monHoc: monHocList) {
                        if(monHoc.getMaMonHoc().equals(maMH1)){
                            flag2=true;
                        }
                    }
                    if(flag2==false){
                        System.out.println("Khong co mon hoc do");
                        continue;
                    }
                    System.out.print("Nhập điểm: ");
                    int diem = Integer.parseInt(sc.nextLine());
                    Diem d = new Diem(maSV1, maMH1, diem);

                    // Them diem vao listDiem
                    diemList.add(d);
                    break;
                case 7:
                    System.out.println("Nhap ma sinh vien: ");
                    String maSV2=sc.nextLine();

                    boolean flag3 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getMaSV().equals(maSV2)){
                            flag1=true;
                            break;
                        }
                    }
                    if(flag3==false){
                        System.out.println("Khong co sinh vien do");
                        continue;
                    }
                    System.out.println("Nhap ma mon hoc: ");
                    String maMH2=sc.nextLine();

                    boolean flag4 = false;
                    for (MonHoc monHoc: monHocList) {
                        if(monHoc.getMaMonHoc().equals(maMH2)){
                            flag2=true;
                        }
                    }
                    if(flag4==false){
                        System.out.println("Khong co mon hoc do");
                        continue;
                    }

                    //kỉem tra xem ban sv da hoc mon nay hay chua
                    Diem diem1=null;
                    for (Diem diemMH: diemList) {
                        if(diemMH.getMaSV().equals(maSV2)&&diemMH.getMaMonHoc().equals(maMH2)){
                            diem1 = diemMH;
                            break;
                        }
                    }
                    if (diem1==null){
                        System.out.println("Chua co diem mon hoc");
                    }else{
//                        diemList.set(Integer.parseInt(diem1));
                        System.out.println("Cap nhat diem thanh cong");
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }while (option!=0);


    }
}
