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
public class Hasher {

    public int toAscii(char letter) {
        return (int) letter;
    }

    public long hash(String value) {
        long result = 0;
        int j = 0;
        for (int m = value.length() - 1; m >= 0; m--) {
            result += (toAscii(value.charAt(m)) * Power.getPower(10, j++));
        }
        return result;
    }
}
