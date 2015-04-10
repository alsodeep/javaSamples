package com.alsodeep;

/**
 * Two dimensional array iterator.
 * @author Sergey Lysenko
 * April 9, 2015
 */
public class ArrIterator {

    /** Array for iteration */
    int[][] arr;
    /** first dimension of the array */
    int y = 0;
    /** curent x dimension position */
    int xstate = 0;
    /** curent y dimension position */
    int ystate = 0;

    /**
     * Init Array iterator
     * @param arr Array to iterate
     */
    public ArrIterator(int[][] arr) {
        this.arr = arr;
        if (this.arr != null) {
            y = arr.length;
        }
    }

    /**
     * Check if array has next elenent
     * @return true if array has next element, flase if hasn't
     */
    public boolean hasNext() {
        if (y == 0) {
            return false;
        }
        if (arr[ystate] != null && arr[ystate].length > xstate) {
            return true;
        }
        for (int st = ystate + 1; st < y; st++) {
            if (arr[st] != null && arr[st].length > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return next element from array
     * @return next element of array
     */
    public int next() {
        if (hasNext()) {
            if (arr[ystate] != null && arr[ystate].length > xstate) {
                int x = xstate;
                xstate++;
                return arr[ystate][x];
            }
            for (int st = ystate + 1; st < y; st++) {
                if (arr[st] != null && arr[st].length > 0) {
                    ystate = st;
                    xstate = 1;
                    return arr[ystate][0];
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
