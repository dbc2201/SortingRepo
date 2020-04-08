/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 03/04/20
 *   Time: 12:35 PM
 */

package insertionsort;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int nextIndex = 1; nextIndex < array.length; nextIndex++) {
            insert(array, nextIndex);
        }
    }

    private static void insert(int[] array, int nextIndex) {
        int nextValue = array[nextIndex];
        while (nextIndex > 0 && nextValue < array[nextIndex - 1]) {
            array[nextIndex] = array[nextIndex - 1];
            nextIndex--;
        }
        array[nextIndex] = nextValue;
    }
}
