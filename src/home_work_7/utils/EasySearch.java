package home_work_7.utils;
//4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String. В данной реализации
// запрещено использовать регулярные выражения в любом виде, для любых задач. Данный класс ищет слова с учётом регистра.
import home_work_7.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count = 0;
        int i = 0;
        while (text.indexOf(word, i) != -1) {
            i = text.indexOf(word, i) + word.length();
            ++count;
        }
        return count;
    }
}
