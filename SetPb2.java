package com.mycompany.problemsolving;

import java.util.HashSet;
import java.util.Set;

public class SetPb2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
       // numbers.clear();
        System.out.println(numbers);
        boolean b=numbers.equals(1);
        {
            boolean b1=numbers.contains(1);
            boolean b2=numbers.contains(2);
        }
        boolean n=numbers.isEmpty();
        System.out.println(n);

    }
}
