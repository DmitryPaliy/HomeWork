package home_work_5.generators;

import java.util.Random;

public class NicknameGenerator extends PersonDataGenerator{

    public String angLetterLineGenerator() {
        StringBuilder line = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                line.append((char) (65 + rnd.nextInt(90 - 65)));
            }
            line.append((char) (97 + rnd.nextInt(123 - 97)));
        }
        return line.toString();
    }
}
