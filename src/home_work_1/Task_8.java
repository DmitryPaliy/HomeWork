package home_work_1;
//8.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number), который возвращает двоичное представление числа.
// В методе можно использовать только обычную математику которая описана в теории. Если число отрицательное, то вернуть
// дополнительный код. Теория https://planetcalc.ru/747. Пример:
//	8.1 Вводим: 42.  Возвращает: 00101010
//	8.2 Вводим: 15.  Возвращает: 00001111
//	8.3 Вводим: -42. Возвращает: 11010110
//	8.4 Вводим: -15. Возвращает: 11110001
public class Task_8 {
    public static void main(String[] args) {
        System.out.println(toBinaryString((byte) 42));
    }
    static String toBinaryString(byte number) {
        if (number >= 0) {
            return 0 + positiveNumberToBinaryString(number);
        } else {
            number = (byte) Math.abs(number + 128);
            return 1 + positiveNumberToBinaryString(number);
        }
    }
    static String positiveNumberToBinaryString(byte byteNum) {
        String binaryNumber = "";
        int count = 0;
        int resultOfDivision = byteNum;
        while (resultOfDivision > 1) {
            binaryNumber = resultOfDivision % 2 + binaryNumber;
            resultOfDivision = resultOfDivision / 2;
            count++;
        }
        binaryNumber = resultOfDivision + binaryNumber;
        if (count < 6) {
            for (int i = count; i < 6; i++) {
                binaryNumber = 0 + binaryNumber;
                count++;
            }
        }
        return binaryNumber;
    }
}
