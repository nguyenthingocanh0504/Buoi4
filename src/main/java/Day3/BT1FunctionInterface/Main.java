package Day3.BT1FunctionInterface;

import Day3.Function.MyFunctional;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        chuoi demChuoi = new chuoi() {
            @Override
            public int chuoi(String a) {
                int count =0;
                for (int i = 0; i <a.length(); i++) {
                    if (a.charAt(i)!=' '){
                        count++;
                    }
                }
                return count;
            }
        };
        System.out.printf("Co %d ky tu trong chuoi",demChuoi.chuoi("anh nguyen"));

        //Cach 2: Su dung lambda
        chuoi demChuoi1=(a)-> a.length();
        System.out.printf("\nCo %d ky tu trong chuoi",demChuoi1.chuoi("anh nguyen"));
        chuoi demChuoi2 = new chuoi() {
            @Override
            public int chuoi(String a) {
                return a.length();
            }
        };
        System.out.printf("\nCo %d ky tu trong chuoi",demChuoi2.chuoi("anh nguyen"));


        chuoi demTu = new chuoi() {
            @Override
            public int chuoi(String a) {
                int count =0;
                if (a.charAt(0)!=' '){
                    count++;
                }
                for (int i = 0; i <a.length(); i++) {
                    if(a.charAt(i)==' '&&a.charAt(i+1)!=' ')
                    {
                        count++;
                    }
                }
                return count;
            }
        };
        System.out.printf("\nCo %d tu trong chuoi",demTu.chuoi("anh nguyen"));
        //Cach 2: Su dung lambda
        chuoi diemTu1 = a ->  {
            int count =0;
            if (a.charAt(0)!=' '){
                count++;
            }
            for (int i = 0; i <a.length(); i++) {
                if(a.charAt(i)==' '&&a.charAt(i+1)!=' ')
                {
                    count++;
                }
            }
            return count;
        };
        System.out.printf("\nCo %d tu trong chuoi",diemTu1.chuoi("Anh nguyen"));
        chuoi demTuA = new chuoi() {
            @Override
            public int chuoi(String a) {
                int count =0;
                if (a.charAt(0)!='a'||a.charAt(0)!='A'){
                    count++;
                }
                for (int i = 0; i <a.length(); i++) {
                    if(a.charAt(i)==' '&&a.charAt(i+1)!=' ')
                    {
                        count++;
                    }
                }
                return count;
            }
        };
        System.out.println("\nSo tu a hoac A trong chuoi la: "+demTuA.chuoi("Anh anh"));

        chuoi diemSoKyTu = new chuoi() {
            @Override
            public int chuoi(String a) {
                Set<Character> characters=new HashSet<>();
                for (int i = 0; i <a.length(); i++) {
                    characters.add(a.charAt(i));
                }
                return characters.size();
            }
        };
        System.out.println("So tu xuat hien 1 lan trong chuoi: "+diemSoKyTu.chuoi("Hello hello"));
    }
}
