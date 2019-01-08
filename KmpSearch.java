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
 * @author Mnzit
 */
public class KmsSearch {

    public static void search(String search, String input) {
        Map<Character, Integer> map = new HashMap<>();
        int test = 1;
        for (int i = 1; i <= search.length(); i++) {
            for (int j = i + 1; j <= search.length(); j++) {
                if (i == 1) {
                    map.put(search.charAt(0), 0);
                }
                if (i != 1 && j == 1) {
                    map.put(search.charAt(j - 1), 0);
                }
                if (search.charAt(i - 1) == search.charAt(j)) {
                    map.put(search.charAt(j - 1), test++);
                }
            }
        }
    }

    public static void main(String[] args) {
        search("abxab", "asdasdasd");
    }

}
