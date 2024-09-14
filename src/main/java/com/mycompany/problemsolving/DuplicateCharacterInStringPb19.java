package com.mycompany.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInStringPb19 {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String[] words = str1.toLowerCase().split("");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            Integer i = wordCount.get(word);

            if (i == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, i + 1);
            }
        }
        for (Map.Entry<String, Integer> keyVal : wordCount.entrySet()) {
            System.out.println("word: " + keyVal.getKey() + "\nDuplication: " + keyVal.getValue());
        }


    }}