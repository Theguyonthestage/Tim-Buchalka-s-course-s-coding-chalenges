//Flour Pack Problem
//
//Write a method named canPack with three parameters of type int:
//
//bigCount → number of big flour bags (5 kilos each)
//
//smallCount → number of small flour bags (1 kilo each)
//
//goal → target amount of flour in kilos
//
//The method should return true if it is possible to reach the goal amount using the available bags.
//Otherwise, return false.
//
//Rules
//
//You can only use whole bags.
//
//Each big bag weighs 5 kilos.
//
//Each small bag weighs 1 kilo.
//
//Bags cannot be broken or partially used.
//
//        Input Validation
//
//If any parameter is negative, return false.


public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(2, 1, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigBagsUsed = Math.min(bigCount, (goal / 5));
        int remainingKilos = goal - (bigBagsUsed * 5);

        if (remainingKilos <= smallCount) {
            return true;
        } else {
            return false;
        }


    }
}
