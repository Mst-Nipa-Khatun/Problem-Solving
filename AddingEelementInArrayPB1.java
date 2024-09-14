
package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class AddingEelementInArrayPB1 {
    public static void main(String[] args) {
         //Scanner sc= new Scanner(System.in);    
    int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
    int [] newarr=new int[arr.length+1]; 
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length]=50;
    System.out.println("Array:"+Arrays.toString(newarr));
    
    
    
    
    //wait 
    
    int  test[] = new int[]{/*index 0*/1,/*index 1*/2};
    
        System.out.println("test length:  "+test.length);//result : 2 but last index 1 why ?
        System.out.println("test length+1:  "+(test.length+1));//result : 3 but last index 1 why 
        
        
        //ei 2 ta question er answer ber koro tahole full clear hobe.byeok
    
    
    
            
}
    }
   
