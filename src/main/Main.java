/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 31/03/20
 *   Time: 10:44 AM
 */

package main;

import bubblesort.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("UNSORTED ARRAY");
        System.out.println(Arrays.toString(array));
        System.out.println("Press 1 to sort this array using Bubble Sort");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: /*BUBBLE SORT*/
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.sort(array);
                System.out.println("ARRAY SORTED BY BUBBLESORT");
                System.out.println(Arrays.toString(array));
                break;
            case 2: /*SELECTION SORT*/
                break;
            default:
                break;
        }
        scanner.close();
    }
}
