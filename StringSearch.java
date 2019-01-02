/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;

import hackerrank.Hasher;

/**
 *
 * @author Mnzit
 *
 * Rabin-karp String Matching algorithm
 */
public class StringSearch {

    public static void main(String[] args) {
        Hasher hasher = new Hasher();
        String input = "abccaccabbbacc";
        String search = "acc";
        long searchHashValue = hasher.hash(search.toCharArray());
        for (int k = 0; k < input.length() - search.length() + 1; k++) {
            char[] send = new char[search.length()];
            int i = 0;
            for (int l = 0; l < search.length(); l++) {
                send[l] = input.charAt(k + i);
                i++;
            }
            long receiveHashValue = hasher.hash(send);
            if (searchHashValue == receiveHashValue) {
                System.out.println("Found from index: " + k);
            }
        }
    }
}
