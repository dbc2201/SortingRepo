/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/04/20
 *   Time: 5:06 AM
 */

package heapsort;

public class HeapSort {

    /**
     * This method will sort an integer array using the Heap Sort Algorithm.
     * NOTE: The Heap Sort Algorithm has a worst-case time complexity of O(n logn).
     * pre-condition: The integer array named `array` must contain elements.
     * post-condition: The integer array will be sorted.
     *
     * @param array The integer array to be sorted.
     */
    public static void sort(int[] array) {
        buildHeap(array);
        shrinkHeap(array);
    }

    /**
     * This method will convert the integer array into a heap.
     * pre-condition: The integer array must contain at least one item.
     * post-condition: All the elements in the array will be converted in heap order.
     *
     * @param array The integer array to be converted to a heap.
     */
    private static void buildHeap(int[] array) {
        int currentIndex = 1;

        while (currentIndex++ < array.length) {

            int childIndex = currentIndex - 1;

            int parentIndex = (childIndex - 1) / 2;

            while (parentIndex >= 0 && array[parentIndex] < array[childIndex]) {
                swap(array, parentIndex, childIndex);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }
    }

    /**
     * This method will convert a heap into an integer array of sorted elements.
     * pre-condition: All the elements in the array must be in the heap order.
     * post-condition: The integer array will be sorted.
     *
     * @param array The integer array to be sorted.
     */
    private static void shrinkHeap(int[] array) {

        int currentIndex = array.length;

        while (currentIndex-- > 0) {

            swap(array, 0, currentIndex);

            int parentIndex = 0;

            while (true) {

                int leftChildIndex = 2 * parentIndex + 1;

                if (leftChildIndex >= currentIndex) {
                    break;
                }

                int rightChildIndex = leftChildIndex + 1;
                // or simply, 2 * parentIndex + 2;

                int maxChildIndex = leftChildIndex;

                if (rightChildIndex < currentIndex &&
                        array[leftChildIndex] < array[rightChildIndex]) {
                    maxChildIndex = rightChildIndex;
                }

                if (array[parentIndex] < array[maxChildIndex]) {
                    swap(array, parentIndex, maxChildIndex);
                    parentIndex = maxChildIndex;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * This method swaps two elements in the `array` based on their indices.
     *
     * @param array The integer array that contains the elements.
     * @param i     The index of the first element to be swapped.
     * @param j     The index of the second element to be swapped.
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
