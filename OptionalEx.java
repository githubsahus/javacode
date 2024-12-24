package javacode;

import java.util.*;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("charan");
        names.add("santosh");
        names.add("prateek");

        Optional<String> op = names.stream()
                .filter(name -> name.contains("x"))
                .findFirst();

        System.out.println(op.orElse("Not Found"));
    }
}
