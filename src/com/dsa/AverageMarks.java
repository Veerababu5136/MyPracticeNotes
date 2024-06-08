package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class AverageMarks {

    public int getBestAverageScore(String[][] scores) {
        Map<String, Integer> studentTotals = new HashMap<>();
        Map<String, Integer> studentCounts = new HashMap<>();

        for (String[] score : scores) {
            String student = score[0];
            int mark = Integer.parseInt(score[1]);

            studentTotals.put(student, studentTotals.getOrDefault(student, 0) + mark);
            studentCounts.put(student, studentCounts.getOrDefault(student, 0) + 1);
        }

        int maxAverage = 0;
        for (Map.Entry<String, Integer> entry : studentTotals.entrySet()) {
            String student = entry.getKey();
            int total = entry.getValue();
            int count = studentCounts.get(student);
            int average = Math.floorDiv(total, count); 
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        AverageMarks solution = new AverageMarks();
        String[][] scores = {{"a", "10"}, {"b", "20"}, {"a", "20"}, {"b", "30"}};
        System.out.println(solution.getBestAverageScore(scores)); // Output: 25
    }
}
