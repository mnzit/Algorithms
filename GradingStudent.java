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
public class GradingStudent {

    static int[] gradingStudents(int[] grades) {
        int count = 0, incre;
        for (int i = 0; i < grades.length; i++) {
            incre = grades[i];
            if (!(grades[i] < 38)) {
                while (incre % 5 != 0) {
                    incre++;
                }
                if (incre - grades[i] < 3) {
                    grades[i] = incre;
                }
            }

        }

        return grades;
    }

    public static void main(String[] args) {
        for (int i : gradingStudents(new int[]{73, 67, 38, 33})) {
            System.out.println(i);
        }

    }
}
