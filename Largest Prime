//Largest Prime
//
//Write a method named getLargestPrime with one parameter of type int named number.
//
//If number is negative or less than 2, return -1
//
//The method should calculate and return the largest prime factor of the given number
//
//Examples
//
//getLargestPrime(21) → 7 (prime factors: 3, 7)
//
//getLargestPrime(217) → 31
//
//getLargestPrime(0) → -1
//
//getLargestPrime(45) → 5
//
//getLargestPrime(-1) → -1

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));   // 7
        System.out.println(getLargestPrime(217));  // 31
        System.out.println(getLargestPrime(0));    // -1
        System.out.println(getLargestPrime(45));   // 5
        System.out.println(getLargestPrime(-1));   // -1
        System.out.println(getLargestPrime(2));    // 2
        System.out.println(getLargestPrime(7));    // 7
        System.out.println(getLargestPrime(16));   // 2
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            int i = 2;
            while (number > 1) {

                if (number % i == 0) {
                    number = number / i;
                } else i++;

            }
            return i;
        }
    }
}
