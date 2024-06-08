package com.dsa.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/*
 * Vector is also an implementation class of List interface, stores a group of objects.
 * It is developed based on a growable array which means it can increase or decrease its size when required.
 * It extends the AbstractList class and implements the List Interface.
 * In Vector, when it reaches its maximum size, it doubles its size.
 * 
 * Note:
 * Vector is synchronized.
 * Vector is a legacy class, developed in earlier versions of Java.
 * Performance-wise, it is slow because it is synchronized.
 * Vector uses the Enumeration interface to iterate elements.
 */

public class CollectionVector {

    public static void main(String[] args) {
        Vector vector = new Vector<>(); // Heterogeneous vector
        
        // Adding elements
        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(0, 'a'); // Inserting 'a' at index 0
        
        System.out.println(vector); // Output: [a, 0, 1, 2]
        
        // Getting an element
        System.out.println(vector.get(0)); // Output: a
        
        // Updating an element
        System.out.println(vector.set(0, 'c')); // Replaces 'a' with 'c', Output: a
        
        System.out.println(vector); // Output: [c, 0, 1, 2]
        
        // Checking if the vector contains a specific element
        System.out.println(vector.contains(0)); // Output: true
        
        // Finding the index of an element
        System.out.println(vector.indexOf(2)); // Output: 3
        
        // Getting the size of the vector
        System.out.println(vector.size()); // Output: 4
        
        // Getting the capacity of the vector
        System.out.println(vector.capacity()); // Output: 10 (default initial capacity)
        
        // Checking if the vector is empty
        System.out.println(vector.isEmpty()); // Output: false
        
        // Converting vector to array and getting the first element
        System.out.println(vector.toArray()[0]); // Output: c
        
        // Removing an element by index
        vector.remove(0); // Removes 'c' at index 0
        
        System.out.println(vector); // Output: [0, 1, 2]
        
        // Removing an element by value
        vector.remove(Integer.valueOf(0)); // Removes the first occurrence of 0
        
        System.out.println(vector); // Output: [1, 2]
        
        // Adding and removing elements using another vector
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(11, 22, 33));
        
        vector.addAll(vector2); // Adding all elements from vector2 to vector
        
        System.out.println(vector); // Output: [1, 2, 11, 22, 33]
        
        vector.removeAll(vector2); // Removing all elements in vector2 from vector
        
        System.out.println(vector); // Output: [1, 2]
        
        vector.add(0); // Adding 0 to the vector
        
        System.out.println(vector); // Output: [1, 2, 0]
        
        // Sorting the vector
        Collections.sort(vector);
        
        System.out.println(vector); // Output: [0, 1, 2]
    }
}
