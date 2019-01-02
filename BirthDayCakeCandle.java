/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Mnzit
 */
public class BirthDayCakeCandle {

    static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        int tallest = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (tallest < ar[i]) {
                tallest = ar[i];
                count = count - count + 1;
            } else if (tallest == ar[i]) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{1, 4, 4, 9, 5, 6, 5, 9, 3, 4, 5, 9}));
    }
}
