package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<? super Number> dd = new ArrayList<>();
        dd.add(new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        });
        System.out.println(dd.get(0).toString() + "dd");
ArrayList<Integer> ggwp = new ArrayList<>();

ggwp.add(3);
ggwp.add(10);
ggwp.add(12);
ggwp.add(1, 100);
//ggwp.forEach(t -> System.out.println(t));
        LinkedList<Integer> s = new LinkedList<>();
        s.add(3);
        s.add(2);
        s.add(11);
//        for (int i = 0; i < s.size(); i++) {
//            System.out.println(s.get(i));
//        }

    }


}