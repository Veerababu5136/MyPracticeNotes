package com.dsa2;
public class median {

    public static void main(String[] args) {
        int a[] = {1, 3};
        int b[] = {2};

        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i += 1;
            } else {
                c[k] = b[j];
                j += 1;
            }
            k += 1;
        }

        while (i < a.length) {
            c[k] = a[i];
            i += 1;
            k += 1;
        }

        while (j < b.length) {
            c[k] = b[j];
            j += 1;
            k += 1;
        }

        // Print the merged array c
        System.out.print("Merged Array: ");
        for (int m = 0; m < c.length; m++) {
            System.out.print(c[m] + " ");
        }
    }
}
