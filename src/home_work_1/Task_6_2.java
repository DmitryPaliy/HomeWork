package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class Task_6_2 implements ICommunicationPrinter {
    String vasia = "Вася";
    String nastia = "Анастасия";
    public String welcom(String name) {
        if (vasia.equalsIgnoreCase(name)) {
            return ("Привет!/n" + "Я тебя так долго ждал.");
        } else if (nastia.equalsIgnoreCase(name)) {
            return "Я тебя так долго ждал.";
        }
        return "Добрый день, а вы кто?";
    }
}
