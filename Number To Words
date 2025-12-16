public class Main {

    public static void main(String[] args) {
        numberToWords(7954365);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid value");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
        } else {
            int last = 0;
            number = reverseNumber(number);
            for (; number != 0; number /= 10) {
                last = number % 10;
                switch (last) {
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    default:
                        System.out.println("OTHER");
                        break;
                }
            }


        }
    }

    public static int reverseNumber(int number) {
        int reverse = 0, remainder;
        while (number > 0) {
            remainder = number % 10;
            reverse = remainder + reverse * 10;
            number /= 10;

        }
        return reverse;
    }


}
