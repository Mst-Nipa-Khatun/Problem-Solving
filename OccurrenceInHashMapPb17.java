package com.mycompany.problemsolving;

import java.util.HashMap;
import java.util.Scanner;

public class OccurrenceInHashMapPb17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.toLowerCase().split(" ");
        HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
        //wordcount.put("who are you", 3);

        for (String word : words) {
            Integer i=wordcount.get(word);
            {
                if(i==null)
                {
                    wordcount.put(word,1);
                }else {
                    wordcount.put(word,i+1);
                }
            }
System.out.println(wordcount);


        }
    }
}
