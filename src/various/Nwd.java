package various;

    public class Nwd {
        public static void main(String[] args) {
            int number1 = 8;
            int number2 = 6;

            System.out.println(commonDivider(number1, number2));

        }

        private static int commonDivider(int number1, int number2) {
            while (number1 != number2) {
                if (number1 > number2) {
                    number1 -= number2;
                } else {
                    number2 -= number1;
                }

            }
            return number1;
        }

    }