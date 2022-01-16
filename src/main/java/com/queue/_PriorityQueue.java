package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _PriorityQueue {

    public static void main(String[] args) {
        // priority queue implicitly implements a min heap
        final PriorityQueue<Integer> priorityQueueMinHeap = new PriorityQueue<>();
        priorityQueueMinHeap.offer(30);
        priorityQueueMinHeap.offer(10);
        priorityQueueMinHeap.offer(40);
        priorityQueueMinHeap.offer(20);
        priorityQueueMinHeap.offer(50);

        System.out.println(priorityQueueMinHeap);

        /* priority queue implements a max heap
        when we pass Comparator.reverseOrder() as an argument in the constructor */
        final PriorityQueue<Integer> priorityQueueMaxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueueMaxHeap.offer(30);
        priorityQueueMaxHeap.offer(10);
        priorityQueueMaxHeap.offer(40);
        priorityQueueMaxHeap.offer(20);
        priorityQueueMaxHeap.offer(50);

        System.out.println(priorityQueueMaxHeap);

    }

}
