package home_work_2.sorts;
//4.2. Создать класс SortsMain. Все проверки пишутся в main.
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

import home_work_2.sorts.HomeWork_4_1;
import home_work_2.utils.HomeWork_2_1_1;

import java.util.Arrays;

public class HomeWork_4_2 {

    public static class SortsMain {

        public static void main(String[] args) {
            int[] a = new int[]{1, 2, 3, 4, 5, 6};
            System.out.println("До сортировки: " + Arrays.toString(a));
            HomeWork_4_1.SortsUtils.sort(a);
            System.out.println("После пузырьковой сортировки: " + Arrays.toString(a));

            HomeWork_4_1.SortsUtils.shake(a);
            System.out.println("После шейкерной сортировки: " + Arrays.toString(a));

            int[] b = new int[]{1, 1, 1, 1};
            System.out.println("До сортировки: " + Arrays.toString(b));
            HomeWork_4_1.SortsUtils.sort(b);
            System.out.println("После пузырьковой сортировки: " + Arrays.toString(b));

            HomeWork_4_1.SortsUtils.shake(b);
            System.out.println("После шейкерной сортировки: " + Arrays.toString(b));

            int[] c = new int[]{9, 1, 5, 99, 9, 9};
            System.out.println("До сортировки: " + Arrays.toString(c));
            HomeWork_4_1.SortsUtils.sort(c);
            System.out.println("После пузырьковой сортировки: " + Arrays.toString(c));

            HomeWork_4_1.SortsUtils.shake(c);
            System.out.println("После шейкерной сортировки: " + Arrays.toString(c));

            int[] d = new int[]{};
            System.out.println("До сортировки: " + Arrays.toString(d));
            HomeWork_4_1.SortsUtils.sort(d);
            System.out.println("После пузырьковой сортировки: " + Arrays.toString(d));

            HomeWork_4_1.SortsUtils.shake(d);
            System.out.println("После шейкерной сортировки: " + Arrays.toString(d));

            int[] f = new int[]{6, 5, 4, 3, 2, 1};
            System.out.println("До сортировки: " + Arrays.toString(f));
            HomeWork_4_1.SortsUtils.sort(f);
            System.out.println("После пузырьковой сортировки: " + Arrays.toString(f));

            HomeWork_4_1.SortsUtils.shake(f);
            System.out.println("После шейкерной сортировки: " + Arrays.toString(f));

            int[] g = HomeWork_2_1_1.ArraysUtils.arrayRandom(50, 100);
            System.out.println("До сортировки: " + Arrays.toString(g));
            HomeWork_4_1.SortsUtils.shake(g);
            System.out.println("После сортировки: " + Arrays.toString(g));

            int[] h = HomeWork_2_1_1.ArraysUtils.arrayFromConsole();
            System.out.println("До сортировки: " + Arrays.toString(h));
            HomeWork_4_1.SortsUtils.shake(h);
            System.out.println("После сортировки: " + Arrays.toString(h));
        }
    }
}
