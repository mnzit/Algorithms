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
        } else {
            s = s.replace("AM", "").replaceFirst("12", "00");
        }
        return s;

    }

    static String timeConversion2(String s) {
        int k = 0;
        String a = "";
        String hour = s.split(":")[0];
        String b = s.substring(s.length() - 2, s.length());;
        for (int i = 0; i < 24; i++) {
            k = i == 0 || k == 11 ? 12 : k != 12 ? k + 1 : 1;
            a = i < 12 ? "AM" : "PM";
            if (hour.equalsIgnoreCase(String.valueOf(String.format("%02d", k))) && b.equalsIgnoreCase(a)) {
                s = s.replaceFirst(hour, String.format("%02d", i));
                break;
            }
        }
        return s.replace("PM", "").replace("AM", "");
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:18:12AM"));
    }
}
