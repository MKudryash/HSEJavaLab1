package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    /**
     * Определить одномерный массив и заполнить его случайными значениями.
     *
     * Определить дополнительный массив разрешенных значений.
     * Составить массив из элементов исходного массива, имеющих неразрешенные значения.
     * Вывести результативный массив на экран;
     */
    public static void OneDimensionalArray() {
        int sizeOriginalArray = 5, sizeAllowedValuesArray = 5;
        int[] originalArray = RandomArray(sizeOriginalArray);
        int[] allowedValues = RandomArray(sizeAllowedValuesArray);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int elem : originalArray) {
            if(IntStream.of(allowedValues).noneMatch(x -> x == elem))
                arrayList.add(elem);
        }
        System.out.print("Исходный массив\n");
        OutPutArray(originalArray);
        System.out.print("Массив допустимых значений\n");
        OutPutArray(allowedValues);
        System.out.print("Итоговый массив\n");
        OutPutArray(arrayList);
    }

    private static int[] RandomArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
    private static void OutPutArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
    private static void OutPutArray(ArrayList<Integer> arrayList) {
        System.out.println(Arrays.toString(new ArrayList[]{arrayList}));
    }
}
