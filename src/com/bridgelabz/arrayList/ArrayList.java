package com.bridgelabz.arrayList;

import java.util.Comparator;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list1 = new java.util.ArrayList<>();
        list1.add(5);
        list1.add(52);
        list1.add(31);
        list1.add(27);

        System.out.println(list1);

        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();
        list2.add(1);
        list2.add(85);
        list2.add(31);
        list2.add(45);

        System.out.println(list2);

        System.out.println("*******************************");
        list1.set(1, 55);
        list1.add(2, 81);
        System.out.println(list1);

        System.out.println("*******************************");
        list1.addAll(list2);
        System.out.println(list1);


        System.out.println("*******************************");
        System.out.println(list1.contains(45));

        //list2.clear();   //=> clear all that is contained in list
        System.out.println("*******************************");

        list1.add(85);
        list1.add(85);
        list1.add(86);
        list1.remove(6);
        System.out.println(list1);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("*******************************");

        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println("*******************************");
        ComparableSample<Integer> obj = new ComparableSample();
        list1.sort(obj);

        System.out.println(list1);

    }
}

class ComparableSample<E extends Comparable<E>> implements Comparator<E>{
    public int compare(E o1,E o2){
        return o1.compareTo(o2);
    }
}
