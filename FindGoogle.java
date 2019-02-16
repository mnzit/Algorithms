/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mnzit
 */
public class FindGoogle {

    public static String tester(String v) {
        Object[] goo = {new String[]{"g", "G"}, new String[]{"o", "0", "()", "O", "[]", "<>"}, new String[]{"l", "L", "I"}, new String[]{"e", "E", "3"}};
        for (int i = 0; i < goo.length; i++) {
            String[] a = (String[]) goo[i];
            for (int j = 0; j < a.length; j++) {
                if (v.equalsIgnoreCase(a[j])) {
                    return a[0];
                }
            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int count = 0;
        String gt = "";
        String testSub = "";
        int count2 = 0;
        for (char c : string.toCharArray()) {
            if (c == ' ') {
                count2++;
                break;
            }
            if (!Character.isLetterOrDigit(c)) {
                if (count < 2) {
                    gt += c;
                    count++;
                    if (count == 2) {
                        testSub += tester(gt);
                        count = 0;
                        gt = "";
                    }
                }
            } else {
                testSub += tester(String.valueOf(c));
            }
        }
        if (count2 > 0) {
            System.out.println("False");
        } else {
            if ((testSub.equalsIgnoreCase("google"))) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        bufferedReader.close();
    }

}
