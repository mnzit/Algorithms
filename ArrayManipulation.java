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
public class ArrayManipulation {

    private static DynamicArray<Integer> coll = null;

    public static Integer sum(Integer[] data) {
        int result = 0;
        for (Integer i : data) {
            result += i;
        }
        return result;
    }

    public static Integer sumBidirectional(Integer[] data, int length) {
        int i = length - 1;
        int result = 0;
        int counter = 0;
        while (i >= 0) {
            if (counter != i) {
                result += data[i--] += data[counter++];
            } else {
                result += data[i--];
                i = -1;
            }
        }
        return result;
    }

    public static Integer sumRecursive(Integer[] data, int length) {
        return length <= 0 ? 0 : sumRecursive(data, length - 1) + data[length - 1];
    }

    public static int min(int[] data, int length) {
        int min = data[0];
        for (int i = 1; i < length; i++) {
            min = data[i] < min ? data[i] : min;
        }
        return min;
    }

    public static Integer max(Integer[] data, int length) {
        int max = data[0];
        for (int i = 1; i < length; i++) {
            max = data[i] > max ? data[i] : max;
        }
        return max;
    }

    public static float avg(Integer[] data, int length) {
        return (float) sum(data) / length;
    }

    public static Integer sumByDivisition(Integer[] data, int length, int divisionValue) {
        coll = new DynamicArray<>();
        for (Integer i : data) {
            if (i % divisionValue == 0) {
                coll.put(i);
            }
        }
        return sum(coll.toArray(new Integer[coll.size()]));
    }

    public static Integer[] oddFilter(Integer[] data, int length) {
        coll = new DynamicArray<>();
        for (int i : data) {
            if (i % 2 != 0) {
                coll.put(i);
            }
        }
        return coll.toArray(new Integer[coll.size()]);
    }

    public static void pushUnique(Integer[] data) {

    }

    public static void main(String[] args) {
        Integer[] data = {2, 3, 1, 8, 10, 15, 20, 22, 25};
        System.out.println(sumRecursive(data, data.length));
    }
}
