package com.mycompany.problemsolving.arraySolve;

public class LemonadeChange860 {
    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        int fives = 0;
        int tens = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                fives--;
                tens++;
            } else {  // bill == 20
                if (tens > 0) {
                    tens--;
                    fives--;
                } else {
                    fives =fives- 3;
                }
            }
            if (fives < 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);

    }
}