package com.mycompany.problemsolving;

import java.util.*;

public class DetectDuplicateUsingMapPb17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.toLowerCase().split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        //wordcount.put("who are you", 3);

        for (String word : words) {
            Integer i = wordCount.get(word);

            if (i == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, i + 1);
            }
        }

        for (Map.Entry<String,Integer> keyVal : wordCount.entrySet()) {
            System.out.println("word: "+keyVal.getKey()+"\nnumberOfDuplicate: "+ keyVal.getValue());
        }



    }
}
