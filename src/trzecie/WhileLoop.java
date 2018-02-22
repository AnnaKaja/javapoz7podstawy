package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        example(scanner);
        // wczytujemy liczby tak długo, az nie bedzie ona podzielna przez 15
        int number = 1;
        while (number % 15 ==0) {
            number = scanner.nextInt();
        }
        System.out.println("Number = " +number);

        //wczytujemy liczby tak długo, az ktos nie poda 0. Wyswietlamy sume podanych elementow
        boolean result = true;
       int sum =0;
        while (result) {
            int value = scanner.nextInt();
            sum +=value;
            if (value ==0){
                result = false;
            }
            System.out.println("sum=" +sum);
       //     result = value! =0;
          //  System.out.println("asdfasd");

        }



        }



    private static void example(Scanner scanner) {
        int sum =10;
        int tmp = 0;
        int i = 0;
        while (tmp < sum){
            int value = scanner.nextInt();
            i++;
            tmp +=value;
        }
        System.out.println("Inserted "+ i + "number.");
    }
}
