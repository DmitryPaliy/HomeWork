package home_work_2.utils;

//	2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole(). Результат: В методе
//	arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3) и его
//	элементы по порядку {4, 17, 32}. Соответсвенно, будет создан массив размером 3 с элементами {4, 17, 32}
//	и сохранён в переменную container.
import java.util.Arrays;
import static home_work_2.utils.HomeWork_2_1_1.ArraysUtils.arrayFromConsole;

public class HomeWork_2_1_1_1 {
     public static void main(String[] args) {
         int[] container = arrayFromConsole();
         System.out.println(Arrays.toString(container));
    }
}
