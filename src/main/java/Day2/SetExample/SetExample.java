package Day2.SetExample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //tao 1 set chua cac chuoi duoc nhap tu ban phim
        Scanner sc=new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (true){
            System.out.println("Enter your string: ");
            String tmp=sc.nextLine();
            if (tmp.equalsIgnoreCase("exit")) break;
            stringSet.add(tmp);
            System.out.println(stringSet);
        }
        sc.close();
    }
}
