// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
//
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106, 81, 26, 15, 5 in it.
//
// Set up the program so that the numbers to sort are read in from the keyboard.
//
// Implement the following methods - getIntegers, printArray, and sortIntegers
//
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers.
//
// You will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many values do you want the array to have?");
        int number = scanner.nextInt();
        int[] array = getIntegers(number);
        System.out.println("Printing the entered array.");
        printArray(array);
        int[] sortedArray = sortIntegers(array);
        System.out.println("Printing the sorted array.");
        printArray(sortedArray);

    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + array.length + " integer values. \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value at position " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

//        int[] newArray1 = Arrays.copyOf(array,array.length); built in way to copy arrays

        for (int j = 0; j < newArray.length; j++) {
            int temp;

            for (int i = 0; i < array.length - 1; i++) {

                if (newArray[i] < newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i]= newArray[i+1];
                    newArray[i+1]=temp;
                }

            }

        }
        return newArray;
    }
}