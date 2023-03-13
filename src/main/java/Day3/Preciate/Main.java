package Day3.Preciate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //co 1 list String
        List<String> stringList = Arrays.asList("hello","hi","xin chao cac ban");

        //loc ra nhung chuoi co so tu lon hon 10 va co tu 'a'

        Function<String, Integer> demSoTu = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int count=0;
                if(s.charAt(0)!=0)
                {
                    count++;
                }
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)==' '&&s.charAt(i+1)!=' ')
                        count++;
                }
                return count;
            }
        };

        Predicate<String> soTuLonHon2 = s -> {
            return demSoTu.apply(s)>2;
        };

        Predicate<String> kiemTraCoChuaA = s -> s.contains("a");

        for (String s:
             stringList) {
            if (soTuLonHon2.test(s)&&kiemTraCoChuaA.test(s)){
                System.out.println(s);
            }
        }
    }
}
