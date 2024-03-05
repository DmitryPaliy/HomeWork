package home_work_2.arrays;

import home_work_2.utils.HomeWork_2_1_1;

import java.util.Arrays;

//2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи
// do....while, while, for, foreach. Вызывая ранее созданный метод arrayFromConsole
// (ArraysUtils.arrayFromConsole()) получить массив. Все задачи в одном классе, в отдельных методах,
// в каждом методе используется 4 разных цикла. Должно получиться 3 метода:
//		2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
public class HomeWork_2_2 {

    public static class ArraysIteration {
        public static void main(String[] args) {
            ArraysIteration.printToConsole();
            ArraysIteration.everySecond();
            ArraysIteration.reverse();
        }
        public static void printToConsole() {
            int[] arr1 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            int i = 0;
            System.out.print("Элементы массива после итерации в цикле do...while: ");
            do {
                int element = arr1[i];
                System.out.print(element + " ");
                ++i;
            } while (i < arr1.length);

            System.out.println(" ");

            int[] arr2 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            int j = 0;
            System.out.print("Элементы массива после итерации в цикле while: ");
            while (j < arr2.length) {
                int element = arr2[j];
                System.out.print(element + " ");
                ++j;
            }

            System.out.println(" ");

            int[] arr3 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.print("Элементы массива после итерации в цикле for: ");
            for (int k = 0; k < arr3.length; k++) {
                int element = arr3[k];
                System.out.print(element + " ");
            }

            System.out.println(" ");

            int[] arr4 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.print("Элементы массива после итерации в цикле foreach: ");
            for (int element : arr4) {
                System.out.print(element + " ");
            }

            System.out.println(" ");
        }

        public static void everySecond() {
            int[] arr1 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            int i = 0;
            System.out.print("Каждый второй элемент массива после итерации в цикле do...while: ");
            do {
                int element = arr1[i];
                if (i % 2 != 0) {
                    System.out.print(element + " ");
                }
                ++i;
            } while (i < arr1.length);

            System.out.println(" ");

            int[] arr2 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            int j = 0;
            System.out.print("Каждый второй элемент массива после итерации в цикле while: ");
            while (j < arr2.length) {
                int element = arr2[j];
                if (j % 2 != 0) {
                    System.out.print(element + " ");
                }
                ++j;
            }

            System.out.println(" ");

            int[] arr3 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.print("Каждый второй элемент массива после итерации в цикле for: ");
            for (int k = 0; k < arr3.length; k++) {
                int element = arr3[k];
                if (k % 2 != 0) {
                    System.out.print(element + " ");
                }
            }

            System.out.println(" ");

            int[] arr4 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.print("Каждый второй элемент массива после итерации в цикле foreach:");
            int n = 0;
            for (int element : arr4) {
                if (n * element != 0) {
                    System.out.print(element);
                    --n;
                } else {
                    System.out.print(" ");
                    ++n;
                }
            }

            System.out.println(" ");
        }

        public static void reverse() {
            int[] arr1 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            int i = 0;
            System.out.print("Элементы массива в обратном порядке после итерации в цикле do...while: ");
            do {
                int temp = arr1[i];
                arr1[i] = arr1[arr1.length - 1 - i];
                arr1[arr1.length - 1 - i] = temp;
                ++i;
            } while (i < arr1.length / 2);
            System.out.println(Arrays.toString(arr1));


            int[] arr2 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            int j = 0;
            System.out.print("Элементы массива в обратном порядке после итерации в цикле while: ");
            while (j < arr2.length / 2) {
                int temp = arr2[j];
                arr2[j] = arr2[arr2.length - 1 - j];
                arr2[arr2.length - 1 - j] = temp;
                ++j;
            }
            System.out.println(Arrays.toString(arr2));


            int[] arr3 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.print("Элементы массива в обратном порядке после итерации в цикле for: ");
            for (int k = 0; k < arr3.length / 2; k++) {
                int temp = arr3[k];
                arr3[k] = arr3[arr3.length - 1 - k];
                arr3[arr3.length - 1 - k] = temp;
            }
            System.out.println(Arrays.toString(arr3));


            int[] arr4 = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.print("Элементы массива в обратном порядке после итерации в цикле foreach:");
            
        }
    }
}
