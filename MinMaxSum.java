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
public class MinMaxSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        long[] arr2 = new long[arr.length];
        int count = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != count) {
                    sum += arr[j];
                }
            }
            count++;
            arr2[i] = sum;
            sum = 0;
        }
        long min = arr2[0];
        long max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println(min + " " + max);
    }

}
