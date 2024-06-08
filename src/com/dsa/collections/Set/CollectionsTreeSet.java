package com.dsa.collections.Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet is a class that provides an implementation of the NavigableSet interface.
 * 
 * TreeSet uses a red-black tree structure to store elements.
 * 
 * TreeSet follows the sorting mechanism. It stores elements in a sorted (ascending) order.
 * 
 * TreeSet does not allow duplicates and allows only one null value (only if the TreeSet is empty).
 * 
 * TreeSet is not synchronized. We can explicitly synchronize it using Collections.synchronizedSortedSet(new TreeSet<>()).
 */

public class CollectionsTreeSet {

    public static void main(String[] args) {
        // Homogeneous TreeSet (using generics)
        TreeSet<Integer> treeset = new TreeSet<>();

        TreeSet<Integer> treeset2 = new TreeSet<>(Arrays.asList(3, 4, 5));

        // Add elements
        treeset.add(0);
        treeset.add(1);
        treeset.add(2);
        treeset.add(3);

        // Add all elements from another set
        treeset.addAll(treeset2);

        // Display the treeset
        System.out.println("Initial TreeSet: " + treeset); // Output: [0, 1, 2, 3, 4, 5]

        // Access elements (indirectly through iteration)
        System.out.println("Iterating over TreeSet elements:");
        for (Integer nums : treeset) {
            System.out.print(nums + " "); // Output: 0 1 2 3 4 5
        }
        System.out.println();
        
        System.out.println("first :"+treeset.first());
        
        System.out.println("last :"+treeset.last());



        // Using an iterator
        System.out.println("Iterating over TreeSet using Iterator:");
        Iterator<Integer> itr = treeset.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " "); // Output: 0 1 2 3 4 5
        }
        System.out.println();

        // Update (not allowed directly, but we can simulate by removing and adding)
        // Remove element '0' and add '6'
        treeset.remove(0);
        treeset.add(6);
        System.out.println("After updating 0 to 6: " + treeset); // Output: [1, 2, 3, 4, 5, 6]

        // Delete
        treeset.remove(1);
        System.out.println("After removing 1: " + treeset); // Output: [2, 3, 4, 5, 6]

        treeset.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + treeset); // Output: [2, 3, 5, 6]

        treeset.removeAll(treeset2);
        System.out.println("After removing all elements from treeset2: " + treeset); // Output: [2, 6]

        // Special methods
        System.out.println("TreeSet contains 2: " + treeset.contains(2)); // Output: true
        System.out.println("TreeSet contains 1: " + treeset.contains(1)); // Output: false

        System.out.println("TreeSet is empty: " + treeset.isEmpty()); // Output: false
        System.out.println("TreeSet size: " + treeset.size()); // Output: 2

        treeset.clear();
        System.out.println("TreeSet after clear: " + treeset); // Output: []
    }
}
