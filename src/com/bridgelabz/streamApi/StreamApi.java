package com.bridgelabz.streamApi;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        list1.add(100);
        list1.add(300);
        list1.add(200);
        list1.add(900);
        list1.add(400);
        list1.add(700);
        list1.add(800);

        // functional interfaces are Consumer, Predicate, Function, Supplier

        Consumer<Integer> c1 = x -> System.out.print(x +" ");
        Predicate<Integer> p1 = x -> x > 400 ? true : false;
        Function<Integer, Integer> f1 = x -> x * 10;

        c1.accept(5);
        System.out.println();
        System.out.println(p1.test(500));
        System.out.println(f1.apply(25));

        System.out.println("*******************************************");

        List l1 = list1.stream().filter(x -> x > 400 ? true : false).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(l1);

        List l2 = list1.stream().map(x -> x * 10).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(l2);

        list1.stream().filter(x -> x > 400 ? true : false).map(x -> x * 10).forEach( x -> System.out.print(x+" "));
        // or
        System.out.println();
        list1.stream().filter(p1).map(f1).forEach(c1);

    }
}
