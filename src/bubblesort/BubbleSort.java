/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 31/03/20
 *   Time: 10:41 AM
 */

package bubblesort;

public class BubbleSort {

    /**
     * This method sorts an integer array using The Bubble Sort Technique
     *
     * @param array the array to be sorted
     */
    public void sort(int[] array, int choiceForSorting) {
        System.out.println(choiceForSorting == 1 ? "DESCENDING ORDER SORT" : "ASCENDING ORDER SORT");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (choiceForSorting == 1) {
                    sortDescending(array, j);
                } else {
                    sortAscending(array, j);
                }
            }
        }
    }

    private void sortDescending(int[] array, int j) {
        if (array[j] < array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }

    private void sortAscending(int[] array, int j) {
        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
