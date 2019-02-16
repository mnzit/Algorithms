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
public class DrawingBook {

    static int pageCount(int n, int p) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p == i) {
                return count;
            }
            if (i % 2 != 0) {
                count++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(5, 4));
    }
}
