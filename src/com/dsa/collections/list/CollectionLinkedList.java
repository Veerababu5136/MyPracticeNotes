package com.dsa.collections.list;

import java.util.LinkedList;
import java.util.List;

/*
 
 LinkedList is another class which provides implementation for List interface
 
 LinkedList uses double linked list ds
 
 LinkedList stores data in format of node
 
 node contains data part, address part
 
 address part stores next element address
 
 LinkedList allows null, duplicates
 
 Maintains insertion order, not synchronized
 
 */
public class CollectionLinkedList {

	public static void main(String[] args) 
	{
	    LinkedList ll = new LinkedList();
	    
	    //add
	    ll.add(0);
	    ll.add(1);
	    ll.add(2);
	     
	    ll.add(2);

	    ll.add(0, 1);
	    ll.addFirst(11);
	    ll.addLast(10);

	    System.out.println(ll); // Output: [11, 1, 0, 1, 2, 2, 10]
	     
	    //set
	    ll.set(0, 2);

	    System.out.println(ll); // Output: [2, 1, 0, 1, 2, 2, 10]
	     
	    //remove
	     
	    ll.removeFirst();
	    ll.removeLast();
	     
	    System.out.println(ll); // Output: [1, 0, 1, 2, 2]

	    ll.remove(0);
	     
	    System.out.println(ll); // Output: [0, 1, 2, 2]

	    ll.remove(Integer.valueOf(2));

	    System.out.println(ll); // Output: [0, 1, 2]

	    //special
	     
	    System.out.println(ll.contains(0)); // Output: true
	    System.out.println(ll.indexOf(0)); // Output: 0
	    
	    ll.add(2);
	    System.out.println(ll + "\n" + ll.lastIndexOf(2)); // Output: [0, 1, 2, 2] \n 3
	    System.out.println(ll.getFirst()); // Output: 0

		// TODO Auto-generated method stub

	}

}
