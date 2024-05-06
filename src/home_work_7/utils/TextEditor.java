package home_work_7.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor {
    public static String getOnlyWords(File file) {

        //Считаем символы
        int count = 0;
        try (FileReader fileReader = new FileReader(file)) {
            while ((fileReader.read()) != -1) {
                ++count;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Записываем номера символов в массив
        int[] text = new int[count];
        try (FileReader reader = new FileReader(file)) {
            int numberOfSimbol;
            int j = 0;
            while ((numberOfSimbol = reader.read()) != -1) {
                text[j] = numberOfSimbol;
                ++j;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Обнуляем всё, кроме букв и пробелов, считаем их количество.
        int newLength = text.length;
        for (int k = 0; k < text.length; k++) {
            if ((text[k] < 1040 | text[k] > 1103) & text[k] != 32) { //придумать что делать с дефисами
                text[k] = 0;
                --newLength;
            }
        }

        //Избавляемся от нулей и подряд стоящих пробелов
        int[] words = new int[newLength];
        int k = 1;
        for (int j = 0; j < text.length; j++) {
            if (words[k - 1] == 32 & text[j] == 32) {
                text[j] = 0;
            }
            if (text[j] != 0) {
                words[k] = text[j];
                ++k;
            }
        }

        //Избавляемся от пробелов, между которыми стояли нули
        int[] onlyWords = new int[k];
        for (int j = 0, m = 1; j < words.length; j++) {
            if (words[j] != 0) {
                onlyWords[m] = words[j];
                ++m;
            }
        }

        //Преобразовываем номера в символы
        StringBuilder line = new StringBuilder();
        for (int num : onlyWords) {
            line.append((char) num);
        }

        return line.toString();
    }
}
