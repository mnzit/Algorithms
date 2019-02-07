/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Mnzit
 */
//output formatting
public class OuputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int value = 15 - s1.length();
            for (int j = 0; j < value; j++) {
                s1 += " ";
            }
            result += s1 + String.format("%03d", x) + (i < 2 ? "\n" : "");
        }
        System.out.println("================================");
        System.out.println(result);
        System.out.println("================================");

    }
}
