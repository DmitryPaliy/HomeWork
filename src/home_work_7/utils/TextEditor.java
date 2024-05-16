package home_work_7.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor {
    public static String getOnlyWords(File file) {

        StringBuilder line = new StringBuilder();

        try (FileReader reader = new FileReader(file)) {
            int numberOfSimbol;
            while ((numberOfSimbol = reader.read()) != -1) {
                if (numberOfSimbol >= 1040 & numberOfSimbol <= 1103) {
                    line.append((char) numberOfSimbol);
                } else if (line.charAt(line.length() - 1) != 32) {
                    line.append((char) 32);
                }
                if (numberOfSimbol == 32) {
                    line.setCharAt(line.length() - 1,(char) numberOfSimbol);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line.toString();
    }
}
