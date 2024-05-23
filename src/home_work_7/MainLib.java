package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.utils.EasySearch;
import home_work_7.utils.Folder;
import home_work_7.utils.TextEditor;

import java.io.File;
import java.util.Scanner;

//7. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки, из которой
// мы будем считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг минимум. При запуске пользователю
// в консоль выдать список txt файлов и предложить выбрать файл, с которым мы будем работать. Пользователь, выбрав файл
// вводит то, что он хочет найти в этом файле. После каждого ввода осуществляется поиск. Вводит пока не надоест.
// Пользователь может вернуться к выбору файла. Результат всех его поисков должен накапливаться в файл result.txt в
// формате «Имя файла – слово – количество». Тестируем.
public class MainLib {
    public static void main(String[] args) {

        System.out.println("Перечень каталогов:\n");

        String folderPath = "D:/Java/JD1/HomeWork/src/home_work_7/library";
        Folder library = new Folder(folderPath);
        library.choiceFolder();

        File file = library.choiceFile();

        String searchingText;
        do {
            System.out.println("\nВведите текст для поиска или слово \"back\" для перехода к выбору файла:");
            Scanner scanner = new Scanner(System.in);
            searchingText = scanner.nextLine();
            String text = TextEditor.getOnlyWords(file);
            ISearchEngine search = new EasySearch();
            System.out.println(searchingText + " " + search.search(text, searchingText));
        } while (!searchingText.equals("back"));

        
    }
}
