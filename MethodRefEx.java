package javacode;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shashi", "Sundar", "Basava");
        //convert name to uppercase and print
        List<String> uName = names.stream()
             .map(name -> name.toUpperCase())
             .toList();
        uName.forEach(name -> System.out.println(name));

        //instead of above code, i will use method reference
        List<String> mNames = names.stream()
            .map(String::toUpperCase)
            .toList();
        mNames.forEach(System.out::println);
    }
}
