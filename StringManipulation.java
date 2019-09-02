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
public class StringManipulation {
    public static void main(String[] args) {
        String value = "Ram Ram";
        
        for (char c : value.toCharArray()) {
            if(!Character.isWhitespace(c)){
                System.out.println(c);
            }
        }
    }
}
