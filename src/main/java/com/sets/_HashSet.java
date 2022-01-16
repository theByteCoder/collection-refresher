package com.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.function.*;

public class _HashSet {

    public static void main(String[] args) {
        // hash set is unordered and unsorted. time complexity is O(1)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Subhasish");
        hashSet.add("Piyu");
        hashSet.add("Subhasish");
        hashSet.add("Lipika");
        hashSet.add("Lipika");
        hashSet.add("Subhasish");
        hashSet.add("Piyu");
        hashSet.add("Lipika");
        hashSet.add("Samarendranath");
        hashSet.add("Samarendranath");
        hashSet.add("Samarendranath");
        hashSet.add("Piyu");

        System.out.println(hashSet);

        hashSet.add("Subhasish");

        System.out.println(hashSet);

        // remove
        hashSet.remove("Subhasish");
        System.out.println(hashSet);

        hashSet.add("SubhasIsH");
        hashSet.add("subhasish");
        System.out.println(hashSet);

        Supplier<Set<String>> hashSetSupplier = () -> hashSet;

        // contains
        printer.accept(setContains.apply(hashSetSupplier.get(), "Subhasish"));

        // isEmpty
        printer.accept(isSetEmpty.apply(hashSetSupplier.get()));

        // clear
        hashSetSupplier.get().clear();

        // isEmpty
        printer.accept(isSetEmpty.apply(hashSetSupplier.get()));
    }

    static BiFunction<Set<String>, String, Boolean> setContains = (hSet, val) -> {
        Predicate<Set<String>> contains = set -> set.contains(val);
        return contains.test(hSet);
    };

    static Function<Set<String>, Boolean> isSetEmpty = hSet -> {
        Predicate<Set<String>> isEmpty = set -> set.isEmpty();
        return isEmpty.test(hSet);
    };

    static Consumer<Boolean> printer = bool -> {
        System.out.println(bool);
    };

}
