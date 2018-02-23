package czwarte;

import java.util.Scanner;

public class Warmup {
    public static void main (String [] args) {
        //czwarte();
        czwarte1();
        //pozbyc się wszystkich 0 z liczby np. 12002 -> 221
        System.out.println();
        System.out.println("zad3");
        int numberWithZeros = 12002;
        int numberWithoutZeros = 0;
        int multiplier = 1;
        while (numberWithZeros !=0) {
            int digit = numberWithZeros % 10;
            if (digit !=0) {
                numberWithZeros *= digit *multiplier;
               multiplier *= 10;
            }
            numberWithoutZeros /=10;
            }
        System.out.println( "NumberWithoutZeros =" + numberWithoutZeros);

        }




    private static void czwarte1() {
        //wczytujemy n liczb, i sumujemy wszystkie cyfry 123, 456 -> 1+2+3+4+5+6 = 21


        System.out.println();
        System.out.println("zad 2");
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Insert number");
            int value = scanner.nextInt();
            //sumowanie cyfr
            while (value != 0) {
                int digit = value % 10;
                sum += digit;
                value /= 10;
            }

        }
        System.out.println("Sum =" + sum);
    }

    private static void czwarte() {
        //napisac petle ktora odwraca liczbe np. 12345 -> 54321, 1200 -> 21
        int number = 123456;
        int reversedNuber = 0;
        while ( number !=0) {
            int digit = number % 10;
            reversedNuber *= 10;
            reversedNuber += digit;
            number /= 10;


        }
        System.out.println("ReversedNumber = " + reversedNuber);
    }
}
//wczytujemy n liczb, i sumujemy wszystkie  cyfry 123, 456 -> 1+2+3+4+5+6 = 21
