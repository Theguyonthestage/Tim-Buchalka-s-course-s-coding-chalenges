import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of integers to read.\r");
        int count = scanner.nextInt();

        int[] numbers = readIntegers(count);

        int min = findMin(numbers);

        System.out.println("Minimum element in the array is: " + min);
    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];

        System.out.println("Enter " + count + " integers:\r");

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}