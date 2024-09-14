package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.put;

public class SelfTask {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<Integer, String>();
        names.put(1, "Nipa");
        names.put(2, "Kirbria");
        names.put(1, "Sheikh");
        names.put(4, "Nila");
        System.out.println(names);


        //2 Duplicate values
        Map<Integer, String> names2 = new HashMap<Integer, String>();

        names2.put(5, "Nipa");
        names2.put(6, "Kibria");
        names2.put(7, "Sheikh");
        names2.put(8, "Nipa");
        System.out.println(names2);

        //Even-odd check using map(for currentnum in 1...100)

 //       HashMap<String, Integer> values1 = new HashMap<>();
//        Map<String, List<Integer>> values1 = new HashMap<>();

//        //for (int i : hm.values())
//            for (int i = 1; i <= 100; i++){
//            if( i % 2 == 0) {
//                values1.get("Even" +i).add(i);
//                //System.out.println("Even Numbers: " + i);
//
//
//            }else {
//                values1.get("odd" +i).add(i);
//                //System.out.println("Odd Numbers: " + i);
//            }
//        }

        //another one
        Map<String, List<Integer>> values = new HashMap<>();

        values.put("Odd", new ArrayList<>());
        values.put("Even", new ArrayList<>());

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                values.get("Even").add(i);
            } else {
                values.get("Odd").add(i);
            }
        }

        System.out.println("Even Numbers:");
        System.out.println(values.get("Even"));

        System.out.println("Odd Numbers:");
        System.out.println(values.get("Odd"));


 //Even nd DUplicate

        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 84, 2, 2, 8};

        Map<Integer, Integer> values3 = new HashMap<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
            //values3.put(i, i); //amr use output is okay for evennumbers but duplicates values elomelo hoy
            values3.put(i, values3.getOrDefault(i, 0) + 1);
        }
        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> duplicates = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : values3.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        System.out.println("Duplicate Numbers: " + duplicates);

}
    }




