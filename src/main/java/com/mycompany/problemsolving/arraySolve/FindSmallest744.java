package com.mycompany.problemsolving.arraySolve;

import java.util.ArrayList;

public class FindSmallest744 {
    public static void main(String[] args) {
        char[] letters = {'x', 'x', 'y','y'};
        char target = 'z';

        //String[] letters = {"c", "f", "j"};
        //String target="a";

        ArrayList<Character> values = new ArrayList<>();

        for (char letter : letters) {
            values.add(letter);
           // values.add(letter.toUpperCase()); // sob letters upper kore nilam
        }
       // target = target.toUpperCase(); //upper kore nilam


        char smallest = 0;

        for (char letter : values) {
            if (letter == target && letter==smallest || smallest==0) {
                smallest = letter;
            }
        }
        if (smallest == 0) {
            System.out.println("No greater letter ");
        } else {
            System.out.println(smallest);
        }
    }
}