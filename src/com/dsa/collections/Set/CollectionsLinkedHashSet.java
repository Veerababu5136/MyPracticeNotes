package com.dsa.collections.Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet is a class that provides an implementation of the Set interface.
 * 
 * LinkedHashSet uses a hash table and a linked list to store elements.
 * 
 * LinkedHashSet maintains insertion order.
 * 
 * LinkedHashSet does not allow duplicates and allows only one null value.
 * 
 * LinkedHashSet is not synchronized. We can explicitly synchronize it using Collections.synchronizedSet(new LinkedHashSet<>()).
 */

public class CollectionsLinkedHashSet {

    public static void main(String[] args) {
        // Heterogeneous LinkedHashSet
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();

        // Homogeneous LinkedHashSet (using generics)
        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));

        // Add elements
        linkedHashSet.add(0);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);

        // Add all elements from another set
        linkedHashSet.addAll(linkedHashSet2);

        // Display the linkedHashSet
        System.out.println("Initial LinkedHashSet: " + linkedHashSet); // Output: [0, 1, 2, 3, 4, 5]

        // Access elements (indirectly through iteration)
        System.out.println("Iterating over LinkedHashSet elements:");
        for (Object nums : linkedHashSet) {
            System.out.print(nums + " "); // Output: 0 1 2 3 4 5
        }
        System.out.println();

        // Using an iterator
        System.out.println("Iterating over LinkedHashSet using Iterator:");
        Iterator<Object> itr = linkedHashSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " "); // Output: 0 1 2 3 4 5
        }
        System.out.println();

        // Update (not allowed directly, but we can simulate by removing and adding)
        // Remove element '0' and add '6'
        linkedHashSet.remove(0);
        linkedHashSet.add(6);
        System.out.println("After updating 0 to 6: " + linkedHashSet); // Output: [1, 2, 3, 4, 5, 6]

        // Delete
        linkedHashSet.remove(1);
        System.out.println("After removing 1: " + linkedHashSet); // Output: [2, 3, 4, 5, 6]

        linkedHashSet.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + linkedHashSet); // Output: [2, 3, 5, 6]

        linkedHashSet.removeAll(linkedHashSet2);
        System.out.println("After removing all elements from linkedHashSet2: " + linkedHashSet); // Output: [2, 6]

        // Special methods
        System.out.println("LinkedHashSet contains 2: " + linkedHashSet.contains(2)); // Output: true
        System.out.println("LinkedHashSet contains 1: " + linkedHashSet.contains(1)); // Output: false

        System.out.println("LinkedHashSet is empty: " + linkedHashSet.isEmpty()); // Output: false
        System.out.println("LinkedHashSet size: " + linkedHashSet.size()); // Output: 2

        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clear: " + linkedHashSet); // Output: []
    }
}
