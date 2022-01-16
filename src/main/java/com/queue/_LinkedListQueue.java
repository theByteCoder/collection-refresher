package com.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _LinkedListQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        /* offer - alternate for add. both offer and add return true if insert is successful.
        but add throws exception if unsuccessful. if unsuccessful offer return false */
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);
        queue.offer(90);
        queue.offer(100);
        queue.offer(110);

        System.out.println(queue);

        /* peek - alternate for element. both peek and element return next-in-line of the queue.
        but throws exception if no element is next-in-line or queue is empty.
        if queue is empty or no next-in-line peek return null */
        int peek = queue.peek();
        System.out.println(peek);
        System.out.println(queue);

        /* poll - alternate for remove. both poll and remove return true if delete is successful.
        but remove throws exception if unsuccessful. if unsuccessful poll return false */
        int poll = queue.poll();
        System.out.println(poll);
        System.out.println(queue);

        queue.stream().forEach(System.out::println);

    }
}
