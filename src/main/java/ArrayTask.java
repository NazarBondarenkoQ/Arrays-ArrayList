package main.java;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTask {

    Integer[] arr = new Integer[]{2, 3, 1, 7, 11};

    /**
     * This method sorts the given array via library methods of Arrays and Collections. And prints the array instantly.
     */

    void autoSort(Integer[] arr) {

        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * This method sorts the given array manually, by replacing the elements. And prints the array instantly.
     */


    public void manualSort(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (Integer integer : arr) { // Array printing
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    /**
     * This method calculates the sum of positive number and return the sum as an Integer value;
     */

    Integer onlyPositiveNumber(Integer[] array) {
        int sum = 0;
        for (Integer i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * This method calculates the arithmetical mean of all array elements and returns the Double value;
     */

    double averageValue(Integer[] array){
        Integer sum = 0;
        double value = (double) 0;
        for (Integer i : array) {
            sum += i;
            value = sum / (double) array.length;
        }
        return value;
    }
}



