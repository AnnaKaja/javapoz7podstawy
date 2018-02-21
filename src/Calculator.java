import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");


        Scanner reader = new Scanner(System.in);
        //int someValue = reader.nextInt();
       // System.out.println(someValue);
        //1. pobrać liczby
        //2. wykonać działania
        //3. wyświetlić wyniki

        System.out.println("Insert first value");
        int firstValue=reader.nextInt();
        System.out.println("Insert second value");
        int secondValue=reader.nextInt();
        int addResult = firstValue + secondValue;
        int substractresult = firstValue - secondValue;
        int multiplyResult = firstValue * secondValue;
        double divideResult = 0;
        if (secondValue != 0) {
             divideResult = (double) firstValue / secondValue;
        }

        System.out.println("add = " + addResult);
        System.out.println("substract = "+ substractresult);
        System.out.println("multiply = " + multiplyResult);
        if (secondValue != 0) {
            System.out.println("divide = " + divideResult);
        }

        //4. ladne wyswietlanie wynikow

         System.out.println(firstValue + " + "  + secondValue + " = " + (firstValue + secondValue));
        System.out.println( firstValue + " - "  + secondValue + " = " + ( firstValue - secondValue));
        System.out.println( firstValue + " * " + secondValue + "=" + (firstValue * secondValue));
        if (secondValue !=0) {
            System.out.println(firstValue + " / " + secondValue + "=" + (firstValue / (double) secondValue));
        }
        //5. wyświetlić informacje o liczbach
        // czy liczby są równe firstValue == secondValue
        // czy liczby są różne firstValue != secondValue
        // wyświetlić większa liczba firstValue >= secondValue -> firstValue
        // wyświetlić większą liczbe firstValue <= secondValue -> firstValue
        // czy jest dzielenie z reszta
        // wyswietlic parzyste liczby
        if (firstValue == secondValue) {
            System.out.println("Values are equal");
        } else {
            System.out.println(" Values are not equal");
        }
        if (firstValue != secondValue) {
            System.out.println("Values are not equal");
        }
        if (firstValue > secondValue) {
            System.out.println("first Value is bigger than second");
        } else

        if (firstValue < secondValue){
            System.out.println("second value is bigger than first one");
        if (firstValue % secondValue !=0){
            System.out.println(" liczby podzielne z reszta");
        } else {
            System.out.println( " liczby podzielne bez reszty");
        }
        if (firstValue % 2 == 0) {
            System.out.println("first value is even");
        }
        if (secondValue % 2 == 0) {
            System.out.println(" second value is even");

            }

        }
        }

        }






