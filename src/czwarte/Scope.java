package czwarte;

public class Scope {
    public static void main(String[] args) {
       int number = 21;

        binarne();
    }

    private static void binarne() {
        int number = 150000000;
        System.out.println(number+number);
        System.out.println("Max_Value = " + (Integer.MAX_VALUE +1));
        System.out.println("MIN_Value = " + (Integer.MIN_VALUE));

        long bigNumber = 30000000L;
        System.out.println(bigNumber);
        System.out.println( "max_value=" +Long.MAX_VALUE);
        System.out.println("max_value =" +Long.MIN_VALUE);

        System.out.println( Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
