package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class Task3 {
    /**
     * Определить матрицу (двумерный массив) и ее заполнить случайными значениями.
     * Построить вектор В, которой возвращает – номер максимального значения в i-й строке;
     */

    public static void TwoDimensionalArray() {
        int sizeRowOriginalArray = 5, sizeColumnOriginalArray = 5;
        int[][] originalArray = RandomArray(sizeRowOriginalArray, sizeColumnOriginalArray);
        OutPutArray(originalArray);
        int numberRow = (int) (Math.random() * sizeRowOriginalArray);
        System.out.printf("Номер строки: " + numberRow + "\n");
        int maxElem = Arrays.stream(originalArray[numberRow]).max().getAsInt();
        System.out.printf("Наибольшее значение: " + maxElem);
    }

    private static int[][] RandomArray(int sizeRowArray, int sizeColumnArray) {
        int[][] array = new int[sizeRowArray][sizeColumnArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    private static void OutPutArray(int[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }
}
