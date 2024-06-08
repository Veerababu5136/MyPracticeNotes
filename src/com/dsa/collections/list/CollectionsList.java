package com.dsa.collections.list;

import java.util.ArrayList;
import java.util.List;

/*
 
 List is an interface
 
 List can be implemented by ArrayList,LinkedList classes
 
 ArrayList is an class where it is used to store homo,hetro objects or data
 
 ArrayList uses array DataStructure
 
 ArrayList uses dynamic array to store data
 
 ArrayList Can store duplicate and null values
 
 ArrayList Maintains Insertion order
 
 ArrayList is not Synchronized

 
 ArrayList has initial capacity 10
 
 When ArrayList capacity reaches its limit, it increases by 50% in terms of size; deletion also follows the same rule
 
 ArrayList example: storing real-time records from a table, which are obtained from a query

 */
public class CollectionsList {

    public static void main(String[] args) {
        List al = new ArrayList(); // heterogeneous list
        
        List<Integer> al2 = new ArrayList(); // homogeneous list

        
        // Add elements to the list
        
        al.add(0);
        al.add(1);
        al.add(2);
        al.add('a');
        al.add("hi amrutha");
        
        al.add(0, "first");

        System.out.println(al); // Output: [first, 0, 1, 2, a, hi amrutha]

        
        // Update 
        
        al.set(0, "pavani");

        System.out.println(al); // Output: [pavani, 0, 1, 2, a, hi amrutha]

        // Get
        System.out.println(al.get(0)); // Output: pavani
        
        
        // Remove 
        
        al.remove(1); // by index
        
        System.out.println(al); // Output: [pavani, 1, 2, a, hi amrutha]
        
        al.remove(Integer.valueOf(2)); // by value
        
        System.out.println(al); // Output: [pavani, 1, a, hi amrutha]
        
        al.remove(Character.valueOf('a')); // by value
        
        System.out.println(al); // Output: [pavani, 1, hi amrutha]

        al.remove(String.valueOf("pavani")); // by value
        
        System.out.println(al); // Output: [1, hi amrutha]



        // Special functions
        
        System.out.println(al.contains(1)); // Output: true
        
        System.out.println(al.indexOf(1)); // Output: 0
        
        System.out.println(al.isEmpty()); // Output: false
        
        System.out.println(al.size()); // Output: 2
        
//      al.sort(null); only same type
        

        al.clear(); // Clears the list
        
        System.out.println(al); // Output: []

        
        
        // TODO Auto-generated method stub

    }

}
