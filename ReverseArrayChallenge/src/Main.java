import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 9, 10};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int j = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {

            int temp;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }

    }
}
