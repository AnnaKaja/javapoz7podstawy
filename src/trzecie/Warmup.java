package trzecie;

import java.util.Scanner;

public class Warmup {
    public static void main (String [] args) {
        // zad 1
        // wczytać liczbe n
        // zapytać n razy o liczbe
        //podzielna przez 2 to poinformować

        //podzielna przez 3 to poinformowac
        // podzielna przez 6 to poinformowac
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insert next number");
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                System.out.println("Value is divisible by 6");
            } else if (number % 3 == 0) {
                System.out.println("Value is divisible by 3");
            } else if (number % 2 == 00) {
                System.out.println(" Value is divisible by 2");
            } else {
                System.out.println("Value is not divisible by 6, 3 or 2");
            }
        }


        //zad 2
        //zdefiniowac liczbe n
        // pobierac n liczb
        //sprawdzic czy podana liczba jest wieksza od poprzedniej wprowadzonej
        System.out.println();
        System.out.println("Zadanie 2");
        int previousValue = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Insert next value to compare");
            int value = scanner.nextInt();
            if (value > previousValue) {
                System.out.println("New value is bigger then previous one");
            } else if (value == previousValue) {
                System.out.println(" Value is equal to previous one");
            } else {
                System.out.println("New value is smaller than previous one");
            }
            previousValue = value;
        }


        // zad 3
        //obliczyć sume n parzystych liczb
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(" Sum = " + sum);
    }}


        //zad*
        // obliczyć silnie dla n




