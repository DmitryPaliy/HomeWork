package home_work_2.sorts;

//4. Выполнить сортировку массива с числами:
//	4.1. Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие
//	методы:
//		4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему
//		массив при помощи алгоритма пузырьковая сортировка. Описание алгоритма: https://prog-cpp.ru/sort-bubble/
//		4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему
//		массив при помощи алгоритма шейкерная сортировка. Описание алгоритма: https://prog-cpp.ru/sort-shaker/

public class HomeWork_4_1 {
    public static class SortsUtils {
        public static void sort(int[] arr) {
            int length = arr.length;
            int thisElement = 0;
            for (int lastElement = length - 1; lastElement > 0; lastElement--) {
                for (int i = thisElement; i < lastElement; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        public static void shake(int[] arr){
            int leftEnd = 0;
            int rightEnd = arr.length - 1;
            do {
                for (int i = leftEnd; i < rightEnd; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
                rightEnd--;
                for (int i = rightEnd; i > leftEnd; i--) {
                    if (arr[i] < arr[i - 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = temp;
                    }
                }
                leftEnd++;
            } while (leftEnd < rightEnd);
        }
    }
}
