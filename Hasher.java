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
public class Hasher {

    public long power(int i, int j) {
        int pow = 1;
        for (int k = 0; k < j; k++) {
            pow = pow * i;
        }
        return pow;
    }

    public long hash(char[] value) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, i++);
        }
        long result = 0;
        int j = 0;
        for (int m = value.length - 1; m >= 0; m--) {
            result += (map.get(value[m]) * power(10, j));
            j++;
        }
        j = 0;
        return result;
    }
}
