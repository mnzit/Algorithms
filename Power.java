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
public class Power {

    public static long getPower(int i, int j) {
        int pow = 1;
        for (int k = 0; k < j; k++) {
            pow = pow * i;
        }
        return pow;
    }
}
