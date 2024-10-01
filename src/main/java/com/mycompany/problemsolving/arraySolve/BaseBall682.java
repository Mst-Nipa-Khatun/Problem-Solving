package com.mycompany.problemsolving.arraySolve;

import java.util.ArrayList;

public class BaseBall682 {
    public static void main(String[] args) {
        ArrayList<Integer> count = new ArrayList<>();
        //1.ops string list
        //sum=0
        //loop er moddhe conditions dibo and string konta ki declare kore dibo.
        //add,remove or multiplation korbo
        //total sum korbo

        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int i = 0;
        int sum = 0;

        for (String val : ops) {
            if (val.equals("C")) {
                //count.add(i);
                count.remove(i - 1);
                i--;
            } else if (val.equals("D")) {
                //count.add(2* (i-1));
                count.add(2 * count.get(i - 1));
                i++;
            } else if (val.equals("+")) {
                //count.add(count.get(i - 1));
                count.add(count.get(i - 1) + count.get(i - 2)); // ager input add to hobei sathe 2 index ager vlaue o add hobe.
                i++;
            } else {
                int a = Integer.parseInt(val);
                count.add(a);
                i++;
            }
        }
        for (int all : count)
            sum += all;
        System.out.println(sum);
    }
}
