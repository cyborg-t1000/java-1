package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));

        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            {
                if (arr3[i] < 6) arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - i - 1] = 1;
        }
        for (int[] ints : arr4) {
            System.out.println(Arrays.toString(ints));
        }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] arr5 = new int[]{1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] < min) min = arr5[i];
            if (arr5[i] > max) max = arr5[i];
        }
        System.out.printf("Min: %d, Max: %d\n", min, max);

        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
        // true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
        // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
        // символами ||, эти символы в массив не входят.

        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 50}));

    }

    public static boolean checkBalance(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arrayRangeSum(arr, 0, i) == arrayRangeSum(arr, i + 1, arr.length-1)) return true;
        }
        return false;
    }

    public static int arrayRangeSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
