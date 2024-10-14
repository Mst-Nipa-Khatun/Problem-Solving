package com.mycompany.problemsolving.arraySolve;

public class DeckCards914 {
    public static void main(String[] args) {
        int[] num={1,2,1,2,3,4,3,4};
        int[] nums2=new int[num.length];

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    nums2[i]=num[j];
                    System.out.println(nums2[i]+" "+num[i]);
                }
//                else {
//                    //System.out.println(false);
//                }
            }
        }
    }
}
