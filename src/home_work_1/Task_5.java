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
public class Task_5 {

    public static void main(String[] arg) {
        System.out.println("Сегодня рабочий день? Да/Нет?");
        Scanner answer = new Scanner(System.in);
        String question1 = answer.nextLine();
        if (!answerYes(question1)) {
            System.out.println("Можешь спать дальше");
        } else {
            System.out.println("Ты в отпуске? Да/Нет?");
            String question2 = answer.nextLine();
            if (answerYes(question2)) {
                System.out.println("Можешь спать дальше");
            } else {
                System.out.println("Пора идти на работу");
            }
        }
    }
    public static boolean answerYes(String answer) {
        return Objects.equals(answer, "Да");
    }
}
