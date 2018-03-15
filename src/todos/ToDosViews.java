package todos;

import java.util.Scanner;

public class ToDosViews {

    public static void menu() {
        System.out.println("1. Dodaj");
        System.out.println("2. Wyświetl");
        System.out.println("0. Koniec");
    }

    public static void noSpaceWaringMessage() {
        System.out.println("No space for new todo");
        System.out.println();
        System.out.println();
    }

    public static void waitForUser(Scanner scanner) {
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }
    public static void newTodosMessage() {
        System.out.println("--------------------");
        System.out.println("-Add next todo-");
        System.out.println("--------------------");
    }
    public static  void noTodosDisplayMessage(){
        System.out.println("------------------------");
        System.out.println("- No todos to display -");
        System.out.println("------------------------");
    }

}
