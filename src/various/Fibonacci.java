package various;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibIterative(9));
        System.out.println("rec " + fibRecursively(9));
    }

    private static int fibIterative(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= number; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    private static int fibRecursively(int number) {
        if (number == 0) {
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return fibRecursively(number - 1) + fibRecursively(number - 2);
    }
}
