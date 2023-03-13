package Day3.Consummer;

import Day3.BT1.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);

        // duyet list
        // y= 3x^2 + 5x -1

        Consumer<Double> y = aDouble -> {
            double y1 =3*aDouble*aDouble+5*aDouble-1;
            System.out.println(y1);
        };
        for (double n: numbers) {
            y.accept(n);
        }
        //Tang gia tri len gap doi
        Consumer<Double> f2= aDouble -> {
            aDouble=aDouble*2;
        };

    }
}
