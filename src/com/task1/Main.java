package com.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 2001 - 1001));
        }
        for (int i = 0; i < 100; i++) {
            if (list.get(i) >= 0)
                list.add(list.get(i));
        }
        for (int i = 0; i < 100; i++) {
            if (list.get(i) < 0)
                list.add(list.get(i));
        }

        for (int i = 0; i < 100; i++) {
            list.remove(0);
        }
        System.out.println(list);
    }
}
