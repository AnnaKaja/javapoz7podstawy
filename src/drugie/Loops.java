package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int a = scanner.nextInt();
      //  int b = scanner.nextInt();
      //  int c = scanner.nextInt();
       // System.out.println("Sum = " + (a + b + c));
        // for najprostsza petla umożliwia pobranie czegoś 5 razy
        //for (zmienna int zmienna pentli;;)
        for (int i = 0; i < 4; i = i + 1) {
            int number = scanner.nextInt();
            if (number >= 5 && number <=20) {
            System.out.println(i + ". Pow ("+ number +") =" + (number * number));
        }else {
                System.out.println("Number not supported. Upgrade to full version");
            }

        System.out.println("End of program");
    }
}}
