package home_work_7.utils;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Folder extends File{

    private File folder;
    private String folderPath;

    public Folder(String folderPath) {
        super(folderPath);
        this.folderPath = folderPath;
        this.folder = new File(folderPath);
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public void listFolderFiles() {
        Arrays.stream(Objects.requireNonNull(folder.list())).forEach(System.out::println);
    }

    public String searchFolder(String nameFolder) {
        for (String folderName : Objects.requireNonNull(folder.list())) {
            if (nameFolder.equals(folderName)) {
                setFolderPath(folderPath + "/" + folderName);
                return folderPath;
            }
        }
        return "Имя каталога указано некорректно!";
    }

    public Folder searchFile(File folder, String selectedFile) {
        for (String fileName : Objects.requireNonNull(folder.list())) {
            if (selectedFile.equals(fileName)) {
                return new Folder(folderPath + "/" + fileName);
            }
        }
        return null;
    }

    public void choiceFolder () {
        listFolderFiles();
        System.out.println("\nУкажите каталог для поиска:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Folder subFolder = new Folder(searchFolder(userInput));
        subFolder.listFolderFiles();
    }
    public Folder choiceFile () {
        System.out.println("\nВыберите файл для работы или введите слово \"back\" для перехода к выбору каталога:");
        Scanner scanner = new Scanner(System.in);
        String selectedFile = scanner.nextLine();
        if (!selectedFile.equals("back")) {
            return searchFile(folder, selectedFile);
        }
        return null;
    }
}
