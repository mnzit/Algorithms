/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.IOException;

/**
 *
 * @author Mnzit
 *
 * Naive search
 */
public class NaiveSearch {

    public static void searchSubString(String search, String input) {
        String result = "";
        for (int i = 0; i < input.length() - search.length() + 1; i++) {
            result = input.substring(i, i + search.length());
            if (result.equals(search)) {
                System.out.println("Found in index: " + i);
                break;
            }
        }
    }

    public static void searchCharByChar(String search, String input) {
        int searchLength = search.length();
        int inputLength = input.length();
        for (int i = 0; i < inputLength - searchLength + 1; i++) {
            int k = 0;
            int count = 0;
            for (int j = 0; j < searchLength; j++) {
                if (search.charAt(j) == input.charAt(i + (k++))) {
                    count++;
                }
                if (count == searchLength) {
                    System.out.println("Found in index: " + i);
                }
            }
            count = 0;
        }
    }

    public static void main(String[] args) throws IOException {
//        String path = new String(Files.readAllBytes(Paths.get("d:/note.txt")), "UTF-8");
//        searchSubString("manjit", path);
        searchCharByChar("manjit", "rameshmanjit");
    }
}
