package home_work_7.utils;

import home_work_7.api.ISearchEngine;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Folder extends File{

    private final File folder;
    private String folderPath;

    public Folder(String folderPath) {
        super(folderPath);
        this.folderPath = folderPath;
        this.folder = new File(folderPath);
    }

    public void listFolderFiles() {
        Arrays.stream(Objects.requireNonNull(folder.list())).forEach(System.out::println);
    }

    public String searchFile(String fileName) {
        for (String name : Objects.requireNonNull(folder.list())) {
            if (fileName.equals(name)) {
                folderPath += "/" + name;
                return folderPath;
            }
        }
        return "Имя каталога указано некорректно!";
    }

    public String choiceFolder () {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Folder subFolder = new Folder(searchFile(userInput));
        subFolder.listFolderFiles();
        return subFolder.getAbsolutePath();
    }
    public File choiceFile (String folderPath) {
        Scanner scanner = new Scanner(System.in);
        String selectedFile = scanner.nextLine();
        if (!selectedFile.equals(getBackToChoice())) {
            return new File(folderPath + "/" + selectedFile);
        }
        return null;
    }

    public void searchingText(File file) {
        String searchingText;
        do {
            Scanner scanner = new Scanner(System.in);
            searchingText = scanner.nextLine();
            String text = TextEditor.getOnlyWords(file);
            ISearchEngine search = new EasySearch();
            System.out.println(searchingText + " " + search.search(text, searchingText));
        } while (!searchingText.equals(getBackToChoice()));
    }

    public String getBackToChoice() {
        return " back ";
    }
}
