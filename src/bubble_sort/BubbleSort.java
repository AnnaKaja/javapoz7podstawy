package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       Integer[] array = {3, 4, 5, 2,1};
       bubbleSort(array);
        System.out.println(Arrays.asList(array));
    }

    public static void bubbleSort(Integer[] array) {
        for (int j = 0; j< array.length -1; j++) {
            if (array[j] > array[j +1]){
                int temp = array[j +1];
                array[j + 1] = array[j];
                array[j] = temp;
                bubbleSort(array);

            }

        }

    }
}
