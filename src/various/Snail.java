package various;

import java.util.Arrays;

public class Snail {
    /*
        array = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
        snail(array) #=> [1,2,3,6,9,8,7,4,5]

        array = [[1,2,3],
                 [8,9,4],
                 [7,6,5]]
        snail(array) #=> [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        int[][] arr3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 1, 2}};

        int[][] arr4 = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
//        mySnail(arr1);
        goRight(arr3, 0, 0, 0, 0);
        goRight(arr1, 0, 0, 0, 0);
        goRight(arr4, 0, 0, 0, 0);
    }

    private static boolean isEnd(int[][] array, int horizontalCounter, int verticalCounter) {
        if (array[0].length - horizontalCounter > 0 && array.length - verticalCounter > 0)
            return false;
        else {
            System.out.println("The end");
            return true;
        }
    }

    public static boolean goRight(int[][] array, int x, int y, int horizontalCounter, int verticalCounter) {
        if (isEnd(array, horizontalCounter, verticalCounter)) {
            return true;
        } else {
            for (int i = 0; i < array[0].length - horizontalCounter; i++) {
                array[y][x] = 0;
                printMatrix(array);
                x++;
            }
            x--;
            y++;
            verticalCounter++;
            return goDown(array, x, y, horizontalCounter, verticalCounter);
        }
    }

    private static boolean goDown(int[][] array, int a, int y, int horizontalCounter, int verticalCounter) {
        if (isEnd(array, horizontalCounter, verticalCounter)) {
            return true;
        } else {
            for (int i = 0; i < array.length - verticalCounter; i++) {
                array[y][a] = 0;
                printMatrix(array);
                y++;
            }
            y--;
            a--;
            horizontalCounter++;
            return goLeft(array, a, y, horizontalCounter, verticalCounter);
        }
    }

    private static boolean goLeft(int[][] array, int x, int y, int horizontalCounter, int verticalCounter) {

        if (isEnd(array, horizontalCounter, verticalCounter)) {
            return true;
        } else {
            for (int i = 0; i < array[0].length - horizontalCounter; i++) {
                array[y][x] = 0;
                printMatrix(array);
                x--;
            }
            x++;
            y--;
            verticalCounter++;
            return goUp(array, x, y, horizontalCounter, verticalCounter);
        }
    }

    private static boolean goUp(int[][] array, int x, int y, int horizontalCounter, int verticalCounter) {
        if (isEnd(array, horizontalCounter, verticalCounter)) {
            return true;
        } else {
            for (int i = 0; i < array.length - verticalCounter; i++) {
                array[y][x] = 0;
                printMatrix(array);
                y--;
            }
            y++;
            x++;
            horizontalCounter++;
            return goRight(array, x, y, horizontalCounter, verticalCounter);
        }
    }

    public static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix)
                .forEach(
                        (row) -> {
                            System.out.print("[");
                            Arrays.stream(row)
                                    .forEach((el) -> System.out.print(" " + el + " "));
                            System.out.println("]");
                        }
                );
        System.out.println();
    }
}
