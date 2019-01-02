/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Mnzit
 *
 * Rabin-karp String Matching algorithm
 */
public class StringSearch {

    public static void main(String[] args) {
        String input = "asdi";
        String search = "sdi";
        long searchHashValue = Hasher.hash("sdi");
        for (int k = 0; k < input.length() - search.length() + 1; k++) {
            long receiveHashValue = Hasher.hash(input.substring(k, k + search.length()));
            if (searchHashValue == receiveHashValue) {
                System.out.println("Found from index: " + k);
            }
        }
    }
}
