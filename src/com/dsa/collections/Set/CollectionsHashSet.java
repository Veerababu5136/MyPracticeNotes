package com.dsa.collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Set is an interface.
 * 
 * Set interface can be implemented by classes HashSet, TreeSet, LinkedHashSet.
 * 
 * Set stores a group of objects, does not allow duplicates, and does not maintain insertion order.
 * 
 * List allows multiple null values, whereas Set allows only one null value.
 * 
 * HashSet is a class that provides an implementation of the Set interface.
 * 
 * HashSet uses a hash table to store elements.
 * 
 * HashSet follows the hashing mechanism.
 * 
 * HashSet does not allow duplicates and allows only one null value.
 * 
 * HashSet is not synchronized. We can explicitly synchronize it using Collections.synchronizedSet(new HashSet<>()).
 */

public class CollectionsHashSet {

    public static void main(String[] args) {
        // Heterogeneous HashSet
        HashSet<Object> hashset = new HashSet<>();

        // Homogeneous HashSet (using generics)
        HashSet<Integer> hashset2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Add elements
        hashset.add(0);
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);

        // Add all elements from another set
        hashset.addAll(hashset2);

        // Display the hashset
        System.out.println("Initial HashSet: " + hashset); // Output: [0, 1, 2, 3, 4, 5]

        // Access elements (indirectly through iteration)
        System.out.println("Iterating over HashSet elements:");
        for (Object nums : hashset) {
            System.out.print(nums + " "); // Output: 0 1 2 3 4 5 (order may vary)
        }
        System.out.println();

        // Using an iterator
        System.out.println("Iterating over HashSet using Iterator:");
        Iterator<Object> itr = hashset.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " "); // Output: 0 1 2 3 4 5 (order may vary)
        }
        System.out.println();

        // Update (not allowed directly, but we can simulate by removing and adding)
        // Remove element '0' and add '6'
        hashset.remove(0);
        hashset.add(6);
        System.out.println("After updating 0 to 6: " + hashset); // Output: [1, 2, 3, 4, 5, 6]

        // Delete
        hashset.remove(1);
        System.out.println("After removing 1: " + hashset); // Output: [2, 3, 4, 5, 6]

        hashset.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + hashset); // Output: [2, 3, 5, 6]

        hashset.removeAll(hashset2);
        System.out.println("After removing all elements from hashset2: " + hashset); // Output: [2, 6]

        // Special methods
        System.out.println("HashSet contains 2: " + hashset.contains(2)); // Output: true
        System.out.println("HashSet contains 1: " + hashset.contains(1)); // Output: false

        System.out.println("HashSet is empty: " + hashset.isEmpty()); // Output: false
        System.out.println("HashSet size: " + hashset.size()); // Output: 2

        hashset.clear();
        System.out.println("HashSet after clear: " + hashset); // Output: []
    }
}
