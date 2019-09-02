/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Mnzit
 */
// https://www.hackerrank.com/challenges/kangaroo/problem
public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (!(x2 > x1 && v2 > v1)) {
            for (int i = 0; i <= 10000; i++) {
                x1 = x1 + v1;
                x2 = x2 + v2;
                if (x1 == x2) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String args[]) {
        System.out.println(kangaroo(0, 2, 5, 3));
    }
}
