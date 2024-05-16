package home_work_7.utils;

import home_work_7.api.ISearchEngine;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher.
// Данный класс ищет слова с учётом регистра.
public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {

        String string = "\\s*"+word+"\\s*";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(text);
        long count = 0;
        while (matcher.find()) {
            ++count;
        }
        return count;
    }
}
