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
public class TimeConversion {

    static String timeConversion(String s) {
        String temp = s.split(":")[0];
        int j = 12;
        if (s.endsWith("PM")) {
            for (int i = 0; i < 12; i++) {
                if (String.format("%02d", i == 0 ? 12 : i).equalsIgnoreCase(temp)) {
                    s = s.replaceFirst(temp, String.valueOf(j)).replace("PM", "");
                }
                j++;
            }
        }else{
              s = s.replace("AM", "").replaceFirst("12", "00");
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:12:12AM"));
    }
}
