package Day2.SetExample;

import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();

        Car car1=new Car(1,"Honda");
        Car car2=new Car(2,"YAMAHA");

        carSet.add(car1);
        carSet.add(car2);
        Car car3=car1;
        System.out.println(car3.hashCode());
        System.out.println(car1.hashCode());

        System.out.println(carSet);

        //gia su co 1 set cac phan tu -> duyet theo cac chi so

        List<Car> list = new ArrayList<>();
        list.addAll(carSet);
        System.out.println(list);
        System.out.println(list.get(0));

        // co 1 list cac phan tu, bao gom cac gia tri trung lap
        // -> tao list moi khong bi trung lap

        List<String> stringList = Arrays.asList("hello","hi","hi","abc");
        System.out.println(stringList);

        Set<String> tmpSet=new HashSet<>();
        tmpSet.addAll(stringList);

        List<String> newList1 = new ArrayList<>(tmpSet);

        System.out.println(newList1);
        System.out.println(newList1.get(0));
    }
}
