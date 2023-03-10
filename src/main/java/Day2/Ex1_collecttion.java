package Day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex1_collecttion {
    public static void main(String[] args) {
        //tao 1 arrayList luu tru thong tin cua cac ban sinh vien
        //chua biet so luong cu the co the them nhieu
        List<Student> arr = new ArrayList<>();
        Student s1 = new Student(1,"Anh");
        arr.add(s1);
        Student s2 = new Student(2,"Anh");
        arr.add(s2);
        System.out.printf("Co %d ban sinh vien",arr.size());
        System.out.println(arr);

        //Thay doi ten cua ban Student 2
        Student s = arr.get(1);
        s.setName("Hoa");

        Student s3 = new Student(2,"Anh3");
        arr.set(1,s3);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        // sap xep
        Collections.sort(arr);
    }
}
