package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrToArrayLIstPb9 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        List<Integer> list=new ArrayList<Integer>();

        for(int x: arr)
        {
            list.add(x);
            System.out.print(x+ " ");
        }
    }
}
