/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mnzit Rabin-karp String Matching algorithm
 */
public class StringSearch {

    public static void main(String[] args) {
        Hasher hasher = new Hasher();
        String input = "ababaz";
        String search = "baz";
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
                i = 0;
            }
        }
    }
}
