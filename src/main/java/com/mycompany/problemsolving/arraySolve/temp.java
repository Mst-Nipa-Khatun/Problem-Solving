package com.mycompany.problemsolving.arraySolve;

import java.util.ArrayList;

//public class temp {
//    public static void main(String[] args) {
        class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        ArrayList<Character> values = new ArrayList<>();

        for (char letter : letters) {
            values.add(letter);
        }

        char smallest = 0;

        for (char letter : values) {
            if (letter == target && letter == smallest || smallest == 0) {
                smallest = letter;
            }
        }
        if (smallest == 0) {
            System.out.println("No greater letter ");
        } else {
           // System.out.println(smallest);

        }
        return smallest;

    }
}

