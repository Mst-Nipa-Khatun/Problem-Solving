package com.mycompany.problemsolving.arraySolve;

public class MinimumIndexSum599 {
    public static void main(String[] args) {
        String[] list1 = {"happy", "sad", "good", "bad"};
        String[] list2 = {"sad", "happy", "good", "bad"};
        String[] list3 = new String[]{};
        String val = "null";
        for (int i = 0; i < list1.length; i++) {
            if (list1[i].equals(list2[i])) {
                val = list1[i]+list2[i];
                System.out.println(list1[i]);
            }
        }
    }
}
