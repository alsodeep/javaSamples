/**
 *
 */
package com.alsodeep;

/**
 * @author Sergey Lysenko
 * April 9, 2015
 */
public class ArrIterator {

    int[][] arr;
    int y = 0;
    int xstate = 0;
    int ystate = 0;

    public ArrIterator(int[][] arr) {
        this.arr = arr;
        if (this.arr != null) {
            y = arr.length;
        }
    }

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
