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
 * Naive search
 */
public class NaiveSearch {

    public static void searchSubString(String search, String input) {
        for (int i = 0; i < input.length() - search.length() + 1; i++) {
            String subs = input.substring(i, i + search.length());
            if (subs.equals(search)) {
                System.out.println("Found (" + search + ") in (" + input + ") from index (" + i + " to " + (i + search.length() - 1) + ")");
            }
        }
    }

    public static void searchCharByChar(String search, String input) {
        for (int i = 0; i < input.length() - search.length() + 1; i++) {
            int k = 0;
            int count = 0;

            for (int j = 0; j < search.length(); j++) {
                if (search.charAt(j) == input.charAt(i + (k++))) {
                    count++;
                }
                if (count == search.length()) {
                    System.out.println("Found (" + search + ") in (" + input + ") from index (" + i + " to " + (i + k - 1) + ")");
                }
            }
            count = 0;
        }
    }

    public static void main(String[] args) {
        searchSubString("aac", "aaaaaaaac");
        searchCharByChar("aac", "aaacaaaaa");
    }
}
