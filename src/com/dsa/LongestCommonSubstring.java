package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str = "aaaabccccc";
        
        Map<Integer, Integer> mp = new HashMap<>();
        
        int c = 1, temp = 0, maxCount = 0, key = 0;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                c++;
            } else {
                mp.put(temp, c);
                
                if (maxCount <= c) {
                    maxCount = c;
                    key = temp;
                }
                
                temp = i;
                c = 1;
            }
        }
        
        mp.put(temp, c);
        if (maxCount <= c) {
            maxCount = c;
            key = temp;
        }
        
        System.out.println("[" + key + ", " + mp.get(key) + "]");
    }
}
