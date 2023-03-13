package Day3.BT1;

import java.util.*;

public class Main {
    public static Map<String, String> listContact=new HashMap<>();
    private static void mainMenu(){
        System.out.println("1. Them danh ba");
        System.out.println("2. Cap nhat danh ba");
        System.out.println("3. Xoa danh ba");
        System.out.println("4. Xem toan bo danh ba");
        System.out.println("5. Thoat");
    }
    private static void optione1(Scanner in){
        System.out.println("Nhap so dien thoai: ");
        String sdt=in.nextLine();
        if(!listContact.containsKey(sdt)){
            System.out.println("Da ton tai lien he");
            return;
        }
        System.out.println("Nhap ten lien he: ");
        String hoTen=in.nextLine();
        listContact.put(sdt,hoTen);
        System.out.println("Luu thanh cong");
    }
    private static void optione2(Scanner in){
        System.out.println("Nhap so dien thoai: ");
        String sdt=in.nextLine();
        if(!listContact.containsKey(sdt)){
            System.out.println("Da ton tai lien he");
            return;
        }
        String hoTenCu = listContact.get(sdt);
        System.out.println("Ten lien he cu la: "+hoTenCu);
        System.out.println("Nhap ten lien he moi: ");

    }
    public static void main(String[] args) {
//        Map<String, Integer> listMap= new HashMap<String, Integer>();
//
//        listMap.put("Anh",1949858);
//        listMap.put("Ngoc anh", 28585885);
//
//        Set set1= listMap.keySet();
//        for (Object key : set1) {
//            System.out.println(key + " " + listMap.get(key));
//        }
//
//
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Nhap ten danh ba can xoa: ");
//        String tenDB=sc.nextLine();
//        for (Object key: set1) {
//
//        }
        Scanner sc=new Scanner(System.in);
//        Map<String, String> listContact=new HashMap<>();
        listContact.put("1949858","Anh");
        listContact.put("1949857","Anh");
        int option=2;
        do{
            mainMenu();
            System.out.println("Nhap lua chon: ");

            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    for (String phone: listContact.keySet()) {
                        System.out.printf("%s - %s",listContact.get(phone),phone);
                    }
                    break;
                case 5:
                    break;
            }
        }while (option!=5);
        sc.close();
    }
}
