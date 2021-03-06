/**
 * @author Vasilshift
 */
package com.example.modulshops.util;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class RandomInserting {
    public static List<Object> random(List<? extends Object> list) {
        int rand = (int) (Math.random() * list.size());

        //List<Object> shopList = Collections.singletonList(list.stream().limit(rand));

        return IntStream.range(0, rand).mapToObj(list::get).collect(Collectors.toList());


    }
}
