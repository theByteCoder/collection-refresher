package com.sets;

import java.util.Set;
import java.util.TreeSet;

public class _TreeSet {

    public static void main(String[] args) {
        /* tree set is sorted. it implements a binary search tree internally for sorting
         * time complexity is O(log n) */
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(60);
        treeSet.add(10);
        treeSet.add(90);
        treeSet.add(50);
        treeSet.add(10);

        System.out.println(treeSet);
    }
}
