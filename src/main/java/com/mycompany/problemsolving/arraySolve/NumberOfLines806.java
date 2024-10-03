package com.mycompany.problemsolving.arraySolve;

public class NumberOfLines806 {
    public static void main(String[] args) {
        int[] widths={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String[] s={"abcdefghijklmnopqrstuvwxyz"};
        int line=0;
        int last=1;
        int width=100;
       // char c : s.toCharArray()
        for(int i=0;i<s.length;i++)
        {
            if(widths[i]>=100){
                width=widths[i];
                System.out.println(width);

            }
        }
    }
}
