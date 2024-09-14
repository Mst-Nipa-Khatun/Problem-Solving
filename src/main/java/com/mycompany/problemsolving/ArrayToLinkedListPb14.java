package com.mycompany.problemsolving;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToLinkedListPb14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i : arr)
        {
            list.add(i);
        }
        System.out.println("LinkedList: "+list);
    }
}
