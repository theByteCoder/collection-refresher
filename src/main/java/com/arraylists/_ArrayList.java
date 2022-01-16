package com.arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class _ArrayList {

    public static void main(String[] args) {
        // internally - a new empty array is created in the memory
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        // when first entry is made, an internal array of length 10 is allocated in the memory
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        integerArrayList.add(60);
        integerArrayList.add(70);
        integerArrayList.add(80);
        integerArrayList.add(90);
        integerArrayList.add(100);
        /* when size crosses the initial array length of 10, internally a new array is created with size n + n/2 + 1
         * and then copies the existing array to the new array */
        integerArrayList.add(110);

        // copy to new list
        List<Integer> newIntegerList = new ArrayList<>();
        newIntegerList.addAll(integerArrayList);

        // remove by value
        newIntegerList.remove(Integer.valueOf(30));

        // remove by index
        newIntegerList.remove(2);

        // set value at index
        newIntegerList.set(0, 20);
        newIntegerList.set(newIntegerList.size() - 1, 120);

        System.out.println(integerArrayList);
        System.out.println(newIntegerList);

        // clear list
        newIntegerList.clear();
        System.out.println(newIntegerList);

        // iterator
        Iterator<Integer> listIterator = integerArrayList.iterator();
        listIterator.forEachRemaining(System.out::println);

    }
}
