public class Main {

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(25, 15));
        System.out.println(greatestCommonDivisor(8, 16));
        System.out.println(greatestCommonDivisor(12, 30));
        System.out.println(greatestCommonDivisor(9, 18));
        System.out.println(greatestCommonDivisor(81, 153));
    }

    public static int greatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        if (first > second) {
            int commonDivisor = 0;

            for (int checker = 1; checker <= second; checker++) {

                if (second % checker == 0 && first % checker == 0) {
                    commonDivisor = checker;
                }
            }
            return commonDivisor;
        } else {
            int commonDivisor = 0;
            for (int checker = 1; checker <= first; checker++) {

                if (second % checker == 0 && first % checker == 0) {

                    commonDivisor = checker;
                }
            }
            return commonDivisor;

        }

    }
}
