package com.stacks;

import java.util.Stack;

public class _Stack {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        integerStack.push(50);
        integerStack.push(60);
        integerStack.push(70);
        integerStack.push(80);
        integerStack.push(90);
        integerStack.push(100);
        integerStack.push(110);

        System.out.println(integerStack);

        // get top element without removing from stack
        final Integer peek = integerStack.peek();
        System.out.println(peek);

        // get top element OR remove top element from stack
        final Integer pop = integerStack.pop();
        System.out.println(pop);
        System.out.println(integerStack);
    }
}
