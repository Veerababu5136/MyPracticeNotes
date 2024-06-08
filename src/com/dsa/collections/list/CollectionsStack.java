package com.dsa.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/*
 * Stack is a subclass of Vector.
 * It represents a last-in-first-out (LIFO) stack of objects.
 * It extends the Vector class with five operations that allow a vector to be treated as a stack.
 * 
 * The usual push and pop operations are provided, as well as a method to peek at the top item on the stack,
 * a method to test for whether the stack is empty, and a method to search the stack for an item and discover
 * how far it is from the top.
 * 
 * Note:
 * Stack is synchronized.
 * Stack is a legacy class, developed in earlier versions of Java.
 * Performance-wise, it is slow because it is synchronized.
 * Vector methods can be used in Stack because Stack inherits Vector. Stack additionally adds 5 methods: push, pop,
 * peek, search, and empty.
 */

public class CollectionsStack {

    public static void main(String[] args) {
        Stack stack = new Stack<>(); // Heterogeneous stack

        // Pushing elements onto the stack
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push('a'); // Pushing 'a' onto the stack

        stack.add(0, 1); // Adding 1 at index 0
        
        System.out.println(stack); // Output: [1, 0, 1, 2, a]

        // Peeking at the top element
        System.out.println(stack.peek()); // Output: a

        // Popping the top element
        System.out.println(stack.pop()); // Output: a
        
        System.out.println(stack); // Output: [1, 0, 1, 2]

        // Removing the element at index 1
        System.out.println(stack.remove(1)); // Output: 0

        System.out.println(stack); // Output: [1, 1, 2]

        // Getting an element (same as Vector, but not typically used in Stack context)
        System.out.println(stack.get(0)); // Output: 1

        // Updating an element (same as Vector, but not typically used in Stack context)
        System.out.println(stack.set(0, 'c')); // Replaces 1 with 'c', Output: 1

        System.out.println(stack); // Output: ['c', 1, 2]

        // Checking if the stack contains a specific element
        System.out.println(stack.contains(0)); // Output: false

        // Finding the index of an element
        System.out.println(stack.indexOf(2)); // Output: 2

        // Getting the size of the stack
        System.out.println(stack.size()); // Output: 3

        // Getting the capacity of the stack
        System.out.println(stack.capacity()); // Output: 10 (default initial capacity)

        // Checking if the stack is empty
        System.out.println(stack.isEmpty()); // Output: false

        // Converting stack to array and getting the first element
        System.out.println(stack.toArray()[0]); // Output: c

        // Removing an element by index
        stack.remove(0); // Removes 'c' at index 0

        System.out.println(stack); // Output: [1, 2]

        // Removing an element by value
        stack.remove(Integer.valueOf(1)); // Removes the first occurrence of 1

        System.out.println(stack); // Output: [2]

        // Adding and removing elements using another stack
        Stack<Integer> stack2 = new Stack<>();
        stack2.addAll(Arrays.asList(11, 22, 33));

        stack.addAll(stack2); // Adding all elements from stack2 to stack

        System.out.println(stack); // Output: [2, 11, 22, 33]

        stack.removeAll(stack2); // Removing all elements in stack2 from stack

        System.out.println(stack); // Output: [2]

        stack.push(0); // Pushing 0 to the stack

        System.out.println(stack); // Output: [2, 0]

        // Sorting the stack
        Collections.sort(stack);

        System.out.println(stack); // Output: [0, 2]
    }
}
