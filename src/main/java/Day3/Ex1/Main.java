package Day3.Ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<Xe>> listMap = new HashMap<>();

        Person p1 = new Person(1,"anh","male");
        Person p2 = new Person(2,"ngoc anh","female");

        Xe x1= new Xe(1,"Mec","Trang");
        Xe x2= new Xe(2,"Mecerdex","Trang");
        Xe x3= new Xe(3,"Mec2","Den");

        listMap.put(p1, Arrays.asList(x1,x2));

        listMap.put(p2, Arrays.asList(x2));

        System.out.println(listMap);

        List<Xe> xeList = new ArrayList<>(listMap.get(p1));
        xeList.add(x3);

        listMap.put(p1,xeList);

        System.out.println(xeList);


    }
}
