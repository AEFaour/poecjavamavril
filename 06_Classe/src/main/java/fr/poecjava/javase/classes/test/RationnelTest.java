package fr.poecjava.javase.classes.test;

import fr.poecjava.javase.classes.Rationnel;

public class RationnelTest {
    public static void main(String[] args) {
        Rationnel r1 = new Rationnel(1, 2);
        Rationnel r2 = new Rationnel(4, 3);


        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(Rationnel.create(5,6).toString());
        System.out.println(r1.copy().toString());
        System.out.println(r1.opposite().toString());
        System.out.println(r1.inverse().toString());
        r1.reduce();
        r2.reduce();
        System.out.println(r1.isPositive());
        System.out.println(r1.opposite().isPositive());
        System.out.println(r1.add(r2).toString());
        r1.addTo(r2);
        System.out.println(r1.sub(r2).toString());
        System.out.println(r1.multiply(r2).toString());
        System.out.println(r1.divide(r2).toString());
        System.out.println(r1.equals(r2));
        System.out.println(r1.compareTo(r2));
    }
}
