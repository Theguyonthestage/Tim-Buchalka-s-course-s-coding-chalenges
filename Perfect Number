//Perfect Number
//
//Write a method named isPerfectNumber with one parameter of type int named number.
//
//If number is less than 1, the method should return false.
//
//The method must calculate whether the number is a perfect number.
//
//A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//Proper positive divisors are positive integers that fully divide the number but exclude the number itself.

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int divisor = 1, sum = 0;
        for (; divisor < number; divisor++) {
            if (isDivisor(number, divisor)) {
                sum += divisor;
            }


        }


        return sum == number;
    }

    public static boolean isDivisor(int number1, int divisor) {
        return number1 % divisor == 0;
    }

}
