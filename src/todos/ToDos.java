package todos;

import java.util.Scanner;

public class ToDos {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] todos = new String[3];
    int index = 0;
    int decision;
    do {
        ToDosViews.menu();
       // System.out.println("1. Dodaj");
        //System.out.println("2. Wyświetl");
        //System.out.println("0. Koniec");
        decision = scanner.nextInt();
        scanner.nextLine();
        switch (decision){
            case 1:
                if (index == todos.length){
                    ToDosViews.noSpaceWaringMessage();
                    ToDosViews.waitForUser (scanner);

                   // System.out.println("No space for new todo");
                    //System.out.println("Press any key to continue");
                    //System.out.println();
                    //System.out.println();
                   // scanner.nextLine();
                } else {
                    addTodo(scanner, todos, index);
                    index++;
                }
                break;
            case 2:
                listTodos(todos, index);
                ToDosViews.waitForUser(scanner);

               // System.out.println();
               // System.out.println();
               // System.out.println("Press any key to continue");
               // scanner.nextLine();
                break;
        }

    }while(decision != 0);
    }
    private static void addTodo(Scanner scanner, String[] todos, int index) {
        //pobieranie od usera
       ToDosViews.newTodosMessage();
       String newTodos = scanner.nextLine();
       //wstawienie do tablicy
        todos[index] = newTodos;
        }

    private static void listTodos(String[] todos, int todosToDisplay) {
        // wyswietlanie tablicy
        if (todosToDisplay ==0){
       ToDosViews.newTodosMessage();}

        for (int i = 0; i < todosToDisplay ; i++) {
            System.out.println(i + "." + todos[i] );

        }

    }

    }
