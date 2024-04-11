package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class Task_6_3 implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        switch (name) {
            case "Вася":
                return "Привет!/n" + "Я тебя так долго ждал.";
            case "Анастасия":
                return "Я тебя так долго ждал.";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
