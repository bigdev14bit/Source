package Shege;

import java.util.Arrays;

public class Sqaure {
    public static void main(String[] args) {
        int[] myArray = {5, 3, 1, 4, 2};
        sortAndSquare(myArray);
    }

    public static void sortAndSquare(int[] array) {
        Arrays.sort(array);
        for(int index = 0; index < array.length; index++) {
            int square = array[index] * array[index];
            System.out.println("Square Of " + array[index] + " is " + square);
        }
    }
}
