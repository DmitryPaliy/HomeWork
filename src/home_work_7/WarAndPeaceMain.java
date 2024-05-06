package home_work_7;

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

        File file = new File("D:\\Java\\library\\War_and_peace.txt");
        if (!file.exists()) {
            System.out.println("Некорректно указан путь к файлу");
            return;
        }

        String[] words = TextEditor.getOnlyWords(file).split(" ");
        Set<String> stringSet = new HashSet<>(List.of(words));
        System.out.println(stringSet.size()); //40316

        Map <String, Integer> mapWords = new HashMap<>();
        for (String word : words) {
            if (!mapWords.containsKey(word)) {
                mapWords.put(word, 1);
            } else {
                mapWords.put(word, mapWords.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> listWords = new ArrayList<>(mapWords.entrySet());
        listWords.sort(Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(listWords);
        for (int i = 0; i <= 4; i++) {
            System.out.println(listWords.get(i) + " раз, "); //и=13874 раз, в=6483 раз, не=5707 раз, что=4747 раз,
        }

        EasySearch easySearch = new EasySearch();
        long countWar = easySearch.search(TextEditor.getOnlyWords(file), "война");
        System.out.println("война - " + countWar + " раз, ");
        long countAnd = easySearch.search(TextEditor.getOnlyWords(file), " и ");
        System.out.println("и - " + countAnd + " раз, ");
        long countPeace = easySearch.search(TextEditor.getOnlyWords(file), "мир");
        System.out.println("мир - " + countPeace + " раз, ");
    }
}


