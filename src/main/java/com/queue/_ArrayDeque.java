package com.queue;

import java.util.ArrayDeque;

public class _ArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.offer(30);
        integerArrayDeque.offer(10);
        integerArrayDeque.offer(40);
        integerArrayDeque.offer(20);
        integerArrayDeque.offer(50);

        System.out.println(integerArrayDeque);

        // peek
        final Integer peek = integerArrayDeque.peek();
        System.out.println(peek);

        // peek first
        System.out.println(integerArrayDeque.peekFirst());

        // peek last
        System.out.println(integerArrayDeque.peekLast());

        // poll
        final Integer poll = integerArrayDeque.poll();
        System.out.println(poll);
        System.out.println(integerArrayDeque);

        // poll first
        final Integer pollFirst = integerArrayDeque.pollFirst();
        System.out.println(pollFirst);
        System.out.println(integerArrayDeque);

        // poll last
        integerArrayDeque.poll();
        System.out.println(integerArrayDeque);
    }
}
