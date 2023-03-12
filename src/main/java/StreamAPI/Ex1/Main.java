package StreamAPI.Ex1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6);
        Stream<Integer> data = nums.stream();
        data.forEach(n-> System.out.println(n));

        //tao 1 stream
        Stream<String> streamEmpty = Stream.empty();

        //Tao 1 stream tu collection
        Collection<String> collection= Arrays.asList("Java","c#","c++");
        Stream<String> streamOfCollecttion=collection.stream();

        //Stream tao tu 1 array hoac 1 phan tu cua array
        Stream<String> streamOfArray= Stream.of("java","c#");
        streamOfArray.forEach(n-> System.out.print(n+"\t"));
        //su dung mang cach 2
        System.out.println("Stream mang cach 2:");
        String[] arr = new String[]{"java1","C++","C#","Kotlin"};
        Stream<String> streamOfArray1=Arrays.stream(arr);
        Stream<String> streamOfArray2=Arrays.stream(arr,2,3);
        streamOfArray1.forEach(n-> System.out.print(n+"\t"));
        streamOfArray2.forEach(n-> System.out.print(n+"\t"));

        //Stream.builder()
        System.out.println("\nStrembuilder");
        Stream<String> streamBuilder= Stream.<String>builder().add("java").add("C#").build();
        streamBuilder.forEach(n-> System.out.print(n+"\t"));

        //stream.generate()
        System.out.println("\nStream.generate");
        Stream<String> streamGenerated= Stream.generate(()->"Ngon ngu lap trinh").limit(2);
        streamGenerated.forEach(n-> System.out.print(n+"\t"));

        //Stream.interate()
        System.out.println("\nStream.interate");
        Stream<String> streamInterate = Stream.iterate("anh.nguyen",n->n+1).limit(5);
        List<String> listInterate = streamInterate.collect(Collectors.toList());
        System.out.println(listInterate);

        //Dung stream toArray()
        System.out.println("\nDung stream toArray: ");
        Stream<Integer> intStream=Stream.of(1,2,3,4,5,6);
        Integer[] intArray = intStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));

        //dung stream.filler() tra ve 1 stream gom cac phan tu khop voi dieu kien predicate
        System.out.println("\nStream.filter: ");
        Predicate<Integer> p = num->num%2==0;
        List<Integer> list = Arrays.asList(3,4,6);
        list.stream().filter(p).forEach(e-> System.out.println(e+" "));
        // stream.allMathch(),Stream.anyMatch() and Stream.noneMatch()
        // allMatch(): tra ve true neu tat ca phan tu khop voi predicate
        // anyMatch(): tra ve true neu co it nhat 1 phan tu khop voi predicate
        // noneMatch(): tra ve true neu khong co phan tu nao khop voi predicate
        System.out.println("allMatch: "+list.stream().allMatch(p));
        System.out.println("anyMatch: "+list.stream().anyMatch(p));
        System.out.println("noneMatch: "+list.stream().noneMatch(p));

        //Stream.findAny() and stream.findFirst()
        //findAny(): tra ve 1 phan tu bat ky cua stream
        //findFirst(): tra ve phan tu dau tien cua stream
        List<String> list1=Arrays.asList("S","A","N");
        String any=list1.stream().findAny().get();
        System.out.println("FindAny: "+any);
        String first = list1.stream().findFirst().get();
        System.out.println("FindFirst: "+ first);

        //stream.distince
        List<Integer> list2 = Arrays.asList(2,3,6,6,7,4,3);
        System.out.println("\nCac phan tu khong trung lap la: ");
        list2.stream().distinct().forEach(n-> System.out.print(n+" "));


    }
}
