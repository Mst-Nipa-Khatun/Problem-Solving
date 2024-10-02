package com.mycompany.problemsolving.arraySolve;

import java.util.ArrayList;

public class FindSmallest744 {
    public static void main(String[] args) {
        String[] letters = {"c", "f", "j"};
        String target = "a";
        target = target.toUpperCase(); //upper kore nilam

        ArrayList<String> values = new ArrayList<>();

        for (String letter : letters) {
            values.add(letter.toUpperCase());
        }

        String smallest = null;

        for (String letter : values) {
            if (letter.compareTo(target) > 0 && (smallest == null ||
                    letter.compareTo(smallest) < 0)) {
                smallest = letter;
            }
        }

        if (smallest == null) {
            System.out.println("No greater letter ");
        } else {
            System.out.println(smallest);
        }
    }}