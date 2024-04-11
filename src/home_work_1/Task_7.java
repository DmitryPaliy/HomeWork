package home_work_1;
// * Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимать
// один параметр и будет возвращать строку в отформатированном виде. В метод будет передаваться массив
// из 10 цифр (от 0 до 9). Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например,
// передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
// В задании нельзя использовать коллекции, стрима.

public class Task_7 {

    public static void main(String[] args) {
        int[] a = {5,7,6,4,9,8,5,4,2,3};
        System.out.println(createPhoneNumber(a));
    }
    public static String createPhoneNumber(int[] arg) {
        if (arg.length != 10) {
            return "Введены некорректные данные";
        }

        String formatPhoneNum = "(";
        int [] phoneNumber = new int[10];
        System.arraycopy(arg, 0, phoneNumber, 0, arg.length);
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                formatPhoneNum += ") ";
            }
            if (i == 6) {
                formatPhoneNum += "-";
            }
            formatPhoneNum += Integer.toString(phoneNumber[i]);
        }
        return formatPhoneNum;
    }
}



