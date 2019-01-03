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

    public void search(String search, String input) {
        for (int i = 0; i < input.length() - search.length() + 1; i++) {
            String subs = input.substring(i, i + search.length());
            if (subs.equals(search)) {
                System.out.println("Found (" + search + ") in (" + input + ") from index (" + i + " to " + (i + search.length() - 1) + ")");
            }
        }
    }
}
