/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Mnzit
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        Map<Integer, String> set = new HashMap<>();
        set.put(1, "A");
        set.put(2, "A");
        set.put(2, "B");
//        for (Map.Entry<Integer, String> entry : set.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + ": " + value);
//        }

        Set<Integer> set1 = new HashSet<>();
        set1.add(9);
        set1.add(2);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        for (int i = 0; i < set1.size(); i++) {
            System.out.println(i + ": " + set1.toArray()[i]);
        }

    }
}
