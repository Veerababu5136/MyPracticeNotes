package com.dsa;

public class SecondMinimum {

    public static int findSecondMinimum(int[] arr) {
        if (arr.length <= 1) {
            return -1;  // Invalid input for empty or single-element array
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        // If secondMin is still Integer.MAX_VALUE, it means no second minimum was found
        return secondMin == Integer.MAX_VALUE ? -1 : secondMin;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 3, 5, 8, 4, 7, 8};
        int[] arr2 = {3, 9, 8, 8, 5, 3, 3};
        int[] arr3 = {4, 3};
        int[] arr4 = {5};

        int result1 = findSecondMinimum(arr1);
        int result2 = findSecondMinimum(arr2);
        int result3 = findSecondMinimum(arr3);
        int result4 = findSecondMinimum(arr4);

        System.out.println(result1); // Output: 4
        System.out.println(result2); // Output: 3
        System.out.println(result3); // Output: 4
        System.out.println(result4); // Output: -1 (invalid input)
    }
}
