package com.brenodiogo;

/**
 * Hello world!
 *
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int brokenCalc(int startValue, int target) {

        int counter = 0;
        while (target > startValue) {
            if (target % 2 != 0) {
                target++;
                counter++;
            }
            target = target / 2;
            counter++;
        }

        while (target != startValue) {
            target++;
            counter++;
        }
        return counter;

    }
}

// https://leetcode.com/problems/broken-calculator/
