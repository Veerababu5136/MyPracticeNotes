package com.dsa;
import java.util.Arrays;

public class SumOfFractions {
    
    public static void main(String[] args) {
        int[] fraction1 = {1, 2};
        int[] fraction2 = {1, 6};
        int[] result = sumOfFractions(fraction1, fraction2);
        System.out.println("Sum: " + Arrays.toString(result)); // Expected output: [2, 3]
    }
    
    public static int[] sumOfFractions(int[] frac1, int[] frac2) {
        int p1 = frac1[0];
        int q1 = frac1[1];
        int p2 = frac2[0];
        int q2 = frac2[1];
        
        // Find common denominator
        int commonDenominator = lcm(q1, q2);
        
        // Convert fractions to have the same denominator
        int numerator1 = p1 * (commonDenominator / q1);
        int numerator2 = p2 * (commonDenominator / q2);
        
        // Add numerators
        int numeratorSum = numerator1 + numerator2;
        
        // Simplify the fraction
        int gcd = gcd(numeratorSum, commonDenominator);
        int simplifiedNumerator = numeratorSum / gcd;
        int simplifiedDenominator = commonDenominator / gcd;
        
        return new int[]{simplifiedNumerator, simplifiedDenominator};
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
