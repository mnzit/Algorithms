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
public class DynamicArray<T> {

    private Object[] numColl = new Object[0];
    private int count = -1;

    public void put(T num) {
        if (numColl.length == 0) {
            numColl = new Object[1];
            numColl[0] = (Object) num;
        } else {
            Object[] tempColl = new Object[numColl.length + 1];
            for (int i = 0; i < numColl.length; i++) {
                tempColl[i] = numColl[i];
            }
            tempColl[numColl.length] = (Object) num;
            numColl = tempColl;
        }
    }

    public int size() {
        return numColl.length;
    }

    public T[] get(int n) {
        return (T[]) numColl[n];
    }

    public T getValue() {
        return (T) numColl[count];
    }

    public boolean next() {
        if (count == numColl.length - 1) {
            count = numColl.length - 1;
            return false;
        } else {
            count++;
            return true;
        }
    }

    public T[] toArray(T[] a) {
        for (int i = 0; i < numColl.length; i++) {
            a[i] = (T) numColl[i];
        }
        return a;
    }
}
