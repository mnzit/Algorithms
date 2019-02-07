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
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] != 0 && ar[i] == ar[j]) {
                    count++;
                    ar[i] = ar[j] = 0;
                    System.out.println(count);
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] socks = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        int count = sockMerchant(socks.length, socks);
        System.out.println(count);
    }
}
