package home_work_2.sorts;

import static home_work_2.utils.HomeWork_2_1_1.ArraysUtils.arrayFromConsole;

//4. Выполнить сортировку массива с числами:
//	4.1. Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие
//	методы:
//		4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему
//		массив при помощи алгоритма пузырьковая сортировка. Описание алгоритма: https://prog-cpp.ru/sort-bubble/
//		4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему
//		массив при помощи алгоритма шейкерная сортировка. Описание алгоритма: https://prog-cpp.ru/sort-shaker/
//	4.2. Создать класс SortsMain. Все проверки пишутся в main.
//		4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата "[Какой массив был до
//		сортировки] -> [Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать
//		класс Arrays.
//		4.2.2. Для тестов используем предварительно созданные массивы:
//			4.2.2.1. new int[]{1,2,3,4,5,6}
//			4.2.2.2. new int[]{1,1,1,1}
//			4.2.2.3. new int[]{9,1,5,99,9,9}
//			4.2.2.4. new int[]{}
//			4.2.2.5. new int[]{6,5,4,3,2,1}
//		4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива. Вызывая ранее созданный
//		метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
//		4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль. Вызывая
//		ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.
public class HomeWork_4_1 {
    public static class SortsUtils {
        public static void sort() {
            int[] container = arrayFromConsole();
            int elems =0;
            container = new int[elems];
            for (int i = 0; i < elems; i++) {
                System.out.print(container[i] + " ");
                System.out.println(" ");
            }
            for (int out = elems - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++){
                    if(container[in] > container[in + 1]) {
                        int a = container[in];
                        container[in] = container[in+1];
                        container[in+1] = a;
                    }
                }
            }
        }
    }
}
