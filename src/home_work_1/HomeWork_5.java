package home_work_1;

import java.util.Objects;
import java.util.Scanner;

//Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//	5.1 Данный метод будет принимать два параметра
//	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
//	5.3 Первый параметр boolean weekday обозначает рабочий день
//	5.4 Второй параметр boolean vacation обозначает отпуск.
//	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
public class HomeWork_5 {
    static boolean conteiner;
    static boolean b;
    public static void main(String[] arg) {
        System.out.println("Сегодня рабочий день? Да/Нет?");
        Scanner ans = new Scanner(System.in);
        String yesNo1 = ans.nextLine();
        if (Objects.equals(yesNo1, "Да")) {
            conteiner = true;
        }
        if (Objects.equals(yesNo1, "Нет")) {
            conteiner = false;
            System.out.println("Можешь спать дальше");
            return;
        }
        System.out.println("Ты в отпуске? Да/Нет?");
        Scanner ans1 = new Scanner(System.in);
        String yesNo2 = ans1.nextLine();
        if (Objects.equals(yesNo2, "Да")) {
            b = true;
        }
        if (Objects.equals(yesNo2, "Нет")) {
            b = false;
        }
        if (sleepIn(conteiner,b)) {
            System.out.println("Можешь спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
}
