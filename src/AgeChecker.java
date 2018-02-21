import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // pobrali od usera liczbe - jego wiek
        // jeżeli wiek < 6 "Powinieneś iść do przedszkola"
        // jeżeli wiek < 12 " Powinieneś iść do podstawówki"
        // jeżeli wiek < 16 " Powinieneś iść do gimnazjum"
        // jeżeli wiek < 20 " powinieneś iść do szkoły średniej"
        //else uczelnia

        Scanner scanner = new Scanner(System. in);
        System.out.println( " Insert your age");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.println(" Go to kindegarden");
        } else if (age < 12) {
            System.out.println(" Go to primary school");
        }else  if ( age < 16) {
            System.out.println(" Go to middel school");
        }else  if (age <20 ) {
            System.out.println(" Go to high school");
        } else {
            System.out.println(" Go to university");
        }
        //if (age >= 0 && (age < 18 ||  age >= 65));
        //1. wyświetlić wiadomość "a" jeżeli wiek jest większy od 30 i podzielny przez 3
        //2. wyświetlić wiadomość "b" jeżeli wiek mniejszy od 15 lub większy od 60 i wiek / 5 ma reszte 2
        if (age > 30 && age % 3== 0 ) {
            System.out.println("a");
        }
        if ((age < 15 || age > 60) && age % 5 == 2 ){
            System.out.println("b");
        }


    }
}
