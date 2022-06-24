package com.bridgelabz.lambda;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface MyFunctionalInterface<E> {
    public abstract E calculate(E x, E y);

    static <E> void calculate(E x, E y, String functionality, MyFunctionalInterface reference) {
        System.out.println(functionality + " of " + x + " and " + y +" is "+ reference.calculate(x, y));
    }

}

public class LambdaExpression {
    public static void main(String[] args) {
        MyFunctionalInterface<Integer> sum = (a, b) -> a + b;   // method implementation
        MyFunctionalInterface<Float> subtract = (a, b) -> a - b;
        MyFunctionalInterface<Double> remainder = (a, b) -> a % b;
        MyFunctionalInterface<Float> quotient = (a, b) -> a / b;
        MyFunctionalInterface<Integer> addition = Integer::sum;


        System.out.println(sum.calculate(5, 3));
        System.out.println(subtract.calculate(5.4F, 3.1f));
        System.out.println(remainder.calculate(5.1, 3.9));
        System.out.println(quotient.calculate(5.0f, 3.0f));
        System.out.println("method reference " + addition.calculate(4, 9));

        MyFunctionalInterface<Integer> add = (a, b) -> {
            System.out.println("in add");
            return a + b;
        };

        System.out.println(add.calculate(5, 4));

        System.out.println("****************");

        MyFunctionalInterface.calculate(70,30,"addition",sum);


    }

}
