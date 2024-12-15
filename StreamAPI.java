package javacode;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,6,2,2);
        Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n->n%2 == 0);
        // Stream<Integer> s3 = s2.map(n->n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);
        int result = s1.filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0, (c,e)->c+e);
        System.out.println(result);
    }
    
    
}
