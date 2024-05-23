package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.decorator.SearchEngineIgnoringCase;
import home_work_7.utils.EasySearch;
import home_work_7.utils.TextEditor;
import java.io.*;
import java.util.*;

//2. Работа с коллекциями:
//	2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
//		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
//		текстовый файл и поместить текст из данного текстового файла в строку. Далее данную строку необходимо
//		обработать таким образом, чтобы из неё можно было бы считывать слова. Далее каждое полученное слово
//		поместить в Set. Благодаря возможностям Set'ов в итоге мы получим коллекцию содержащую набор слов который
//		был использован при написании данного текста. В конце выводим в консоль количество использованных слов.
//	2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
//	Отсортировать по количеству. Распечатать в консоль.
//		Пример: Война - 200 раз, Мир - 100 раз и так далее. Знаки препинания, пробелы и переводы строк - это не слова.
//		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
//		текстовый файл и поместить текст из данного текстового файла в строку.  Далее данную строку необходимо
//		обработать таким образом, чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить
//		как ключ в Map, а количество повторений в тексте ставить как значение. Для того чтобы это работало вам
//		необходимо постоянно проверять наличие ключа в Map, и если нужный нам ключ уже присутствует в нашей коллекции
//		то мы должны увеличить уже имеющееся значение в коллекции на единицу. После наполнения данной коллекции мы
//		получим набор слов и их количество в тексте. Далее нам нужно придумать как отсортировать получившуюся
//		коллекцию, но к сожалению непосредственно эту коллекцию отсортировать не получится, придётся создавать для
//		этого List и наполнять лист Entry из Map. В итоге из получившегося отсортированного набора данных вывести
//		первые N записей.
//5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война", "и" (как союз), "мир".
//	5.1 Как есть.
//	5.2* Вне зависимости от регистра.
public class WarAndPeaceMain {

    public static void main(String[] args) {

        File file = new File("D:/Java/JD1/HomeWork/src/home_work_7/library/классика/War_and_peace_Tolstoi.txt");
        if (!file.exists()) {
            System.out.println("Некорректно указан путь к файлу");
            return;
        }

        String text = TextEditor.getOnlyWords(file);
        String[] words = text.split(" ");
        Set<String> stringSet = new HashSet<>(List.of(words));
        System.out.println("В тексте используется " + stringSet.size() + " слов"); //40067

        Map <String, Integer> mapWords = new HashMap<>();
        for (String word : words) {
            if (!mapWords.containsKey(word)) {
                mapWords.put(word, 1);
            } else {
                mapWords.put(word, mapWords.get(word) + 1);
            }
        }

        String times = " раз";
        List<Map.Entry<String, Integer>> listWords = new ArrayList<>(mapWords.entrySet());
        listWords.sort(Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(listWords);
        for (int i = 0; i < 4; i++) {
            System.out.println(listWords.get(i) + times); //и=13875 раз, в=6490 раз, не=5717 раз, что=5040 раз,
        }

        ISearchEngine easySearch = new EasySearch();
        String[] searchingWords = {" война ", " и ", " мир "};
        for (String s : searchingWords) {
            System.out.println(s + easySearch.search(text, s) + times);// война-46, и-13875, мир-33
        }

        ISearchEngine ignorCaseSearch = new SearchEngineIgnoringCase(easySearch);
        for (String str : searchingWords) {
            System.out.println(str + ignorCaseSearch.search(text, str) + times);// война-51, и-14599, мир-33
        }
    }
}


