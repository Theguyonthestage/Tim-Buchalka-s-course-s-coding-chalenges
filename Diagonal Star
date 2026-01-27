//Write a method named printSquareStar with one parameter of type int named number.
//
//If number is less than 5, the method should print “Invalid Value”.
//
//The method should print a square pattern of stars (*) with the given number of rows and columns.
//
//Pattern Rules
//
//For a given number n, the pattern must contain:
//
//A border of stars
//
//A main diagonal of stars (top-left to bottom-right)
//
//A secondary diagonal of stars (top-right to bottom-left)
//
//All other positions should be filled with spaces.

public class Main {

    public static void main(String[] args) {
        printSquareStar(6);
    }

    public static void printSquareStar(int number) {
        char star = '*';
        char space = ' ';
        if (number < 5) {
            System.out.println("Invalid value");
        } else for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {

                if (row == 0 || row == number - 1 || col == 0 || col == number - 1 || row == col || row + col == number - 1) {
                    System.out.print(star);
                }
                else {
                    System.out.print(space);
                }

            }
            System.out.printf("%n");
        }
    }
}


