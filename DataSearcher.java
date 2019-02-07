package hackerrank;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mnzit
 */
public class DataSearcher {

    static String[] head = {"id", "price", "quantity"};
    static int[][] body = {{1, 150, 2}, {2, 50, 5}, {3, 10, 15}, {4, 100, 10}, {5, 200, 150}};

    public static void get() {
        String left = "";
        String right = "";
        String operator = "";
        int count = 0, index = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter operation: ");
        String line = in.nextLine();
        System.out.println("");
        for (char c : line.toCharArray()) {
            if (c != ' ') {
                if (((int) c >= 65 && (int) c <= 122) && (count == 0)) {
                    left += String.valueOf(c);
                } else if ((int) c >= 60 && (int) c <= 62) {
                    operator += String.valueOf(c);
                    count++;
                } else {
                    right += String.valueOf(c);
                }
            }
        }
        for (String string : head) {
            if (string.equalsIgnoreCase(left)) {
                break;
            }
            index++;
        }
        for (int i = 0; i < body.length; i++) {
            for (int j = 0; j < body[0].length; j++) {
                if (j == index) {
                    if (operator.equalsIgnoreCase(">")) {
                        if (body[i][j] > Integer.parseInt(right)) {
                            System.out.println(body[i][j]);
                        }
                    } else if (operator.equalsIgnoreCase("<")) {
                        if (body[i][j] < Integer.parseInt(right)) {
                            System.out.println(body[i][j]);
                        }
                    } else if (operator.equalsIgnoreCase("==")) {
                        if (body[i][j] == Integer.parseInt(right)) {
                            System.out.println(body[i][j]);
                        }
                    } else if (operator.equalsIgnoreCase(">=")) {
                        if (body[i][j] >= Integer.parseInt(right)) {
                            System.out.println(body[i][j]);
                        }
                    } else if (operator.equalsIgnoreCase("<=")) {
                        if (body[i][j] <= Integer.parseInt(right)) {
                            System.out.println(body[i][j]);
                        }
                    }
                }
            }
        }   
    }
    

    public static void main(String[] args) {
        while (true) {
            get();
        }
    }
}
