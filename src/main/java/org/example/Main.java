package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.mult(4, 4));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.sub(9, 8));
        System.out.println(intsCalc.div(9, 2));
    }
}