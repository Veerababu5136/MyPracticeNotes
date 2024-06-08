package com.dsa;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SecondMinimumOptimal {

    public static String findSecondMinimumOptimized(int[] arr) {
        if (arr.length <= 1) {
            return "invalid input";  // Invalid input for empty or single-element array
        }

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                maxPQ.add(num);
                if (maxPQ.size() > 2) {
                    maxPQ.poll();  // Remove the largest element to keep only the two smallest
                }
            }
        }

        if (maxPQ.size() < 2) {
            return "invalid input";  // Less than 2 unique elements
        }

        // The second minimum is now the root of the max priority queue
        return String.valueOf(maxPQ.poll());
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 3, 5, 8, 4, 7, 8};
        int[] arr2 = {3, 9, 8, 8, 5, 3, 3};
        int[] arr3 = {4, 3};
        int[] arr4 = {5};

        System.out.println(findSecondMinimumOptimized(arr1)); // Output: 4
        System.out.println(findSecondMinimumOptimized(arr2)); // Output: 3
        System.out.println(findSecondMinimumOptimized(arr3)); // Output: 4
        System.out.println(findSecondMinimumOptimized(arr4)); // Output: "invalid input"
    }
}
