package home_work_1;
// * Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимать
// один параметр и будет возвращать строку в отформатированном виде. В метод будет передаваться массив
// из 10 цифр (от 0 до 9). Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например,
// передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
// В задании нельзя использовать коллекции, стрима.

public class Task_7 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(a));
    }
    public static String createPhoneNumber(int[] arg) {
        if (arg == null) {
            return incorrect();
        }
        if (arg.length != 10) {
            return incorrect();
        }
        for (int j : arg) {
            if (j < 0) {
                return incorrect();
            }
        }

        StringBuilder formatPhoneNum = new StringBuilder("(");
        for (int i = 0; i < arg.length; i++) {
            if (i == 3) {
                formatPhoneNum.append(") ");
            }
            if (i == 6) {
                formatPhoneNum.append("-");
            }
            formatPhoneNum.append(arg[i]);
        }
        return formatPhoneNum.toString();
    }

    public static String incorrect() {
        return "Введены некорректные данные";
    }
}



