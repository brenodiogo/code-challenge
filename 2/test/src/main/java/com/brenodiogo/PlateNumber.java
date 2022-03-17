package com.brenodiogo;

/**
 * Hello world!
 *
 */
public class PlateNumber {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(PlateNumber.licensePlate("5F3Z-2e-9-w", 2));
  }

  public static String licensePlate(String code, int group) {
    code = code.replaceAll("-", "").toUpperCase();
    if (code.length() <= group) {
      return code;
    }
    return licensePlate(code.substring(0, code.length() - group), group) + "-" + code.substring(code.length() - group);
  }
}

/*
 * https://edabit.com/challenge/qafJTrENQeMq6apgy
 * 
 * Traveling through Europe one needs to pay attention to how the license plate
 * in the given country is displayed. When crossing the border you need to park
 * on the shoulder, unscrew the plate, re-group the characters according to the
 * local regulations, attach it back and proceed with the journey.
 * 
 * Create a solution that can format the dmv number into a plate number with
 * correct grouping. The function input consists of string s and group length n.
 * The output has to be upper case characters and digits. The new groups are
 * made from right to left and connected by -. The original order of the dmv
 * number is preserved.
 * 
 * Examples
 * licensePlate("5F3Z-2e-9-w", 4) ➞ "5F3Z-2E9W"
 * 
 * licensePlate("2-5g-3-J", 2) ➞ "2-5G-3J"
 * 
 * licensePlate("2-4A0r7-4k", 3) ➞ "24-A0R-74K"
 * 
 * licensePlate("nlj-206-fv", 3) ➞ "NL-J20-6FV"
 * Notes
 * You are expected to solve this challenge via a recursive approach.
 * An iterative version of this challenge can be found via this link.
 * A collection of challenges in recursion can be found via this link.
 */