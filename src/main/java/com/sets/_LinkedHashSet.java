package com.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class _LinkedHashSet {

    public static void main(String[] args) {
        /* linked hash set is ordered and unsorted. it implements a linked list internally.
        time complexity is O(1) */
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(40);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(50);
        linkedHashSet.add(60);
        linkedHashSet.add(30);
        linkedHashSet.add(10);

        System.out.println(linkedHashSet);

        linkedHashSet.remove(10);
        System.out.println(linkedHashSet);

        linkedHashSet.clear();
        System.out.println(linkedHashSet.contains(10));
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet);

    }
}
