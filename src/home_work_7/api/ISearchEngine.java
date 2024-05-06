package home_work_7.api;

//3. Написать интерфейс ISearchEngine. Это будет интерфейс в котором будут методы:
//	3.1 long search(String text, String word) - Метод возвращает информацию о количестве раз которое встречается
//	слово в тексте. Первый параметр текст в котором ищем, второй параметр, что ищем в тексте.
public interface ISearchEngine {
    long search(String text, String word);
}
