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
public class ArrayRefiner {

    public static Integer[] refiner(int elements[], int refine) {

        Integer[] numColl = new Integer[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != refine) {
                if (numColl.length == 0) {
                    numColl = new Integer[1];
                    numColl[0] = elements[i];
                } else {
                Integer[] tempColl = new Integer[numColl.length + 1];
                for (int m = 0; m < numColl.length; m++) {
                    tempColl[m] = numColl[m];
                }
                tempColl[numColl.length] = elements[i];
                numColl = tempColl;
                }
            }
        }
        return numColl;
    }
    public static Integer[] UnionRefiner(int elements1[], int elements2[], int refine[]){
        Integer[] numColl = new Integer[0];
//        for (int i = 0; i < elements.length; i++) {
//            if (elements[i] != refine) {
//                if (numColl.length == 0) {
//                    numColl = new Integer[1];
//                    numColl[0] = elements[i];
//                } else {
//                Integer[] tempColl = new Integer[numColl.length + 1];
//                tempColl = numColl;
//                for (int m = 0; m < numColl.length; m++) {
//                    tempColl[m] = numColl[m];
//                }
//                tempColl[numColl.length] = elements[i];
//                numColl = tempColl;
//                }
//            }
//        }
        return numColl;
    }

    public static void main(String[] args) {
        Integer arr[] = refiner(new int[]{1, 2, 3, 3, 3, 5, 6, 3}, 3);
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }

}
