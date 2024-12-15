package javacode;

import java.util.*;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(2);

        // Consumer<Integer> com = n->System.out.println(n);

        nums.forEach(n->System.out.println(n));
    }
}
