package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.Collections;

public class ComapreElementPb3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(18);
        list.add(4);
        list.add(6);

        System.out.println(list.size());
        System.out.println(list.get(2));
        int minimum = Collections.min(list);
        int maximum = Collections.max(list);

        if(minimum == maximum)
        {
            System.out.println("The equals values is ");
        }else
        {
            System.out.println("The  values is : "+minimum+" and "+maximum);
        }


    }
}
